package Database;

import javax.swing.*;



public class GUICode extends JFrame{
    
    JLabel titleLbl ;
    JLabel searchLbl ;
    JTextField searchTxtf ;
    JButton searchBtn ;
    
    public GUICode(){
        titleLbl = new JLabel();
        searchLbl = new JLabel();
        searchTxtf = new JTextField();
        searchBtn = new JButton();
        
      
    
    }
    
    public static void main(String[]args){
        
    
        java.awt.EventQueue.invokeLater(new Runnable(){
        
        public void run(){           
            new GUICode().setVisible(true);
            
        }
    });
    
}
}
    
