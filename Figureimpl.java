package tlaba;

import java.awt.*;

public abstract class Figureimpl {
    public int x;
    public int y;
    public int sX, sY;
    private boolean visible = true;
    private int r;


    public Figureimpl(int x, int y, int r, boolean visible, int sX, int sY) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.visible = visible;
        this.sX = sX;
        this.sY = sY;
    }


    public int getsX() {
        return sX;
    }

    public void setsX(int sizeX) {
        this.sX = sizeX;
    }

    public int getsY() {
        return sY;
    }

    public void setsY(int sizeY) {
        this.sY = sizeY;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    abstract void draw(Graphics g);
}
