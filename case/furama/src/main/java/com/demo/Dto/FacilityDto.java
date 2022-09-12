package com.demo.Dto;

import com.demo.model.facility.RentType;
import com.demo.model.facility.TypeService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FacilityDto implements Validator {

    private Integer idFacility;

    @NotBlank
    @Pattern(regexp = "^([A-Z][ a-zA-Z0-9]+)+$")
    private String name;

    @NotNull
    @Min(value = 0)
    private int area;

    @NotNull
    @Min(value = 0)
    private double cost;

    @NotNull
    @Min(value = 0)
    private int people;

    @NotNull
    private String room;

    @NotNull
    private String note;

    @NotNull
    @Min(value = 0)
    private Double poolArea;

    @NotNull
    @Min(value = 0)
    private Integer flood;

    @NotNull
    private String free;

    @NotNull
    private RentType rentType;

    @NotNull
    private TypeService typeService;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
      FacilityDto facilityDto = (FacilityDto) target;

    }
}
