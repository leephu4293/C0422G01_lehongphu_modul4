package com.demo.model.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MusicDto {
    private Integer id;
    @NotBlank
    @Pattern(regexp = "^[A-Za-z ]{800}$", message = "nhap trong gioi han 800")
    private String name;
    @NotBlank
    @Pattern(regexp = "^[A-Za-z ]{300}$",message = "nhap trong gioi han 300")
    private String singer;
    @NotBlank
    @Pattern(regexp ="^[A-Za-z ]{1000}$", message = "nhap trong gioi han 1000")
    private String type;
}
