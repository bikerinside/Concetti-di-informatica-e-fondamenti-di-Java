import javax.swing.JFrame;

public class FaceViewer
{

  public static void main(String[] args)
  {

    JFrame myFrame = new JFrame();

    myFrame.setSize(200, 200);

    myFrame.setTitle("FaceViewer");

    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    FaceComponent component = new FaceComponent();

    myFrame.add(component);

    myFrame.setVisible(true);

  }

}
