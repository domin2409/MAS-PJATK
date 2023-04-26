package org.example;

public class Boat implements IBoat{
    private double draft;
    private String hullType;

    public Boat(double draft, String hullType) {
        this.draft = draft;
        this.hullType = hullType;
    }
    @Override
    public void sail() {
        System.out.println("Sailing a " + hullType + " boat with a draft of " + draft + " meters.");
    }


    @Override
    public double GetDraft() {
        return this.draft;
    }

    @Override
    public String GetHullType() {
        return this.hullType;
    }
}