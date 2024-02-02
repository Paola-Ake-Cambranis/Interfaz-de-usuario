
package mycompany.ejercicios;

import javax.swing.*;
public class Ventana extends JFrame{
    public Ventana(){
        setTitle("Notas"); 
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        iniciarComponentes();
        
    }
    
    private void iniciarComponentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);
        
        JLabel etiqueta = new JLabel("Notas");
        etiqueta.setBounds(200,10,150,50);
        panel.add(etiqueta);
        
        JTextArea texto = new JTextArea();
        texto.setBounds(40,50,400,300);
        panel.add(texto);
        
        JButton boton = new JButton("Guardar");
        boton.setBounds(190, 380, 100,30);
        panel.add(boton);
    }
}
