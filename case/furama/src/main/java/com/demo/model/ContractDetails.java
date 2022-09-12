package com.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name ="hop_dong_chi_tiet")
public class ContractDetails {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hop_dong_chi_tiet")
    private Integer idDetail;


    @Column(name = "so_luong")
    private Integer numbers;


    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "ma_hop_dong", referencedColumnName = "ma_hop_dong")
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "ma_dich_vu_di_kem", referencedColumnName = "ma_dich_vu_di_kem")
    private OtherFacilities otherFacilities;


}
