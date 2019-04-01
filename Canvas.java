package tlaba;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Canvas extends JComponent {
    private List<Figureimpl> figureList = new ArrayList<Figureimpl>() {{
        add(new Figure(320, 240, 320, true, getWidth(), getHeight()));
//        add(new Circle(960,540,100,true,100,80));
//        add(new Triangle(960,540,100,true,100,80));
    }};

    public void paint(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;
        figureList.forEach(figure -> {
            figure.draw(g2d);
        });
    }
}
