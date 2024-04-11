import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JPanel painel = new JPanel();
    private JButton jButtonAposta1 = new JButton("Apostar de 0 a 100");
    private JButton JButtonAposta2 = new JButton("Apostar de A a Z");
    private JButton JButtonAposta3 = new JButton("Apostar par ou ímpar");

    public Main() {
        this.setTitle("Lotofácil - Início");
        this.setSize(400, 200);
        painel.setBackground(new Color(255, 255, 255));
        setVisible(true);
        

    }



    private static void aposta1() {
        ImageIcon icon = new ImageIcon("sorteio.png");
        Object apostaNumero = JOptionPane.showInputDialog(null, "Digite um número de 0 a 100", "Aposta 1", JOptionPane.INFORMATION_MESSAGE, icon, null, "");
    }

    public static void main(String[] args) {
        new Main();
    }
}