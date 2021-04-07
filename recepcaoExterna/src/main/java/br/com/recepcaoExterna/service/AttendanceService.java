package br.com.recepcaoExterna.service;

import br.com.recepcaoExterna.dto.AttendanceDTO;
import br.com.recepcaoExterna.dto.PatientDTO;
import br.com.recepcaoExterna.dto.PatientNameDTO;
import br.com.recepcaoExterna.model.Attendance;
import br.com.recepcaoExterna.model.Patient;
import br.com.recepcaoExterna.repository.AttendanceRepository;
import br.com.recepcaoExterna.repository.PatientRepository;
import br.com.recepcaoExterna.util.CreateAttendanceRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepository repository;

    public AttendanceDTO insert (AttendanceDTO attendanceDTO){
       attendanceDTO.setAttendanceRecord(CreateAttendanceRecord.buildAttendanceRecord());
       Attendance attendance = repository.save(Attendance.convert(attendanceDTO));
       return AttendanceDTO.convert(attendance);

    }
    
    @Transactional(readOnly = true)
    public List<AttendanceDTO> findAll(){
        List<Attendance> list = repository.findAll();
        return list.stream().map(AttendanceDTO::convert).collect(Collectors.toList());
    }

}
