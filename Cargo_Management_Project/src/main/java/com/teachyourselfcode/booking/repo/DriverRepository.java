package com.teachyourselfcode.booking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teachyourselfcode.booking.model.Driver;
@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {

}
