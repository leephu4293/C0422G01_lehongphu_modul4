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
@Table(name = "loai_dich_vu")
public class TypeService {
    @Id
    @Column(name = "ma_loai_dich_vu")
    private Integer id;

    @Column(name = "ten_loai_dich_vu")
    private String name;

    @OneToMany(mappedBy = "typeService")
    private List<Facility> facilities;
}
