//http://www.java2s.com/Code/Java/2D-Graphics-GUI/Gradientsinthemiddle.htm
    

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GradientColour3 extends JPanel {
    
    Color NewGreen = new Color(26, 134, 58);    
    Color NewBlue = new Color(32, 0, 210);
    
  public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;

    GradientPaint gp1 = new GradientPaint(5, 25, NewBlue, 20, 2, NewGreen, true);

    g2d.setPaint(gp1);
    g2d.fillRect(20, 80, 300, 40);

  }

  public static void main(String[] args) {

    JFrame frame = new JFrame("GradientsDirection");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new GradientColour3());
    frame.setSize(350, 350);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}

   
    