package padraostate;

public class EstadoDisposta implements Estado {

    @Override
    public void interagir(Mulher mulher, String acao) {
        switch (acao) {
            case "Elogiar":
                System.out.println(">> Resposta: Hehe, que fofo você. (O estado mudou para: Interessada)");
                mulher.alterar_estado(new EstadoInteressada());
                break;
            case "FalarBobagem":
                System.out.println(">> Resposta: Ah, tá... (O estado regrediu para: Indisposta)");
                mulher.alterar_estado(new EstadoIndisposta());
                break;
            case "ConvidarParaSair":
                System.out.println(">> Resposta: Hmm, talvez... ainda não te conheço direito.");
                break;
            case "CancelarPrograma":
                System.out.println(">> Resposta: Ué, ok...?");
                break;
            default:
                System.out.println(">> Resposta: Oi, tudo bem?");
                break;
        }
    }
}