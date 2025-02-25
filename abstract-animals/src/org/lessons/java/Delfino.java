package org.lessons.java;

public class Delfino extends Animale implements INuotante {
    // costruttore
    public Delfino(String verso, String cibo) {
        // richiamo il costruttore della superclasse
        super(verso, cibo);
    }

    // implemento i metodi astratti
    @Override
    public void verso() {
        System.out.println("Il delfino fa il seguente verso: " + this.verso);
    }

    @Override
    public void mangia() {
        System.out.println("Il delfino mangia: " + this.cibo);
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
