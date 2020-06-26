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

public class Archive extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	 public Archive ()
		 {
			 setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			 
			 setBounds(450, 190, 1014, 597);
			 setResizable(true);
		        setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\DESKTOP\\book.png"));
		        setTitle("Archive List");
		        contentPane = new JPanel();
		        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		        setContentPane(contentPane);
		        contentPane.setLayout(null);
		        
		        
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
		      //------desarchive button--------
		        
		        JButton desarchiveButton = new JButton("Desarchivate");
		        desarchiveButton.setForeground(new Color(0, 0, 0));
		        desarchiveButton.setBackground(UIManager.getColor("Button.disabledForeground"));
		        desarchiveButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		        desarchiveButton.addActionListener(new ActionListener() {
		            @Override
					public void actionPerformed(ActionEvent e) {
		                
		            

		            }
		        });
		        desarchiveButton.setBounds(500, 460, 170, 50);
		        contentPane.add(desarchiveButton);
		}
	
}
