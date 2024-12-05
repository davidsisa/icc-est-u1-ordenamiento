package controllers;

import models.Person;

public class ShortingMethods {
    public void sortByNameWithBuble(Person[] personas) {
        int n = personas.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (personas[j].getPersonas().compareToIgnoreCase(personas[j + 1].getPersonas()) > 0) {
                    Person temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public void sortByNameWithSelectio(Person[] personas) {
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (personas[j].getPersonas().compareToIgnoreCase(personas[minIndex].getPersonas()) < 0) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Person temp = personas[i];
                personas[i] = personas[minIndex];
                personas[minIndex] = temp;
            }
        }
    }

    public void sortByAge(Person[] personas) {
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (personas[j].getAnio() < personas[i].getAnio()) {
                    Person temp = personas[i];
                    personas[i] = personas[j];
                    personas[j] = temp;
                }
            }
        }
    }
}

