package gradesystem;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.table.*;
import javax.swing.border.*;

public class GradeRecord implements ActionListener{
    JButton btnReturn, btnEdit, btnAdd, btnDelete;
    JFrame tblGrades;
    JTable table;
    JLabel lblHeader;
    JPanel headerPanel;
    DefaultTableModel model;
    JTableHeader tableHeader;
    JScrollPane scrollPane;
    
    GradeRecord(){
        tblGrades  = new JFrame();
        tblGrades.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tblGrades.setSize(1500, 1000);
        tblGrades.setTitle("Grades");
        tblGrades.setLocationRelativeTo(null);
        tblGrades.setLayout(null);
        
        
        headerPanel = new JPanel();
        headerPanel.setBackground(new Color(128, 0, 0));   
        headerPanel.setBounds(0, 0, 1500, 100);
        
        model = new DefaultTableModel(new Object[]{"Student Name", "COMP 009", "COMP 010", "COMP 012", "COMP 013", "COMP 014", "ELEC IT-FE2", "INTE 202", "PAHFIT 4", "GWA"}, 0);
        table = new JTable(model);
        table.setOpaque(false);
        table.setBackground(new Color(245, 245, 220));
        table.setEnabled(false);
        
        tableHeader = table.getTableHeader();
        table.getTableHeader().setBackground(new Color(128, 0, 0));
        table.getTableHeader().setForeground(new Color(245, 245, 220));
        table.getTableHeader().setFont(new Font("Arial Black", Font.BOLD, 13));
        
        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(75, 160, 1350, 500);
      
       Color tableBorderColor = new Color(128, 0, 0);
       scrollPane.setBorder(new LineBorder(tableBorderColor, 8));
        
        
                
 
        lblHeader = new JLabel("BSIT STUDENT RECORD SYSTEM");
        lblHeader.setBounds(400, 30, 700, 50);
        lblHeader.setFont(new Font("Arial", Font.BOLD, 38));
        lblHeader.setForeground(Color.WHITE);
        
        btnReturn = new JButton("RETURN TO MAIN MENU");
        btnReturn.setBounds(1100, 675, 300, 50);
        btnReturn.setFont(new Font("Arial Black", Font.BOLD, 13));
        btnReturn.setBackground(new Color(245, 245, 220));
        btnReturn.setForeground(new Color(128, 0, 0));
        btnReturn.addActionListener(this);
        
        btnEdit = new JButton("EDIT");
        btnEdit.setBounds(350, 675, 200, 50);
        btnEdit.setFont(new Font("Arial Black", Font.BOLD, 13));
        btnEdit.setBackground(new Color(245, 245, 220));
        btnEdit.setForeground(new Color(128, 0, 0));
        btnEdit.addActionListener(this);
        
        btnAdd = new JButton("ADD");
        btnAdd.setBounds(100, 675, 200, 50);
        btnAdd.setFont(new Font("Arial Black", Font.BOLD, 13));
        btnAdd.setBackground(new Color(245, 245, 220));
        btnAdd.setForeground(new Color(128, 0, 0));
        btnAdd.addActionListener(this);
        
        btnDelete = new JButton("DELETE");
        btnDelete.setBounds(600, 675, 200, 50);
        btnDelete.setFont(new Font("Arial Black", Font.BOLD, 13));
        btnDelete.setBackground(new Color(245, 245, 220));
        btnDelete.setForeground(new Color(128, 0, 0));
        btnDelete.addActionListener(this);
        
        JLabel background = new JLabel();
        ImageIcon bckgrndPic = new ImageIcon("BACKGROUND.jpg");
        background.setIcon(bckgrndPic);
        background.setSize(1500, 1000);
        
        tblGrades.setVisible(true);
        tblGrades.add(btnReturn);
        tblGrades.add(btnAdd);
        tblGrades.add(btnEdit);
        tblGrades.add(btnDelete);
        tblGrades.add(scrollPane);
        tblGrades.add(lblHeader);
        tblGrades.add(headerPanel);
        tblGrades.add(background);
        
        
        
        
        
    }
    
    
    private void addRow(){
        model.addRow(new Object[]{"Torralba, Angel Wayne L.", "1.25", "1.50", "1.75", "1", "1.25", "1.50", "1.75", "1", "1.44"});
    }
            
            
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnEdit){
            new EditGrades();
        }
        else if(e.getSource() == btnAdd){
            addRow();
        }
    }

}


