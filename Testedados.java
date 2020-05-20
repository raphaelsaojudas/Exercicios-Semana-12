import javax.swing.JOptionPane;
public class Testedados {
   public static void main(String args[]) {

      CartaoDeCredito cartao;
      Cheque          cheque;
      Boleto          boleto;
      String          nroCartao;
      String          nroCheque;
      String          nroBoleto;
      String          nome;
      String          cpf;
      double          valor;
      int             dia;
      int             mes;
      int             ano;

      nome      =                     JOptionPane.showInputDialog("Nome:");
      cpf       =                     JOptionPane.showInputDialog("CPF:");
      valor     = Double.parseDouble( JOptionPane.showInputDialog("Valor a Pagar:") );
      nroCartao =                     JOptionPane.showInputDialog("Numero do cartao:");
      nroCheque =                     JOptionPane.showInputDialog("Numero do cheque:");
      nroBoleto =                     JOptionPane.showInputDialog("Numero do boleto:");
      dia       = Integer.parseInt(   JOptionPane.showInputDialog("Dia do vencimento:") );
      mes       = Integer.parseInt(   JOptionPane.showInputDialog("Mes do vencimento:") );
      ano       = Integer.parseInt(   JOptionPane.showInputDialog("Ano do vencimento") );

      cartao = new CartaoDeCredito(nome, cpf, valor, nroCartao);
      JOptionPane.showMessageDialog(null, cartao.show());
      
      cheque = new Cheque(nome, cpf, valor, nroCheque);
      JOptionPane.showMessageDialog(null, cheque.show());
      
      boleto = new Boleto(nome, cpf, valor, nroBoleto, dia, mes, ano);
      JOptionPane.showMessageDialog(null, boleto.show());
      
      System.exit(0);
   }
}