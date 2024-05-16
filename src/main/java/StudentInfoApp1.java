import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class StudentInfoApp1 extends JFrame {
    private JTextField nameField, yearandcourseField, genderField,  emailField, studentIdField ;
    private JTextArea displayArea;
    private ArrayList<Student> students;

    public StudentInfoApp1() {
        students = new ArrayList<>();

         
        JLabel nameLabel = new JLabel("Name:");
        JLabel ageLabel = new JLabel("Age:");
        JLabel idLabel = new JLabel("ID:");
        nameField = new JTextField(50);
        
        studentIdField = new JTextField(50);
        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("Delete");
        JButton searchButton = new JButton("Search");
        JButton backButton = new JButton("Back");
        displayArea = new JTextArea(50, 50);
        displayArea.setEditable(false);

       
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,2));
        panel.add(nameLabel);
        panel.add(nameField);
        PopupMenu studentIdLabel;
        panel.add(studentIdField);
        panel.add(addButton);
        panel.add(deleteButton);
        panel.add(searchButton);
        panel.add(backButton);
 
        setLayout(new BorderLayout());
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

   
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteStudent();
            }
        });

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchStudent();
            }
        });

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayStudents();
            }
        });

       
        setTitle("Student Information");
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addStudent() {
        String name = nameField.getText();
      
        int studentId = Integer.parseInt(studentIdField.getText());
        students.add(new Student(name, studentId));
        displayStudents();
    }

    private void deleteStudent() {
        int studentId = Integer.parseInt(studentIdField.getText());
        students.removeIf(student -> student.getId() == studentId);
        displayStudents();
    }

    private void searchStudent() {
        int id = Integer.parseInt(studentIdField.getText());
        for (Student student : students) {
            if (student.getId() == id) {
                displayArea.setText(student.toString());
                return;
            }
        }
        displayArea.setText("Student not found.");
    }

    private void displayStudents() {
        StringBuilder displayText = new StringBuilder();
        for (Student student : students) {
            displayText.append(student).append("\n");
        }
        displayArea.setText(displayText.toString());
    }

    public static void main(String[] args) {
        new StudentInfoApp1();
    }
}

class Student {
    private String name;
  
    private int id;

    public Student(String name, int age, int id) {
        this.name = name;
     
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}
