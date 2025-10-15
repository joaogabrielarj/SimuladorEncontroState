package padraostate;

public class EstadoIndisposta implements Estado {

    @Override
    public void elogiar(Mulher mulher) {
        System.out.println(">> Resposta: Humpf... obrigada. (O estado mudou para: Disposta)");
        mulher.alterarEstado(new EstadoDisposta());
    }

    @Override
    public void falarBobagem(Mulher mulher) {
        System.out.println(">> Resposta: ... (silêncio total)");
    }

    @Override
    public void convidarParaSair(Mulher mulher) {
        System.out.println(">> Resposta: Não.");
    }

    @Override
    public void cancelarPrograma(Mulher mulher) {
        System.out.println(">> Resposta: Que programa? Nem sabia que tínhamos algo.");
    }
}