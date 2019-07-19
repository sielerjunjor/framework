package com.sielerjunjor.controller;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sielerjunjor.models.Frameworks;
import com.sielerjunjor.repository.FrameworksRepository;

@RestController
@RequestMapping("/frameworks")
public class FrameworksController {

	@Autowired
	private FrameworksRepository repository;
	
	@RequestMapping(value ="", method = RequestMethod.GET)
	public List<Frameworks> getAllFrameworks(){
		System.out.println("Endpoint hit");
		return repository.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Frameworks getById(@PathVariable("id") ObjectId id) {
		return repository.findBy_id(id);
	}
	
	@RequestMapping(value ="", method = RequestMethod.POST)
	public Frameworks createFramework(@Valid @RequestBody Frameworks frameworks) {
		frameworks.set_id(ObjectId.get());
		repository.save(frameworks);
		return frameworks;
	}
	
	@RequestMapping(value ="/{id}", method = RequestMethod.PUT)
	public Frameworks updateFramework(@PathVariable("id") ObjectId id, @Valid @RequestBody Frameworks frameworks) {
		frameworks.set_id(id);
		repository.save(frameworks);
		return frameworks;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String deleteFramework(@PathVariable ObjectId id) {
	    repository.delete(repository.findBy_id(id));
	    return "{\"message\": \"Framework deleted successfully\"}";
	}
	
}
