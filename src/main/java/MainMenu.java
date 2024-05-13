import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame implements ActionListener {

    public MainMenu() {
        setTitle("Dashboard Menu");
        setSize(1500, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLayeredPane layoutOrder = new JLayeredPane();
        getContentPane().add(layoutOrder);

        ImageIcon backgroundImage = new ImageIcon("/Users/lykamaesebelina/Downloads/sbBinan.jpg");
        Image imageIcon = backgroundImage.getImage();
        Image imageSize = imageIcon.getScaledInstance(1500, 1000, Image.SCALE_SMOOTH);
        ImageIcon bgImage = new ImageIcon(imageSize);
        JLabel bgLabel = new JLabel(bgImage);
        bgLabel.setBounds(0, 0, 1500, 1000);
        layoutOrder.add(bgLabel, Integer.valueOf(0));


        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(128, 0, 0));   
        headerPanel.setBounds(0, 0, 1500, 100);
        layoutOrder.add(headerPanel, Integer.valueOf(2));
        
        JLabel headerLabel = new JLabel("PUPBC STUDENT RECORD SYSTEM");
        headerLabel.setPreferredSize(new Dimension(720, 100)); //x and y axis of jlabel
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 38));
        headerLabel.setForeground(new Color(245, 245, 220));
        headerPanel.add(headerLabel);



        JButton button1 = new JButton("Student Information");
        button1.setFont(new Font("Arial Black", Font.BOLD, 28));
        button1.setForeground(new Color(245, 245, 220));
        button1.setBackground(new Color(128, 0, 0));      
        button1.setOpaque(true);
        button1.setBorder(null);
        button1.setBounds(625, 135, 780, 150);
        button1.addActionListener(this);
        layoutOrder.add(button1, Integer.valueOf(1));

        JButton button2 = new JButton("Student Grades");
        button2.setFont(new Font("Arial Black", Font.BOLD, 28));
        button2.setForeground(new Color(245, 245, 220));
        button2.setBackground(new Color(128, 0, 0));
        button2.setOpaque(true);
        button2.setBorder(null);
        button2.setBounds(625, 295, 780, 150); 
        button2.addActionListener(this);
        layoutOrder.add(button2, Integer.valueOf(1));

        JButton button3 = new JButton("Attendance Record");
        button3.setFont(new Font("Arial Black", Font.BOLD, 28));
        button3.setForeground(new Color(245, 245, 220));
        button3.setBackground(new Color(128, 0, 0));
        button3.setOpaque(true);
        button3.setBorder(null);
        button3.setBounds(625, 455, 780, 150);
        button3.addActionListener(this);
        layoutOrder.add(button3, Integer.valueOf(1));
        
        JButton button4 = new JButton("Courses");
        button4.setFont(new Font("Arial Black", Font.BOLD, 28));
        button4.setForeground(new Color(245, 245, 220));
        button4.setBackground(new Color(128, 0, 0));
        button4.setOpaque(true);
        button4.setBorder(null);
        button4.setBounds(625, 615, 780, 150);
        button4.addActionListener(this);
        layoutOrder.add(button4, Integer.valueOf(1));

        

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        JOptionPane.showMessageDialog(this, source.getText() + " clicked");
    }

   
}