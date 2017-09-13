package br.ufjf.dcc171;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Aula09Exm01 extends JFrame {

    private final JPanel principal = new JPanel();
    private final JComboBox<String> layouts = new JComboBox<>(new String[] {"Absolute", "FlowLayout", "BorderLayout", "GridLayout", "GridBagLayout", "HorizontalLayout", "VerticalLayout"});
    private final JLabel lbl1 = new JLabel("Etiqueta 1");
    private final JLabel lbl2 = new JLabel("Etiqueta 2");
    private final JLabel lbl3 = new JLabel("Etiqueta 3");
    private final JLabel lbl4 = new JLabel("Etiqueta 4");
    private final JTextField txt1 = new JTextField("Texto 1");
    private final JTextField txt2 = new JTextField("Texto 2");
    private final JTextField txt3 = new JTextField("Texto 3");
    private final JTextField txt4 = new JTextField("Texto 4");

    public Aula09Exm01() throws HeadlessException {
        super("Exemplo de Layout");
        //configuraFlowLayout();
        //configuraBorderLayout();
        //configuraLayoutAbsoluto();
        //configuraGridLayout();
        //configuraHorizontalBoxLayout();
        //configuraGridBagLayout();
        configuraBoxLayout();
        add(layouts, BorderLayout.NORTH);
        add(principal, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Aula09Exm01 janela = new Aula09Exm01();
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

    private void configuraFlowLayout() {
        principal.setLayout(new FlowLayout());
        principal.add(lbl1);
        principal.add(txt1);
        principal.add(lbl2);
        principal.add(txt2);
        principal.add(lbl3);
        principal.add(txt3);
        principal.add(lbl4);
        principal.add(txt4);
    }

    private void configuraBorderLayout() {
        principal.setLayout(new BorderLayout());
        principal.add(lbl1, BorderLayout.NORTH);
        principal.add(txt1, BorderLayout.WEST);
        principal.add(lbl2, BorderLayout.EAST);
        principal.add(txt2, BorderLayout.CENTER);
        principal.add(lbl3, BorderLayout.SOUTH);
        principal.add(txt3);
        principal.add(lbl4);
        principal.add(txt4);
    }

    private void configuraLayoutAbsoluto() {
        principal.setLayout(null);
        principal.add(lbl1);
        lbl1.setSize(100, 30);
        lbl1.setLocation(10, 10);
        principal.add(txt1);
        txt1.setSize(200, 30);
        txt1.setLocation(120, 10);
        principal.add(lbl2);
        lbl2.setSize(100, 30);
        lbl2.setLocation(10, 50);
        principal.add(txt2);
        txt2.setSize(200, 30);
        txt2.setLocation(120, 50);
        principal.add(lbl3);
        lbl3.setSize(100, 30);
        lbl3.setLocation(10, 90);
        principal.add(txt3);
        txt3.setSize(200, 30);
        txt3.setLocation(120, 90);
        principal.add(lbl4);
        lbl4.setSize(100, 30);
        lbl4.setLocation(10, 130);
        principal.add(txt4);
        txt4.setSize(200, 30);
        txt4.setLocation(120, 130);
    }

    private void configuraGridLayout() {
        principal.setLayout(new GridLayout(4, 2));
        principal.add(lbl1);
        principal.add(txt1);
        principal.add(lbl2);
        principal.add(txt2);
        principal.add(lbl3);
        principal.add(txt3);
        principal.add(lbl4);
        principal.add(txt4);
    }

    private void configuraGridBagLayout() {
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        principal.setLayout(gbl);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.ipadx = 3;
        gbc.ipady = 10;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;

        principal.add(lbl1);
        gbl.setConstraints(lbl1, gbc);

        principal.add(lbl2);
        gbc.gridy = 1;
        gbl.setConstraints(lbl2, gbc);

        principal.add(lbl3);
        gbc.gridy = 2;
        gbl.setConstraints(lbl3, gbc);

        principal.add(lbl4);
        gbc.gridy = 3;
        gbl.setConstraints(lbl4, gbc);

        gbc.ipady = 0;

        principal.add(txt1);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 2;
        gbl.setConstraints(txt1, gbc);

        principal.add(txt2);
        gbc.gridy = 1;
        gbl.setConstraints(txt2, gbc);

        principal.add(txt3);
        gbc.gridy = 2;
        gbl.setConstraints(txt3, gbc);

        principal.add(txt4);
        gbc.gridy = 3;
        gbl.setConstraints(txt4, gbc);
    }

    private void configuraHorizontalBoxLayout() {
        Box horizontal = Box.createHorizontalBox();
        horizontal.add(lbl1);
        horizontal.add(txt1);
        horizontal.add(lbl2);
        horizontal.add(txt2);
        horizontal.add(lbl3);
        horizontal.add(txt3);
        horizontal.add(lbl4);
        horizontal.add(txt4);
        principal.add(horizontal);
    }
    
    private void configuraVeticalBoxLayout() {
        Box vertical = Box.createVerticalBox();
        vertical.add(lbl1);
        vertical.add(txt1);
        vertical.add(lbl2);
        vertical.add(txt2);
        vertical.add(lbl3);
        vertical.add(txt3);
        vertical.add(lbl4);
        vertical.add(txt4);
        principal.add(vertical);
    }

    private void configuraBoxLayout() {
    }

}
