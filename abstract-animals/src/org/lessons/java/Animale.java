package org.lessons.java;

public abstract class Animale {
    // attributi
    protected String verso;
    protected String cibo;

    // costruttore
    public Animale(String verso, String cibo) {

        this.verso = verso;
        this.cibo = cibo;
    }

    // metodi
    public void dormi() {
        System.out.println("Zzz");
    }

    public abstract void verso();
}
