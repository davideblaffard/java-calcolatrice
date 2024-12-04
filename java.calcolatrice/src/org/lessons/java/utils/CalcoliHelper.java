package org.lessons.java.utils;

public class CalcoliHelper {
    private CalcoliHelper() {
        
    }

    // Metodo per sommare due numeri interi
    public static int somma(int primoValore, int secondoValore) {
        return primoValore + secondoValore;
    }

    // Metodo per sommare due numeri double
    public static double somma(double primoValore, double secondoValore) {
        return primoValore + secondoValore;
    }

    public static int differenza(int primoValore, int secondoValore) {
        return primoValore - secondoValore;
    }

    public static double differenza(double primoValore, double secondoValore) {
        return primoValore - secondoValore;
    }

    public static int prodotto(int primoValore, int secondoValore) {
        return primoValore * secondoValore;
    }

    public static double prodotto(double primoValore, double secondoValore) {
        return primoValore * secondoValore;
    }

    public static int assoluto(int primoValore) {
        if(primoValore<0){
            return primoValore * -1;
        }
        return primoValore ;
    }

    public static double assoluto(double primoValore) {
        if(primoValore<0){
            return primoValore * -1;
        }
        return primoValore ;
    }

    public static int massimo(int primoValore, int secondoValore) {
        if(primoValore>secondoValore){
            return primoValore;
        }
        return secondoValore ;
    }
    
    public static double massimo(double primoValore, double secondoValore){
        if(primoValore>secondoValore){
            return primoValore;
        }
        return secondoValore;
    }

    public static int minimo(int primoValore, int secondoValore) {
        if(primoValore<secondoValore){
            return primoValore;
        }
        return secondoValore ;
    }
    
    public static double minimo(double primoValore, double secondoValore){
        if(primoValore<secondoValore){
            return primoValore;
        }
        return secondoValore;
    }

}
