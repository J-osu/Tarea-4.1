package org.example;

import java.util.Scanner;

public class fizzbuzz {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //fizzbuzz.numerdo10();
        //fizzbuzz.Clear();
        fizzbuzz.numeroN();
        //fizzbuzz.Clear();
        fizzbuzz.bizzbuss();
        //fizzbuzz.Clear();
        fizzbuzz.Ejercicio15();
    }

    public static void Clear(){
        System.out.println("");
        System.out.print("Desea continuar s/n: ");
        char n = fizzbuzz.sc.next().toLowerCase().charAt(0);
        if (n == 's'){
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

    public static void numerdo10(){
        //Comentario de muestro para el commit.
        for (int i = 5; i < 11; i++) {
            System.out.println(i);
        }
    }

    public static void numeroN(){
        System.out.println("Introduce el valor de n: ");
        int n = fizzbuzz.sc.nextInt();
        for (int i = 1; i < n ; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int sumarN(int n){
        //tines que introducir un numero.
        System.out.println("Introduce el valor de n: ");
        n = fizzbuzz.sc.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++){
            suma +=i;
        }
        return suma;

    }

    public static void bizzbuss(){
         //tines que introducir un numero.
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();
        for (int i = 1; i<= num ; i++) {
            boolean divisiblede3 = i % 3 == 0;
            boolean divisiblede5 = i % 5 == 0;
            if (divisiblede3 && divisiblede5) {
                System.out.println("osopas");
            } else if (divisiblede3) {
                System.out.println("fizz");
            } else if (divisiblede5) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void ejer1(){
        System.out.print("El multiplo: ");
        int multiplo = fizzbuzz.sc.nextInt();
        for (int i = 1; i <= 100; i++) {
            if (i % multiplo == 0) {
                System.out.println(i+", ");
                i++;
            }
        }
    }

    public static void ejer2(){
        System.out.print("El multiplo: ");
        int multiplo = fizzbuzz.sc.nextInt();
        int i = 0;
        while (i<=100) {
            if (i % multiplo == 0) {
                System.out.print(i+", ");
                i++;
            }
        }
    }

    public static void Ejercicio15(){
        System.out.print("Introduce un numero base: ");
        int n = sc.nextInt();
        System.out.print("Introduce un exponente: ");
        int exp = sc.nextInt();
        for(int i = 1; i <= exp; i++){
            int pot = fizzbuzz.exponente(n, i);
            System.out.print(pot);
            System.out.print(", ");
        }

    }

    public static int exponente(int n, int exp){
        int producto = 1;
        for(int i = 1; i <= exp; i++){
            producto = n*producto;
        }
        return producto;
    }

    public static void Ejercicio16(){
        System.out.print("Introduce un numero: ");
        int numero = fizzbuzz.sc.nextInt();
        for (int i = 2; i <= numero; i++){
            if (esPrimo(i)) {
                System.out.print( i+", ");
            }
        }
    }

    public static boolean esPrimo(int numero){
        int i =2;
        while (i <= numero -1) {
            if (numero % i != 0) {
                System.out.print("El numero "+numero+" es primo");
            }
            i++;
        }
        return true;
    }
}
