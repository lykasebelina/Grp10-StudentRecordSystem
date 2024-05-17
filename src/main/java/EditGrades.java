package gradesystem;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author Admin
 */
public class EditGrades implements ActionListener {
    JTextField txtfld1, txtfld2, txtfld3, txtfld4, txtfld5, txtfld6, txtfld7, txtfld8, txtfld9;
    JButton btnSave, btnReturn;
    JPanel headerPanel;
    
    EditGrades(){

        
        JFrame grades = new JFrame();
        grades.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        grades.setSize(1500,1000);
        grades.setTitle("GRADES RECORD");
        grades.setLocationRelativeTo(null);
        grades.setLayout(null);
        
        headerPanel = new JPanel();
        headerPanel.setBackground(new Color(128, 0, 0));   
        headerPanel.setBounds(0, 0, 1500, 100);
        
        
        JLabel lblHeader = new JLabel("STUDENT MANAGEMENT SYSTEM");
        lblHeader.setBounds(400, 30, 700, 50);
        lblHeader.setFont(new Font("Arial", Font.BOLD, 38));
        lblHeader.setForeground(Color.WHITE);
        
        JLabel lblHeader2 = new JLabel("EDIT GRADES");
        lblHeader2.setBounds(625, 130, 500, 50);
        lblHeader2.setFont(new Font("Arial Black", Font.BOLD, 33));
        lblHeader2.setForeground(Color.BLACK);
        JLabel lblName = new JLabel("Student Name: ");
        lblName.setBounds(300, 260, 200, 50);
        lblName.setFont(new Font("serif", Font.BOLD, 20));
        lblName.setForeground(Color.BLACK);
        txtfld1 = new JTextField();
        txtfld1.setBounds(450, 270, 400, 35);
        
        
        JLabel lblSub1 = new JLabel("COMP 009: ");
        lblSub1.setBounds(300, 310, 200, 50);
        lblSub1.setFont(new Font("serif", Font.BOLD, 20));
        lblSub1.setForeground(Color.BLACK);
        txtfld2 = new JTextField();
        txtfld2.setBounds(450, 320, 400, 35);
        JLabel lblSub2 = new JLabel("COMP 010: ");
        lblSub2.setBounds(300, 360, 200, 50);
        lblSub2.setFont(new Font("serif", Font.BOLD, 20));
        lblSub2.setForeground(Color.BLACK);
        txtfld3 = new JTextField();
        txtfld3.setBounds(450, 370, 400, 35);
        JLabel lblSub3 = new JLabel("COMP 012: ");
        lblSub3.setBounds(300, 410, 200, 50);
        lblSub3.setFont(new Font("serif", Font.BOLD, 20));
        lblSub3.setForeground(Color.BLACK);
        txtfld4 = new JTextField();
        txtfld4.setBounds(450, 420, 400, 35);
        JLabel lblSub4 = new JLabel("COMP 013: ");
        lblSub4.setBounds(300, 460, 200, 50);
        lblSub4.setFont(new Font("serif", Font.BOLD, 20));
        lblSub4.setForeground(Color.BLACK);
        txtfld5 = new JTextField();
        txtfld5.setBounds(450, 470, 400, 35);
        JLabel lblSub5 = new JLabel("COMP 014: ");
        lblSub5.setBounds(300, 510, 200, 50);
        lblSub5.setFont(new Font("serif", Font.BOLD, 20));
        lblSub5.setForeground(Color.BLACK);
        txtfld6 = new JTextField();
        txtfld6.setBounds(450, 520, 400, 35);
        JLabel lblSub6 = new JLabel("ELEC IT-FE2: ");
        lblSub6.setBounds(300, 560, 200, 50);
        lblSub6.setFont(new Font("serif", Font.BOLD, 20));
        lblSub6.setForeground(Color.BLACK);
        txtfld7 = new JTextField();
        txtfld7.setBounds(450, 570, 400, 35);
        JLabel lblSub7 = new JLabel("INTE 202: ");
        lblSub7.setBounds(300, 610, 200, 50);
        lblSub7.setFont(new Font("serif", Font.BOLD, 20));
        lblSub7.setForeground(Color.BLACK);
        txtfld8 = new JTextField();
        txtfld8.setBounds(450, 620, 400, 35);
        JLabel lblSub8 = new JLabel("PATHFIT 4: ");
        lblSub8.setBounds(300, 660, 200, 50);
        lblSub8.setFont(new Font("serif", Font.BOLD, 20));
        lblSub8.setForeground(Color.BLACK);
        txtfld9 = new JTextField();
        txtfld9.setBounds(450, 670, 400, 35);
        
        
        btnSave = new JButton("SAVE");
        btnSave.setBounds(1000, 300, 300, 50);
        btnSave.setFont(new Font("Arial Black", Font.BOLD, 13));
        btnSave.setBackground(new Color(245, 245, 220));
        btnSave.setForeground(new Color(128, 0, 0));
        btnSave.addActionListener(this);
        
        btnReturn = new JButton("BACK");
        btnReturn.setBounds(1000, 600, 300, 50);
        btnReturn.setFont(new Font("Arial Black", Font.BOLD, 13));
        btnReturn.setBackground(new Color(245, 245, 220));
        btnReturn.setForeground(new Color(128, 0, 0));
        btnReturn.addActionListener(this);
        
        
        grades.add(lblHeader);
        grades.add(lblHeader2);
        grades.add(lblName);
        grades.add(txtfld1);
        grades.add(lblSub1);
        grades.add(txtfld2);
        grades.add(lblSub2);
        grades.add(txtfld3);
        grades.add(lblSub3);
        grades.add(txtfld4);
        grades.add(lblSub4);
        grades.add(txtfld5);
        grades.add(lblSub5);
        grades.add(txtfld6);
        grades.add(lblSub6);
        grades.add(txtfld7);
        grades.add(lblSub7);
        grades.add(txtfld8);
        grades.add(lblSub8);
        grades.add(txtfld9);
        grades.add(btnSave);
        grades.add(btnReturn);
        grades.add(headerPanel);

        grades.setLayout(null);
        grades.setVisible(true);
        
        JLabel background = new JLabel();
        ImageIcon bckgrndPic = new ImageIcon("BACKGROUND2.jpg");
        background.setIcon(bckgrndPic);
        background.setSize(1500, 1000);
        grades.add(background);
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnReturn){
            new GradeRecord();
        }
    }

    
}
