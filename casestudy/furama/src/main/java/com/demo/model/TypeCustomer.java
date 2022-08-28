package com.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "loai_khach")
public class TypeCustomer {
    @Id
    @Column(name = "ma_loai_khach")
    private Integer id;

    @Column(name = "ten_loai_khach")
    private String name;

    @OneToMany (mappedBy = "typeCustomer")
    private List<Customer> customer;

}
