package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Schritt 1: Erstellt eine Klasse mit einer statischen Variable 'totalCount' und
        // einer instanziellen Variable 'instanceCount'. Initialisiert beide Variablen
        // mit dem Wert 0.
        // Schritt 2: Schreibt eine statische Methode 'incrementTotalCount', die die
        // 'totalCount' um 1 erhöht.
        // Schritt 3: Schreibt eine instanzielle Methode 'incrementInstanceCount', die
        // die 'instanceCount' für das Objekt um 1 erhöht.
        // Schritt 4: Erstellt in der main-Methode mehrere Objekte der Klasse und ruft
        // sowohl die statische als auch die instanzielle Methode auf
        // Schritt 5: Gebt nach den Methodenaufrufen die aktuellen Werte von 'totalCount'
        // und 'instanceCount' aus.

        StaticExample st1 = new StaticExample();
        StaticExample st2 = new StaticExample();
        StaticExample st3 = new StaticExample();

        st1.incrementInstanceCount();
        st1.incrementTotalCount();
        st2.incrementInstanceCount();
        st2.incrementInstanceCount();
        st2.incrementTotalCount();
        st2.incrementTotalCount();
        st3.incrementInstanceCount();
        st3.incrementInstanceCount();
        st3.incrementInstanceCount();
        st3.incrementTotalCount();
        st3.incrementTotalCount();
        st3.incrementTotalCount();

        System.out.println("st1.instanceCount: " + st1.instanceCount + ", st1.totalCount: " + st1.totalCount);
        System.out.println("st2.instanceCount: " + st2.instanceCount + ", st2.totalCount: " + st2.totalCount);
        System.out.println("st3.instanceCount: " + st3.instanceCount + ", st3.totalCount: " + st3.totalCount);

        System.out.println("StaticExample.totalCount: " + StaticExample.totalCount);

    }
}