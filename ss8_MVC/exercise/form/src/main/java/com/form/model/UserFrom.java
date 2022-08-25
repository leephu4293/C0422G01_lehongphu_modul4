package com.form.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserFrom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;

    private String firstName;
    private String lastName;
    private String phone;
    @Column(columnDefinition = "date")
    private String age;
    private String email;
}
