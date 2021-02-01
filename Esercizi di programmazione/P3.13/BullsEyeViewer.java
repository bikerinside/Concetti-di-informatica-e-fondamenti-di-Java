/* visualizza un frame che contiene car component */

import javax.swing.JFrame;

public class BullsEyeViewer
{

  public static void main(String[] args)
  {

    JFrame frame = new JFrame();

    frame.setSize(300, 300);

    frame.setTitle("Bull's Eye");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    BullsEyeComponent component = new BullsEyeComponent();
    frame.add(component);

    frame.setVisible(true);

  }

}
