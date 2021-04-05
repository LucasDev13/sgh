package br.com.recepcaoExterna.repository;

import br.com.recepcaoExterna.dto.PatientNameDTO;
import br.com.recepcaoExterna.model.Attendance;
import br.com.recepcaoExterna.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
}
