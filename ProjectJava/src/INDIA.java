
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.FontRenderContext;
import java.awt.font.LineBreakMeasurer;
import java.awt.font.TextAttribute;
import java.awt.font.TextLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;



public class INDIA extends JApplet implements ActionListener{
	
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private static final Object Stop = null;
static BufferedImage bg = null;
  static BufferedImage img = null;
  static BufferedImage img1 = null;
  static BufferedImage img2 = null;
  static BufferedImage img3 = null;
  static BufferedImage img4 = null;
  static BufferedImage img5 = null;
  JButton btn1=new JButton("States");
  JButton btn2=new JButton("National_Anthem");
  JButton btn3=new JButton("Prime Minister");
  JButton btn4=new JButton("Stop");
  ImageIcon icon1 = new ImageIcon("india.gif"); 
  private Clip clip;
//constructor	 
 INDIA() {
	 
    try {
      bg = ImageIO.read(new File("C:/Project_Workspace/ProjectJava/india3.jpg"));
      img=ImageIO.read(new File("C:/Project_Workspace/ProjectJava/INDIAf.png"));
      img1=ImageIO.read(new File("C:/Project_Workspace/ProjectJava/indiab.jpg"));
      img2=ImageIO.read(new File("C:/Project_Workspace/ProjectJava/buttonb2.jpg"));
      img3=ImageIO.read(new File("C:/Project_Workspace/ProjectJava/pindia.jpg"));
      img4=ImageIO.read(new File("C:/Project_Workspace/ProjectJava/back.jpg"));
      img5=ImageIO.read(new File("C:/Project_Workspace/ProjectJava/indiast.gif"));
     
    } catch (Exception ex) {
      System.out.println(ex);
    }
   //first tab panel
    JPanel tabPanel = new JPanel() {
      /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	@Override
      protected void paintComponent(Graphics g) {
    	 
        super.paintComponent(g);
        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
        g.drawImage(img,50, 160, 350, 200, this);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Courier New",Font.PLAIN, 80));
        g.drawString("INDIA", 50, 90);
       
      }
      @Override
      public Dimension getPreferredSize() {
        return new Dimension(1124, 400);
      }
    };
    JPanel tabPanel12 = new JPanel() {
     
         
      @Override
        protected void paintComponent(Graphics g) {
            
          super.paintComponent(g);
    	  g.drawImage(img4, 0, 0, getWidth(), getHeight(), this);
          TimeZone timeZone = TimeZone.getTimeZone("IST");
          Calendar cal=new GregorianCalendar();
          cal.setTimeZone(timeZone);
        String seconds= String.valueOf(cal.get(Calendar.SECOND));
        String minutes= String.valueOf(cal.get(Calendar.MINUTE));
        String hours= String.valueOf(cal.get(Calendar.HOUR)+12);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Courier New",Font.PLAIN, 80));
        g.drawString(hours+":"+minutes+":"+seconds, 150, 200);
          
          
         
        }
      
      
      };
    
    //second tab panel
    JPanel tabPanel1 = new JPanel(new BorderLayout()) {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
        protected void paintComponent(Graphics g) {
      	 
          super.paintComponent(g);
          g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
         
          g.setColor(Color.WHITE);
          g.setFont(new Font("Courier New",Font.PLAIN, 80));
          g.drawString("INDIA", 30, 70);
         
        
        
     //for writing paragraphs
          Graphics2D g2 = (Graphics2D) g;

          g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
              RenderingHints.VALUE_ANTIALIAS_ON);
          String s="One-third the area of the United States, the Republic of India"
          		+ " occupies most of the subcontinent of India in southern Asia. "
          		+ "It borders on China in the northeast. Other neighbors are Pakistan on the west, "
          		+ "Nepal and Bhutan on the north, and Burma and Bangladesh on the east.The country "
          		+ "can be divided into three distinct geographic regions: the Himalayan region in the north,"
          		+ " which contains some of the highest mountains in the world, the Gangetic Plain, and the plateau "
          		+ "region in the south and central part. Its three great river systems—the Ganges, the Indus, and "
          		+ "the Brahmaputra—have extensive deltas and all rise in the Himalayas.";
     
      
          Font font = new Font("Serif", Font.BOLD, 25);
          AttributedString as = new AttributedString(s);
          as.addAttribute(TextAttribute.FONT, font);
          AttributedCharacterIterator aci = as.getIterator();

          FontRenderContext frc = g2.getFontRenderContext();
          LineBreakMeasurer lbm = new LineBreakMeasurer(aci, frc);
   
         float y = 70;

          while (lbm.getPosition() < s.length()) {
            TextLayout textLayout = lbm.nextLayout(780);
            y += textLayout.getAscent();
            textLayout.draw(g2, 320, y);
            y += textLayout.getDescent() + textLayout.getLeading();
           
          }

        }
     
   
      };
   //third tab panel
      JPanel tabPanel2 = new JPanel() {
          /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
          protected void paintComponent(Graphics g) {
        	
            super.paintComponent(g);
            g.drawImage(img1, 0, 0, getWidth(), getHeight(), this);
            g.setColor(Color.white);
            g.setFont(new Font("Courier New",Font.PLAIN, 80));
            g.drawString("INDIA", 800, 60);
           
            g.setColor(Color.white);           
            g.fillRect(40, 50, 500, 30);
            g.fillRect(40, 100, 500, 30);
            g.fillRect(40, 150, 900, 30);
            g.fillRect(40, 200, 1000, 30);
            g.fillRect(40, 250, 1000, 30);
            g.fillRect(40, 300, 500, 30);
            g.setColor(Color.black);
            g.setFont(new Font("Courier New",Font.BOLD, 22));
           
            g.drawString("Capital: Delhi", 50, 70);
            g.drawString("Population: 1.3 billion", 50, 120);
            g.drawString("Area: 3.1 million sq km (1.2 million sq miles), excluding Kashmir", 50, 170);
            g.drawString("Major languages: Hindi, English and more than 20 other official languages", 50, 220);
            g.drawString("Major religions: Hinduism, Islam, Christianity, Sikhism, Buddhism", 50, 270);
            g.drawString("Currency: Rupee", 50, 320);
            
           
          }
       
        };
        
      //third tab panel
        JPanel tabPanel3 = new JPanel(new BorderLayout()) {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            protected void paintComponent(Graphics g) {
          
              super.paintComponent(g);
              g.drawImage(img1, 0, 0, getWidth(), getHeight(), this);
             
             
              //helps transparent filling of rect
              g.setColor(new Color(30, 30,100, 100));
            
              g.fillRect(135, 45, 800, 300);
              g.setColor(Color.white);
             
              Graphics2D g2 = (Graphics2D) g;

              g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                  RenderingHints.VALUE_ANTIALIAS_ON);
              String s="India is a vast South Asian country with diverse terrain –"
              		+ " from Himalayan peaks to Indian Ocean coastline – and history "
              		+ "reaching back 5 millennia. In the north, Mughal Empire landmarks "
              		+ "include Delhi’s Red Fort complex and massive Jama Masjid mosque, plus"
              		+ " Agra’s iconic Taj Mahal mausoleum. Pilgrims bathe in the Ganges in Varanasi, "
              		+ "and Rishikesh is a yoga centre and base for Himalayan trekking.";
         
          
              Font font = new Font("Serif", Font.PLAIN, 30);
              AttributedString as = new AttributedString(s);
              as.addAttribute(TextAttribute.FONT, font);
              AttributedCharacterIterator aci = as.getIterator();

              FontRenderContext frc = g2.getFontRenderContext();
              LineBreakMeasurer lbm = new LineBreakMeasurer(aci, frc);
       
             float y = 50;

              while (lbm.getPosition() < s.length()) {
                TextLayout textLayout = lbm.nextLayout(780);
                y += textLayout.getAscent();
                textLayout.draw(g2, 150, y);
                y += textLayout.getDescent() + textLayout.getLeading();
               
              }
             
            }
         
          };
  
          
          
    //add buttons 
     JPanel button=new JPanel()
    		 {
    	 /**
				 * 
				 */
				private static final long serialVersionUID = 1L;

		@Override
         protected void paintComponent(Graphics g) {
       	 
           super.paintComponent(g);
           g.drawImage(img2, 0, 0, getWidth(), getHeight(), this);
           
          
         }
    		 };
     button.setLayout(new FlowLayout(FlowLayout.CENTER));
     //customizing the look of buttons
    btn1.setFont(new Font("Serif",Font.BOLD,20));
     btn1.setBackground(new Color(82,0,163));//import java.awt.Color;
     btn1.setForeground(Color.WHITE);
     btn1.setFocusPainted(false);
     btn1.setBorderPainted(false);

     btn2.setFont(new Font("Serif",Font.BOLD,20));
     btn2.setBackground(new Color(202,122,255));
     btn2.setForeground(Color.WHITE);
     btn2.setFocusPainted(false);
     btn2.setBorderPainted(false);
     
     btn3.setFont(new Font("Serif",Font.BOLD,20));
     btn3.setBackground(new Color(82,0,163));
     btn3.setForeground(Color.WHITE);
     btn3.setFocusPainted(false);
     btn3.setBorderPainted(false);
     
     
    button.add(btn1);  
    button.add(btn2);
	button.add(btn3);
	
	//button.setBackground(new Color(100,0,0));
   tabPanel3.add(button,BorderLayout.SOUTH);
	 btn1.addActionListener(this);
	 btn2.addActionListener(this);
	 btn3.addActionListener(this);
	 
	 
	
	//for the gif flag	
	 JLabel s = new JLabel(icon1);
 	 tabPanel1.add(s,BorderLayout.WEST);
 	
 	 
 	
 	 
 //tab declaration and initializing	 
   JTabbedPane tabPane = new JTabbedPane();
   
    tabPane.add("Country", tabPanel);
    tabPane.add("Geography", tabPanel1);
    tabPane.add("Time",tabPanel12);
    tabPane.add("About", tabPanel3);
    tabPane.add("Facts", tabPanel2);
   
   //frame declaration
    JFrame frame = new JFrame("Country Profile Display");
  
   
    frame.setContentPane(tabPane);
    frame.pack();
    frame.setResizable(false);
    frame.setVisible(true);
  }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
//for current time	
	 if(e.getSource() == btn1)
	{    
	    
	     
		  JPanel p1=new JPanel()
 		 {
 	 /**
				 * 
				 */
				private static final long serialVersionUID = 1L;

		@Override
      protected void paintComponent(Graphics g) {
    	 
        super.paintComponent(g);
        g.drawImage(img5, 0, 0, getWidth(),getHeight(), this);
		}
 		 };
	    
	     JFrame frame=new JFrame("STATES");
	 frame.add(p1);
	 frame.setSize(800, 700);
	 frame.setVisible(true);
     frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
	}
//for audio
	 if(e.getSource() == btn2)
		 
	{   
		 boolean playing=false; 
	    
		 try {
        // Open an audio input stream.
        URL url = this.getClass().getClassLoader().getResource("india.wav");
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
        // Get a sound clip resource.
        Clip clip = AudioSystem.getClip();
        // Open audio clip and load samples from the audio input stream.
        clip.open(audioIn);
        if ( ! playing ) 
        { 
          clip.start() ; 
     
          playing = true ; 
          btn2.setText ( "Playing National Anthem" ) ; 
          return;
        } 
        	 }
        
      catch (UnsupportedAudioFileException ea) {
        ea.printStackTrace();
     } catch (IOException ae) {
        ae.printStackTrace();
     } catch (LineUnavailableException ae) {
       ae.printStackTrace();
     } 
		 if ( ! playing ) 
	        { 
	          clip.start(); 
	     
	          playing = true ; 
	          btn2.setText ( "Playing National Anthem" ) ; 
	          return;
	        } 
		 playing = false ; 
		    btn2.setText ( "Play Again" ) ; 
		    clip.stop (); 
	        	
	}
	     
	 if(e.getSource() == btn3)
		{     JFrame frame=new JFrame("Prime Minister");
		    // JButton btn=new JButton("show");
		 ImageIcon icon1 = new ImageIcon("pindia.jpg"); 
		    
	     JPanel p1=new JPanel()
	    		 {
	    	 /**
					 * 
					 */
					private static final long serialVersionUID = 1L;

			@Override
	         protected void paintComponent(Graphics g) {
	       	 
	           super.paintComponent(g);
	           g.drawImage(img3, 0, 0, 800, 300, this);
	           
	           Graphics2D g2 = (Graphics2D) g;

	              g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	                  RenderingHints.VALUE_ANTIALIAS_ON);
	              String s="Narendra Damodardas Modi is an Indian politician "
	              		+ "who is the 14th and current Prime Minister of India, "
	              		+ "in office since May 2014. He was the Chief Minister of "
	              		+ "Gujarat from 2001 to 2014, and is the Member of Parliament for Varanasi.";
	         
	          
	              Font font = new Font("Serif", Font.PLAIN, 30);
	              AttributedString as = new AttributedString(s);
	              as.addAttribute(TextAttribute.FONT, font);
	              AttributedCharacterIterator aci = as.getIterator();

	              FontRenderContext frc = g2.getFontRenderContext();
	              LineBreakMeasurer lbm = new LineBreakMeasurer(aci, frc);
	       
	             float y = 320;

	              while (lbm.getPosition() < s.length()) {
	                TextLayout textLayout = lbm.nextLayout(600);
	                y += textLayout.getAscent();
	                textLayout.draw(g2, 50, y);
	                y += textLayout.getDescent() + textLayout.getLeading();
	               
	              }
	           
	          
	         }
	    		 };
	  
		   
			
		
	/*	btn.addActionListener(new ActionListener()
		{  
			
		  public void actionPerformed(ActionEvent e)
		  {    
		// display/center the jdialog when the button is pressed
		 JDialog d = new JDialog(frame, "Hello", true);
		  d.setLocationRelativeTo(frame);
		  d.setVisible(true);
		 
		  } 
		});*/
		 frame.add(p1);
		 frame.setSize(800, 600);
		 frame.setVisible(true);
	     frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		}
	}
	 
	
}


