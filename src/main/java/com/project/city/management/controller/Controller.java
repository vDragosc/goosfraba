package com.project.city.management.controller;

import com.project.city.management.domain.City;
import com.project.city.management.domain.ParkingFacilities;
import com.project.city.management.repo.CityRepo;
import com.project.city.management.repo.ParkingFacilitiesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class Controller {

    @Autowired
    private CityRepo citiesRepo;

    @Autowired
    private ParkingFacilitiesRepo parkingFacilitiesRepo;

    @PostMapping(value = {"/create/city"})
    public City saveCity(@RequestBody City city) {
        return citiesRepo.save(city);
    }

    @GetMapping(value = {"/get/city/by/id/{id}"})
    public City findCityById(@PathVariable(name = "id") String id){
        id = id.substring(1, id.length() - 1);
        List<City> cityList = citiesRepo.findAll();
        for (City city : cityList) {
            if(city.getId().equals(id)){
                return city;
            }
        }
        return new City();
    }

    @GetMapping(value = {"/get/city/by/code/{code}"})
    public City findCityByCode(@PathVariable(name = "code") String code){
        code = code.substring(1, code.length() - 1);
        List<City> cityList = citiesRepo.findAll();
        for (City city : cityList) {
            if(city.getCode().equals(code)){
                return city;
            }
        }
        return new City();
    }

    @GetMapping(value = {"/get/all/cities"})
    public List<City> getAllCities(){
        return citiesRepo.findAll();
    }

    @PostMapping(value = {"/create/parking/facility"})
    public ParkingFacilities saveFacility(@RequestBody ParkingFacilities parkingFacilities) {
        return parkingFacilitiesRepo.save(parkingFacilities);
    }

    @GetMapping(value = {"/get/facility/by/id/{id}"})
    public ParkingFacilities findFacilityById(@PathVariable(name = "id") String id){
        id = id.substring(1, id.length() - 1);
        List<ParkingFacilities> parkingFacilitiesList = parkingFacilitiesRepo.findAll();
        for (ParkingFacilities parkingFacilities : parkingFacilitiesList) {
            if(parkingFacilities.getId().equals(id)){
                return parkingFacilities;
            }
        }
        return new ParkingFacilities();
    }

    @GetMapping(value = {"/get/all/facilities"})
    public List<ParkingFacilities> getAllFacilities(){
        return parkingFacilitiesRepo.findAll();
    }

    //no time for implementation of vehicle functionalities.

}
