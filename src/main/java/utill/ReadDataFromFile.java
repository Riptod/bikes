package utill;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Bike;
import model.Ebike;
import model.FoldingBike;
import model.SpeedelecBike;

public class ReadDataFromFile {

    public List<String> parseTxtToList(String path) throws IOException {
        List<String> txtFile = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader
                (path))) {
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
                txtFile.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        txtFile.remove(txtFile.size() - 1);
        return txtFile;
    }

    public List<List<Bike>> getBikeModels(List<String> strings) {
        List<List<Bike>> resultList = new ArrayList<>();
        List<Bike> foldingBikeModels = new ArrayList<>();
        List<Bike> eBikeModels = new ArrayList<>();
        List<Bike> speedelecBikeModels = new ArrayList<>();
        for (String s : strings) {
            String[] words = s.split("; ");
            if (words[0].contains("SPEEDELEC")) {
                SpeedelecBike speedElecBike = new SpeedelecBike();
                speedElecBike.setType("SPEEDELEC");
                speedElecBike.setBrand(words[0].substring(10));
                speedElecBike.setMaxSpeed(Integer.parseInt(words[1]));
                speedElecBike.setWeight(Integer.parseInt(words[2]));
                speedElecBike.setLights(Boolean.parseBoolean(words[3]));
                speedElecBike.setBatteryCapacity(Integer.parseInt(words[4]));
                speedElecBike.setColor(words[5]);
                speedElecBike.setPrice(Integer.parseInt(words[6]));
                speedelecBikeModels.add(speedElecBike);
            } else if (words[0].contains("E-BIKE")) {
                Ebike ebike = new Ebike();
                ebike.setType("E-BIKE");
                ebike.setBrand(words[0].substring(7));
                ebike.setMaxSpeed(Integer.parseInt(words[1]));
                ebike.setWeight(Integer.parseInt(words[2]));
                ebike.setLights(Boolean.parseBoolean(words[3]));
                ebike.setBatteryCapacity(Integer.parseInt(words[4]));
                ebike.setColor(words[5]);
                ebike.setPrice(Integer.parseInt(words[6]));
                eBikeModels.add(ebike);
            } else if (words[0].contains("FOLDING")) {
                FoldingBike foldingBike = new FoldingBike();
                foldingBike.setType("FOLDING");
                foldingBike.setBrand(words[0].substring(8));
                foldingBike.setSizeOfWheels(Integer.parseInt(words[1]));
                foldingBike.setGears(Integer.parseInt(words[2]));
                foldingBike.setWeight(Integer.parseInt(words[3]));
                foldingBike.setLights(Boolean.parseBoolean(words[4]));
                foldingBike.setColor(words[5]);
                foldingBike.setPrice(Integer.parseInt(words[6]));
                foldingBikeModels.add(foldingBike);
            } else {
                System.out.println("ERROR");
            }
        }
        resultList.add(foldingBikeModels);
        resultList.add(eBikeModels);
        resultList.add(speedelecBikeModels);
        return resultList;
    }
}
