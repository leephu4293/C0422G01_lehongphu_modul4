package com.form.common;

import com.form.model.Dto.UserFromDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@AllArgsConstructor

public class CheckValidate implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserFromDto userFromDto = (UserFromDto) target;
        String dateVali = userFromDto.getAge();
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

