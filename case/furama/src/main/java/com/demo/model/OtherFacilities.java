package com.demo.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.apachecommons.CommonsLog;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dich_vu_di_kem")
public class OtherFacilities {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "ma_dich_vu_di_kem")
    private Integer idOtherFacilities;

    @Column(name = "ten_dich_vu_di_kem")
    private String nameOtherFacilities;

    @OneToMany(mappedBy = "otherFacilities")
    @JsonBackReference
    private Set<ContractDetails> contractDetails;

    @Column(name="gia")
    private Double price;

    @Column(name = "don_vi")
    private String units;

    @Column(name = "trang_thai")
    private String status;

}
