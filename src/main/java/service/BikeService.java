package service;

import java.util.List;

import model.Bike;

public interface BikeService {
    void getBikeCatalog(List<List<Bike>> bikes);
}