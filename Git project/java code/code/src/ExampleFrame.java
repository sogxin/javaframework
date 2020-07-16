import javax.swing.*;
import java.awt.*;

public class ExampleFrame extends JFrame {
    public static void main(String[] args) {
        ExampleFrame frame = new ExampleFrame();
        frame.setVisible(true);
    }
    public ExampleFrame(){
        super();
        setTitle("创建可以滚动的表格");
        setBounds(100,100,240,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] columnNames = {"A","B"};
        String[][] tableValues = {{"A1","B1"},{"A2","B2"},{"A3","B3"},{"A4","B4"},{"A5","B5"}};
        JTable table = new JTable(tableValues,columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }
}
