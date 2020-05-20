public class Pagamento {
   protected String nomeDoPagador;
   protected String cpf;
   protected double valorASerPago;

   public Pagamento() {
      this("", "", 0);
   }
   public Pagamento(String n, String c, double v) {
      setNomeDoPagador(n);
      setCpf(c);
      setValorASerPago(v);
   }

   public void setNomeDoPagador(String n) {
      this.nomeDoPagador = n; 
   }
   public void setCpf(String c) {
      this.cpf = c; 
   }
   public void setValorASerPago(double v) {
      this.valorASerPago = v; 
   }
   
   public String getNomeDoPagador() { 
      return this.nomeDoPagador; 
   }
   public String getCpf() {
      return this.cpf;
   }
   public double getValorASerPago() { 
      return this.valorASerPago; 
   }
}