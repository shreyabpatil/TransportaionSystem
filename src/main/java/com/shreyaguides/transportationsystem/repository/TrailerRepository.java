package com.shreyaguides.transportationsystem.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shreyaguides.transportationsystem.model.Trailer;

@Repository
public interface TrailerRepository extends JpaRepository<Trailer, Serializable> {

}
