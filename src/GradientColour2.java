//http://www.java2s.com/Code/Java/2D-Graphics-GUI/GradientPaintdemo.htm

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JApplet;
import javax.swing.JFrame;

public class GradientColour2 extends JApplet {

    Color NewGreen = new Color(26, 134, 58);
    Color NewBlue = new Color(32, 0, 210);
    Color NewRed = new Color(255, 17, 23);

    public void init() {
        setBackground(Color.white);
        setForeground(Color.white);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setPaint(Color.GRAY);
        int x = 5;
        int y = 7;
        GradientPaint greentoblue = new GradientPaint(x, y, NewGreen, 2000, y, NewBlue);
        g2.setPaint(greentoblue);
        g2.fill(new RoundRectangle2D.Double(x, y, 500, 500, 50, 50));
        g2.setPaint(Color.black);

    }

    public static void main(String s[]) {
        JFrame f = new JFrame("");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        JApplet applet = new GradientColour2();
        f.getContentPane().add("Center", applet);
        applet.init();
        f.pack();
        f.setSize(new Dimension(550, 550));
        f.show();
    }
}
