package org.example;

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

        /* Bonusaufgabe.

        Erstellt eine neue Klasse 'Calculator' mit einer statischen Methode 'add', die zwei Zahlen
        als Parameter entgegennimmt und ihre Summe zurückgibt.

        Schreibt in der main-Methode Code, um die 'add'-Methode
        aufzurufen und das Ergebnis auszugeben.

        Optional: Implementiert weitere statische Methoden in der 'Calculator'-Klasse (Subtraktion, Multiplikation, Division) und ruft sie in der main-Methode auf.
         */

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

        System.out.println("\n   Calculator   ");
        System.out.println("   add   (  1, 5 ) -> " + Calculator.add  ( 1,5));
        System.out.println("   sub   (  1, 5 ) -> " + Calculator.sub  ( 1,5));
        System.out.println("   div   ( 26, 5 ) -> " + Calculator.div  (26,5) + " Rest: " + Calculator.mod(26,5));
        System.out.println("   multi (  3, 5 ) -> " + Calculator.multi( 3,5));

    }
}