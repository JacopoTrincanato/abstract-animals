package org.lessons.java;

public class Cane extends Animale {

    // costruttore
    public Cane(String verso, String cibo) {
        // richiamo il costruttore della superclasse
        super(verso, cibo);
    }

    // implemento i metodi astratti
    @Override
    public void verso() {
        System.out.println(this.verso);
    }

    @Override
    public void mangia() {
        System.out.println(this.cibo);
    }

}
