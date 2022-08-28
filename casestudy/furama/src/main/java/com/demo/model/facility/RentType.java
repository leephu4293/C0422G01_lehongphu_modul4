package com.demo.model.facility;

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
@Table(name = "kieu_thue")
public class RentType {
    @Id
    @Column(name = "ma_kieu_thue")
    private Integer id;

    @Column(name = "ten_kieu_thue")
    private String name;

    @OneToMany(mappedBy = "rentType")
    private List<Facility> facilities;

}
