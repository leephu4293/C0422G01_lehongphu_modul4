package com.demo.Dto;

import com.demo.model.customer.TypeCustomer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.Period;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto implements Validator {


    private Integer idCustomer;

    @NotBlank
//    @Pattern(regexp = "^([A-Z][a-z]+)+( [A-Z][a-z]*)*$" , message = " Example: Nguyen Van Abcd ...")
    private  String name;

    @NotBlank
    private String date;

    @NotNull
    private boolean gender;

    @NotBlank
    @Pattern(regexp = "^([1-9][0-9]{8})|([1-9][0-9]{11})$")
    private String id;

    @NotBlank
    @Pattern(regexp = "^((090)[0-9]{7})|((091)[0-9]{7})|((84\\+90)[0-9]{7})|((84\\+91)[0-9]{7})$"
            , message = "Phone have 10 number like 090..., 091... 84+090.....")
    private String phone;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String adress;

    @NotNull
    private TypeCustomer typeCustomer;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
      CustomerDto customerDto = (CustomerDto) target;
       String ageDTO = ((CustomerDto) target).date;
        LocalDate localDate;
        int year = 0;

        try {
            localDate = LocalDate.parse(ageDTO);
            Period period = Period.between(localDate, LocalDate.now());
            year = period.getYears();
        } catch (Exception e) {
            errors.rejectValue("date", "ageVali", "khong dung dinh dang ngay");
        }

        if (year < 18) {
            errors.rejectValue("date", "ageVali", "phai tren 18 tuoi");
        }

        if (!customerDto.getName().trim().equals("")){
            if (!customerDto.getName().matches("^([A-Z][a-z]+)+( [A-Z][a-z]*)*$")){
                errors.rejectValue("name","nameVali","wrong fomat");
            }
        }
    }

    }

