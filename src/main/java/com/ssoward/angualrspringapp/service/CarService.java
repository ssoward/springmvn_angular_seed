package com.ssoward.angualrspringapp.service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ssoward
 * Date: 12/20/12
 */
public interface CarService {
    public List<String> getAllCars();

    public void addCar(String car);

    public void deleteCar(String car);

    public void deleteAll();
}
