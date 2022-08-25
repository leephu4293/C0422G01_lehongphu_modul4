package com.demo.model.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MusicDto {
    private Integer id;
    @NotBlank
    private String name;
    @NotBlank
    private String singer;
    @NotBlank
    private String type;
}
