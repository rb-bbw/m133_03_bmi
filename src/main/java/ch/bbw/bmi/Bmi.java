package ch.bbw.bmi;

public class Bmi {
    private double bmi;
    private int height;
    private int weight;

    public void calculateBmi(){
        this.bmi = this.weight / Math.pow(this.height / 100.0, 2);
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }
    public void setBmi() {
        calculateBmi();
    }

    public String toString() {
        return this.height + ", " + this.weight + ", " + getBmi();
    }
}
