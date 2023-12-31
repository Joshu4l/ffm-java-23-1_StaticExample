package org.example;

public class StaticExample {
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

    static int totalCount = 0;
    int instanceCount = 0;

    public static void incrementTotalCount () {
        totalCount++;
    }

    public void incrementInstanceCount(){
        instanceCount++;
    }
}
