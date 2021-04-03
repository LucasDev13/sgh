package br.com.recepcaoExterna.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "tb_attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private int attendanceRecord;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Patient patient;//patient
    @OneToOne(cascade = CascadeType.PERSIST)
    private HealthInsurance healthInsurance;//convenio
    private String requestCharacter;//carater de solicitação
    @ManyToOne(cascade = CascadeType.PERSIST)//verificar o mapeamento
    private Clinic clinic;//clinca
    private LocalDateTime dateTimeAttendance;
    @OneToOne(cascade = CascadeType.PERSIST)
    private ProcedureClinic procedureClinic;//procedimento clinco
    @OneToOne(cascade = CascadeType.PERSIST)
    private Professional doctor;
    @OneToOne(cascade = CascadeType.PERSIST)
    private CostCenter cdc;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Origin origin;//procedencia/origem

    public Attendance() {
    }

    public Attendance(Long id, Patient patient, HealthInsurance healthInsurance,
                      String requestCharacter, Clinic clinic, LocalDateTime dateTimeAttendance,
                      ProcedureClinic procedureClinic, Professional doctor,
                      CostCenter cdc, Origin origin) {
        this.id = id;
        this.patient = patient;
        this.healthInsurance = healthInsurance;
        this.requestCharacter = requestCharacter;
        this.clinic = clinic;
        this.dateTimeAttendance = dateTimeAttendance;
        this.procedureClinic = procedureClinic;
        this.doctor = doctor;
        this.cdc = cdc;
        this.origin = origin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAttendanceRecord() {
        return attendanceRecord;
    }

    public void setAttendanceRecord(int attendanceRecord) {
        this.attendanceRecord = attendanceRecord;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public HealthInsurance getHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(HealthInsurance healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    public String getRequestCharacter() {
        return requestCharacter;
    }

    public void setRequestCharacter(String requestCharacter) {
        this.requestCharacter = requestCharacter;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public LocalDateTime getDateTimeAttendance() {
        return dateTimeAttendance;
    }

    public void setDateTimeAttendance(LocalDateTime dateTimeAttendance) {
        this.dateTimeAttendance = dateTimeAttendance;
    }

    public ProcedureClinic getProcedureClinic() {
        return procedureClinic;
    }

    public void setProcedureClinic(ProcedureClinic procedureClinic) {
        this.procedureClinic = procedureClinic;
    }

    public Professional getDoctor() {
        return doctor;
    }

    public void setDoctor(Professional doctor) {
        this.doctor = doctor;
    }

    public CostCenter getCdc() {
        return cdc;
    }

    public void setCdc(CostCenter cdc) {
        this.cdc = cdc;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attendance that = (Attendance) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
