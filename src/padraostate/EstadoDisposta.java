package padraostate;

public class EstadoDisposta implements Estado {

    @Override
    public void elogiar(Mulher mulher) {
        System.out.println(">> Resposta: Hehe, que fofo você. (O estado mudou para: Interessada)");
        mulher.alterarEstado(new EstadoInteressada());
    }

    @Override
    public void contarPiada(Mulher mulher) {
        System.out.println(">> Resposta: Ah, tá... (O estado regrediu para: Indisposta)");
        mulher.alterarEstado(new EstadoIndisposta());
    }

    @Override
    public void convidarParaSair(Mulher mulher) {
        System.out.println(">> Resposta: Hmm, talvez... ainda não te conheço direito.");
    }

    @Override
    public void cancelarPrograma(Mulher mulher) {
        System.out.println(">> Resposta: Ué, ok...?");
    }
}