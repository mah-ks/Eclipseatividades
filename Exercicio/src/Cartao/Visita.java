package Cartao;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Iterator;

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
        frmPrincipal.setBounds(100, 100, 838, 591);
        frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmPrincipal.getContentPane().setLayout(null);

     
        DefaultListModel<String> listModel1 = new DefaultListModel<>();
        listModel1.addElement("Teclado");
        listModel1.addElement("Mouse");
        listModel1.addElement("Monitor");
        listModel1.addElement("CPU");
        listModel1.addElement("Notebook");

        JList<String> list = new JList<>(listModel1);
        list.setBackground(new Color(247, 164, 249));
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        list.setBounds(536, 227, 131, 198);
        frmPrincipal.getContentPane().add(list);

        DefaultListModel<String> listModel2 = new DefaultListModel<>();
        JList<String> list_2 = new JList<>(listModel2);
        list_2.setBackground(new Color(247, 164, 249));
        list_2.setBounds(677, 227, 131, 198);
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
        btnConfirmar.setBounds(614, 436, 120, 23);
        frmPrincipal.getContentPane().add(btnConfirmar);

      
        JRadioButton rbtMasculino = new JRadioButton("Masculino");
        rbtMasculino.setBounds(21, 387, 93, 23);
        rbtMasculino.setBackground(new Color(247, 164, 249));
        buttonGroup_1.add(rbtMasculino);
        frmPrincipal.getContentPane().add(rbtMasculino);

        JRadioButton rbtFeminino = new JRadioButton("Feminino");
        rbtFeminino.setBounds(21, 413, 93, 23);
        rbtFeminino.setBackground(new Color(247, 164, 249));
        buttonGroup_1.add(rbtFeminino);
        frmPrincipal.getContentPane().add(rbtFeminino);

        JButton btnSelecionar = new JButton("Inserir");
        btnSelecionar.setBounds(21, 443, 89, 23);
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
        scrollPane.setBounds(536, 25, 272, 94);
        frmPrincipal.getContentPane().add(scrollPane);


        JCheckBox ckbJornal = new JCheckBox("Jornal");
        ckbJornal.setBounds(44, 189, 97, 23);
        ckbJornal.setBackground(new Color(247, 164, 249));
        frmPrincipal.getContentPane().add(ckbJornal);

        JCheckBox cbkRevista = new JCheckBox("Revista");
        cbkRevista.setBounds(44, 215, 97, 23);
        cbkRevista.setBackground(new Color(247, 164, 249));
        frmPrincipal.getContentPane().add(cbkRevista);

        JCheckBox ckbCdDvd = new JCheckBox("CD/DVD");
        ckbCdDvd.setBounds(44, 241, 97, 23);
        ckbCdDvd.setBackground(new Color(247, 164, 249));
        frmPrincipal.getContentPane().add(ckbCdDvd);

        JButton btnSelecionados = new JButton("Itens Selecionados");
        btnSelecionados.setBounds(163, 215, 189, 23);
        btnSelecionados.addActionListener(e -> {
            String itens = "";
            if (ckbJornal.isSelected()) itens += "\nJornal ";
            if (cbkRevista.isSelected()) itens += "\nRevista ";
            if (ckbCdDvd.isSelected()) itens += "\nCD/DVD ";
            JOptionPane.showMessageDialog(null, "Itens selecionados: " + itens);
        });
        frmPrincipal.getContentPane().add(btnSelecionados);

 
        JLabel lblMensagem = new JLabel("Digite uma Mensagem");
        lblMensagem.setBounds(21, 66, 204, 14);
        frmPrincipal.getContentPane().add(lblMensagem);

        textField = new JTextField();
        textField.setBounds(24, 91, 201, 20);
        textField.setColumns(10);
        frmPrincipal.getContentPane().add(textField);

        JButton btnMostrar = new JButton("Mostrar mensagem");
        btnMostrar.setBounds(21, 122, 189, 23);
        btnMostrar.addActionListener(e -> JOptionPane.showMessageDialog(null, textField.getText()));
        frmPrincipal.getContentPane().add(btnMostrar);


        JSeparator separator = new JSeparator();
        separator.setBounds(-10, 174, 818, 2);
        frmPrincipal.getContentPane().add(separator);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(0, 487, 818, 2);
        frmPrincipal.getContentPane().add(separator_1);

        JButton btnSair = new JButton("Sair");
        btnSair.setBounds(716, 498, 89, 23);
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
        comboBox.setBounds(536, 130, 265, 22);
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
        textFM.setBounds(120, 365, 275, 94);
        frmPrincipal.getContentPane().add(textFM);
        textFM.setColumns(10);
        
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
        
        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Abrir Cartão de Visita");
        mnNewMenu.add(mntmNewMenuItem_1);
        mntmNewMenuItem_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new SegundaTela(); 
            }
        });
    
        
        JMenuBar menuBar_1 = new JMenuBar();
        menuBar.add(menuBar_1);
    }
}
