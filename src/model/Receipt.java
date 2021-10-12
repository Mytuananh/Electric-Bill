package model;

public class Receipt {
    private Host host;
    private int oldNumber;
    private int newNumber;
    private double money = 750;

    public Receipt() {
    }

    public Receipt(Host host, int oldNumber, int newNumber) {
        this.host = host;
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
    }

    public Receipt(Host host, int oldNumber, int newNumber, double money) {
        this.host = host;
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
        this.money = money;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public int getOldNumber() {
        return oldNumber;
    }

    public void setOldNumber(int oldNumber) {
        this.oldNumber = oldNumber;
    }

    public int getNewNumber() {
        return newNumber;
    }

    public void setNewNumber(int newNumber) {
        this.newNumber = newNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getRealMoney() {
        return (getNewNumber() - getOldNumber()) * money;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                " oldNumber = " + oldNumber +
                ", newNumber = " + newNumber +
                '}';
    }
}
