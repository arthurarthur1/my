package tlaba;

import java.awt.*;

public class Circle extends Figureimpl {
    private int r;

    public Circle(int x, int y, int r, boolean visible, int sX, int sY) {
        super(x, y, r, visible, sX, sY);
        this.r = r;
    }


    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    void draw(Graphics g) {
        g.drawOval(x - r, y - r, r * 2, r * 2);
    }
}