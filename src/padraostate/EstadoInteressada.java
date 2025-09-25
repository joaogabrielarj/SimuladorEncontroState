package padraostate;

import padraostate.secret.EstadoExitadaNovo;

public class EstadoInteressada implements Estado {

    @Override
    public void interagir(Mulher mulher, String acao) {
        switch (acao) {
            case "Elogiar":
                System.out.println(">> Resposta: Que legal que você pensou nisso! Obrigada!");
                break;
            case "FalarBobagem":
                System.out.println(">> Resposta: Poxa, que pena... achei que você era diferente. (O estado regrediu para: Indisposta)");
                mulher.alterar_estado(new EstadoIndisposta());
                break;
            case "ConvidarParaSair":
                System.out.println(">> Resposta: SIM! Adoraria sair com você! (O estado mudou para: Exitada)");

                System.out.println("\n****************************************************");
                System.out.println("*** PARABÉNS! Você conseguiu o encontro! Hoje tem! ***");
                System.out.println("****************************************************");

                mulher.alterar_estado(new EstadoExitada());
                break;
            case "CancelarPrograma":
                System.out.println(">> Resposta: Que? Calma, não entendi.");
                break;
            default:
                System.out.println(">> Resposta: E aí, o que mais você gosta de fazer?");
                break;
        }
    }
}