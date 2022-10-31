package com.example.recyclerview;

public class State {

    private String name; // название
    private String capital;  // столица
    private String square;  //площадь
    private String population;  //население
    private int flagResource; // ресурс флага

    public State(String name, String capital, String square, String population, int flag){

        this.name = name;
        this.capital = capital;
        this.square = square;
        this.population = population;
        this.flagResource = flag;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getSquare() {
        return this.square;
    }

    public void setSquare(String square) {
        this.square = square;
    }

    public String getPopulation() {
        return this.population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public int getFlagResource() {
        return this.flagResource;
    }

    public void setFlagResource(int flagResource) {
        this.flagResource = flagResource;
    }
}
