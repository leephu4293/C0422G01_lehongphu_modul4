package com.demo.model;

import com.demo.model.customer.Customer;
import com.demo.model.facility.Facility;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hop_dong")
public class Contract {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hop_dong")
    private Integer idContract;

    @Column (name="ngay_lam_hop_dong", columnDefinition = "date")
    private String dayStart;
    @Column (name = "ngay_ket_thuc", columnDefinition = "date")
    private String dayEnd;
    @Column(name = "tien_dat_coc")
    private Double moneyDeposit;
    @Column(name="ma_nhan_vien")
    private Integer codeEmployee;

    @ManyToOne
    @JoinColumn (name = "ma_khach_hang", referencedColumnName = "ma_khach_hang")
    private Customer customer;

    @ManyToOne
    @JoinColumn (name="ma_dich_vu", referencedColumnName = "ma_dich_vu")
    private Facility facility;

    @OneToMany (mappedBy = "contract")
    private Set<ContractDetails> contractDetails;



}
