/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginframe;

import javax.swing.JFrame;

/**
 *
 * @author Anonymous
 */
public class loginFrame1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           LoginFrame frame=new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10,10,370,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        // TODO code application logic here
    }
    
}
