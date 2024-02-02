
package mycompany.ejercicios;

import javax.swing.*;
public class Ventana extends JFrame{
    public Ventana(){
        setTitle("Lista de compras"); 
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        iniciarComponentes();
        
    }
    
    private void iniciarComponentes(){
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);
        JLabel etiqueta = new JLabel("Lista de compras");
        panel.add(etiqueta);
        
        JTextField texto = new JTextField();
        texto.setBounds(100,100, 50,50);
        panel.add(texto);
    }
}
