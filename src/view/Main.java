package view;

import control.ElectricManager;
import model.Host;
import model.Receipt;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hey, pay money. Please!");
        ArrayList<Host> hostArrayList = new ArrayList<>();
        ArrayList<Receipt> receiptArrayList = new ArrayList<>();
        ElectricManager electricManager = new ElectricManager(hostArrayList, receiptArrayList);
        MenuManager.manager(electricManager);

    }
}
