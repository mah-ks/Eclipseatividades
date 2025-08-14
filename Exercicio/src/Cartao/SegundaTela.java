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

        JLabel lblNewLabel = new JLabel("Maria Karoline Da Silva");
        lblNewLabel.setForeground(new Color(168, 129, 91));
        lblNewLabel.setFont(new Font("Serif", Font.ITALIC, 18));
        lblNewLabel.setBounds(34, 44, 232, 24);
        getContentPane().add(lblNewLabel);

        JLabel lblDesenvolvedora = new JLabel("Desenvolvedora");
        lblDesenvolvedora.setForeground(new Color(168, 129, 91));
        lblDesenvolvedora.setFont(new Font("Serif", Font.PLAIN, 16));
        lblDesenvolvedora.setBounds(34, 79, 232, 24);
        getContentPane().add(lblDesenvolvedora);

        JSeparator separator = new JSeparator();
        separator.setForeground(new Color(168, 129, 91));
        separator.setBounds(10, 134, 414, 2);
        getContentPane().add(separator);

        JLabel lblNewLabel_2 = new JLabel("Email: Maria.Silva7@br.bosch.com");
        lblNewLabel_2.setForeground(new Color(168, 129, 91));
        lblNewLabel_2.setBounds(34, 160, 250, 14);
        getContentPane().add(lblNewLabel_2);

        JLabel lblNewLabel_5 = new JLabel("M");
        lblNewLabel_5.setFont(new Font("Serif", Font.PLAIN, 93));
        lblNewLabel_5.setForeground(new Color(168, 129, 91));
        lblNewLabel_5.setBounds(249, 134, 84, 102);
        getContentPane().add(lblNewLabel_5);

        JLabel lblNewLabel_3 = new JLabel("Celular :(47)988548027");
        lblNewLabel_3.setForeground(new Color(168, 129, 91));
        lblNewLabel_3.setBounds(34, 198, 232, 14);
        getContentPane().add(lblNewLabel_3);

        JLabel lblNewLabel_5_1 = new JLabel("K");
        lblNewLabel_5_1.setForeground(new Color(168, 129, 91));
        lblNewLabel_5_1.setFont(new Font("Serif", Font.PLAIN, 93));
        lblNewLabel_5_1.setBounds(327, 134, 84, 102);
        getContentPane().add(lblNewLabel_5_1);
    }
}
