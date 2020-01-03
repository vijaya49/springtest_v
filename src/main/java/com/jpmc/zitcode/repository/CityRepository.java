package com.jpmc.zitcode.repository;

import com.jpmc.zitcode.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City,Long>{
}
