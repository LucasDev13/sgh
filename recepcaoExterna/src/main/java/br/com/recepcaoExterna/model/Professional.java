package br.com.recepcaoExterna.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_professional")
public class Professional {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nameProfessinal;
    private String crm;

    public Professional() {
    }

    public Professional(Long id, String nameProfessinal, String crm) {
        this.id = id;
        this.nameProfessinal = nameProfessinal;
        this.crm = crm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameProfessinal() {
        return nameProfessinal;
    }

    public void setNameProfessinal(String nameProfessinal) {
        this.nameProfessinal = nameProfessinal;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}
