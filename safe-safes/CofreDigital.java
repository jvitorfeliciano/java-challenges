public class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }

    public void imprimirInformacoes(boolean senhaValida) {
        String mensagem = senhaValida ? "Cofre aberto!" : "Senha incorreta!";
        super.imprimirInformacoes();
        System.out.println(mensagem);
    }
}
