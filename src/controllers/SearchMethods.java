package controllers;

import models.Person;

public class SearchMethods {
    public int sequentialSearchByName(Person[] personas, String nombre) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getPersonas().equalsIgnoreCase(nombre)) {
                return i; 
            }
        }
        System.out.println("Persona no encontrada.");
        return -1; 
    }
    
    public int binarySearchByName(Person[] personas, String nombre) {
        int inicio = 0;
        int fin = personas.length - 1;
    
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            int comparacion = personas[medio].getPersonas().compareToIgnoreCase(nombre);
    
            if (comparacion == 0) {
                return medio; 
            }
    
            if (comparacion < 0) {
                inicio = medio + 1; 
            } else {
                fin = medio - 1; 
            }
        }
        System.out.println("Persona no encontrada.");
        return -1; 
    }
    
}
