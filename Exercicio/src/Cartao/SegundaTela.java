package Cartao;

import javax.swing.*;
import java.awt.*;

public class SegundaTela extends JFrame {
    public SegundaTela() {
        setTitle("Cartão de Visita");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        JTextPane txtpnMariaKarolineDa = new JTextPane();
        txtpnMariaKarolineDa.setForeground(new Color(168, 129, 91));
        txtpnMariaKarolineDa.setBackground(new Color(240, 240, 240));
        txtpnMariaKarolineDa.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 14));
        txtpnMariaKarolineDa.setEditable(false);
        txtpnMariaKarolineDa.setText("Maria Karoline Da Silva");
        txtpnMariaKarolineDa.setBounds(238, 179, 150, 20);
        getContentPane().add(txtpnMariaKarolineDa);

        JLabel lblMeuNome = new JLabel("Maria Karoline Da Silva");
        lblMeuNome.setForeground(new Color(168, 129, 91));
        lblMeuNome.setFont(new Font("Serif", Font.ITALIC, 18));
        lblMeuNome.setBounds(34, 44, 232, 24);
        getContentPane().add(lblMeuNome);

        JLabel lblDesenvolvedora = new JLabel("Desenvolvedora");
        lblDesenvolvedora.setForeground(new Color(168, 129, 91));
        lblDesenvolvedora.setFont(new Font("Serif", Font.PLAIN, 16));
        lblDesenvolvedora.setBounds(34, 79, 232, 24);
        getContentPane().add(lblDesenvolvedora);

        JSeparator separator = new JSeparator();
        separator.setForeground(new Color(168, 129, 91));
        separator.setBounds(10, 134, 414, 2);
        getContentPane().add(separator);

        JLabel lblEmail = new JLabel("Email: Maria.Silva7@br.bosch.com");
        lblEmail.setFont(new Font("Serif", Font.PLAIN, 11));
        lblEmail.setForeground(new Color(168, 129, 91));
        lblEmail.setBounds(34, 160, 250, 14);
        getContentPane().add(lblEmail);

        JLabel lblM = new JLabel("M");
        lblM.setFont(new Font("Serif", Font.PLAIN, 93));
        lblM.setForeground(new Color(168, 129, 91));
        lblM.setBounds(249, 134, 84, 102);
        getContentPane().add(lblM);

        JLabel lblCelular = new JLabel("Celular :(47)988548027");
        lblCelular.setFont(new Font("Serif", Font.PLAIN, 11));
        lblCelular.setForeground(new Color(168, 129, 91));
        lblCelular.setBounds(34, 198, 232, 14);
        getContentPane().add(lblCelular);

        JLabel lblK = new JLabel("K");
        lblK.setForeground(new Color(168, 129, 91));
        lblK.setFont(new Font("Serif", Font.PLAIN, 93));
        lblK.setBounds(327, 134, 84, 102);
        getContentPane().add(lblK);
    }
}
