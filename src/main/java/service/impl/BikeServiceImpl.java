package service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exception.FailReadWriteFileException;
import model.Bike;
import service.BikeService;

public class BikeServiceImpl implements BikeService {

    private List<String> stringsForWrite = new ArrayList<>();

    @Override
    public void getBikeCatalog(List<Bike> bikes) {
        for (Bike bike: bikes) {
            System.out.println(bike.getInfo());
        }
    }

    @Override
    public void addFoldingBike() {
        System.out.println("Write following parameters : BIKE TYPE brand; sizeOfWheels; number of gears; " +
                "weight of the bike (in grams); availability of lights at front and back; color; price");
        System.out.println("Example: FOLDING BIKE Trinx; 18; 18; 9600; false; yellow; 359");
        System.out.println("Please, write parameters to FoldingBike, using ';' separator");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        stringsForWrite.add(inputString);
    }

    @Override
    public void addSpeedelecOrEBike() {
        System.out.println("Write following parameters : BIKE TYPE brand; maximum speed; " +
                "weight of the bike(in grams); availability of lights at front and back; " +
                "battery capacity; color; price;");
        System.out.println("Example: SPEEDELEC(E-BIKE) Peugeot; 45; 5426; TRUE; 8000; blue; 875");
        System.out.println("Please, write parameters to FoldingBike, using ';' separator");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        stringsForWrite.add(inputString);
    }

    @Override
    public void writeToFile(String path) {
        try(FileWriter writer = new FileWriter(path, true))
        {
            for (String s:stringsForWrite) {
                writer.write(s);
                writer.append('\n');
                writer.flush();
            }
        } catch (IOException ex) {
            throw new FailReadWriteFileException("Can`t write data to file", ex);
        }
    }
}
