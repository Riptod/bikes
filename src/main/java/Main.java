import java.io.IOException;

import service.BikeService;
import service.impl.BikeServiceImpl;
import utill.ReadDataFromFile;

public class Main {
    public static void main(String[] args) {
        ReadDataFromFile readDataFromFile = new ReadDataFromFile();
        BikeService bikeService = new BikeServiceImpl();
        try {
            System.out.println();
            bikeService.getBikeCatalog(readDataFromFile.getBikeModels(readDataFromFile.parseTxtToList("C:/Users/super/Documents/ecobike.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
