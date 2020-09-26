package com.calculadora;

public class Main {

    public static void main(String[] args) {
        Alumno paulo = new Alumno();

        double[] calificaciones = {80,79,98,100,88};
        paulo.setNombre("Paulo");
        paulo.setCalificaciones(calificaciones);

        paulo.imprimeResultados();
    }
}
