package org.lessons.java.utils;
public class App {
    public static void main(String[] args) throws Exception {
        int sommaInteri = CalcoliHelper.somma(5, 7);
        double sommaDouble = CalcoliHelper.somma(3.3, 4.4);
        int differenzaInteri = CalcoliHelper.differenza(10, 4);
        double differenzaDouble = CalcoliHelper.differenza(7.5, 2.2);
        int valoreAssolutoIntero = CalcoliHelper.assoluto(-10);
        double valoreAssolutoDouble = CalcoliHelper.assoluto(-5.5);
        int minimoInteri = CalcoliHelper.minimo(8, 3);
        double minimoDouble = CalcoliHelper.minimo(2.2, 4.4);
        int massimoInteri = CalcoliHelper.massimo(6, 9);
        double massimoDouble = CalcoliHelper.massimo(1.1, 0.9);

        System.out.println("Somma interi: " + sommaInteri);
        System.out.println("Somma double: " + sommaDouble);
        System.out.println("Differenza interi: " + differenzaInteri);
        System.out.println("Differenza double: " + differenzaDouble);
        System.out.println("Valore assoluto intero: " + valoreAssolutoIntero);
        System.out.println("Valore assoluto double: " + valoreAssolutoDouble);
        System.out.println("Minimo interi: " + minimoInteri);
        System.out.println("Minimo double: " + minimoDouble);
        System.out.println("Massimo interi: " + massimoInteri);
        System.out.println("Massimo double: " + massimoDouble);
    }
}
