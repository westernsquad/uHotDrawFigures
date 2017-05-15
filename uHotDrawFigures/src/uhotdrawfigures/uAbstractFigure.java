/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhotdrawfigures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

//*
public class uAbstractFigure implements IFigure {
    
    protected Rectangle caja;
    
    public uAbstractFigure(){
        
        caja = new Rectangle(20, 20, 30, 30);
        
    }
    

    public Rectangle getCaja() {
        return caja;
    }

    public void setCaja(Rectangle caja) {
        this.caja = caja;
    }
    
    
    public Rectangle DisplayBox(){
        return caja;
    }
    
    @Override
    public void moveBy(double moverX , double moverY){
        
        int x = (int) moverX;
        int y = (int) moverY;
        
        caja.translate(x, y);

    }
    

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.red);
        g.drawOval(caja.x, caja.y, caja.width, caja.height);
    }

    @Override
    public boolean containstPoint(double x, double y) {
        
       return caja.contains(x, y);
    }

    @Override
    public Rectangle displayBox() {
        return caja;
    }

   
    @Override
    public IFigure clone() {
        return null;
    }

    @Override
    public void setSize(int x, int y) {
      caja.setSize(x, y);
    }
   
    

    
    
}
