
package TesteGFT;

import java.util.Scanner;

public class CalculadoraEstudo {

    public static void main(String[] args) {
        


        Scanner sc = new Scanner(System.in);

        
        System.out.print("Quantos dias de estudo nesta semana (de 1 a 7)? ");
        int dias = sc.nextInt();

        int[] horas = new int[dias];
        int total = 0;

        
        System.out.println("Digite as horas de estudo de cada dia:");
        for (int i = 0; i < dias; i++) {
            horas[i] = sc.nextInt();
            total += horas[i];
        }

        
        double media = (double) total / dias;

        
        System.out.println("\nDias de estudo: " + dias);
        System.out.print("Horas: ");
        for (int h : horas) {
            System.out.print(h + " ");
        }
        System.out.println("\nTotal: " + total + " horas");
        System.out.printf("Media: %.1f horas/dia\n", media);

        
        if (total >= 20) {
            System.out.println("Meta atingida");
        } else {
            System.out.println("Meta não atingida");
        }

        sc.close();
    }
}
    
    

