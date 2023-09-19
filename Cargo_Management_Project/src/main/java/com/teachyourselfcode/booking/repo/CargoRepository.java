package com.teachyourselfcode.booking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teachyourselfcode.booking.model.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Integer>{

}
