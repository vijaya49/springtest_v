package com.jpmc.zitcode.controller;

import com.jpmc.zitcode.model.City;
import com.jpmc.zitcode.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CityController {

    @Autowired
    private ICityService iCityService;

    @GetMapping("/showCities")
    public String findCities(Model model) {

        List<City> cities = (List<City>) iCityService.findAll();

        model.addAttribute("cities", cities);

        return "showCities";
    }

}
