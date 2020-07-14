package web.models;

public class Car {
    String name;
    String model;
    int series;


    public Car(String name, String model, int series) {
        this.model = model;
        this.name = name;
        this.series = series;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

}
