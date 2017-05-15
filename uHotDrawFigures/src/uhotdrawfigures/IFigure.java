/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhotdrawfigures;

import java.awt.Graphics;
import java.awt.Rectangle;


public interface IFigure {
    
    public void draw(Graphics g);
    public boolean containstPoint (double x, double y);
    public void moveBy(double dx,double dy);
    public Rectangle displayBox();
    public IFigure clone();
    public void setSize(int x,int y);
}
