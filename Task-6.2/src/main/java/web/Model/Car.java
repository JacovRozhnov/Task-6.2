package web.Model;

public class Car {

    private  int age;

    private String model;

    private String series;

    public Car(int age, String model, String series) {
        this.age = age;
        this.model = model;
        this.series = series;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}
