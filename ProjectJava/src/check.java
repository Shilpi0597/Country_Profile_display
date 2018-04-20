

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class check extends JApplet implements ActionListener{
	
  private static final String Current_time = null;
private static final String National_Anthem = null;
static BufferedImage bg = null;
  static BufferedImage img = null;
  JButton btn1=new JButton("Current_time");
  JButton btn2=new JButton("National_Anthem");
 
	
 check() {
	 
    try {
      bg = ImageIO.read(new File("C:/Project_Workspace/ProjectJava/india3.jpg"));
      img=ImageIO.read(new File("C:/Project_Workspace/ProjectJava/INDIAf.png"));
    } catch (Exception ex) {
      System.out.println(ex);
    }
   
    JPanel tabPanel = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
    	  setPreferredSize(new Dimension(1124,400));
        super.paintComponent(g);
        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
        g.drawImage(img,50, 160, 200, 150, this);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Courier New",Font.PLAIN, 80));
        g.drawString("INDIA", 30, 70);
       
      }
      @Override
      public Dimension getPreferredSize() {
        return new Dimension(1124, 400);
      }
    };
    
   
    GridBagLayout layout = new GridBagLayout();
    tabPanel.setLayout(layout);        
    GridBagConstraints gbc = new GridBagConstraints();
     
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(5, 0, 5, 0);
    gbc.gridx = 0;
    gbc.gridy = 0;
    tabPanel.add(btn1,gbc); 
      
    gbc.gridx = 0;
    gbc.gridy = 2; 
    gbc.fill = GridBagConstraints.HORIZONTAL;
   // gbc.gridwidth = 2;  
	tabPanel.add(btn2,gbc);
	 btn1.addActionListener(this);
	 btn2.addActionListener(this);
    
	
	
	

  
	

    JTabbedPane tabPane = new JTabbedPane();
    tabPane.add("Country", tabPanel);

    JFrame frame = new JFrame();
    
    frame.setContentPane(tabPane);
    frame.pack();

    frame.setVisible(true);
  }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	 if(e.getSource() == btn1)
	{
		JOptionPane.showMessageDialog(null, "Hello");
	}
	 if(e.getSource() == btn2)
	{
		JOptionPane.showMessageDialog(null, "Hiiii");
	}
	
}
}

