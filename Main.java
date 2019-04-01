package tlaba;

import javax.swing.*;
import java.awt.*;

public class Main {
    private Main(int sX, int sY) {
        JFrame jFrame = new JFrame("Окно с изображением!");
        jFrame.setSize(sX, sY);
        JFrame.setDefaultLookAndFeelDecorated(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new BorderLayout(1, 1));
        Canvas myCanvas = new Canvas();
        jFrame.add(myCanvas);
        jFrame.setVisible(true);
    }


    public static void main(String[] args) {
        new Main(640, 480);
    }
}
