public class CartaoDeCredito extends Pagamento {
   private String numeroDoCartao;
   
   public CartaoDeCredito() {
      this("", "", 0, "");
   }
   public CartaoDeCredito(String n, String c, double v, String nc) {
      super(n, c, v);
      setNumeroDoCartao(nc);
   }
   public void setNumeroDoCartao(String nc) { this.numeroDoCartao = nc; }
   public String getNumeroDoCartao() { return this.numeroDoCartao; }

   public String show() {
      String msg = "Nome: "               + getNomeDoPagador() +
                   "\nCPF: "              + getCpf()           +
                   "\nValor a pagar: R$ " + getValorASerPago() +
                   "\nNumero do Cartao: " + getNumeroDoCartao();
      return msg;
   }
}