package ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import ihm.UserLogin;

public class EventsList extends JFrame {
	 
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	 public EventsList (){
		 setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		 
		 setBounds(450, 190, 1014, 597);
	        setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\DESKTOP\\book.png"));
	        setTitle("Events List");
		 setResizable(true);
		 contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	        
	        
	        //----------logout button ----------
	        JButton logoutButton = new JButton("Logout");
	        logoutButton.setForeground(new Color(0, 0, 0));
	        logoutButton.setBackground(UIManager.getColor("Button.disabledForeground"));
	        logoutButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
	        logoutButton.addActionListener(new ActionListener() {
	            @Override
				public void actionPerformed(ActionEvent e) {
	                int a = JOptionPane.showConfirmDialog(logoutButton, "Are you sure?");
	                // JOptionPane.setRootFrame(null);
	                if (a == JOptionPane.YES_OPTION) {
	                    dispose();
	                    UserLogin obj = null;
						try {
							obj = new UserLogin();
						} catch (UnsupportedLookAndFeelException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	                    obj.setTitle("User-Login");
	                    obj.setVisible(true);
	                }
	                
	                dispose();
	                UserLogin obj = null;
					try {
						obj = new UserLogin();
					} catch (UnsupportedLookAndFeelException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

	                obj.setTitle("User-Login");
	                obj.setVisible(true);

	            }
	        });
	        logoutButton.setBounds(860, 460, 120, 50);
	        contentPane.add(logoutButton);
	        
	        //------return button
	        
	        JButton returnButton = new JButton("Return");
	        returnButton.setForeground(new Color(0, 0, 0));
	        returnButton.setBackground(UIManager.getColor("Button.disabledForeground"));
	        returnButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
	        returnButton.addActionListener(new ActionListener() {
	            @Override
				public void actionPerformed(ActionEvent e) {
	                
	                
	                dispose();
	                UserHome ah = new UserHome(UserLogin.username);
                    ah.setTitle("Welcome");
                    ah.setVisible(true);
                    
                   

	            }
	        });
	        returnButton.setBounds(700, 460, 120, 50);
	        contentPane.add(returnButton);
	        
	        
          //------delete button--------
	        
	        JButton deleteButton = new JButton("Delete");
	        deleteButton.setForeground(new Color(0, 0, 0));
	        deleteButton.setBackground(UIManager.getColor("Button.disabledForeground"));
	        deleteButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
	        deleteButton.addActionListener(new ActionListener() {
	            @Override
				public void actionPerformed(ActionEvent e) {
	                
	            

	            }
	        });
	        deleteButton.setBounds(540, 460, 120, 50);
	        contentPane.add(deleteButton);
	        
             //------archivate button--------
	        
	        JButton archivateButton = new JButton("Archivate");
	        archivateButton.setForeground(new Color(0, 0, 0));
	        archivateButton.setBackground(UIManager.getColor("Button.disabledForeground"));
	        archivateButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
	        archivateButton.addActionListener(new ActionListener() {
	            @Override
				public void actionPerformed(ActionEvent e) {
	                
	            

	            }
	        });
	        archivateButton.setBounds(380, 460, 140, 50);
	        contentPane.add(archivateButton);
	        
              //------update button--------
	        
	        JButton updateButton = new JButton("Update");
	        updateButton.setForeground(new Color(0, 0, 0));
	        updateButton.setBackground(UIManager.getColor("Button.disabledForeground"));
	        updateButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
	        updateButton.addActionListener(new ActionListener() {
	            @Override
				public void actionPerformed(ActionEvent e) {
	                
	            

	            }
	        });
	        updateButton.setBounds(220, 460, 120, 50);
	        contentPane.add(updateButton);
	}
}
