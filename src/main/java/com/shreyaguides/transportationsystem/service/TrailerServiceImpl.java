package com.shreyaguides.transportationsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shreyaguides.transportationsystem.model.Trailer;
import com.shreyaguides.transportationsystem.repository.TrailerRepository;


@Service
public class TrailerServiceImpl implements TrailerService {
	
	@Autowired
	private TrailerRepository trailerRepo;

	@Override
	public String upsert(Trailer trailer) {	
		trailerRepo.save(trailer); //internally perform insert opertaion (upsert is insert/update if primary key is available)
		return "success";
	}

	@Override
	public Trailer getById(Integer tid) {
		Optional<Trailer> findById = trailerRepo.findById(tid); ///optional is object(id value is stored in optional object)
		if(findById.isPresent()) {     ///check if record is present in optional or not
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Trailer> getAllTrailers() {
		return trailerRepo.findAll();
	}

	@Override
	public String deleteById(Integer tid) {
		if(trailerRepo.existsById(tid)) {             /////first check if data is present in db or not
			trailerRepo.deleteById(tid);
			return "Delete Success";
		}
		else {
			return "No Record Found";
		}
	}

}
