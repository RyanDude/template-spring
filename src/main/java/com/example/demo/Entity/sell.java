package com.example.demo.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "sell")
@Data
@NoArgsConstructor
public class sell {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn
    private House house;
    public sell(House house, SaleContract saleContract){
        this.house = house;
        this.saleContract = saleContract;
    }
    @ManyToOne
    @JoinColumn
    private SaleContract saleContract;
}
