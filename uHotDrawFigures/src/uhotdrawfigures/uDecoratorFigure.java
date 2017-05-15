/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhotdrawfigures;

import java.awt.Graphics;


public class uDecoratorFigure extends uAbstractFigure{
    
    public IFigure innerFigure ;
    
    @Override
    public void draw (Graphics g){
        innerFigure.draw(g);
    }

    public IFigure getInnerFigure() {
        return innerFigure;
    }

    public void setInnerFigure(IFigure innerFigure) {
        this.innerFigure = innerFigure;
    }
    
    
    
}
