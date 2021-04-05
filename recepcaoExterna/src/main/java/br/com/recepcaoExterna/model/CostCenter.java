package br.com.recepcaoExterna.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_costcenter")
public class CostCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameCostCenter;

    public CostCenter() {
    }

    public CostCenter(Long id, String nameCostCenter) {
        this.id = id;
        this.nameCostCenter = nameCostCenter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCostCenter() {
        return nameCostCenter;
    }

    public void setNameCostCenter(String nameCostCenter) {
        this.nameCostCenter = nameCostCenter;
    }
}
