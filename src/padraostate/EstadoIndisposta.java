package padraostate;

public class EstadoIndisposta implements Estado {

    @Override
    public void interagir(Mulher mulher, String acao) {
        switch (acao) {
            case "Elogiar":
                System.out.println(">> Resposta: Humpf... obrigada. (O estado mudou para: Disposta)");
                mulher.alterar_estado(new EstadoDisposta());
                break;
            case "FalarBobagem":
                System.out.println(">> Resposta: ... (silêncio total)");
                break;
            case "ConvidarParaSair":
                System.out.println(">> Resposta: Não.");
                break;
            case "CancelarPrograma":
                System.out.println(">> Resposta: Que programa? Nem sabia que tínhamos algo.");
                break;
            default:
                System.out.println(">> Resposta: Tô ocupada agora.");
                break;
        }
    }
}