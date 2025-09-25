package padraostate;

public class EstadoExitada implements Estado {

    @Override
    public void interagir(Mulher mulher, String acao) {
        switch (acao) {
            case "Elogiar":
                System.out.println(">> Resposta: Você é incrível! Mal posso esperar!");
                break;
            case "FalarBobagem":
                System.out.println(">> Resposta: Hahaha, você é uma figura!");
                break;
            case "ConvidarParaSair":
                System.out.println(">> Resposta: Já combinamos! Estou super ansiosa!");
                break;
            case "CancelarPrograma":
                System.out.println(">> Resposta: O QUÊ?! NÃO ACREDITO! NUNCA MAIS FALE COMIGO! (O estado regrediu para: Indisposta)");
                mulher.alterar_estado(new EstadoIndisposta());
                break;
            default:
                System.out.println(">> Resposta: AI QUE MARAVILHA! Quando? Onde?");
                break;
        }
    }
}