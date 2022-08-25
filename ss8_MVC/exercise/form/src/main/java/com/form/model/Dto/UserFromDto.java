package com.form.model.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserFromDto implements Validator {

    @NotBlank
    @Pattern(regexp = "^[A-Za-z ]{5,45}$", message = "nhap it nhat 5 ky tu toi da 45")
    private String firstName;

    @NotBlank
    @Pattern(regexp = "^[A-Za-z ]{5,45}$", message = "nhap it nhat 5 ky tu toi da 45")
    private String lastName;

    @NotBlank
    @Pattern(regexp = "^(0)[0-9]{9,10}$", message = "nhap it nhat 5 ky tu toi da 45")
    private String phone;

    @NotBlank
    private String age;

    @NotBlank
    @Email(message = "nhap dung dinh dang")
    private String email;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserFromDto userFromDto = (UserFromDto) target;
        String dateVali = userFromDto.age;
        LocalDate localDate;
        int year = 0;

        try {
            localDate = LocalDate.parse(dateVali);
            Period period = Period.between(localDate, LocalDate.now());
            year = period.getYears();
        } catch (Exception e) {
            errors.rejectValue("age", "ageVali", "khong dung dinh dang ngay");
        }

        if (year < 18) {
            errors.rejectValue("age", "ageVali", "phai tren 18 tuoi");
        }
    }
}
