package com.books.model.Dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BooksDto {

    private Integer id;
    private String name;
    private String type;
    private int counts;
    private int checkNumber;
}
