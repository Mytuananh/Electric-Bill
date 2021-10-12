package control;


import model.Host;
import model.Receipt;

import java.util.ArrayList;

public class ElectricManager {
    ArrayList<Host> hostArrayList = new ArrayList<>();
    ArrayList<Receipt> receiptArrayList = new ArrayList<>();

    public ElectricManager() {
    }

    public ElectricManager(ArrayList<Host> hostArrayList, ArrayList<Receipt> receiptArrayList) {
        this.hostArrayList = hostArrayList;
        this.receiptArrayList = receiptArrayList;
    }

    public void addHost(Host newHost) {
        hostArrayList.add(newHost);
    }

    public void removeHost(int index) {
        hostArrayList.remove(index);
    }

    public void setHost(int index, Host host) {
        hostArrayList.set(index, host);
    }

    public void addReceipt(Receipt newReceipt) {
        receiptArrayList.add(newReceipt);
    }

    public void removeReceipt(int index) {
        receiptArrayList.remove(index);
    }

    public void setReceipt(int index, Receipt receipt) {
        receiptArrayList.set(index, receipt);
    }

    public ArrayList<Host> getHostArrayList() {
        return hostArrayList;
    }

    public void setHostArrayList(ArrayList<Host> hostArrayList) {
        this.hostArrayList = hostArrayList;
    }

    public ArrayList<Receipt> getReceiptArrayList() {
        return receiptArrayList;
    }

    public void setReceiptArrayList(ArrayList<Receipt> receiptArrayList) {
        this.receiptArrayList = receiptArrayList;
    }

    public int searchCodeHost(String codeElectric) {
        int index = -1;
        for (int i = 0; i < hostArrayList.size(); i++) {
            if (codeElectric.equals(hostArrayList.get(i).getCodeElectric())) {
               index = i;
            }
        }
        return index;
    }

    public Host searchHost(String numberHouse) {
        for (int i = 0; i < hostArrayList.size(); i++) {
            if (numberHouse.equals(hostArrayList.get(i).getNumberHouse())) {
                return hostArrayList.get(i);

            }
        }
        return null;
    }
    public void showHostList() {
        for (Host host: hostArrayList
             ) {
            System.out.println(host);
        }
    }

    public void showReceiptList() {
        for (Receipt receipt: receiptArrayList
             ) {
            System.out.println(receipt);
        }
    }


}
