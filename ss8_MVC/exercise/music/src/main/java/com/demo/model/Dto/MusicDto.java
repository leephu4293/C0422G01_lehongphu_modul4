package com.demo.model.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MusicDto {

    private Integer id;

    @NotBlank
    @Size(max = 800)
    @Pattern(regexp = "^[A-Za-z ]*$", message = "vui long nhap chu")
    private String name;

    @NotBlank
    @Size(max = 300)
    @Pattern(regexp = "^[A-Za-z ]*$",message = "vui long nhap chu")
    private String singer;

    @NotBlank
    @Size(max = 1000)
    @Pattern(regexp = "^[A-Za-z, ]*$", message = "vui long nhap chu")
    private String type;
}
