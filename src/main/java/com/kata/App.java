package com.kata;

public class App {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Daniel", "Gutierrez", "123456789", 1980, "Cantabria", 'H');
        Persona persona2 = new Persona("Natalia", "Garcia", 987654321, 1983, "Asturias", 'F');
        
        System.out.println("Persona 1:");
        persona1.imprimir();

        System.out.println("Persona2:");
        persona2.imprimir();
        
       
    }
   

}


