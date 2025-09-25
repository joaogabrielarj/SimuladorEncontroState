package padraostate;

public class Mulher {

    private Estado estado_atual;

    public Mulher() {
        this.estado_atual = new EstadoIndisposta();
    }

    public void alterar_estado(Estado novo_estado) {
        this.estado_atual = novo_estado;
    }

    public void interagir(String acao) {
        this.estado_atual.interagir(this, acao);
    }

    public String getNomeEstadoAtual() {
        return this.estado_atual.getClass().getSimpleName();
    }
}