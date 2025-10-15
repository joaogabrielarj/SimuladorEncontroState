package padraostate;

public class EstadoInteressada implements Estado {

    @Override
    public void elogiar(Mulher mulher) {
        System.out.println(">> Resposta: Que legal que você pensou nisso! Obrigada!");
    }

    @Override
    public void contarPiada(Mulher mulher) {
        System.out.println(">> Resposta: Poxa, que pena... achei que você era diferente. (O estado regrediu para: Indisposta)");
        mulher.alterarEstado(new EstadoIndisposta());
    }

    @Override
    public void convidarParaSair(Mulher mulher) {
        System.out.println(">> Resposta: SIM! Adoraria sair com você! (O estado mudou para: Exitada)");
        System.out.println("\n****************************************************");
        System.out.println("*** PARABÉNS! Você conseguiu o encontro! Hoje tem! ***");
        System.out.println("****************************************************");
        mulher.alterarEstado(new EstadoExitada());
    }

    @Override
    public void cancelarPrograma(Mulher mulher) {
        System.out.println(">> Resposta: Que? Calma, não entendi.");
    }
}