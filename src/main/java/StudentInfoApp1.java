import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;



/**
 *
 * @author Stephanie Palma and Vanessa Ramos
 */




public class StudentInfoApp1 extends JFrame {
    private JTextField nameField, yearandcourseField, idField, ageField, genderField, contactnumberField, emailField;
    private JTextArea displayArea;
    private ArrayList<Student> students;

    public StudentInfoApp1() {
        
        
        
         
        
        students = new ArrayList<>();

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JLabel yearandcourseLabel = new JLabel("Year & Course:");
        JLabel idLabel = new JLabel("ID:");
        JLabel ageLabel = new JLabel("Age:");
        JLabel genderLabel = new JLabel("Gender:");
        JLabel contactnumberLabel = new JLabel("Contact Number:");
        JLabel emailLabel = new JLabel("Email:");
        
        nameField = new JTextField(50);
        yearandcourseField = new JTextField(50);
        idField = new JTextField(50);
        ageField = new JTextField(50);
        genderField = new JTextField(50);
        contactnumberField = new JTextField(50);
        emailField = new JTextField(50);
        
        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("Delete");
        JButton searchButton = new JButton("Search");
        JButton backButton = new JButton("Back");
        displayArea = new JTextArea(50, 50);
        displayArea.setEditable(false);

        
        
        
        
        JPanel panel = new JPanel();
       
        
        
        
        
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(yearandcourseLabel);
        panel.add(yearandcourseField);
        panel.add(idLabel);
        panel.add(idField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(genderLabel);
        panel.add(genderField);
        panel.add(contactnumberLabel);
        panel.add(contactnumberField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(addButton);
        panel.add(deleteButton);
        panel.add(searchButton);
        panel.add(backButton);

        ImageIcon bgImage = new ImageIcon("folderimage/sbBinan.jpg");
        Image background = bgImage.getImage().getScaledInstance(1500, 1000, Image.SCALE_SMOOTH);
        ImageIcon bckgrnd = new ImageIcon(background);
       
        JLabel imageLabel = new JLabel(bckgrnd);
         panel.setBounds(0,-10,1500,1000);
        panel.add(imageLabel);
        panel.setOpaque(false); 
        
        
        
        
        
        // Add components to the frame
        setLayout(new BorderLayout());
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        // Add button actions
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteStudent();
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchStudent();
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayStudents();
            }
        });
      
        

        // Final frame setup
        setTitle("Student Information");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        
        pack();
        setVisible(true);
        
        
    }

    private void addStudent() {
        String name = nameField.getText();
        String yearandcourse = yearandcourseField.getText();
        int id = Integer.parseInt(idField.getText());
        int age = Integer.parseInt(ageField.getText());
        String gender = genderField.getText();
        String contactnumber = contactnumberField.getText();
        String email = emailField.getText();
         
        students.add(new Student(name, yearandcourse, id, age, gender, contactnumber,  email));
        displayStudents();
    }

    private void deleteStudent() {
        int id = Integer.parseInt(idField.getText());
        students.removeIf(student -> student.getId() == id);
        displayStudents();
    }

    private void searchStudent() {
        int id = Integer.parseInt(idField.getText());
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


class Student {
    private String name;
    private String yearandcourse;
    private int id;
    private int age;
    private String gender;
    private String contactnumber;
    private String email;
    
    public Student(String name, String yearandcourse, int id, int age, String gender, String contactnumber, String email) {
        this.name = name;
        this.yearandcourse = yearandcourse;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.contactnumber = contactnumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Year & Course: " + yearandcourse + ", Age: " + age + ", Gender: " + gender + ", Contact Number: " + contactnumber + ", Email: " + email;
    }
}
        

    }