package Cartao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Iterator;
import java.awt.Font;
import java.awt.SystemColor;

public class Visita {

    private JFrame frmPrincipal;
    private final ButtonGroup buttonGroup_1 = new ButtonGroup();
    private JTable table;
    private JTextField textField;
    private JTextField textFM;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Visita window = new Visita();
                window.frmPrincipal.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Visita() {
        initialize();
    }

    private void initialize() {
        frmPrincipal = new JFrame();
        frmPrincipal.getContentPane().setBackground(new Color(253, 206, 245));
        frmPrincipal.setBounds(100, 100, 734, 731);
        frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmPrincipal.getContentPane().setLayout(null);

     
        DefaultListModel<String> listModel1 = new DefaultListModel<>();
        listModel1.addElement("Teclado");
        listModel1.addElement("Mouse");
        listModel1.addElement("Monitor");
        listModel1.addElement("CPU");
        listModel1.addElement("Notebook");
        
        JLabel lblTransferirItens_1 = new JLabel("Itens transferidos");
        lblTransferirItens_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
        lblTransferirItens_1.setBounds(541, 187, 211, 18);
        frmPrincipal.getContentPane().add(lblTransferirItens_1);

        JList<String> list = new JList<>(listModel1);
        list.setBackground(SystemColor.desktop);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        list.setBounds(38, 216, 131, 198);
        frmPrincipal.getContentPane().add(list);

        DefaultListModel<String> listModel2 = new DefaultListModel<>();
        JList<String> list_2 = new JList<>(listModel2);
        list_2.setBackground(SystemColor.desktop);
        list_2.setBounds(560, 216, 131, 198);
        frmPrincipal.getContentPane().add(list_2);

        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.addActionListener(e -> {
            for (Iterator<String> it = list.getSelectedValuesList().iterator(); it.hasNext();) {
                String itemSelecionado = it.next();
                if (!listModel2.contains(itemSelecionado)) {
                    listModel2.addElement(itemSelecionado);
                }
            }
        });
        btnConfirmar.setBounds(38, 425, 120, 23);
        frmPrincipal.getContentPane().add(btnConfirmar);

      
        JRadioButton rbtMasculino = new JRadioButton("Masculino");
        rbtMasculino.setBounds(378, 556, 93, 23);
        rbtMasculino.setBackground(SystemColor.desktop);
        buttonGroup_1.add(rbtMasculino);
        frmPrincipal.getContentPane().add(rbtMasculino);

        JRadioButton rbtFeminino = new JRadioButton("Feminino");
        rbtFeminino.setBounds(578, 556, 93, 23);
        rbtFeminino.setBackground(SystemColor.desktop);
        buttonGroup_1.add(rbtFeminino);
        frmPrincipal.getContentPane().add(rbtFeminino);

        JButton btnSelecionar = new JButton("Inserir");
        btnSelecionar.setBounds(378, 634, 89, 23);
        btnSelecionar.addActionListener(e -> {
            if (rbtMasculino.isSelected()) {
                textFM.setText("O genero Masculino foi selecionado");
            } else if (rbtFeminino.isSelected()) {
                textFM.setText("O genero Feminino foi selecionado");
            } else {
                textFM.setText("");
                JOptionPane.showMessageDialog(null, "Selecione uma opção");
            }
        });

        frmPrincipal.getContentPane().add(btnSelecionar);

     
        table = new JTable();
        table.setModel(new DefaultTableModel(
                new Object[][]{
                        {1, "Petri"},
                        {2, "Francini"},
                        {3, "Caludia"},
                        {4, "Talita"},
                },
                new String[]{"Código", "Nome"}
        ));
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(348, 43, 272, 94);
        frmPrincipal.getContentPane().add(scrollPane);


        JCheckBox ckbJornal = new JCheckBox("Jornal");
        ckbJornal.setBounds(21, 516, 97, 23);
        ckbJornal.setBackground(SystemColor.desktop);
        frmPrincipal.getContentPane().add(ckbJornal);

        JCheckBox cbkRevista = new JCheckBox("Revista");
        cbkRevista.setBounds(21, 542, 97, 23);
        cbkRevista.setBackground(SystemColor.desktop);
        frmPrincipal.getContentPane().add(cbkRevista);

        JCheckBox ckbCdDvd = new JCheckBox("CD/DVD");
        ckbCdDvd.setBounds(21, 568, 97, 23);
        ckbCdDvd.setBackground(SystemColor.desktop);
        frmPrincipal.getContentPane().add(ckbCdDvd);

        JButton btnSelecionados = new JButton("Itens Selecionados");
        btnSelecionados.setBounds(21, 599, 189, 23);
        btnSelecionados.addActionListener(e -> {
            String itens = "";
            if (ckbJornal.isSelected()) itens += "\nJornal ";
            if (cbkRevista.isSelected()) itens += "\nRevista ";
            if (ckbCdDvd.isSelected()) itens += "\nCD/DVD ";
            JOptionPane.showMessageDialog(null, "Itens selecionados: " + itens);
        });
        frmPrincipal.getContentPane().add(btnSelecionados);

 
        JLabel lblMensagem = new JLabel("Digite uma Mensagem");
        lblMensagem.setFont(new Font("Times New Roman", Font.ITALIC, 16));
        lblMensagem.setBounds(38, 40, 204, 33);
        frmPrincipal.getContentPane().add(lblMensagem);

        textField = new JTextField();
        textField.setBounds(38, 70, 201, 20);
        textField.setColumns(10);
        frmPrincipal.getContentPane().add(textField);

        JButton btnMostrar = new JButton("Mostrar mensagem");
        btnMostrar.setBounds(38, 96, 189, 23);
        btnMostrar.addActionListener(e -> JOptionPane.showMessageDialog(null, textField.getText()));
        frmPrincipal.getContentPane().add(btnMostrar);


        JSeparator separator = new JSeparator();
        separator.setBounds(-10, 174, 967, 2);
        frmPrincipal.getContentPane().add(separator);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(0, 487, 957, 2);
        frmPrincipal.getContentPane().add(separator_1);

        JButton btnSair = new JButton("Sair");
        btnSair.setBounds(582, 634, 89, 23);
        btnSair.addActionListener(e -> System.exit(0));
        frmPrincipal.getContentPane().add(btnSair);
        
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setModel(new DefaultComboBoxModel<>(new String[]{
            "Selecione Uma cor para a tabela",
            "Roxo",
            "Rosa",
            "Verde",
            "Azul"
        }));
        comboBox.setBounds(348, 141, 265, 22);
        frmPrincipal.getContentPane().add(comboBox);

        comboBox.addActionListener(e -> {
            String corSelecionada = (String) comboBox.getSelectedItem();
            if (corSelecionada != null) {
                switch (corSelecionada) {
                    case "Roxo":
                        table.setBackground(new Color(153, 50, 204));
                        table.setForeground(Color.WHITE);
                        break;
                    case "Rosa":
                        table.setBackground(new Color(247, 164, 249));
                        table.setForeground(Color.BLACK);
                        break;
                    case "Verde":
                        table.setBackground(new Color(144, 238, 144));
                        table.setForeground(Color.BLACK);
                        break;
                    case "Azul":
                        table.setBackground(new Color(135, 206, 250));
                        table.setForeground(Color.BLACK);
                        break;
                    default:
    
                        table.setBackground(Color.WHITE);
                        table.setForeground(Color.BLACK);
                        break;
                }
            }
        });

        
        textFM = new JTextField();
        textFM.setEditable(false);
        textFM.setBounds(378, 586, 292, 37);
        frmPrincipal.getContentPane().add(textFM);
        textFM.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Seleção de Itens");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
        lblNewLabel.setBounds(21, 495, 211, 14);
        frmPrincipal.getContentPane().add(lblNewLabel);
        
        JLabel lblTransferirItens = new JLabel("Transferir Itens");
        lblTransferirItens.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
        lblTransferirItens.setBounds(38, 187, 211, 18);
        frmPrincipal.getContentPane().add(lblTransferirItens);
        
        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon(Visita.class.getResource("/imagem/kitty.png")));
        lblNewLabel_1.setBounds(0, -35, 1005, 703);
        frmPrincipal.getContentPane().add(lblNewLabel_1);
        
        JLabel lblTransferirItens_2 = new JLabel("Transferir Itens");
        lblTransferirItens_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
        lblTransferirItens_2.setBounds(541, 187, 211, 18);
        frmPrincipal.getContentPane().add(lblTransferirItens_2);
        
        JMenuBar menuBar = new JMenuBar();
        frmPrincipal.setJMenuBar(menuBar);
        
        JMenu mnNewMenu = new JMenu("Arquivo");
        mnNewMenu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        menuBar.add(mnNewMenu);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Abrir Mensagem");
        mnNewMenu.add(mntmNewMenuItem);
        mntmNewMenuItem.addActionListener(e -> {
            ImageIcon icon = new ImageIcon("kitty.png");    
            Image img = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            icon = new ImageIcon(img);

            JOptionPane.showMessageDialog(
                frmPrincipal,
                "Olá tudo bem?",
                "Mensagem",
                JOptionPane.INFORMATION_MESSAGE,
                icon
            );
        });


        
        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Abrir Cartão de Visita");
        mnNewMenu.add(mntmNewMenuItem_1);
        mntmNewMenuItem_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	SegundaTela st = new SegundaTela();
				st.setVisible(true);
            }
        });
    
        
        JMenuBar menuBar_1 = new JMenuBar();
        menuBar.add(menuBar_1);
    }
}
