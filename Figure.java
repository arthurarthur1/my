package tlaba;

import java.awt.*;

class Figure extends Figureimpl {
    private Circle circle;
    private Triangle triangle;


    Figure(int x, int y, int r, boolean visible, int sX, int sY) {
        super(x, y, r, true, sX, sY);
        circle = new Circle(x, y, r, visible, sX, sY);
        triangle = new Triangle(x, y, r, visible, sX, sY);
    }


    @Override
    void draw(Graphics g) {
        circle.draw(g);
        triangle.draw(g);
    }
}