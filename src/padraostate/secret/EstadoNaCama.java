package padraostate.secret;

import padraostate.Estado;
import padraostate.Mulher;

public class EstadoNaCama implements Estado {

    @Override
    public void interagir(Mulher mulher, String acao) {
        System.out.println("\n*******************************************************");
        System.out.println("*** Jogo zerado! Você atingiu o final secreto! ;) ***");
        System.out.println("*******************************************************");

        switch (acao) {
            case "Elogiar":
                System.out.println(">> Resposta: (Ela sorri de uma forma que você nunca viu antes)");
                break;
            case "FalarBobagem":
                System.out.println(">> Resposta: (Ela ri baixinho, abraçada a você)");
                break;
            default:
                System.out.println(">> Resposta: (Não há mais nada a ser dito...)");
                break;
        }
    }
}