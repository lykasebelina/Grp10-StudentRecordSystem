import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class MainMenu extends JFrame implements ActionListener {
        JFrame frame;
        Image background;
        Image imageSize;
        ImageIcon bgImage;
        JLabel bgLabel;
        JPanel headerPanel;
        JLabel headerLabel;
        JButton button1, button2, button3, button4;
        
        
    public MainMenu() {
        frame = new JFrame();
        frame.setTitle("Dashboard Menu");
        frame.setSize(1500, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

    
        try {
            
             background = ImageIO.read(new File("folderimage/sbBinan.jpg"));
             imageSize = background.getScaledInstance(1500, 1000, Image.SCALE_SMOOTH);
             bgImage = new ImageIcon(imageSize);
             
             frame.setContentPane(new JLabel(bgImage));
             
            } 
        
        catch (IOException e) {
                                e.printStackTrace();
                                
                              }


        headerPanel = new JPanel();
        headerPanel.setBackground(new Color(128, 0, 0));   
        headerPanel.setBounds(0, 0, 1500, 100);

        
        
        headerLabel = new JLabel("PUPBC STUDENT RECORD SYSTEM");
        headerLabel.setPreferredSize(new Dimension(720, 100)); 
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 38));
        headerLabel.setForeground(new Color(245, 245, 220));
        headerPanel.add(headerLabel);

  
        

        button1 = new JButton("Student Information");
        button1.setFont(new Font("Arial Black", Font.BOLD, 28));
        button1.setForeground(new Color(245, 245, 220));
        button1.setBackground(new Color(128, 0, 0));      
        button1.setOpaque(true);
        button1.setBorder(null);
        button1.setBounds(625, 135, 780, 150);
        button1.addActionListener(this);
 
  

        button2 = new JButton("Student Grades");
        button2.setFont(new Font("Arial Black", Font.BOLD, 28));
        button2.setForeground(new Color(245, 245, 220));
        button2.setBackground(new Color(128, 0, 0));
        button2.setOpaque(true);
        button2.setBorder(null);
        button2.setBounds(625, 295, 780, 150); 
        button2.addActionListener(this);

        

        button3 = new JButton("Attendance Record");
        button3.setFont(new Font("Arial Black", Font.BOLD, 28));
        button3.setForeground(new Color(245, 245, 220));
        button3.setBackground(new Color(128, 0, 0));
        button3.setOpaque(true);
        button3.setBorder(null);
        button3.setBounds(625, 455, 780, 150);
        button3.addActionListener(this);

        
        
        button4 = new JButton("Courses");
        button4.setFont(new Font("Arial Black", Font.BOLD, 28));
        button4.setForeground(new Color(245, 245, 220));
        button4.setBackground(new Color(128, 0, 0));
        button4.setOpaque(true);
        button4.setBorder(null);
        button4.setBounds(625, 615, 780, 150);
        button4.addActionListener(this);


        

        frame.add(headerPanel);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
 
        
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        JOptionPane.showMessageDialog(this, source.getText() + " clicked");
    }

   
}