class Transacao {
    private String data;
    private String hora;
    private String descricao;
    private String valor;

    public Transacao(String data, String hora, String descricao, String valor) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println(this.descricao);
        System.out.println(this.data);
        System.out.println(this.hora);
        System.out.printf(this.valor);
    }
}