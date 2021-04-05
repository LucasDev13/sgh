package br.com.recepcaoExterna.dto;

import br.com.recepcaoExterna.model.Attendance;
import br.com.recepcaoExterna.model.Clinic;
import br.com.recepcaoExterna.model.CostCenter;
import br.com.recepcaoExterna.model.HealthInsurance;
import br.com.recepcaoExterna.model.Origin;
import br.com.recepcaoExterna.model.Patient;
import br.com.recepcaoExterna.model.ProcedureClinic;
import br.com.recepcaoExterna.model.Professional;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;
import java.util.Objects;

public class AttendanceDTO {

    private Long id;
    private int attendanceRecord;
    private Patient patient;//patient
    private HealthInsurance healthInsurance;//convenio
    private String requestCharacter;//carater de solicitação
    private Clinic clinic;//clinca
    private LocalDateTime dateTimeAttendance = LocalDateTime.now();
    private ProcedureClinic procedureClinic;//procedimento clinco
    private Professional doctor;
    private CostCenter cdc;
    private Origin origin;//procedencia/origem

    public AttendanceDTO() {
    }

    public AttendanceDTO(Long id, int attendanceRecord, Patient patient, HealthInsurance healthInsurance,
                      String requestCharacter, Clinic clinic, LocalDateTime dateTimeAttendance,
                      ProcedureClinic procedureClinic, Professional doctor,
                      CostCenter cdc, Origin origin) {
        this.id = id;
        this.attendanceRecord = attendanceRecord;
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

    public AttendanceDTO(Attendance attendance){
        this.id = attendance.getId();
        this.attendanceRecord = attendance.getAttendanceRecord();
        this.patient = attendance.getPatient();
        this.healthInsurance = attendance.getHealthInsurance();
        this.requestCharacter = attendance.getRequestCharacter();
        this.clinic = attendance.getClinic();
        this.dateTimeAttendance = attendance.getDateTimeAttendance();
        this.procedureClinic = attendance.getProcedureClinic();
        this.doctor = attendance.getDoctor();
        this.cdc = attendance.getCdc();
        this.origin = attendance.getOrigin();
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

    public static AttendanceDTO convert(Attendance attendance){
        //get no dto e set na entity
        AttendanceDTO attendanceDTO = new AttendanceDTO();
        attendanceDTO.setAttendanceRecord(attendance.getAttendanceRecord());
        attendanceDTO.setPatient(attendance.getPatient());
        attendanceDTO.setHealthInsurance(attendance.getHealthInsurance());
        attendanceDTO.setRequestCharacter(attendance.getRequestCharacter());
        attendanceDTO.setClinic(attendance.getClinic());
        attendanceDTO.setDateTimeAttendance(attendance.getDateTimeAttendance());
        attendanceDTO.setProcedureClinic(attendance.getProcedureClinic());
        attendanceDTO.setDoctor(attendance.getDoctor());
        attendanceDTO.setCdc(attendance.getCdc());
        attendanceDTO.setOrigin(attendance.getOrigin());
        return attendanceDTO;
    }

}
