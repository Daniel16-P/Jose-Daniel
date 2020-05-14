import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Circulo extends JApplet {

  public void paint(Graphics g) {
    g.drawString("o", 200,100);
    g.drawString("o", 200,230);

    g.drawString("o", 140,160);
    g.drawString("o", 260,160);

    g.drawString("o", 0,0);
    g.drawString("o", 252,130);
    
    g.drawString("o", 180,105);
    g.drawString("o", 165,110);
    g.drawString("o", 155,120);
    g.drawString("o", 150,130);
    g.drawString("o", 145,140);
    g.drawString("o", 140,150);
    g.drawString("o", 140,180);
    
    g.drawString("o", 140,190);
    g.drawString("o", 145,200);
    g.drawString("o", 150,210);
    g.drawString("o", 160,220);
    g.drawString("o", 170,225);
    g.drawString("o", 180,230);
    
    g.drawString("o", 225,100);
    g.drawString("o", 235,110);
    g.drawString("o", 245,120);
    g.drawString("o", 250,130);
    g.drawString("o", 255,140);
    g.drawString("o", 258,150);
    g.drawString("o", 255,190);
    g.drawString("o", 260,180);
    
    g.drawString("o", 250,198);
    g.drawString("o", 245,205);
    g.drawString("o", 240,210);
    g.drawString("o", 235,215);
    g.drawString("o", 230,220);
    g.drawString("o", 225,225);
    g.drawString("o", 220,230);
    g.drawString("o", 215,232);
    g.drawString("o", 207,230);
    
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Cargando JApplet");
    Circulo circuloApplet = new Circulo();
    circuloApplet.init();
    frame.getContentPane().add(circuloApplet);
    frame.setSize(200, 200);
    frame.setVisible(true);
  }

}