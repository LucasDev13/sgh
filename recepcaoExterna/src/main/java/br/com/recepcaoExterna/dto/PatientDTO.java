package br.com.recepcaoExterna.dto;

import br.com.recepcaoExterna.model.Address;
import br.com.recepcaoExterna.model.Patient;

import java.time.LocalDateTime;
import java.util.Objects;

public class PatientDTO {

    private Long id;
    private int medicalRecord;
    private String firstName;
    private String birthDate;
    private int age;
    private String motherName;
    private String fatherName;
    private String genre;
    private String cpf;
    private String nationalHealthCard;
    private String rg;
    private String telephone;
    private String email;
    private LocalDateTime dataHoraCadastro;
    private Address address;

    public PatientDTO() {
    }

    public PatientDTO(Long id, int medicalRecord, String firstName, String birthDate,
                   int age, String motherName, String fatherName,
                   String genre, String cpf, String nationalHealthCard,
                   String rg, String telephone, String email, Address address) {
        this.id = id;
        this.medicalRecord = medicalRecord;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.age = age;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.genre = genre;
        this.cpf = cpf;
        this.nationalHealthCard = nationalHealthCard;
        this.rg = rg;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
    }

    public PatientDTO(Patient patient) {
        this.id = patient.getId();
        this.medicalRecord = patient.getMedicalRecord();
        this.firstName = patient.getFirstName();
        this.birthDate = patient.getBirthDate();
        this.age = patient.getAge();
        this.motherName = patient.getMotherName();
        this.fatherName = patient.getFatherName();
        this.genre = patient.getGenre();
        this.cpf = patient.getCpf();
        this.nationalHealthCard = patient.getNationalHealthCard();
        this.rg = patient.getRg();
        this.telephone = patient.getTelephone();
        this.email = patient.getEmail();
        this.dataHoraCadastro = patient.getDataHoraCadastro();
        this.address = patient.getAddress();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(int medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNationalHealthCard() {
        return nationalHealthCard;
    }

    public void setNationalHealthCard(String nationalHealthCard) {
        this.nationalHealthCard = nationalHealthCard;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public void setDataHoraCadastro(LocalDateTime dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientDTO patientDTO = (PatientDTO) o;
        return Objects.equals(id, patientDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static PatientDTO convert(Patient patient){
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setId(patient.getId());
        patientDTO.setFirstName(patient.getFirstName());
        patientDTO.setBirthDate(patient.getBirthDate());
        patientDTO.setAge(patient.getAge());
        patientDTO.setMotherName(patient.getMotherName());
        patientDTO.setFatherName(patient.getFatherName());
        patientDTO.setGenre(patient.getGenre());
        patientDTO.setCpf(patient.getCpf());
        patientDTO.setNationalHealthCard(patient.getNationalHealthCard());
        patientDTO.setRg(patient.getRg());
        patientDTO.setTelephone(patient.getTelephone());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.setDataHoraCadastro(patient.getDataHoraCadastro());
        patientDTO.setAddress(patient.getAddress());
        return patientDTO;
    }
}
