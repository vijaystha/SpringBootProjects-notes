package com.teachyourselfcode.booking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teachyourselfcode.booking.model.Truck;
@Repository
public interface TruckRepository extends JpaRepository<Truck, Integer>{

}
