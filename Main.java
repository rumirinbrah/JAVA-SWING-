import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JLabel label=new JLabel();
        label.setText("Alag Asmaan");
        JFrame frame=new JFrame();
        //BORDER
        Border border=BorderFactory.createLineBorder(Color.white,2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("NEWBIE");
        ImageIcon logo=new ImageIcon("C:\\Users\\Atharva\\Documents\\COLLEGE\\balloon.jpg");
        frame.setSize(700,600);
        frame.setVisible(true);
        frame.setIconImage(logo.getImage());
        frame.getContentPane().setBackground(new Color(0x9D8BB2DA, true));
        frame.add(label);
        frame.setLayout(null);
        //label comms
        label.setIcon(logo);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x4B3A2D));
        label.setFont(new Font("Arial",Font.BOLD,20));
        label.setIconTextGap(0);
        label.setBorder(border);
        // to set the size of our label
        label.setBounds(0,0,300,320);
        //by default vertical is center
        label.setHorizontalAlignment(JLabel.CENTER);




    }
}