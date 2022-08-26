package com.form.model.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserFromDto {

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


}
