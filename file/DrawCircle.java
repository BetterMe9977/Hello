import javax.swing.*;
import java.awt.*;
import java.net.URL;

@SuppressWarnings({"all"})
public class DrawCircle extends JFrame {
    private MyPanel myPanel = null;

    public static void main(String[] args) {
        System.out.println("Hello");

        new DrawCircle();
    }

    public DrawCircle() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(400,300);
        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MyPanel extends JPanel {

    @Override
    public  void paint(Graphics g) {
        super.paint(g);
//        g.drawOval(10,10,100,100);

        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.png"));
        g.drawImage(image, 10,10, 50, 50, this);
    }
}