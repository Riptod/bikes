package utill;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import exception.FailReadWriteFileException;
import model.Bike;
import model.Ebike;
import model.FoldingBike;
import model.SpeedelecBike;

public class ReadDataFromFile {

    public List<String> parseTxtToList(String path) {
        List<String> txtFile = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader
                (path))) {
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
                txtFile.add(line);
            }
        } catch (IOException e) {
            throw new FailReadWriteFileException("Can`t read file", e);
        }
        txtFile.remove(txtFile.size() - 1);
        return txtFile;
    }

    public List<Bike> getBikeModels(List<String> strings) {
        List<Bike> resultList = new ArrayList<>();
        for (String s : strings) {
            String[] words = s.split("; ");
            String[] type = words[0].split(" ");
            if (type[0].equals("SPEEDELEC")) {
                SpeedelecBike speedelecBike = new SpeedelecBike();
                speedelecBike.setType(type[0]);
                speedelecBike.setBrand(words[0].substring(type[0].length() + 1));
                speedelecBike.setMaxSpeed(Integer.parseInt(words[1]));
                speedelecBike.setLights(Boolean.parseBoolean(words[3]));
                speedelecBike.setBatteryCapacity(Integer.parseInt(words[4]));
                speedelecBike.setWeight(Integer.parseInt(words[2]));
                speedelecBike.setColor(words[5]);
                speedelecBike.setPrice(Integer.parseInt(words[6]));
                resultList.add(speedelecBike);
            } else if (type[0].equals("E-BIKE")) {
                Ebike ebike = new Ebike();
                ebike.setType(type[0]);
                ebike.setBrand(words[0].substring(type[0].length() + 1));
                ebike.setMaxSpeed(Integer.parseInt(words[1]));
                ebike.setLights(Boolean.parseBoolean(words[3]));
                ebike.setBatteryCapacity(Integer.parseInt(words[4]));
                ebike.setWeight(Integer.parseInt(words[2]));
                ebike.setColor(words[5]);
                ebike.setPrice(Integer.parseInt(words[6]));
                resultList.add(ebike);
            } else if (type[0].equals("FOLDING")) {
                FoldingBike foldingBike = new FoldingBike();
                foldingBike.setType(type[0]);
                foldingBike.setBrand(words[0].substring(8));
                foldingBike.setSizeOfWheels(Integer.parseInt(words[1]));
                foldingBike.setGears(Integer.parseInt(words[2]));
                foldingBike.setWeight(Integer.parseInt(words[3]));
                foldingBike.setLights(Boolean.parseBoolean(words[4]));
                foldingBike.setColor(words[5]);
                foldingBike.setPrice(Integer.parseInt(words[6]));
                resultList.add(foldingBike);
            } else {
            throw new IllegalArgumentException("Cant find available bike model");
        }
    }
        return resultList;
}
}
