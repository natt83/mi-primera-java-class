package com.kata;

public class Persona {
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private int añoNacimiento;
    private String paisNacimiento;
    private char genero;

    
    public Persona(String nombre, String apellido, String numeroDocumento, int añoNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.añoNacimiento = añoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    
    public Persona(String nombre2, String apellido2, int i, int añoNacimiento2, String paisNacimiento2, char genero2) {
        //TODO Auto-generated constructor stub
    }


    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Número de Documento: " + numeroDocumento);
        System.out.println("Año de Nacimiento: " + añoNacimiento);
        System.out.println("País de Nacimiento: " + paisNacimiento);
        System.out.println("Género: " + genero);
    }

    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Daniel", "Guiterrez", "123456789", 1980,"Cantabria",'H');
        Persona persona2 = new Persona("Natalia", "Garcia", "987654321", 1983,"Asturias",'F');

        
        System.out.println("Persona 1:");
        persona1.imprimir();
        System.out.println();

        
        System.out.println("Persona 2:");
        persona2.imprimir();
    }}
