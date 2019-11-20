/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprofil;
import java.awt.*;

/**
 *
 * @author ASUS
 */
public class Myprofil extends Panel {
    Myprofil(){
        setBackground(Color.WHITE);
    }
    public void paint(Graphics g){
        
        g.setColor(Color.pink);
        g.fillOval(300, 100, 250, 250);
        g.setColor(Color.black);
        g.fillOval(325, 200, 25, 25);
        g.fillOval(500, 200, 25, 25);
        g.setColor(Color.red); //tebal 3 kali
        g.drawArc(385, 275, 75, 50, 180, 180);
        g.drawArc(385, 275, 75, 50, 180, 180);
        g.drawArc(385, 275, 75, 50, 180, 180);
        //the body
        g.drawLine(425, 550, 425, 350);
        //the hands
        g.drawLine(425, 400, 80, 200);
        g.drawLine(725, 200, 425, 400);
        //the legs
        g.drawLine(425, 550, 80, 750);
        g.drawLine(425, 550, 725, 750);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f = new Frame("My Profil");
        Myprofil gp = new Myprofil();
        f.add(gp);
        f.setSize(900,900);
        f.setVisible(true);
    }
}
