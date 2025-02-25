package org.lessons.java;

public class Passerotto extends Animale implements IVolante {
    // costruttore
    public Passerotto(String verso, String cibo) {
        // richiamo il costruttore della superclasse
        super(verso, cibo);
    }

    // implemento i metodi astratti
    @Override
    public void verso() {
        System.out.println("Il passerotto fa il seguente verso: " + this.verso);
    }

    @Override
    public void mangia() {
        System.out.println("Il passerotto mangia: " + this.cibo);
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
