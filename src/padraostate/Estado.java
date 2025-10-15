package padraostate;

public interface Estado {
    void elogiar(Mulher mulher);
    void falarBobagem(Mulher mulher);
    void convidarParaSair(Mulher mulher);
    void cancelarPrograma(Mulher mulher);
}