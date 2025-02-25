package org.lessons.java;

public class Main {
    public static void main(String[] args) {

        // creo i vari animali
        Animale cane = new Cane("abbaiare", "crocchette");
        Animale passerotto = new Passerotto("cinguettare", "vermi");
        Animale aquila = new Aquila("strido", "mammiferi");
        Animale delfino = new Delfino("scoppiettare", "pesce");

        // creo animali che volano o nuotano
        IVolante aquilaVolante = new Aquila("strido", "uccelli");
        INuotante caneNuotante = new Cane("abbaiare", "carne");

        // testo i vari metodi
        cane.verso();
        passerotto.mangia();
        aquila.dormi();
        delfino.mangia();

        // testo i metodi implementati nella classe Main
        faiVolare(aquilaVolante);
        faiNuotare(caneNuotante);
    }

    // aggiungo i metodi statici faiVolare e faiNuotare
    public static void faiVolare(IVolante animale) {
        animale.vola();
    }

    public static void faiNuotare(INuotante animale) {
        animale.nuota();
    }

}
