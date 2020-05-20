public class Boleto extends Pagamento {
   private String numeroDoBoleto;
   private int dia;
   private int mes;
   private int ano;

   public Boleto() {
      this("", "", 0, "", 0, 0, 0);
   }
   public Boleto(String n, String c, double v, String nc, int d, int
   m, int a) {
      super(n, c, v);
      setNumeroDoBoleto(nc);
      setDia(d);
      setMes(m);
      setAno(a);
   }
   public void setNumeroDoBoleto(String nc) { this.numeroDoBoleto = nc; }
   public void setDia(int d) { this.dia = d; }
   public void setMes(int m) { this.mes = m; }
   public void setAno(int a) { this.ano = a; }
   
   public String getNumeroDoBoleto() { return this.numeroDoBoleto; }
   public int getDia() { return this.dia; }
   public int getMes() { return this.mes; }
   public int getAno() { return this.ano; }
      
   public String show() {
      String msg = "Nome: " + getNomeDoPagador() +
                   "\nCPF: " + getCpf() +
                   "\nValor a pagar: R$ " + getValorASerPago() +
                   "\nNumero do Boleto: " + getNumeroDoBoleto()+
                   "\nVencimento da data: " + getDia() +
                   "/" + getMes() +
                   "/" + getAno();
      return msg;
   }
}