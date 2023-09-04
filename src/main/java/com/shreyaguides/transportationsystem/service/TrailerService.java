package com.shreyaguides.transportationsystem.service;

import java.util.List;

import com.shreyaguides.transportationsystem.model.Trailer;

public interface TrailerService {
	
	public String upsert(Trailer trailer);
	
	public Trailer getById(Integer tid);
	
	public List<Trailer> getAllTrailers();
	
	public String deleteById(Integer tid);

}
