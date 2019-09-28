package com.uhack.constructify.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "order_requests")
public class RequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "project_id")
    private ProjectEntity project;

    @Column(name = "total_price")
    private Double totalPrice;

    @OneToMany(mappedBy = "request")
    private List<MaterialEntity> materialList;

    @OneToOne
    @JoinColumn(name = "area_id")
    private AreaEntity area;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

}
