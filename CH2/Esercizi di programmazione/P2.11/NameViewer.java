import javax.swing.JFrame;

public class NameViewer
{

  public static void main(String[] args)
  {

    JFrame myFrame = new JFrame();

    myFrame.setSize(200, 200);

    myFrame.setTitle("Nome rosso rettangolo blu");

    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    NameComponent component = new NameComponent();

    myFrame.add(component);

    myFrame.setVisible(true);

  }

}
