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



public class France extends JApplet implements ActionListener{
	
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
  ImageIcon icon1 = new ImageIcon("Francef.gif"); 
  private Clip clip;
//constructor	 
 France() {
	 
    try {
      bg = ImageIO.read(new File("C:/Project_Workspace/ProjectJava/France.jpg"));
      img=ImageIO.read(new File("C:/Project_Workspace/ProjectJava/Francef.png"));
      img1=ImageIO.read(new File("C:/Project_Workspace/ProjectJava/Franceb1.jpg"));
      img2=ImageIO.read(new File("C:/Project_Workspace/ProjectJava/buttonb2.jpg"));
      img3=ImageIO.read(new File("C:/Project_Workspace/ProjectJava/Francep.jpg"));
      img4=ImageIO.read(new File("C:/Project_Workspace/ProjectJava/back.jpg"));
      img5=ImageIO.read(new File("C:/Project_Workspace/ProjectJava/francest.jpg"));
     
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
        g.drawString("FRANCE", 50, 90);
       
      }
      @Override
      public Dimension getPreferredSize() {
        return new Dimension(1124, 400);
      }
    };
    JPanel tabPanel12 = new JPanel() {
        /**
           * 
           */
          private static final long serialVersionUID = 1L;
      @Override
        protected void paintComponent(Graphics g) {
            
          super.paintComponent(g);
    	  g.drawImage(img4, 0, 0, getWidth(), getHeight(), this);
          TimeZone timeZone = TimeZone.getTimeZone("DST");
          Calendar cal=new GregorianCalendar();
          cal.setTimeZone(timeZone);
        String seconds= String.valueOf(cal.get(Calendar.SECOND));
        String minutes= String.valueOf(cal.get(Calendar.MINUTE));
        String hours= String.valueOf(cal.get(Calendar.HOUR)+2);
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
          g.drawString("FRANCE", 30, 70);
         
        
        
     //for writing paragraphs
          Graphics2D g2 = (Graphics2D) g;

          g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
              RenderingHints.VALUE_ANTIALIAS_ON);
          String s="France, the second largest country in Europe, is partially covered central, "
          		+ "north and west by a relatively flat plain that's punctuated by some time-worn"
          		+ " low rolling hills and mountains."
            +"Rugged cliffs front its coastline along the English Channel. There, to the northwest of Caen"
           + ", the Cotentin Peninsula shields the Channel Islands, while a bit further to the west, the "
            + "Brittany Peninsula juts into the Atlantic Ocean. "
        		  +"Assorted coastal islands dot the western coastline south of Brest, where "
        		  + "white-sandy beaches stretch along the Atlantic Ocean to the border with Spain.";
     
      
          Font font = new Font("Serif", Font.PLAIN, 25);
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
            g.drawString("France", 800, 60);
           
            g.setColor(Color.white);            
            g.fillRect(40, 50, 500, 30);
            g.fillRect(40, 100, 500, 30);
            g.fillRect(40, 150, 900, 30);
            g.fillRect(40, 200, 1000, 30);
            g.fillRect(40, 250, 1000, 30);
            g.fillRect(40, 300, 500, 30);
            g.setColor(Color.black);
            g.setFont(new Font("Courier New",Font.BOLD, 22));
           
            g.drawString("Capital: Paris", 50, 70);
            g.drawString("Population: 63.5 million", 50, 120);
            g.drawString("Area: 543,965 sq km (210,026 sq miles)", 50, 170);
            g.drawString("Major languages: French", 50, 220);
            g.drawString("Major religions: Christianity", 50, 270);
            g.drawString("Currency:  Euro UN, World Bank", 50, 320);
            
           
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
              String s="France is known the world over for its cuisine,"
              		+ " fashion, culture and language. It is the most visited "
              		+ "tourist destination in the world.A key player on the global"
              		+ " stage and a country at the political heart of Europe, France"
              		+ " paid a high price in both economic and human terms during the"
              		+ " two world wars.The years which followed saw protracted conflicts"
              		+ " culminating in independence for Algeria and most other French colonies"
              		+ " in Africa as well as decolonisation in south-east Asia.France was one of "
              		+ "the founding fathers of European integration as the continent sought to rebuild"
              		+ " after the devastation of the Second World War.";
         
          
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
	 frame.setSize(800, 650);
	 frame.setVisible(true);
    frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
	}
//for audio
	 if(e.getSource() == btn2)
		 
	{    boolean playing=false; 
	    
		 try {
        // Open an audio input stream.
        URL url = this.getClass().getClassLoader().getResource("france.wav");
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
		 ImageIcon icon1 = new ImageIcon("pFrance.jpg"); 
		    
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
	           g.setColor(Color.white);
	           g.setFont(new Font("Courier New",Font.BOLD, 28));
	           g.drawString("Bernard Cazeneuve",20, 240);
	           g.drawString("Prime Minister of France", 20, 285);
	           g.setColor(Color.BLACK);
	           Graphics2D g2 = (Graphics2D) g;

	              g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	                  RenderingHints.VALUE_ANTIALIAS_ON);
	              String s="Bernard Cazeneuve (born 2 June 1963) is a "
	              		+ "French Socialist politician who has been Prime Minister"
	              		+ " of France since December 2016. Born in Senlis, Oise, Cazeneuve "
	              		+ "rose to prominence with his election as a deputy of the National "
	              		+ "Assembly representing the 5th constituency of Manche in 1997, and as"
	              		+ " mayor of Cherbourg-Octeville in 2001.";
	         
	          
	              Font font = new Font("Serif", Font.PLAIN, 28);
	              AttributedString as = new AttributedString(s);
	              as.addAttribute(TextAttribute.FONT, font);
	              AttributedCharacterIterator aci = as.getIterator();

	              FontRenderContext frc = g2.getFontRenderContext();
	              LineBreakMeasurer lbm = new LineBreakMeasurer(aci, frc);
	       
	             float y = 320;

	              while (lbm.getPosition() < s.length()) {
	                TextLayout textLayout = lbm.nextLayout(680);
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


