/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhotdrawfigures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
//x

public class uRectangleFigure extends uAbstractFigure {
    
    @Override
    public void draw (Graphics rect){
        
        rect.setColor(Color.red);
        rect.drawRect(caja.x , caja.y , caja.width , caja.height);   
    }
    
    public uRectangleFigure(uAbstractFigure f){
        
        super();
        caja= new Rectangle(f.getCaja());
        
    }
    
    public uRectangleFigure(){
        super();
    }
    
    public uRectangleFigure(int x, int y, int w, int h){
        super();
        caja = new Rectangle(x, y, w, h);
    }
    public IFigure clone() {
        return new uRectangleFigure(this);
    }
}
