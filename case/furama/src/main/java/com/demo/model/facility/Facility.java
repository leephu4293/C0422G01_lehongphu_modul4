package com.demo.model.facility;

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
@Table(name = "dich_vu")
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_dich_vu")
    private Integer idFacility;

    @Column(name = "ten_dich_vu")
    private String name;

    @Column(name = "dien_tich")
    private int area;

    @Column(name = "chi_phi_thue")
    private double cost;

    @Column(name = "so_nguoi_toi_da")
    private int people;

    @Column(name = "tieu_chuan_phong")
    private String room;

    @Column(name = "mo_ta_tien_nghi_khac")
    private String note;



    @Column(name = "dien_tich_do_boi")
    private Double poolArea;

    @Column(name = "so_tang")
    private Integer flood;

    @Column(name="dich_vu_mien_phi_di_kem")
    private String free;

   @ManyToOne
   @JoinColumn(name = "ma_kieu_thue", referencedColumnName = "ma_kieu_thue")
    private RentType rentType;

   @ManyToOne
    @JoinColumn(name = "ma_loai_dich_vu", referencedColumnName = "ma_loai_dich_vu")
    private TypeService typeService;

}
