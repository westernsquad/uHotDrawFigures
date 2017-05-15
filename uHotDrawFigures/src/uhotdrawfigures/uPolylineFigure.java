/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhotdrawfigures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import uhotdrawfigures.uAbstractFigure;

public class uPolylineFigure extends uAbstractFigure {

    ArrayList<Point> puntos;

    public uPolylineFigure() {
        super();
        this.puntos = new ArrayList<Point>();
    }

    public void setPuntos(ArrayList<Point> puntos) {
        this.puntos = puntos;
    }

    public ArrayList<Point> getPuntos() {
        return puntos;
    }

    @Override
    public void draw(Graphics pl) {
        pl.setColor(Color.red);
        //if(puntos.size()>1){
        for (int i = 0; i < puntos.size() - 1; i++) {
            pl.drawLine(puntos.get(i).x, puntos.get(i).y,
                    puntos.get(i + 1).x, puntos.get(i + 1).y);
        }

    }

    @Override
    public IFigure clone() {
        return new uPolylineFigure();
    }

    @Override
    public boolean containstPoint(double x, double y) {
        return false;
    }

    @Override
    public void moveBy(double dx, double dy) {
        super.moveBy(dx, dy);
        for (Point p : this.puntos) {
            p.translate((int) dx, (int) dy);
        }
    }

    @Override
    public Rectangle displayBox() {
        return null;
    }

}
