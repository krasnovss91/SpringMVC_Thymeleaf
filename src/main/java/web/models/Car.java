package web.models;

public class Car {
    int id, series;
    String name;

    public Car(String name, int series) {
        this.name = name;
        this.series = series;
    }

    public Car(int id, String name, int series) {
        this.id = id;
        this.name = name;
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){return name;}

    public void setName(String name) {this.name = name;}

    public  int getSeries(){return series;}

    public void setSeries(int series){
        this.series = series;
    }

}
