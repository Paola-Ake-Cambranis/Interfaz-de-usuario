
package mycompany.ejercicios;

import javax.swing.*;
public class Ventana extends JFrame{
    public Ventana(){
        setTitle("Lista de pendientes"); 
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        iniciarComponentes();
        
    }
    
    private void iniciarComponentes(){
        
        JPanel panel = new JPanel();
        
        getContentPane().add(panel);
        
        JLabel etiqueta = new JLabel("Lista de pendientes");
        panel.add(etiqueta);
    }
}
