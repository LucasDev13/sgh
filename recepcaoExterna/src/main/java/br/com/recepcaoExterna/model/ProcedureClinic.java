package br.com.recepcaoExterna.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_procedre_clinic")
public class ProcedureClinic {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nameProcedureClinic;

    public ProcedureClinic() {
    }

    public ProcedureClinic(Long id, String nameProcedureClinic) {
        this.id = id;
        this.nameProcedureClinic = nameProcedureClinic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameProcedureClinic() {
        return nameProcedureClinic;
    }

    public void setNameProcedureClinic(String nameProcedureClinic) {
        this.nameProcedureClinic = nameProcedureClinic;
    }
}
