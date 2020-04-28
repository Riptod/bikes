import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Bike;
import service.BikeService;
import service.UserInterface;
import service.impl.BikeServiceImpl;
import service.impl.UserInterfaceImpl;
import utill.ReadDataFromFile;

public class Main {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterfaceImpl();
        userInterface.getMenu();
    }
}
