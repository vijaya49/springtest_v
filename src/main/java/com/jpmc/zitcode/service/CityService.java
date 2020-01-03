package com.jpmc.zitcode.service;

import com.jpmc.zitcode.model.City;
import com.jpmc.zitcode.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {

    @Autowired
    CityRepository cityRepository;

    @Override
    public List<City> findAll(){
        return(List<City>) cityRepository.findAll();

    }

}
