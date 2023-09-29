package com.m.roman.oreh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "specification", schema = "oreh")
public class Specification {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "gardens", precision = 10)
    private BigDecimal gardens;

    @Column(name = "greenhouses", precision = 10)
    private BigDecimal greenhouses;

    @Column(name = "rosehip_plantation", precision = 10)
    private BigDecimal rosehipPlantation;

    @Column(name = "plant_survival_rate")
    private Integer plantSurvivalRate;

}