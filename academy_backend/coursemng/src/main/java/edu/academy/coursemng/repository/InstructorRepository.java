package edu.academy.coursemng.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import edu.academy.coursemng.entity.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Integer> {
    //TO DO test
  // add custom finder methods if needed, e.g.List<Instructor> findByLastName(String name);
}
