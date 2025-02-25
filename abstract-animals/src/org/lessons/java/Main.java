package org.lessons.java;

public class Main {
    public static void main(String[] args) {

        // creo i vari animali
        Animale cane = new Cane("abbaiare", "crocchette");
        Animale passerotto = new Passerotto("cinguettare", "vermi");
        Animale aquila = new Aquila("strido", "carne");
        Animale delfino = new Delfino("scoppiettare", "pesce");

        // testo i vari metodi
        cane.verso();
        passerotto.mangia();
        aquila.dormi();
        delfino.mangia();
    }
}
