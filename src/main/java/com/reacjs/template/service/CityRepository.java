package com.reacjs.template.service;

import org.springframework.data.repository.CrudRepository;

import com.reacjs.template.domain.City;

public interface CityRepository extends CrudRepository<City, Long> {
	City findByNameAndCountryAllIgnoringCase(String name, String country);
}
