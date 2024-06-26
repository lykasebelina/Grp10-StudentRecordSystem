/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attendancerecord;

/**
 *
 * @author Matthew Pascua
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.border.LineBorder;
import javax.swing.table.JTableHeader;

public class Attendance extends JFrame implements ActionListener {
    
     JFrame attendanceFrame;
     JPanel headerPanel;
     JLabel headerLabel;
     JTable table;
     Color tableBorderColor;
     JTableHeader tableHeader;
     JScrollPane scrollPane;
     DefaultTableModel model;
     JButton addButton;
     JButton deleteButton;
     JButton backButton;
     JTextField searchBar;
     ImageIcon bg;
     Image imageSize;
     ImageIcon backgroundImage;
     JPanel panelImage;
     JLabel imageLabel;
     
    public Attendance() {
        attendanceFrame = new JFrame();
        attendanceFrame.setTitle("Student Attendance");
        attendanceFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        attendanceFrame.setPreferredSize(new Dimension(1500, 1000));
        attendanceFrame.setLayout(null);
        attendanceFrame.setLocationRelativeTo(null);
  
        
        
        headerPanel = new JPanel();
        headerPanel.setBackground(new Color(128, 0, 0));   
        headerPanel.setBounds(0, 0, 1500, 100);
        
        headerLabel = new JLabel("BSIT STUDENT RECORD SYSTEM");
        headerLabel.setPreferredSize(new Dimension(720, 100)); 
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 38));
        headerLabel.setForeground(new Color(245, 245, 220));
        headerPanel.add(headerLabel);
        
        model = new DefaultTableModel(new Object[]{"Name", "Course", "Subject", "Date", "Attendance"}, 0);
        table = new JTable(model);
        table.setOpaque(false);
        table.setBackground(new Color(245, 245, 220));
     
      
       tableHeader = table.getTableHeader();
       table.getTableHeader().setBackground(new Color(128, 0, 0));
       table.getTableHeader().setForeground(new Color(245, 245, 220));
       table.getTableHeader().setFont(new Font("Arial Black", Font.BOLD, 13));
      
       scrollPane = new JScrollPane(table);
       scrollPane.setBounds(35, 160, 1350, 500);
      
       tableBorderColor = new Color(128, 0, 0);
       scrollPane.setBorder(new LineBorder(tableBorderColor, 8));

       String[] choices = { "Present", "Absent", "Excuse"};
       JComboBox<String> attendance = new JComboBox<String>(choices);
       table.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(attendance));
    
       String[] subjectCode = { "COMP 009", "COMP 010", "COMP 012", "COMP 013", "COMP 014", "ELECT IT-FE2", "INTE 202", "PATHFIT 4"};
       JComboBox<String> selectSubject = new JComboBox<String>(subjectCode);
       table.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(selectSubject));
 
       
         searchBar = new JTextField(20);
         
         
         JPanel panelText = new JPanel(new BorderLayout());
         panelText.add(searchBar);
         panelText.setBounds(50, 120, 300, 30);
       
         attendanceFrame.add(panelText);
    
        addButton = new JButton("Add New Record");
        addButton.setFont(new Font("Arial Black", Font.BOLD, 13));
        addButton.setForeground(new Color(128, 0, 0));
        addButton.setBackground(new Color(245, 245, 220));
        addButton.setOpaque(true);
        addButton.setBorder(null);
        addButton.setBounds(50, 680, 200, 50);
        addButton.addActionListener(this);
        
        deleteButton = new JButton("Delete Record");
        deleteButton.setFont(new Font("Arial Black", Font.BOLD, 13));
        deleteButton.setForeground(new Color(128, 0, 0));
        deleteButton.setBackground(new Color(245, 245, 220));
        deleteButton.setOpaque(true);
        deleteButton.setBorder(null);
        deleteButton.setBounds(270, 680, 200, 50);
        deleteButton.addActionListener(this);
        
        backButton = new JButton("BACK");
        backButton.setFont(new Font("Arial Black", Font.BOLD, 13));
        backButton.setForeground(new Color(128, 0, 0));
        backButton.setBackground(new Color(245, 245, 220));
        backButton.setOpaque(true);
        backButton.setBorder(null);
        backButton.setBounds(1180, 720, 200, 50);
        backButton.addActionListener(this);
        
        
        
        bg = new ImageIcon("folderimage/sbBinan.jpg");
        imageSize = bg.getImage().getScaledInstance(1500, 1000, Image.SCALE_SMOOTH);
        backgroundImage = new ImageIcon(imageSize);
       
        imageLabel = new JLabel(backgroundImage);
        
        JPanel panelImage = new JPanel();
        panelImage.setBounds(0,-10,1500,1000);
        panelImage.add(imageLabel);
        
        
        attendanceFrame.add(scrollPane);
        attendanceFrame.add(headerPanel);
        attendanceFrame.add(addButton);
        attendanceFrame.add(deleteButton);
        attendanceFrame.add(backButton);
        attendanceFrame.add(panelImage);
        

        attendanceFrame.pack();
        attendanceFrame.setVisible(true);  
        
    }
  
    private void addRow() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = sdf.format(new Date());

        model.addRow(new Object[]{"","BSIT 2-1","Select Subject", currentDate, "Set Attendance"});

    }
        @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== addButton){
                addRow();
            }
        
   
                if(e.getSource()== deleteButton){
               JOptionPane.showMessageDialog(this, "Do you want to delete this record?");
            }
                
                if(e.getSource()== backButton){
               JOptionPane.showMessageDialog(this, backButton.getText() + " clicked");
            }
        }
}


