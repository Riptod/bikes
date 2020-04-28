package service;

import java.util.List;

import model.Bike;

public interface BikeService {
    void getBikeCatalog(List<Bike> bikes);

    void addFoldingBike();

    void addSpeedelecOrEBike();

    void writeToFile(String path);
}
