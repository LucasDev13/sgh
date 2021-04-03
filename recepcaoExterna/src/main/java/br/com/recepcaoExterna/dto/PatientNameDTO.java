package br.com.recepcaoExterna.dto;

public class PatientNameDTO {

    private String fullName;

    public PatientNameDTO() {
    }

    public PatientNameDTO(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
