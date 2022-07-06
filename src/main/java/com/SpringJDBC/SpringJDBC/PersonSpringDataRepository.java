package com.SpringJDBC.SpringJDBC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonSpringDataRepository
        extends JpaRepository<Person, Integer>{
}