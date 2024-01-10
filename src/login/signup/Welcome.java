/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login.signup;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author harry sahani
 */
public class Welcome extends JFrame implements ActionListener {
    JButton logout,back;
    JLabel txt,txt1,txt2;
    
    Welcome(){
        setBounds(300,100,900,550);
        getContentPane().setBackground(Color.white);
        
        JLabel username = new JLabel("Welcome to XenonStack");
        username.setBounds(300,70,625,25);
        username.setFont(new Font("ARIAL", Font.BOLD,28));
        add(username);
        
        
        JLabel name = new JLabel("Develop Generative AI Applications with\n" +
"Data-Driven Approach");
        name.setBounds(200,150,625,25);
        name.setFont(new Font("ARIAL", Font.BOLD,18));
        add(name);
        
        
        JLabel password = new JLabel("For more information contact us...");
        password.setBounds(50,400,425,25);
        password.setFont(new Font("ARIAL", Font.BOLD,18));
        add(password);
        
        
        
        
        logout = new JButton("Logout");
        logout.setBackground(Color.black);
        logout.setForeground(new Color(133,193,233));
        logout.setFont(new Font("ARIAL", Font.BOLD,12));
        logout.setBounds(400,230,100,30);
        logout.addActionListener(this);
        add(logout);
        
        back = new JButton("Contack");
        back.setBackground(Color.black);
        back.setForeground(new Color(133,193,233));
        back.setFont(new Font("ARIAL", Font.BOLD,12));
        back.setBounds(150,450,100,30);
        back.addActionListener(this);
        add(back);
        
        setLayout(null);
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
    
    if(ae.getSource()==logout){
        setVisible(false);
        new Login();
    }
    else{
        setVisible(false);
        new Contact("user");
    }
    
    }
    
    public static void main(String[] args) {
        new Welcome();
    }
}
