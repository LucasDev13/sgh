package br.com.recepcaoExterna.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "tb_patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int medicalRecord;
    private String fullName;
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

    @ManyToOne(cascade = CascadeType.ALL)
    private Address address;

    public Patient() {
    }

    public Patient(Long id, int medicalRecord, String fullName, String birthDate,
                   int age, String motherName, String fatherName,
                   String genre, String cpf, String nationalHealthCard,
                   String rg, String telephone, String email, Address address) {
        this.id = id;
        this.medicalRecord = medicalRecord;
        this.fullName = fullName;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMedicalRecord() {
        return medicalRecord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
        Patient patient = (Patient) o;
        return Objects.equals(id, patient.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
