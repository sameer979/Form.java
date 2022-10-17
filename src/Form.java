import javax.swing.*;
import java.awt.*;

public class Form extends JFrame
{
    private JLabel heading;
    Font font = new Font("",Font.BOLD,20);
    private JPanel mainPanel;
    private JLabel nameLabel,passwordLabel;
    private  JTextField nameText;
    private JPasswordField passwordFeild;
    private JButton button1,button2;
    public Form() {

        super.setTitle("Form");
        super.setSize(400,500);
        super.setLocation(100,100);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.createGUI();
        super.setVisible(true);
        System.out.printf("Running Form");

    }
    public void createGUI(){
     this.setLayout(new BorderLayout());
     heading  = new JLabel(" Fill Form Enter details");
     heading.setFont(font);
     this.add(heading,BorderLayout.NORTH);
     mainPanel = new JPanel();
     mainPanel.setLayout(new GridLayout(3,2));
     nameLabel = new JLabel("Enter Name");
     nameLabel.setFont(font);
     passwordLabel = new JLabel("Enter passWord");
     passwordLabel.setFont((font));
     nameText = new JTextField();
     nameText.setFont(font);
     passwordFeild = new JPasswordField();
     passwordFeild.setFont(font);
     button1 = new JButton("Submit");
     button1.setFont(font);
     button2 = new JButton("RESET");
     button2.setFont(font);

     mainPanel.add(nameLabel);

     mainPanel.add(nameText);

     mainPanel.add(passwordLabel);

     mainPanel.add(passwordFeild);

     mainPanel.add(button1);

     mainPanel.add((button2));

     this.add(mainPanel,BorderLayout.CENTER);

    }
}
