package com.harikaClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.harikaClasses.DMS.Models.Dog;


/**
 * DogRepository interface
 * @author Harika Reddy Kondam
 *
 */

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);
}
