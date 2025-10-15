package padraostate;

public class Mulher {

    private Estado estadoAtual;

    public Mulher() {
        this.estadoAtual = new EstadoIndisposta();
    }

    public void alterarEstado(Estado novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public void elogiar() {
        this.estadoAtual.elogiar(this);
    }

    public void falarBobagem() {
        this.estadoAtual.falarBobagem(this);
    }

    public void convidarParaSair() {
        this.estadoAtual.convidarParaSair(this);
    }

    public void cancelarPrograma() {
        this.estadoAtual.cancelarPrograma(this);
    }

    public String getNomeEstadoAtual() {
        return this.estadoAtual.getClass().getSimpleName().replace("Estado", "");
    }
}