/*
 * Jim Klayder -- spring 2018
 * 
 * The drawSix method demos how to set up a simple recursive drawing example.
 */
package demoRecursionExample;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author jimklayder
 */
public class DrawingPanel extends javax.swing.JPanel {

    private int whichDrawing;
    /**
     * Creates new form DrawingPanel
     */
    public DrawingPanel() {
        initComponents();
        
        whichDrawing = 1;
    }
    
     @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.setColor(new Color(255,230,230));
        g.fillRect(0, 0, 1400, 1400);
        
        g.setFont(new Font("TimesRoman", Font.BOLD, 48));
        
        if (whichDrawing == 1) drawOne(g,10);
        if (whichDrawing == 2) drawTwp(g,10);
        if (whichDrawing == 3) drawThree(g,10);
        if (whichDrawing == 4) drawFour(g,10);
        if (whichDrawing == 5) drawFive(g,10);
        if (whichDrawing == 6) drawSix(g,25);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void makeDrawing(int num)
    {
        whichDrawing = num;
        repaint();
    }
    
    private void drawOne(Graphics g, int num) {
        g.setColor(new Color(140,140,255));
        g.drawString("one", 100, 60);
        drawMeOne(g, num);
    }
    
    private void drawMeOne(Graphics g, int num){     
        if(num >= 280){
            g.drawRect(num, num, 10, 10);
            g.drawRect(num, num - 270, 10, 10);
        }
        else{
            g.drawRect(num, num, 10, 10);
            g.drawRect(num, -1*num + 290, 10, 10);
            drawMeOne(g, num + 10);
        }
    }
    
    private void drawTwp(Graphics g, int num) {
        g.setColor(new Color(140,140,255));
        g.drawString("two", 40, 60);
        drawMeTwp(g, num);
    }
    
    private void drawMeTwp(Graphics g, int num){
        if(num == 200){
            g.drawOval(num, 100, num, num);
        }
        else{
            g.drawOval(num, 100, num, num);
            drawMeTwp(g, num + 1);
        }
    }
    
    private void drawThree(Graphics g, int num) {
        g.setColor(new Color(140,140,255));
        g.drawString("three", 40, 60);
    
    }
    
    private void drawFour(Graphics g, int num) {
        g.setColor(new Color(140,140,255));
        g.drawString("four", 40, 60);
    
    }
    
    private void drawFive(Graphics g, int num) {
        g.setColor(new Color(140,140,255));
        g.drawString("five", 40, 60);
    
    }
    
    private void drawSix(Graphics g, int num) {
        //first do some non-recursive drawing
        g.setColor(new Color(140,140,255));
        g.drawString("six", 40, 60);
        
        //then call the recursive method
        drawMeSix(g,num);
    
    }
    
    private void drawMeSix(Graphics g, int num) {
        
        if (num <= 0)
        {
           g.fillRect(150,20,10,10); 
        }else
        {
            g.drawRect(150,20,10 * num,10 * num);
            
            //note that if the following method call is executed enough times,
            //it will eventually have a second parameter value of 0
            //which will end the recursion
            drawMeSix(g,num - 1);
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
