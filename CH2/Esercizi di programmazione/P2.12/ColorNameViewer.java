import javax.swing.JFrame;

public class ColorNameViewer
{

  public static void main(String[] args)
  {

    JFrame myFrame = new JFrame();

    myFrame.setSize(200, 200);

    myFrame.setTitle("ColorNameViewer");

    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ColorNameComponent component = new ColorNameComponent();

    myFrame.add(component);

    myFrame.setVisible(true);

  }

}
