package com.uhack.constructify.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "materials")
public class MaterialEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "initial_quantity")
    private String initialQuantity;

    @Column(name = "current_quantity")
    private String currentQuantity;

    @OneToOne
    @JoinColumn(name = "class_id")
    private MaterialClassEntity materialClass;

    private Double price;

    @ManyToOne
    @JoinColumn(name = "order_request_id")
    private OrderRequestEntity request;

}
