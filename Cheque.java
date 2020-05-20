public class Cheque extends Pagamento {
   private String numeroDoCheque;
   
   public Cheque() {
      this("", "", 0, "");
   }
   public Cheque(String n, String c, double v, String nc) {
      super(n, c, v);
      setNumeroDoCheque(nc);
   }
   public void setNumeroDoCheque(String nc) { this.numeroDoCheque = nc; }
   public String getNumeroDoCheque() { return this.numeroDoCheque; }

   public String show() {
      String msg = "Nome: "               + getNomeDoPagador() +
                   "\nCPF: "              + getCpf()           +
                   "\nValor a pagar: R$ " + getValorASerPago() +
                   "\nNumero do Cheque: " + getNumeroDoCheque();
      return msg;
   }
}