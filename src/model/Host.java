package model;

public class Host {
    private String name;
    private String numberHouse;
    private String codeElectric;

    public Host() {
    }

    public Host(String name, String numberHouse, String codeElectric) {
        this.name = name;
        this.numberHouse = numberHouse;
        this.codeElectric = codeElectric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(String numberHouse) {
        this.numberHouse = numberHouse;
    }

    public String getCodeElectric() {
        return codeElectric;
    }

    public void setCodeElectric(String codeElectric) {
        this.codeElectric = codeElectric;
    }

    @Override
    public String toString() {
        return "Host{" +
                "name='" + name + '\'' +
                ", numberHouse='" + numberHouse + '\'' +
                ", codeElectric='" + codeElectric + '\'' +
                '}';
    }
}
