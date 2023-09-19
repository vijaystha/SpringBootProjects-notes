package com.teachyourselfcode.booking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teachyourselfcode.booking.model.Route;
@Repository
public interface RouteRepository extends JpaRepository<Route, Float>{
	

}
