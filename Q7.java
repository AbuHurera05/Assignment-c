import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;
class Q7 {
    public static void main(String args[]){
  new MyTable();

    }
}
class MyTable extends JFrame {
    JTable table;
    MyTable() {

        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        Object [][] data={{"BLCS/2k32/01","English",80},{"BLCS/2k32/01","Basic Electronics",85},{"BLCS/2k32/01","Methamatics",80},{"BLCS/2k32/01","Introduction to Computer",60},{"BLCS/2k32/01","Computer Laguage",70}};

String [] columnNames={"Roll No","Subject","Marks"};
        DefaultTableModel model= new DefaultTableModel(data,columnNames);
        table = new JTable(model);
        add (new JScrollPane(table));
    }




}
