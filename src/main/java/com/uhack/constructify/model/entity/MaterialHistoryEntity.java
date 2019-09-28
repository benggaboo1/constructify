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
import java.util.Date;

@Data
@Entity
@Table(name = "update_history")
public class MaterialHistoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private MaterialEntity material;

    private String action;

    @OneToOne
    @JoinColumn(name = "area_id")
    private AreaEntity area;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "date_updated")
    private Date dateUpdated;

}
