package controllers;

import models.Person;
import view.View;
//hola
public class Controller {
    private View view;
    private ShortingMethods shortingMethods;
    private SearchMethods searchMethod;

    private Person[] personas;

    public Controller(View view, ShortingMethods shortingMethods, SearchMethods searchMethods) {
        this.view = view;
        this.shortingMethods = shortingMethods;
        this.searchMethod = searchMethods;
        System.out.println("Controller created");
    }

    public void start() {
        int option = 0;
        do {
            option = view.showMenu();
            switch (option) {
                case 1:
                    inputPersonas();
                    break;
                case 2:
                    addPerson();
                    break;
                case 3:
                    sortPerson();
                    break;
                case 4:
                    view.showPeople(personas);
                    break;
                case 100:
                    System.out.println("Finalizado");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (option != 100);
    }

    public void inputPersonas() {
        int numeroPersonas = view.inputInt("Ingrese el número de personas: ");
        personas = new Person[numeroPersonas];

        for (int i = 0; i < numeroPersonas; i++) {
            personas[i] = view.inputPerson();
        }
    }

    public void addPerson() {
        if (personas == null) {
            view.showMensajae("Datos no ingresados");
            inputPersonas();
        } else {
            int numeroPersonas = view.inputInt("Ingrese el número de personas a agregar: ");
            Person[] personasTotales = new Person[personas.length + numeroPersonas];

            for (int i = 0; i < personas.length; i++) {
                personasTotales[i] = personas[i];
            }

            for (int i = personas.length; i < personasTotales.length; i++) {
                personasTotales[i] = view.inputPerson();
            }

            personas = personasTotales;
        }
    }

    public void sortPerson() {
        int sortingOption = view.selectSortingMethod();
        
        switch (sortingOption) {
            case 1:
                shortingMethods.sortByNameWithBuble(personas);
                break;
            case 2:
                shortingMethods.sortByNameWithSelectio(personas);
                break;
            case 3:
                shortingMethods.sortByAge(personas);
                break;
            default:
                view.showMensajae("Opción no válida");
                break;
        }
    
        view.showPeople(personas);
        }
    }