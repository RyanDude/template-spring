package com.example.demo.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "contract")
@Data
@NoArgsConstructor
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private double SoldPrice;
    private String mortgage_company;
    private String financial_professionals;
    private Date ClosingDate;
    @ManyToOne
    @JoinColumn
    private Buyer buyer;
    @ManyToOne
    @JoinColumn
    private Seller seller;
    @ManyToOne
    @JoinColumn
    private House house;
    public Contract(Buyer buyer, Seller seller, House house){
        this.buyer = buyer;
        this.seller = seller;
        this.house = house;
    }
}
