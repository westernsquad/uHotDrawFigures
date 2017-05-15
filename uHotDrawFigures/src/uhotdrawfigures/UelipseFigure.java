/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhotdrawfigures;
//x
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author westernsquad
 */

public class UelipseFigure extends uAbstractFigure{
    public UelipseFigure() {
        super();
    }
    public UelipseFigure(uAbstractFigure f){
        
        super();
        caja= new Rectangle(f.getCaja());
        
    }

    public UelipseFigure(int i, int i0, int i1, int i2) {
        super();
        caja=new Rectangle(i,i0,i1,i2);
    }

   
    public void draw (Graphics ecl){
         ecl.setColor(Color.blue);
         
        ecl.drawOval(caja.x,caja.y,caja.width,caja.height);  
    
    }
    public IFigure clone() {
        return new UelipseFigure(this);
    }

    

    

   
}
