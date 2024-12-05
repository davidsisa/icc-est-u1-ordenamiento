package models;

public class Person {
    private String personas;
    private int anio;
    
    public Person(String personas, int anio) {
        this.personas = personas;
        this.anio = anio;
    }
    public String getPersonas() {
        return personas;
    }
    public void setPersonas(String personas) {
        this.personas = personas;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
}
