/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhotdrawfigures;

import java.awt.Graphics;

/**
 *
 * @author westernsquad
 */
public class uBorderDecoratorFigure extends uDecoratorFigure {

    @Override
    public void draw(Graphics g){
        super.draw(g);
        g.drawRect( innerFigure.displayBox().x,
                innerFigure.displayBox().y,
                innerFigure.displayBox().width,
                innerFigure.displayBox().height);
 }
}
