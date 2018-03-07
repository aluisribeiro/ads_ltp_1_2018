import javax.swing.*;

public class Programa{

  public static void main(String args[]) {
    int jan = Integer.parseInt(JOptionPane.showInputDialog("Janeiro:"));
    int fev = Integer.parseInt(JOptionPane.showInputDialog("Fevereiro:"));
    int mar = Integer.parseInt(JOptionPane.showInputDialog("Março:"));
    int abr = Integer.parseInt(JOptionPane.showInputDialog("Abril:"));
    int mai = Integer.parseInt(JOptionPane.showInputDialog("Maio:"));
    int jun = Integer.parseInt(JOptionPane.showInputDialog("Juhho:"));
    int jul = Integer.parseInt(JOptionPane.showInputDialog("Julho:"));
    int ago = Integer.parseInt(JOptionPane.showInputDialog("Agosto:"));
    int set = Integer.parseInt(JOptionPane.showInputDialog("Setembro:"));
    int out = Integer.parseInt(JOptionPane.showInputDialog("Outubro:"));
    int nov = Integer.parseInt(JOptionPane.showInputDialog("Novembro:"));
    int dez = Integer.parseInt(JOptionPane.showInputDialog("Dezembro:"));

    int total = ( jan + fev + mar + abr + mai + jun + jul + ago + set +
      out + nov + dez );

    JOptionPane.showMessageDialog(null, "Total: " + total);
  }

}
