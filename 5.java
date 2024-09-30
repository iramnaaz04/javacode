ASSIGNMENT 5
SET A

Q1.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ass5AQ1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Addition of Numbers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new GridLayout(4, 2, 5, 5));
        
        final JTextField num1Field = new JTextField();
        final JTextField num2Field = new JTextField();
        
        JButton addButton = new JButton("Add");
        
        final JTextField resultField = new JTextField();
        resultField.setEditable(false);
        
        frame.add(new JLabel("Number 1:"));
        frame.add(num1Field);
        frame.add(new JLabel("Number 2:"));
        frame.add(num2Field);
        frame.add(addButton);
        frame.add(resultField);
        
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {

                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double sum = num1 + num2;

                    resultField.setText(String.format("%.2f", sum));

                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });  
        frame.setVisible(true);
    }
}
OUTPUT:

 

Q2.
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {
    TextField t, t1;
    Label l, l1;
    int x, y;
    Panel p;
    MyFrame(String title) {
        super(title);
        setSize(500, 500);
        setVisible(true);
        setLayout(new FlowLayout());

        p = new Panel();
        p.setLayout(new GridLayout(2, 2, 5, 5));
        
        l = new Label("Coordinates of clicking");
        t = new TextField(20);
        l1 = new Label("Coordinates of movement");
        t1 = new TextField(20);

        p.add(l);
        p.add(t);
        p.add(l1);
        p.add(t1);
        add(p);

        addMouseListener(new MyClick());
        addMouseMotionListener(new MyMove());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    class MyClick extends MouseAdapter {
        public void mouseClicked(MouseEvent me) {
            x = me.getX();
            y = me.getY();
            t.setText("X=" + x + " Y=" + y);
        }
    }
    class MyMove extends MouseMotionAdapter {
        public void mouseMoved(MouseEvent me) {
            x = me.getX();
            y = me.getY();
            t1.setText("X=" + x + " Y=" + y);
        }
    }
}

public class Ass5AQ2 {
    public static void main(String[] args) {
        new MyFrame("Mouse Event Handler");
    }
}
OUTPUT:

 

SET B
Q1.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ass5BQ1 extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JButton b, submitButton;
    JRadioButton r1, r2, r3;
    JCheckBox c1, c2, c3;
    JTextField t1, t2;
    ButtonGroup b1;
    JPanel p1, p2;
    static int cnt;
    private StringBuffer s1 = new StringBuffer();

    Ass5BQ1() {
        b1 = new ButtonGroup();
        p1 = new JPanel();
        p2 = new JPanel();
        b = new JButton("Clear");
        b.addActionListener(this);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        r1 = new JRadioButton("FY");
        r2 = new JRadioButton("SY");
        r3 = new JRadioButton("TY");

        b1.add(r1);
        b1.add(r2);
        b1.add(r3);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        c1 = new JCheckBox("Music");
        c2 = new JCheckBox("Dance");
        c3 = new JCheckBox("Sports");

        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);

        l1 = new JLabel("Your Name");
        l2 = new JLabel("Your Class");
        l3 = new JLabel("Your Hobbies");
        t1 = new JTextField(20);
        t2 = new JTextField(30);

        p1.setLayout(new GridLayout(5, 2));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(l3);
        p1.add(r1);
        p1.add(c1);
        p1.add(r2);
        p1.add(c2);
        p1.add(r3);
        p1.add(c3);

        p2.setLayout(new FlowLayout());
        p2.add(submitButton);
        p2.add(b);
        p2.add(t2);

        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.EAST);

        setSize(400, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            s1.setLength(0); // Clear previous content
            String name = t1.getText();
            String selectedClass = "";
            if (r1.isSelected()) selectedClass = "FY";
            else if (r2.isSelected()) selectedClass = "SY";
            else if (r3.isSelected()) selectedClass = "TY";

            s1.append("Name = ").append(name).append(" Class = ").append(selectedClass);

            StringBuilder hobbies = new StringBuilder(" Hobbies = ");
            if (c1.isSelected()) hobbies.append("Music ");
            if (c2.isSelected()) hobbies.append("Dance ");
            if (c3.isSelected()) hobbies.append("Sports ");

            s1.append(hobbies.toString().trim());
            t2.setText(s1.toString());
        } else if (e.getSource() == b) {
            t2.setText("");
            t1.setText("");
            b1.clearSelection();
            c1.setSelected(false);
            c2.setSelected(false);
            c3.setSelected(false);
            s1.setLength(0)
        } else {
        }
    }

    public static void main(String arg[]) {
        Ass5BQ1 s = new Ass5BQ1();
    }
}
OUTPUT:

 

Q2.
import java.awt.*;
import java.awt.event.*;
class InvalidPasswordException extends Exception
{
	InvalidPasswordException()
	{
		System.out.println(" User name and Password is not same");
	}
}
public class Ass5BQ2 extends Frame implements ActionListener
{
	Label uname,upass;
	TextField nametext;
	TextField passtext,msg;
	Button login,Clear;
	Panel p;
	int attempt=0;
	char c= '*' ;

	public void login()
	{
		p=new Panel();
		uname=new Label("Use Name: ",Label.CENTER);
		upass=new Label("Password: ",Label.RIGHT);

		nametext=new TextField(20);
		passtext =new TextField(20);
		passtext.setEchoChar(c);
		msg=new TextField(10);
		msg.setEditable(false);

		login=new Button("Login");
		Clear=new Button("Clear");
		login.addActionListener(this);
		Clear.addActionListener(this);

		p.add(uname);
		p.add(nametext);
		p.add(upass);
		p.add(passtext);
		p.add(login);
		p.add(Clear);
		p.add(msg);
		add(p);
		setTitle("Login");
		setSize(290,200);
		setResizable(false);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
		Button btn=(Button)(ae.getSource());
		if(attempt<3)
		{
			if((btn.getLabel())=="Clear")
			{
				nametext.setText("");
				passtext.setText("");
			}
			if((btn.getLabel()).equals("Login"))
			{
				try
				{
					String user=nametext.getText();
					String upass=passtext.getText();

					if(user.compareTo(upass)==0)
					{
						msg.setText("Valid");
						System.out.println("Username is valid");
					}
					else
					{
						throw new InvalidPasswordException();
					}
				}
				catch(Exception e)
				{
					msg.setText("Error");
				}
				attempt++;
			}
		}
		else
		{
			System.out.println("you are using 3 attempt");
			System.exit(0);
		}
	}
	public static void main(String args[])
	{
		Ass5BQ2 pd=new Ass5BQ2();
		pd.login();
	}
}

OUTPUT:

 

