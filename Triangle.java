package tlaba;

import java.awt.*;

public class Triangle extends Figureimpl {

    private int r;

    Triangle(int x, int y, int r, boolean visible, int sX, int sY) {
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
        double a = ((double) (r)) * Math.sqrt(3);
        int[] xPoints = {getX() - ((int) (a / 2)), getX() + ((int) (a / 2)), getX()};
        int[] yPoints = {getY() + ((int) (r / 2.0)), getY() + ((int) (r / 2.0)), getY() - r};
        g.drawPolygon(xPoints, yPoints, xPoints.length);
    }
}
