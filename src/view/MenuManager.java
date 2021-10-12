package view;

import control.ElectricManager;
import model.Host;
import model.Receipt;


import java.util.Scanner;

public class MenuManager {
    public static void manager(ElectricManager electricManager){
        while (true) {
            System.out.println("1. Add New Host");
            System.out.println("2. Remove Host");
            System.out.println("3. Set Host");
            System.out.println("4. Show list Host");
            System.out.println("5. Show Money");
            System.out.println("6. Search Host");
            System.out.println("7. Exit");
            System.out.println("Enter choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Add New Host");
                    electricManager.addHost(addNewHost());
                    break;
                case 2:
                    System.out.println("2. Remove Host");
                    electricManager.removeHost(getIndex());
                    break;
                case 3:
                    System.out.println("3. Set Host");
                    electricManager.setHost(getIndex(), addNewHost());
                    break;
                case 4:
                    System.out.println("4. Show list Host");
                    electricManager.showHostList();
                    break;
                case 5:
                    System.out.println("5. Show Money");
                    checkHost(electricManager);
                    break;
                case 6:
                    System.out.println("6. Search Host");
                    searchHost(electricManager);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
                    break;
            }
        }

    }

    private static Host addNewHost() {
        System.out.println("Enter name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Enter numberHouse: ");
        Scanner scanner1 = new Scanner(System.in);
        String number = scanner1.nextLine();

        System.out.println("Enter codeElectric: ");
        Scanner scanner2 = new Scanner(System.in);
        String code = scanner2.nextLine();

        return new Host(name, number,code);
    }
    private static int getIndex() {
        System.out.println("Enter index: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static void showMoney(ElectricManager electricManager, Host host) {
        System.out.println("Enter oldNumber: ");
        Scanner scanner = new Scanner(System.in);
        int old = scanner.nextInt();

        System.out.println("Enter newNumber: ");
        Scanner scanner1 = new Scanner(System.in);
        int newNum = scanner1.nextInt();

        Receipt receipt = new Receipt(host, old, newNum);
        electricManager.addReceipt(receipt);
        System.out.println(receipt);
        System.out.println(receipt.getRealMoney());
    }

    private static void checkHost(ElectricManager electricManager) {
        System.out.println("Enter codeElectric: ");
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        if (electricManager.searchCodeHost(code) != -1) {
            showMoney(electricManager,electricManager.searchHost(code));
        } else {
            System.out.println("Not found!");

        }
    }

    private static void searchHost(ElectricManager electricManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numberHouse: ");
        String numberHouse = scanner.nextLine();
        electricManager.searchHost(numberHouse);
    }

}
