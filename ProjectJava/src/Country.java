import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.File;


import javax.imageio.ImageIO;
//used for JLabel,JOptionPane.JFrame frame used in the program is latest swing frame which supports many functionality and is much more flexible
import javax.swing.*;
 
 
public class Country {
  
 
	JFrame frame = new JFrame("Country Profile Display");
	//accepts pair of points i.e coordintes(x,y) for start point and the end point
   	 Point start = new Point();
 	Point end = new Point();
     
 	ImageIcon icon1 = new ImageIcon("back.jpg"); 



   	Country(final BufferedImage image) {
   		
          	//copies the passed image into another variable
    	final BufferedImage imageCopy = new BufferedImage(
            	image.getWidth(),
            	image.getHeight(),
            	image.getType());
    	final JLabel imageLabel = new JLabel(new ImageIcon(imageCopy));
   	
    	JPanel panel = new JPanel(new BorderLayout());
    	//adds the passed image(worldmap1.png) into the frames panel
    	panel.add(imageLabel, BorderLayout.CENTER);
	    
    	JLabel label1 =new JLabel("Country Profile Display");
    	label1.setFont(new Font("Felix Titling",Font.BOLD, 40));
      	label1.setForeground(Color.getHSBColor(1.57f, 1.0f, 0.03f));
      	panel.add(label1, BorderLayout.NORTH);
   	
 	//bottom of the frame displays the cursor coordinates
    	final JLabel selectionLabel = new JLabel(
            	"Click Country's Area to display its Profile");
    	selectionLabel.setFont(new Font("Courier New",Font.PLAIN, 40));
    	panel.add(selectionLabel, BorderLayout.SOUTH);
   	//defines the heading for the frame with colour specified
    	
    	
      	repaint(image, imageCopy);
    	imageLabel.repaint();
   	
    	//required for retrieveing the coordinates of the cursor when the mouse is moved 
    	imageLabel.addMouseMotionListener(new MouseMotionAdapter() {
 
       	
        	@Override
        	public void mouseMoved(MouseEvent me) {
            	start = me.getPoint();
            	repaint(image, imageCopy);
            	selectionLabel.setText("Start Point: " +"x="+start.x+" y="+start.y);
            	imageLabel.repaint();
        	}
 
        	@Override
      	public void mouseDragged(MouseEvent me) {
             	end = me.getPoint();
           	repaint(image, imageCopy);
            	imageLabel.repaint();
           	
           	
           	
        	
        	}
      	
        	
    	});
  	
   	
    	
   	imageLabel.addMouseListener(new MouseAdapter() {
	    
	   
          	   
	   

		@Override
	      public void mouseClicked(MouseEvent me)
	      {  
	      	   start = me.getPoint();
	      	    end = me.getPoint();
	      	   //condition to be satisfied to display particular countries
	      	    if((start.x>=824&&end.x<=916)&&(start.y>=183&&end.y<=269))
        	{                 
	      	    new INDIA();
			
			
   	
        	}
	      else if((start.x>=976&&end.x<=1098)&&(start.y>=326&&end.y<=416))
	      {  
	      	   new AUSTRALIA();
	      
	      
	      }
	      else if((start.x>=221&&end.x<=374)&&(start.y>=137&&end.y<=212))
	      { 
	    	new United();
	      	
	      }
	      else if((start.x>=603&&end.x<=645)&&(start.y>=135&&end.y<=161))
		     { 
		    	new France();
		      }
	      else
	      	   
	      	   JOptionPane.showMessageDialog(null, "not specified region");
    	}
 
   	
   	});
 
   
        
 	//adding the picture to the frame
  	frame.add(panel);
  	panel.setBackground(Color.getHSBColor(220, 30, 61));
          	
  //	frame.getRootPane().setBorder(BorderFactory.createMatteBorder(6,6 , 6, 6, Color.BLUE));
  	 
  	frame.setVisible(true);
  	 frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  	frame.setPreferredSize(new Dimension(1250, 740));
  	frame.setResizable(false);
  	frame.pack();

	 //windowClosing
  	
	}
   	
	public void repaint(BufferedImage orig, BufferedImage copy) {
    	Graphics2D g = copy.createGraphics();
    	
    	g.drawImage(orig,0,0, null);

    	//highlighted countries area with their respective coordinates
    	int x[] = { 838,843,850,852,855,851,855,856,860,855,865,874,884,892,905,915,907,902,
                       	 899,893,897,891,887,883,883,883,878,869,864,854,856,855,848,847,842,841,839,836,
                       	 835,832,829,822,826,820,823,829,825,824,831,841};
          	    int y[] = {187,187,184,189,194,197,200,200,201,206,208,212,212,211,
          	          	204,207,208,213,220,226,219,218,218,212,220,224,229,236,241
          	          	,247,255,262,269,271,262,258,252,244,231,227,234,226,223,222,
          	          	220,220,213,208,209,195};
          	 
          	    g.setColor(new Color(30,40,0,100));
          	    g.fillPolygon(x,y,50);
          	   
          	  int a[]={214,212,211,212,215,218,219,221,223,225,230,234,240,241,243,246,
                       	  251,253,261,265,271,274,278,282,286,289,293,296,296,308,315
                       	  ,321,330,335,338,344,344,352,350,347,348,364,359,373,381,381,
                       	  386,391,388,381,381,373,359,354,341,346,341,334,324,307,219};
          	  int b[]={145,153,163,169,175,179,180,183,186,189,190,194,194,193,195,197,196,200,199,195,198
                       	  ,202,206,203,209,215,215,209,203,203,202,201,204,201,207,215,217,208,202,199,181,
                       	  173,166,165,161,157,154,150,149,152,155,159,165,164,160,153,148,143,141,144};
          	
          	    g.fillPolygon(a,b,60);
          	   
          	  int c[]={962,967,968,970,967,973,982,991,998,1006,1013,1021,1029,1029,1038,
                       	  1039,1041,1043,1048,1050,1057,1062,1070,1079,1078,1087,1089,1086,1086
                       	  ,1077,1074,1066,1063,1062,1055,1051,1048,1029,1034,1034,1015,1011,1008,1002,
                       	  990,987,976,965,963,962};
          	  int d[]={378,390,396,401,404,407,401,405,399,400,397,396,398,405,402,402,408,
                       	  409,417,417,416,416,415,415,410,392,384,381,375,368,361,357,347,
                       	  343,341,329,351,345,339,337,334,344,344,340,351,359,362,365,368,377};
          	  g.fillPolygon(c,d,50);
 
          	int e[]={581,587,591,593,621,599,609,613,617,621,619,615,619,617,615,611,605,599,595,593,591,587,583,581};
   	     int f[]={142,140,138,140,138,136,138,140,142,140,146,148,152,156,160,156,162,162,160,150,148,146,144,144};
   	  g.fillPolygon(e,f,24);
    	}
  	
	
  
	public static void main(String[] args) throws Exception {
 	//retrieves worldmap1 image from the given path  
    	String path = "C:/Users/Shilpi/workspace/project/worldmap1.png";
    	BufferedImage image = ImageIO.read(new File(path));
          	
    	SwingUtilities.invokeLater(new Runnable() {
        	public void run() {
            	new Country(image);
        	}
    	});
	}
}
	