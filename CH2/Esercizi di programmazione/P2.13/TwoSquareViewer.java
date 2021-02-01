import javax.swing.JFrame;

public class TwoSquareViewer
{

  public static void main(String[] args)
  {

    JFrame myFrame = new JFrame();

    myFrame.setSize(200, 200);

    myFrame.setTitle("Due rettangoli colorati");

    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TwoSquareComponent component = new TwoSquareComponent();

    myFrame.add(component);

    myFrame.setVisible(true);

  }

}
