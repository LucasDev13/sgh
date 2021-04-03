package br.com.recepcaoExterna.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_healthInsurance")
public class HealthInsurance {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nameHealthInsurance;

    public HealthInsurance() {
    }

    public HealthInsurance(Long id, String nameHealthInsurance) {
        this.id = id;
        this.nameHealthInsurance = nameHealthInsurance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameHealthInsurance() {
        return nameHealthInsurance;
    }

    public void setNameHealthInsurance(String nameHealthInsurance) {
        this.nameHealthInsurance = nameHealthInsurance;
    }
}
