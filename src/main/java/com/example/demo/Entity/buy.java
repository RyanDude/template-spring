package com.example.demo.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "buy")
@Data
@NoArgsConstructor
public class buy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn
    private House house;
    @ManyToOne
    @JoinColumn
    private PurchaseContract purchaseContract;
    public buy(House house, PurchaseContract purchaseContract){
        this.house = house;
        this.purchaseContract = purchaseContract;
    }
}
