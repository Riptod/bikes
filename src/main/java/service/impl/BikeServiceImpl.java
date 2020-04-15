package service.impl;

import java.util.List;

import model.Bike;
import service.BikeService;

public class BikeServiceImpl implements BikeService {

    @Override
    public void getBikeCatalog(List<List<Bike>> bikes) {
        for (List<Bike> bike: bikes) {
            for (Bike b: bike) {
                System.out.println(b.getInfo());
            }
        }
    }
}
