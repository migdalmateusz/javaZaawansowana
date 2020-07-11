package Exc26;

import java.util.List;

public class Manufacturer {

    public String name;
    public int yearOfCreation;
    List<Model> models;

    public Manufacturer(String name, int yearOfCreation, List<Model> models) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.models = models;
    }

    public List<Model> getModels() {
        return models;
    }

    public String getName() {
        return name;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                ", models=" + models +
                '}';
    }
}
