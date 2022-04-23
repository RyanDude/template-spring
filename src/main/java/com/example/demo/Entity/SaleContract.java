package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "saleContract")
@Data
@NoArgsConstructor
public class SaleContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private double sold_price;
    private String payment_method;
    @OneToMany(mappedBy = "saleContract", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<sell> sells = new ArrayList<>();
}
