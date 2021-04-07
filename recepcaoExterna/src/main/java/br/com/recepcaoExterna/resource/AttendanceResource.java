package br.com.recepcaoExterna.resource;

import br.com.recepcaoExterna.dto.AttendanceDTO;
import br.com.recepcaoExterna.dto.PatientDTO;
import br.com.recepcaoExterna.dto.PatientNameDTO;
import br.com.recepcaoExterna.service.AttendanceService;
import br.com.recepcaoExterna.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/attendances")
public class AttendanceResource {

    @Autowired
    private AttendanceService service;

    @Autowired
    private PatientService patientService;

    @PostMapping
    public ResponseEntity<AttendanceDTO> insert(@RequestBody AttendanceDTO attendanceDTO){
        attendanceDTO = service.insert(attendanceDTO);
        return ResponseEntity.ok().body(attendanceDTO);
    }

    @GetMapping("/patient/search")
    public List<PatientDTO> queryByName(@RequestParam(name = "firstName", required = true) String firstName){
        //return firstName;
        return patientService.queryByName(firstName);
    }
}
