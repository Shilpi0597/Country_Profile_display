


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

public class AUSTRALIA extends JApplet implements ActionListener{
	
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
static BufferedImage bg = null;
  static BufferedImage img = null;
  static BufferedImage img1 = null;
  static BufferedImage img2 = null;
  static BufferedImage img3 = null;
  static BufferedImage img4 = null;
  static BufferedImage img5 = null;
  JButton btn1=new JButton("State");
  JButton btn2=new JButton("National_Anthem");
  JButton btn3=new JButton("Prime Minister");
  ImageIcon icon1 = new ImageIcon("australia.gif");
  private Clip clip;
	
 AUSTRALIA() {
	 
    try {
      bg = ImageIO.read(new File("C:/Project_Workspace/ProjectJava/australlia.jpg"));
      img=ImageIO.read(new File("C:/Project_Workspace/ProjectJava/ausf.jpg"));
      img1=ImageIO.read(new File("C:/Project_Workspace/ProjectJava/ausb.jpg"));
      img2=ImageIO.read(new File("C:/Project_Workspace/ProjectJava/buttonb2.jpg"));
      img3=ImageIO.read(new File("C:/Project_Workspace/ProjectJava/paus.jpg"));
      img4=ImageIO.read(new File("C:/Project_Workspace/ProjectJava/back.jpg"));
      img5=ImageIO.read(new File("C:/Project_Workspace/ProjectJava/ausst.png"));
      
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
    	  setPreferredSize(new Dimension(1124,400));
      //  super.paintComponent(g);
        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
        g.drawImage(img,50, 160, 350, 200, this);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Courier New",Font.PLAIN, 80));
        g.drawString("AUSTRALIA", 50, 90);
       
      }
      @Override
      public Dimension getPreferredSize() {
        return new Dimension(1124, 400);
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
          g.drawString("AUSTRALIA", 30, 70);
          
         //for paragraph in adout tab
          Graphics2D g2 = (Graphics2D) g;

          g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
              RenderingHints.VALUE_ANTIALIAS_ON);
          String s="The continent of Australia, with the island state of Tasmania, is approximately equal in"
          		+ " area to the United States (excluding Alaska and Hawaii). Mountain ranges run from north to "
          		+ "south along the east coast, reaching their highest point in Mount Kosciusko (7,308 ft; 2,228 m). "
          		+ "The western half of the continent is occupied by a desert plateau that rises into barren, rolling hills "
          		+ "near the west coast. The Great Barrier Reef, extending about 1,245 mi (2,000 km), "
          		+ "lies along the northeast coast. The island of Tasmania (26,178 sq mi; 67,800 sq km) is off the southeast coast.";
     
      
          Font font = new Font("Serif", Font.BOLD, 24);
          AttributedString as = new AttributedString(s);
          as.addAttribute(TextAttribute.FONT, font);
          AttributedCharacterIterator aci = as.getIterator();

          FontRenderContext frc = g2.getFontRenderContext();
          LineBreakMeasurer lbm = new LineBreakMeasurer(aci, frc);
      
         
        
          float y = 100;

          while (lbm.getPosition() < s.length()) {
            TextLayout textLayout = lbm.nextLayout(750);
            y += textLayout.getAscent();
            textLayout.draw(g2, 300, y);
            y += textLayout.getDescent() + textLayout.getLeading();
           
          }
        }
        @Override
        public Dimension getPreferredSize() {
          return new Dimension(1124, 400);
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
            g.drawImage(img1, 0, 0, 1124, 400, this);
            g.setColor(Color.white);
            g.setFont(new Font("Courier New",Font.PLAIN, 80));
            g.drawString("AUSTRALIA", 650, 60);
            g.setColor(Color.white);           
            g.fillRect(40, 50, 500, 30);
            g.fillRect(40, 100, 500, 30);
            g.fillRect(40, 150, 800, 30);
            g.fillRect(40, 200, 500, 30);
            g.fillRect(40, 250, 500, 30);
            g.fillRect(40, 300, 500, 30);
            g.setColor(Color.black);
            g.setFont(new Font("Courier New",Font.BOLD, 22));
           
            g.drawString("Capital: Canberra", 50, 70);
            g.drawString("Population: 22.9 million", 50, 120);
            g.drawString("Area: 7.7 million sq km (2.9 million sq miles)", 50, 170);
            g.drawString("Major language: English", 50, 220);
            g.drawString("Major religion: Christianity", 50, 270);
            g.drawString("Currency: Australian dollar", 50, 320);
          }
          @Override
          public Dimension getPreferredSize() {
            return new Dimension(1124, 400);
          }
        };
        //fourth tab panel
        JPanel tabPanel3 = new JPanel(new BorderLayout()) {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            protected void paintComponent(Graphics g) {
          
              super.paintComponent(g);
              g.drawImage(img1, 0, 0, 1124, 400, this);
             
             
              //helps transparent filling of rect
              g.setColor(new Color(30, 30,100, 100));
            
              g.fillRect(135, 45, 800, 300);
              g.setColor(Color.white);
             
              Graphics2D g2 = (Graphics2D) g;

              g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                  RenderingHints.VALUE_ANTIALIAS_ON);
              String s="Australia ranks as one of the best countries "
              		+ "to live in the world by international comparisons of wealth, "
              		+ "education, health and quality of life. The sixth-largest country by "
              		+ "land mass, its population is comparatively small with most people living "
              		+ "around the eastern and south-eastern coastlines.";
         
          
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
     
         		 JPanel tabPanel12 = new JPanel() {
         	        /**
         	           * 
         	           */
         	          private static final long serialVersionUID = 1L;
         	      @Override
         	        protected void paintComponent(Graphics g) {
         	            
         	          super.paintComponent(g);
         	    	  g.drawImage(img4, 0, 0, getWidth(), getHeight(), this);
         	          TimeZone timeZone = TimeZone.getTimeZone("ACT");
         	          Calendar cal=new GregorianCalendar();
         	          cal.setTimeZone(timeZone);
         	        String seconds= String.valueOf(cal.get(Calendar.SECOND));
         	        String minutes= String.valueOf(cal.get(Calendar.MINUTE)+30);
         	        String hours= String.valueOf(cal.get(Calendar.HOUR)+12);
         	        g.setColor(Color.WHITE);
         	        g.setFont(new Font("Courier New",Font.PLAIN, 80));
         	        g.drawString(hours+":"+minutes+":"+seconds,150, 200);
         	          
         	          
         	         
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
     	 tabPanel3.add(button,BorderLayout.SOUTH);
     	 
	 btn1.addActionListener(this);
	 btn2.addActionListener(this);
	 btn3.addActionListener(this);
	

	 JLabel s = new JLabel(icon1);
 	 tabPanel1.add(s,BorderLayout.WEST);
 	 
	

  
	

    JTabbedPane tabPane = new JTabbedPane();
    tabPane.add("Country", tabPanel);
    tabPane.add("Geography", tabPanel1);
    tabPane.add("Time", tabPanel12);
    tabPane.add("About",tabPanel3);
    tabPane.add("Facts",tabPanel2);
    
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
	 frame.setSize(500, 500);
	 frame.setVisible(true);
    frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
	}
	 
	//for audio
		 if(e.getSource() == btn2)
			 
		{    boolean playing=false; 
		    
			 try {
	        // Open an audio input stream.
	        URL url = this.getClass().getClassLoader().getResource("Australia.wav");
	        AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
	        // Get a sound clip resource.
	        Clip clip= AudioSystem.getClip();
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
		          clip.start() ; 
		     
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
		           g.setColor(Color.white);
		           g.setFont(new Font("Courier New",Font.BOLD, 35));
		           g.drawString("Malcolm Turnbull", 20, 50);
		           g.drawString("Prime Minister of Australia", 20, 100);
		           g.setColor(Color.BLACK);
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
		  
			   
				
		
			 frame.add(p1);
			 frame.setSize(800, 600);
			 frame.setVisible(true);
		     frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
			}
}
}

