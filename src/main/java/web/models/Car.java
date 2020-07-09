package web.models;

public class Car {
    //int id, series;
    String name;
    String model;
    int series;

    /*public Car(String name, int series) {
        this.name = name;
        this.series = series;
    }
  */
    public Car(String name,String model, int series) {
      //  this.id = id;
        this.model = model;
        this.name = name;
        this.series = series;
    }

  /*  public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } */

    public String getName(){return name;}

    public void setName(String name) {this.name = name;}

    public String getModel(){return  model;}

    public void setModel(String model){this.model = model;}

    public  int getSeries(){return series;}

    public void setSeries(int series){
        this.series = series;
    }

}
