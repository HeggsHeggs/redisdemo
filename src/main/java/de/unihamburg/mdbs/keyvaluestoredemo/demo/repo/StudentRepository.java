package de.unihamburg.mdbs.keyvaluestoredemo.demo.repo;

import de.unihamburg.mdbs.keyvaluestoredemo.demo.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
}
