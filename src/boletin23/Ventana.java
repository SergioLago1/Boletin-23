/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
/**
 *
 * @author slagogonzalez
 */
public class Ventana {
   
    public void crearVentana() {         
       
        String [] elementos = {"elemento1","elemento2","elemento3"};
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JFrame marco = new JFrame("Boletin 23");
    JLabel etiqueta = new JLabel("Nome");
    JTextField casilla = new JTextField(10);
    JLabel etiqueta2 = new JLabel("Password");
    JPasswordField pass = new JPasswordField(10);
    JButton boton = new JButton("Premer");
    JButton boton2 = new JButton("Limpiar");
    JButton boton3 = new JButton("boton");
    JList lista = new JList(elementos);
    JTextArea area = new JTextArea("area texto");
    FlowLayout dis = new FlowLayout(FlowLayout.CENTER,3,2);
    dis.setHgap(70);
    dis.setVgap(70);
    
    panel.setBounds(0,0,400,400);
    panel.setBackground(Color.yellow);
   
    panel.setLayout(dis);
    panel.add(etiqueta);
    panel.add(casilla);
    panel.add(etiqueta2);
    panel.add(pass);
    panel.add(boton);
    panel.add(boton2);
    
    panel2.setBounds(0,400,400,400);
    panel2.setBackground(Color.blue);
    panel2.add(lista);
    panel2.add(boton3);
    panel2.add(area);
    
    marco.setLayout(null);
    marco.setSize(400,800);
    marco.add(panel2);
    marco.add(panel);
    
    
    marco.setVisible(true);
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco.setLocationRelativeTo(null);
    
    }
}