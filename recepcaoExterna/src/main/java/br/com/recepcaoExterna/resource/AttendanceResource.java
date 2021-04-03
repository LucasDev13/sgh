package br.com.recepcaoExterna.resource;

import br.com.recepcaoExterna.dto.AttendanceDTO;
import br.com.recepcaoExterna.dto.PatientNameDTO;
import br.com.recepcaoExterna.service.AttendanceService;
import br.com.recepcaoExterna.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/attendances")
public class AttendanceResource {

    @Autowired
    private AttendanceService service;

    @PostMapping
    public ResponseEntity<AttendanceDTO> insert(@RequestBody AttendanceDTO attendanceDTO){
        attendanceDTO = service.insert(attendanceDTO);
        return ResponseEntity.ok().body(attendanceDTO);
    }

    @GetMapping
    private void findPatientName(PatientNameDTO patientNameDTO){
        //pode ser muita responsabildiade para esse método
        //delegar para o método findPatientName()
        //buscar o paciente pelo nome, verificar se ele existe. pode ser usado o getOne
        // para não tocar o banco.
        //retornar esse paciente
        //inserir no Attendance
        //registrar o atendimento
    }
}
