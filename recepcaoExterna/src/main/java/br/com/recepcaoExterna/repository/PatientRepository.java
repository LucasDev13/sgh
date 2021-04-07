package br.com.recepcaoExterna.repository;

import br.com.recepcaoExterna.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    Patient findBycpf(String cpf);
    List<Patient> queryByFirstNameLike(String firstName);//a query precisa ter o mesmo nome do atributo da entidade.
}
