package proyecto;

import java.util.Random;
import java.util.Scanner;

public class Proyecto {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        
        Agregar agregar = new Agregar();
        agregar.setVisible(true);

        //Programa que controle la cantidad de pacientes para atender
        //Clinica Fe y Alegria
        //Ginecología,  odontolgía y pediatría
        //Pacientes diarios totales = 50
        //Doctores = 5
        //Pacientes atendidos por doctor al día = 10
        
        int doctores[] = new int[5];
        int presentes = 0, noPresentes = 0;
        int pacientes = 10;
        double aumentador = 0;
        String cargo = null;
        int presentesPaso, noPresentesPaso;

        int i = 0;
        while (i < 4) {
            i = i + 1;
            System.out.println("");
            System.out.println("\033[33m -----> Día " + i + " <----- ");

            if (noPresentes > 0) {
                aumentador = (noPresentes * 10) / presentes;
            }

            System.out.println(presentes);
            System.out.println(noPresentes);
            System.out.println("Aumentador: " + aumentador);

            presentes = 0;
            noPresentes = 0;

            //Asistencia de doctores
            
            for (int j = 0; j < doctores.length; j++) {
                int asistenciaDoctores = (int) (Math.random() * 2);

                if (asistenciaDoctores == 0) {
                    presentes = presentes + 1;
                } else {
                    noPresentes = noPresentes + 1;
                }
            }

            System.out.println("");
            System.out.println("Asistieron un total de " + presentes + " doctores");
            System.out.println("Faltaron un total de " + noPresentes + " doctores");
            System.out.println("");
            
            presentesPaso = presentes;
            noPresentesPaso = noPresentes;
            System.out.println(presentesPaso + " y " + noPresentesPaso);

            //Cargos de los doctores
            
            int doctoresPresentes[] = new int[presentes];

            for (int j = 0; j < doctoresPresentes.length; j++) {
                int randomDos = (int) (Math.random() * 3);
                
                if (noPresentes > 0) {
                    
                }

                switch (randomDos) {
                    case 0:
                        cargo = "Ginecología";
                        break;
                    case 1:
                        cargo = "Odontología";
                        break;
                    case 2:
                        cargo = "Pediatría";
                        break;
                    default:
                        break;
                }
                doctoresPresentes[j] = j+1;
                System.out.println("El doctor #" + doctoresPresentes[j] + " ocupa el cargo de " + cargo + " y se encarga de " + (pacientes+aumentador) + " pacientes");
            }
            
            
        }

    }
}
