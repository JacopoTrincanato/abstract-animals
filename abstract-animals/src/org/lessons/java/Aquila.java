package org.lessons.java;

public class Aquila extends Animale implements IVolante {
    // costruttore
    public Aquila(String verso, String cibo) {
        // richiamo il costruttore della superclasse
        super(verso, cibo);
    }

    // implemento i metodi astratti
    @Override
    public void verso() {
        System.out.println("l'aquila fa il seguente verso: " + this.verso);
    }

    @Override
    public void mangia() {
        System.out.println("l'aquila mangia: " + this.cibo);
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
