package br.com.recepcaoExterna.resource;

import br.com.recepcaoExterna.dto.PatientDTO;
import br.com.recepcaoExterna.model.Patient;
import br.com.recepcaoExterna.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/patients")
public class PatientResource {

    @Autowired
    private PatientService patientService;

    @PostMapping
    public ResponseEntity<PatientDTO> insert(@RequestBody PatientDTO patientDTO){
        patientDTO = patientService.insert(patientDTO);
        return ResponseEntity.ok().body(patientDTO);
    }

    @GetMapping
    public ResponseEntity<List<PatientDTO>> findAll(){
        List<PatientDTO> list = patientService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<PatientDTO> update(@PathVariable Long id, @RequestBody PatientDTO patientDTO){
        patientDTO = patientService.update(id, patientDTO);
        return ResponseEntity.ok().body(patientDTO);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<PatientDTO> delete(@PathVariable Long id){
        patientService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
