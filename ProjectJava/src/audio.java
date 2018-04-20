

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
import java.net.URL; 
 
public class audio 
    extends JApplet 
    implements ActionListener 
{ 
  AudioClip aclip ; 
  JButton btn ; 
  boolean playing=false; 
 
  public void init() 
  { JFrame frame = new JFrame("Country Profile Display");
  frame.getContentPane() ; 
    frame.setBackground ( Color.cyan ) ; 
    btn = new JButton ( "Play" ); 
    frame.setLayout( new FlowLayout() ); 
    JPanel p = new JPanel();
    p.add(btn);
    frame.add ( p ); 
    btn.addActionListener ( this ); 
 
    URL classloc = getCodeBase (); 
 
    aclip = getAudioClip 
      ( classloc, "india.wav"  ) ; 
    
    
    frame.pack();
    frame.setResizable(false);
    frame.setVisible(true);
  } 
  public void actionPerformed ( ActionEvent ev ) 
  { 
    if ( ! playing ) 
    { 
      aclip.loop () ; 
 
      playing = true ; 
      btn.setText ( "Stop" ) ; 
      return; 
    } 
    playing = false ; 
    btn.setText ( "Play Again" ) ; 
    aclip.stop (); 
  } 
  public void stop () 
  { 
    aclip.stop(); 
  } 
  public void start () 
  { 
    if ( playing )  aclip.loop(); 
  } 
 
} 