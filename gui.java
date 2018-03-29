import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class gui {
  public static void main(String[] args) {
    // Generate item
    String[] items = new String[50];
    for (int i = 0; i < 50; i++)
      items[i] = "item" + String.valueOf(i);

    // Create new JList
    JList<String> list = new JList<String>();
    list.setListData(items);
    list.setVisibleRowCount(5);
    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    // Create new Frame
    JFrame frame = new JFrame("Test Frame!");
    frame.add(new JScrollPane(list)); // Add list with Scrollbar

    // Setting frame before show
    frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
