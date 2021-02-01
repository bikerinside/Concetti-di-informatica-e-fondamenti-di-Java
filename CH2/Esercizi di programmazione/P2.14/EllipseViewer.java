import javax.swing.JFrame;

public class EllipseViewer
{

  public static void main(String[] args)
  {

    JFrame myFrame = new JFrame();

    myFrame.setSize(200, 200);

    myFrame.setTitle("Elllisse colorata");

    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    EllipseComponent component = new EllipseComponent();

    myFrame.add(component);

    myFrame.setVisible(true);

  }

}
