package padraostate;

import java.util.Scanner;

public class SimuladorEncontro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mulher mulher = new Mulher();

        System.out.println("--- Simulador: Ensinando a Namorar (Padrão State) ---");
        System.out.println("Objetivo: Mudar o estado da pessoa de 'Indisposta' para 'Exitada'.\n");

        while (true) {
            System.out.println("\n[Estado Atual: " + mulher.getNomeEstadoAtual() + "]");
            System.out.println("Escolha sua ação:");
            System.out.println("1 - Elogiar");
            System.out.println("2 - Contar piada");
            System.out.println("3 - Convidar para Sair");
            System.out.println("4 - Cancelar Programa (Cuidado!)");
            System.out.println("5 - Sair do Programa");
            System.out.print("> ");

            int escolha = -1;
            try {
                escolha = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(">> Por favor, digite um número válido.");
                continue;
            }

            if (escolha == 5) {
                break;
            }


            switch (escolha) {
                case 1:
                    mulher.elogiar();
                    break;
                case 2:
                    mulher.contarPiada();
                    break;
                case 3:
                    mulher.convidarParaSair();
                    break;
                case 4:
                    mulher.cancelarPrograma();
                    break;
                default:
                    System.out.println(">> Ação inválida. Tente novamente.");
                    break;
            }
        }

        System.out.println("\n--- Fim da Simulação ---");
        scanner.close();
    }
}