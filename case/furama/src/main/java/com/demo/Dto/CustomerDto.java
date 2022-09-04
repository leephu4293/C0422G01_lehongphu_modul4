package com.demo.Dto;

import com.demo.model.customer.TypeCustomer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;


@Getter
@Setter
@AllArgsConstructor
public class CustomerDto implements Validator {

    private Integer idCustomer;
    @NotBlank
    private  String name;
    @NotBlank
    private String date;
    @NotBlank
    private boolean gender;
    @NotBlank
    private String id;
    @NotBlank
    private String phone;
    @NotBlank
    private String email;
    @NotBlank
    private String adress;
    @NotBlank
    private TypeCustomer typeCustomer;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
