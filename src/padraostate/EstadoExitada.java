package padraostate;

public class EstadoExitada implements Estado {

    @Override
    public void elogiar(Mulher mulher) {
        System.out.println(">> Resposta: Você é incrível! Mal posso esperar!");
    }

    @Override
    public void contarPiada(Mulher mulher) {
        System.out.println(">> Resposta: Hahaha, você é uma figura!");
    }

    @Override
    public void convidarParaSair(Mulher mulher) {
        System.out.println(">> Resposta: Já combinamos! Estou super ansiosa!");
    }

    @Override
    public void cancelarPrograma(Mulher mulher) {
        System.out.println(">> Resposta: O QUÊ?! NÃO ACREDITO! NUNCA MAIS FALE COMIGO! (O estado regrediu para: Indisposta)");
        mulher.alterarEstado(new EstadoIndisposta());
    }
}