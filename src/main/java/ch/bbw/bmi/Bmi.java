package ch.bbw.bmi;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.io.Serializable;

@Component
@SessionScope
public class Bmi implements Serializable {
    private int count;

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

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public void incrementCount() {
        this.count += 1;
    }
}
