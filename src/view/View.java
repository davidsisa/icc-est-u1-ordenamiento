package view;
import java.util.Scanner;
import models.Person;
public class View {
    private Scanner scanner;

    public View(){
        scanner =new Scanner(System.in);
    }

    public int showMenu() {
        System.out.println("1. Ingresar personas");
        System.out.println("2. Agregar más personas");
        System.out.println("3. Ordenar personas");
        System.out.println("4. Mostrar todas las personas");
        System.out.println("100. Salir");
        System.out.print("Ingrese una opción: ");
        return scanner.nextInt();
    }

    public int inputInt(String mensaje){
        System.out.println(mensaje);
        return scanner.nextInt();
    

    } 
    public Person inputPerson(){
        String name=inputName();
        int age = inputAge();
            return new Person(name,age);
    
    }
    public String inputName(){
        System.out.println("ingrese el nombre: ");
        return scanner.next();

    }
    public int inputAge(){
        return inputInt("ingrese la edad");

    }

    public void showMensajae(String mensaje) {
       System.out.println("Datos "+mensaje);

    }
    public int selectSortingMethod(){
        System.out.println("******* ingreso la condicion a ordenar *******");
        System.out.println("1. por nombre: ");
        System.out.println("2. por edad: ");
        System.out.println();
        return scanner.nextInt();
        
    }
    public void showPeople(Person[] personas) {
        System.out.println("Lista de personas:");
        for (Person persona : personas) {
            System.out.println("Nombre: " + persona.getPersonas() + ", Edad: " + persona.getAnio());
        }
    }

        
}
