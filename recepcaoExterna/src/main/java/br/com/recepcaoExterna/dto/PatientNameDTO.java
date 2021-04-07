package br.com.recepcaoExterna.dto;

import br.com.recepcaoExterna.model.Patient;

public class PatientNameDTO {

    private String fullName;

    public PatientNameDTO() {
    }

    public PatientNameDTO(String fullName) {
        this.fullName = fullName;
    }

    public PatientNameDTO(Patient patient){
        this.fullName = patient.getFirstName();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
