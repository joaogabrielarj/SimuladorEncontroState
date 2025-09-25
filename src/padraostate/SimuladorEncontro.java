package padraostate;

import java.util.Scanner;

public class SimuladorEncontro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mulher mulher = new Mulher();

        System.out.println("--- Simulador: Ensinando a Namorar (Padrão State) ---");
        System.out.println("Objetivo: Mudar o estado da pessoa de 'Indisposta' para 'Exitada'.\n");

        while (true) {
            System.out.println("\n[Estado Atual: " + mulher.getNomeEstadoAtual().replace("Estado", "") + "]");

            System.out.println("Escolha sua ação:");
            System.out.println("1 - Elogiar");
            System.out.println("2 - Falar Bobagem");
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

            String acao = "";
            boolean sair = false;

            switch (escolha) {
                case 1:
                    acao = "Elogiar";
                    break;
                case 2:
                    acao = "FalarBobagem";
                    break;
                case 3:
                    acao = "ConvidarParaSair";
                    break;
                case 4:
                    acao = "CancelarPrograma";
                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    System.out.println(">> Ação inválida. Tente novamente.");
                    continue;
            }

            if (sair) {
                System.out.println("--- Fim da Simulação ---");
                break;
            }

            mulher.interagir(acao);
        }

        scanner.close();
    }
}