import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Bike;
import service.BikeService;
import service.impl.BikeServiceImpl;
import utill.ReadDataFromFile;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write path to txt file: ");
        String path = in.nextLine();
        String menu = "Please make your choice: \n" +
                "1-Show the entire EcoBike catalog \n" +
                "2–Add a new folding bike \n " +
                "3–Add a new speedelec  \n " +
                "4–Add a new e-bike \n " +
                "5–Find the first item of a particular brand \n " +
                "6–Write to file \n " +
                "7–Stop the program";
        System.out.println(menu);
        int num = in.nextInt();
        ReadDataFromFile readDataFromFile = new ReadDataFromFile();
        BikeService bikeService = new BikeServiceImpl();
        List<Bike> bikes = new ArrayList<>(readDataFromFile.getBikeModels(readDataFromFile
                .parseTxtToList(path)));
        while (num != 7) {
            switch (num) {
                case 1:
                    bikeService.getBikeCatalog(bikes);
                    System.out.println(menu);
                    num = in.nextInt();
                    break;
                case 2:
                    bikeService.addFoldingBike();
                    System.out.println(menu);
                    num = in.nextInt();
                    break;
                case 3: case 4:
                    bikeService.addSpeedelecOrEBike();
                    System.out.println(menu);
                    num = in.nextInt();
                    break;
                case 6:
                    bikeService.writeToFile(path);
                    System.out.println(menu);
                    num = in.nextInt();
                    break;
                default:
                    break;
            }
            System.out.println("Program stopping");
        }
    }
}
