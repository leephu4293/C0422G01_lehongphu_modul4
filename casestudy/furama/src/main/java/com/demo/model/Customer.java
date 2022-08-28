package com.demo.model;
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
@Table(name = "khach_hang")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ma_khach_hang")
    private Integer idCustomer;

    @Column(name = "ho_ten")
    private  String name;

    @Column(name = "ngay_sinh", columnDefinition = "date")
    private String date;

    @Column(name="gioi_tinh")
    private boolean gender;

    @Column(name="so_cmnd")
    private String id;

    @Column(name="so_dien_thoai")
    private String phone;

    @Column(name="email")
    private String email;

    @Column(name="dia_chi")
    private String adress;

    @ManyToOne
    @JoinColumn(name = "ma_loai_khach", referencedColumnName = "ma_loai_khach")
    private TypeCustomer typeCustomer;

}
