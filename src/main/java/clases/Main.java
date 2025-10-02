package main.java.clases;

import main.java.clases.dao.CarsDAO;
import main.java.clases.gui.CarsAppGUI;
import main.java.clases.util.AppProperties;
import main.java.clases.model.Cars;

import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(CarsAppGUI::new);
    }
}
