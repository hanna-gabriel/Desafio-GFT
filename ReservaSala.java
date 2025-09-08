
package TesteGFT;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Reserva {
    private String nome;
    private int hora;

    public Reserva(String nome, int hora) {
        this.nome = nome;
        this.hora = hora;
    }

    public String getNome() {
        return nome;
    }

    public int getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return hora + "h - " + nome;
    }
}

public class ReservaSala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Reserva> reservas = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Sistema de Reservas ---");
            System.out.println("1 - Cadastrar reserva");
            System.out.println("2 - Exibir reservas");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            if (opcao == 1) {
                System.out.print("Nome do responsavel: ");
                String nome = sc.nextLine();

                System.out.print("Hora da reserva (8h as 18h): ");
                int hora = sc.nextInt();

                if (hora < 8 || hora > 18) {
                    System.out.println(" Horario invalido! Somente entre 8h e 18h.");
                } else {
                    boolean existe = false;
                    for (Reserva r : reservas) {
                        if (r.getHora() == hora) {
                            existe = true;
                            break;
                        }
                    }

                    if (existe) {
                        System.out.println(" Ja existe uma reserva nesse horario!");
                    } else {
                        reservas.add(new Reserva(nome, hora));
                        System.out.println(" Reserva confirmada para " + hora + "h.");
                    }
                }
            } 
            else if (opcao == 2) {
                System.out.println("\n--- Reservas confirmadas ---");
                if (reservas.isEmpty()) {
                    System.out.println("Nenhuma reserva encontrada.");
                } else {
                    for (Reserva r : reservas) {
                        System.out.println(r);
                    }
                }
            } 
            else if (opcao == 0) {
                System.out.println("Saindo... Ate mais!");
                break;
            } 
            else {
                System.out.println("Opcao invalida!");
            }
        }

        sc.close();
    }
}
