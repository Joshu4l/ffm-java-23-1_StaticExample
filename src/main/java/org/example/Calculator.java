package org.example;

 /* Bonusaufgabe:

    Erstellt eine neue Klasse 'Calculator' mit einer statischen Methode 'add', die zwei Zahlen
    als Parameter entgegennimmt und ihre Summe zurückgibt.

    Schreibt in der main-Methode Code, um die 'add'-Methode
    aufzurufen und das Ergebnis auszugeben.

    Optional: Implementiert weitere statische Methoden in der 'Calculator'-Klasse
    (Subtraktion, Multiplikation, Division) und ruft sie in der main-Methode auf.
     */

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int div(int a, int b) {
        if(b==0){
            System.out.println( "Error");
        }
        return a / b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }

}
