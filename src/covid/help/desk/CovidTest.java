package covid.help.desk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

class CovidTest extends JFrame implements ActionListener {
	
    
	private static final long serialVersionUID = 1L;

	JLabel label,label1;
        public int X=0,Y=0;
        
	JRadioButton radioButton[] = new JRadioButton[5];
	JButton btnNext, btnBookmark;
	ButtonGroup bg;
	int count = 0, current = 0, x = 1, y = 1, now = 0;
	int m[] = new int[15];


	CovidTest(String s) {
		super(s);
		label = new JLabel();
		add(label);
                label1 = new JLabel();
                add(label1);
		bg = new ButtonGroup();
		for (int i = 0; i < 5; i++) {
			radioButton[i] = new JRadioButton();
			add(radioButton[i]);
			bg.add(radioButton[i]);
		}
		btnNext = new JButton("Next");
		btnBookmark = new JButton("Bookmark");
		btnNext.addActionListener(this);
		btnBookmark.addActionListener(this);
		add(btnNext);
		add(btnBookmark);
		set();
                
                label.setBounds(230, 40, 450, 40);
		radioButton[0].setBounds(300, 120, 450, 40);
		radioButton[1].setBounds(300, 180, 200, 40);
                radioButton[2].setBounds(300, 240, 200, 45);
		btnNext.setBounds(200, 320, 100, 30);
		btnBookmark.setBounds(470, 320, 100, 30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                radioButton[0].setFont(new java.awt.Font("Times New Roman", 1, 34));
                radioButton[1].setFont(new java.awt.Font("Times New Roman", 1, 34));
                radioButton[2].setFont(new java.awt.Font("Times New Roman", 1, 34));
                label.setFont(new java.awt.Font("Times New Roman", 1, 30));               
		setLayout(null);
		setLocation(350, 150);
		setVisible(true);             
		this.setSize(850, 441);
                this.setBackground(new java.awt.Color(236, 236, 252));               		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNext) {
			if (check())
				count = count + 1;
			current++;
			set();
			if (current == 10) {
				btnNext.setEnabled(false);
				btnBookmark.setText("Result");
			}
		}
		if (e.getActionCommand().equals("Bookmark")) {
			JButton bk = new JButton("Bookmark" + x);
			bk.setBounds(680, 30 + 30 * x, 100, 30);
			add(bk);
			bk.addActionListener(this);
			m[x] = current;
			x++;
			current++;
			set();
			if (current == 10)
				btnBookmark.setText("Result");
			setVisible(false);
			setVisible(true);
		}
		for (int i = 0, y = 1; i < x; i++, y++) {
			if (e.getActionCommand().equals("Bookmark" + y)) {
				if (check())
					count = count + 1;
				now = current;
				current = m[y];
				set();
				((JButton) e.getSource()).setEnabled(false);
				current = now;
			}
		}

		if (e.getActionCommand().equals("Result")) {
			if (check())
				count = count + 1;
			current++;
                        if(count>=4){
                           JOptionPane.showMessageDialog(this, "You are Covid --" + " Positive."); 
                        }
                        setVisible(false);
                        new VaccineN().setVisible(true);
                }
                else if(e.getActionCommand().equals("Result")){
                    if (check())
				count = count + 1;
			current++;
                    if(count<4)
                        {
                            JOptionPane.showMessageDialog(this, "You are Covid --" + " Negative.");
                        }
			setVisible(false);
                        new CovidT().setVisible(true);
		}
	}

	// SET Questions with options
         void set(){
             radioButton[4].setSelected(true);
             try{
                 String question = null,qid;

                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con =DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6428124","sql6428124","VCn1UKEt3V");
                        
                        Statement stmt1 = con.createStatement();
                        ResultSet rs =stmt1.executeQuery("SELECT * FROM covid_question;");
                        while(rs.next())
                      
                        {
                             qid = rs.getString("qid");
                             question = rs.getString("ques"); 
                             if(X==Integer.parseInt(qid)){
                                 break;
                             }
                        }
                        label.setText(question);
			radioButton[0].setText("YES");
			radioButton[1].setText("NO");
                        radioButton[2].setText("NOT SURE");
                        X++;
                        
                                                
		}catch(SQLException e)
		{
		    JOptionPane.showMessageDialog(this, e.getMessage());
		} catch (ClassNotFoundException ex) {
                Logger.getLogger(CovidTest.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
	// declare right answers.
	boolean check() {
		if (current == 0)
			return (radioButton[0].isSelected());
		if (current == 1)
			return (radioButton[0].isSelected());
		if (current == 2)
			return (radioButton[0].isSelected());
		if (current == 3)
			return (radioButton[0].isSelected());
		if (current == 4)
			return (radioButton[0].isSelected());
		if (current == 5)
			return (radioButton[0].isSelected());
		if (current == 6)
			return (radioButton[0].isSelected());
		if (current == 7)
			return (radioButton[0].isSelected());
		if (current == 8)
			return (radioButton[0].isSelected());
		if (current == 9)
			return (radioButton[0].isSelected());
                if (current == 10)
			return (radioButton[0].isSelected());
		return false;
	}

	public static void main(String s[]) {
		new CovidTest("Covid-19 Positive Test with #Symptoms!!");
	}

}