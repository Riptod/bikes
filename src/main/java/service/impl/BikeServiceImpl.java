package service.impl;

import java.util.List;

import model.Bike;
import service.BikeService;

public class BikeServiceImpl implements BikeService {

    @Override
    public void getBikeCatalog(List<Bike> bikes) {
        for (Bike bike: bikes) {
            System.out.println(bike.getInfo());
        }
    }
}
