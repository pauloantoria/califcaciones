package com.calculadora;

public class Alumno {
    private String nombre;
    private double[] calificaciones;


    public String getNombre(){
        return this.nombre;

    }

    public void setNombre(String nombre){
        this.nombre = nombre;

    }
    public double[] getCalificaciones(){
        return this.calificaciones;
    }

    public void setCalificaciones(double[] calificaciones){
        this.calificaciones = calificaciones;
    }

    public double getPromedio(){
        double suma = 0;
        for (int i=0; i<this.calificaciones.length;i++){
            suma += calificaciones[i];

        }

        return suma/this.calificaciones.length;

    }

    public char getCalificacionFinal(double promedio){
        if(promedio < 50) return 'F';
        if(promedio > 50 && promedio <= 60) return 'E';
        if(promedio > 60 && promedio <= 70) return 'D';
        if(promedio > 70 && promedio <= 80) return 'C';
        if(promedio > 80 && promedio <= 90) return 'B';
        if(promedio > 90 && promedio <= 100) return 'A';
        return 'F';

    }

    public void imprimeResultados(){
        System.out.println("Nombre del estudiante "+ this.getNombre());
        for (int i=0;i<this.calificaciones.length;i++){
            System.out.println("Calificación "+ (i+1) + ": " + this.calificaciones[i]);

        }

        double promedio = this.getPromedio();
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación final: " + this.getCalificacionFinal(promedio));

    }
}
