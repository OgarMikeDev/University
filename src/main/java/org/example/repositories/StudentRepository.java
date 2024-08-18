package org.example.repositories;

import org.example.entitys.Course;
import org.example.entitys.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Integer, Student> {
}
