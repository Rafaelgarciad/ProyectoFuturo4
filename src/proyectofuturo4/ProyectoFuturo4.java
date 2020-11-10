/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofuturo4;

/**
 *
 * @author garri
 */
public class ProyectoFuturo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int modulos = 5;
        int horas = 30;
        System.out.println("Estudiante " + args[0] + " " + args[1] + " : ");
        
    }
        
    private static String veredicto(String[] args) {
        String valor1,valor2;
        valor1 = args[0];
        valor2 = args[1];
        
        if (valor1.equals(valor2)) {
        return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
        return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
        
        }
    }
    

