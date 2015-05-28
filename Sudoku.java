import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class Sudoku extends JFrame{

	private JButton jbt1;
	private JButton jbt2;
	private JButton jbt3;
	
	private JTextField jtf1 = new JTextField();
	private JTextField jtf2 = new JTextField();
	private JTextField jtf3 = new JTextField();
	private JTextField jtf6 = new JTextField();
	private JTextField jtf7 = new JTextField();
	private JTextField jtf8 = new JTextField();
	private JTextField jtf9 = new JTextField();
	private JTextField jtf10 = new JTextField();
	private JTextField jtf11 = new JTextField();
	private JTextField jtf12 = new JTextField();
	private JTextField jtf14 = new JTextField();
	private JTextField jtf15 = new JTextField();
	private JTextField jtf16 = new JTextField();
	private JTextField jtf18 = new JTextField();
	private JTextField jtf19 = new JTextField();
	private JTextField jtf21 = new JTextField();
	private JTextField jtf22 = new JTextField();
	private JTextField jtf25 = new JTextField();
	private JTextField jtf26 = new JTextField();
	private JTextField jtf28 = new JTextField();
	private JTextField jtf30 = new JTextField();
	private JTextField jtf31 = new JTextField();
	private JTextField jtf32 = new JTextField();
	private JTextField jtf33 = new JTextField();
	private JTextField jtf34 = new JTextField();
	private JTextField jtf38 = new JTextField();
	private JTextField jtf39 = new JTextField();
	private JTextField jtf41 = new JTextField();
	private JTextField jtf43 = new JTextField();
	private JTextField jtf44 = new JTextField();
	private JTextField jtf48 = new JTextField();
	private JTextField jtf49 = new JTextField();
	private JTextField jtf50 = new JTextField();
	private JTextField jtf51 = new JTextField();
	private JTextField jtf52 = new JTextField();
	private JTextField jtf54 = new JTextField();
	private JTextField jtf56 = new JTextField();
	private JTextField jtf57 = new JTextField();
	private JTextField jtf60 = new JTextField();
	private JTextField jtf61 = new JTextField();
	private JTextField jtf63 = new JTextField();
	private JTextField jtf64 = new JTextField();
	private JTextField jtf66 = new JTextField();
	private JTextField jtf67 = new JTextField();
	private JTextField jtf68 = new JTextField();
	private JTextField jtf70 = new JTextField();
	private JTextField jtf71 = new JTextField();
	private JTextField jtf73 = new JTextField();
	private JTextField jtf74 = new JTextField();
	private JTextField jtf75 = new JTextField();
	private JTextField jtf76 = new JTextField();
	private JTextField jtf79 = new JTextField();
	private JTextField jtf80 = new JTextField();


	public Sudoku() {

	JPanel p1 = new JPanel();
		p1.setBorder(new LineBorder(Color.green, 2));
		p1.setLayout(new GridLayout(3,3,0,0));

		jtf1.setFont(new Font("Courie",Font.BOLD,40));
		jtf2.setFont(new Font("Courie",Font.BOLD,40));
		jtf3.setFont(new Font("Courie",Font.BOLD,40));
		jtf10.setFont(new Font("Courie",Font.BOLD,40));
		jtf11.setFont(new Font("Courie",Font.BOLD,40));
		jtf12.setFont(new Font("Courie",Font.BOLD,40));
		jtf19.setFont(new Font("Courie",Font.BOLD,40));
		jtf21.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l20 = new JLabel(" 2");
		l20.setForeground(Color.blue);
		l20.setFont(new Font("Courie",Font.BOLD,40));

		p1.add(jtf1);
		p1.add(jtf2);
		p1.add(jtf3);
		p1.add(jtf10);
		p1.add(jtf11);
		p1.add(jtf12);
		p1.add(jtf19);
		p1.add(l20);
		p1.add(jtf21);

	JPanel p2 = new JPanel();
		p2.setBorder(new LineBorder(Color.green, 2));
		p2.setLayout(new GridLayout(3,3,0,0));

		jtf6.setFont(new Font("Courie",Font.BOLD,40));
		jtf14.setFont(new Font("Courie",Font.BOLD,40));
		jtf15.setFont(new Font("Courie",Font.BOLD,40));
		jtf22.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l4 = new JLabel(" 1");
		l4.setForeground(Color.blue);
		l4.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l5 = new JLabel(" 4");
		l5.setForeground(Color.blue);
		l5.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l13 = new JLabel(" 6");
		l13.setForeground(Color.blue);
		l13.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l23 = new JLabel(" 3");
		l23.setForeground(Color.blue);
		l23.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l24 = new JLabel(" 9");
		l24.setForeground(Color.blue);
		l24.setFont(new Font("Courie",Font.BOLD,40));

		p2.add(l4);
		p2.add(l5);
		p2.add(jtf6);
		p2.add(l13);
		p2.add(jtf14);
		p2.add(jtf15);
		p2.add(jtf22);
		p2.add(l23);
		p2.add(l24);

	JPanel p3 = new JPanel();
		p3.setBorder(new LineBorder(Color.green, 2));
		p3.setLayout(new GridLayout(3,3,0,0));

		jtf7.setFont(new Font("Courie",Font.BOLD,40));
		jtf8.setFont(new Font("Courie",Font.BOLD,40));
		jtf9.setFont(new Font("Courie",Font.BOLD,40));
		jtf16.setFont(new Font("Courie",Font.BOLD,40));
		jtf18.setFont(new Font("Courie",Font.BOLD,40));
		jtf25.setFont(new Font("Courie",Font.BOLD,40));
		jtf26.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l17 = new JLabel(" 2");
		l17.setForeground(Color.blue);
		l17.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l27 = new JLabel(" 1");
		l27.setForeground(Color.blue);
		l27.setFont(new Font("Courie",Font.BOLD,40));
		
		p3.add(jtf7);
		p3.add(jtf8);
		p3.add(jtf9);
		p3.add(jtf16);
		p3.add(l17);
		p3.add(jtf18);
		p3.add(jtf25);
		p3.add(jtf26);
		p3.add(l27);

	JPanel p4 = new JPanel();
		p4.setBorder(new LineBorder(Color.green, 2));
		p4.setLayout(new GridLayout(3,3,0,0));

		jtf28.setFont(new Font("Courie",Font.BOLD,40));
		jtf30.setFont(new Font("Courie",Font.BOLD,40));
		jtf38.setFont(new Font("Courie",Font.BOLD,40));
		jtf39.setFont(new Font("Courie",Font.BOLD,40));
		jtf48.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l29 = new JLabel(" 3");
		l29.setForeground(Color.blue);
		l29.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l37 = new JLabel(" 4");
		l37.setForeground(Color.blue);
		l37.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l46 = new JLabel(" 7");
		l46.setForeground(Color.blue);
		l46.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l47 = new JLabel(" 5");
		l47.setForeground(Color.blue);
		l47.setFont(new Font("Courie",Font.BOLD,40));

		p4.add(jtf28);
		p4.add(l29);
		p4.add(jtf30);
		p4.add(l37);
		p4.add(jtf38);
		p4.add(jtf39);
		p4.add(l46);
		p4.add(l47);
		p4.add(jtf48);

	JPanel p5 = new JPanel();
		p5.setBorder(new LineBorder(Color.green, 2));
		p5.setLayout(new GridLayout(3,3,0,0));

		jtf31.setFont(new Font("Courie",Font.BOLD,40));
		jtf32.setFont(new Font("Courie",Font.BOLD,40));
		jtf33.setFont(new Font("Courie",Font.BOLD,40));
		jtf41.setFont(new Font("Courie",Font.BOLD,40));
		jtf49.setFont(new Font("Courie",Font.BOLD,40));
		jtf50.setFont(new Font("Courie",Font.BOLD,40));
		jtf51.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l40 = new JLabel(" 7");
		l40.setForeground(Color.blue);
		l40.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l42 = new JLabel(" 3");
		l42.setForeground(Color.blue);
		l42.setFont(new Font("Courie",Font.BOLD,40));

		p5.add(jtf31);
		p5.add(jtf32);
		p5.add(jtf33);
		p5.add(l40);
		p5.add(jtf41);
		p5.add(l42);
		p5.add(jtf49);
		p5.add(jtf50);
		p5.add(jtf51);

	JPanel p6 = new JPanel();
		p6.setBorder(new LineBorder(Color.green, 2));
		p6.setLayout(new GridLayout(3,3,0,0));

		jtf34.setFont(new Font("Courie",Font.BOLD,40));
		jtf43.setFont(new Font("Courie",Font.BOLD,40));
		jtf44.setFont(new Font("Courie",Font.BOLD,40));
		jtf52.setFont(new Font("Courie",Font.BOLD,40));
		jtf54.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l35 = new JLabel(" 5");
		l35.setForeground(Color.blue);
		l35.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l36 = new JLabel(" 9");
		l36.setForeground(Color.blue);
		l36.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l45 = new JLabel(" 8");
		l45.setForeground(Color.blue);
		l45.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l53 = new JLabel(" 4");
		l53.setForeground(Color.blue);
		l53.setFont(new Font("Courie",Font.BOLD,40));
		
		p6.add(jtf34);
		p6.add(l35);
		p6.add(l36);
		p6.add(jtf43);
		p6.add(jtf44);
		p6.add(l45);
		p6.add(jtf52);
		p6.add(l53);
		p6.add(jtf54);

	JPanel p7 = new JPanel();
		p7.setBorder(new LineBorder(Color.green, 2));
		p7.setLayout(new GridLayout(3,3,0,0));

		jtf56.setFont(new Font("Courie",Font.BOLD,40));
		jtf57.setFont(new Font("Courie",Font.BOLD,40));
		jtf64.setFont(new Font("Courie",Font.BOLD,40));
		jtf66.setFont(new Font("Courie",Font.BOLD,40));
		jtf73.setFont(new Font("Courie",Font.BOLD,40));
		jtf74.setFont(new Font("Courie",Font.BOLD,40));
		jtf75.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l55 = new JLabel(" 1");
		l55.setForeground(Color.blue);
		l55.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l65 = new JLabel(" 4");
		l65.setForeground(Color.blue);
		l65.setFont(new Font("Courie",Font.BOLD,40));		

		p7.add(l55);
		p7.add(jtf56);
		p7.add(jtf57);
		p7.add(jtf64);
		p7.add(l65);
		p7.add(jtf66);
		p7.add(jtf73);
		p7.add(jtf74);
		p7.add(jtf75);

	JPanel p8 = new JPanel();
		p8.setBorder(new LineBorder(Color.green, 2));
		p8.setLayout(new GridLayout(3,3,0,0));

		jtf60.setFont(new Font("Courie",Font.BOLD,40));
		jtf67.setFont(new Font("Courie",Font.BOLD,40));
		jtf68.setFont(new Font("Courie",Font.BOLD,40));
		jtf76.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l58 = new JLabel(" 5");
		l58.setForeground(Color.blue);
		l58.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l59 = new JLabel(" 6");
		l59.setForeground(Color.blue);
		l59.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l69 = new JLabel(" 7");
		l69.setForeground(Color.blue);
		l69.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l77 = new JLabel(" 2");
		l77.setForeground(Color.blue);
		l77.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l78 = new JLabel(" 1");
		l78.setForeground(Color.blue);
		l78.setFont(new Font("Courie",Font.BOLD,40));

		p8.add(l58);
		p8.add(l59);
		p8.add(jtf60);
		p8.add(jtf67);
		p8.add(jtf68);
		p8.add(l69);
		p8.add(jtf76);
		p8.add(l77);
		p8.add(l78);

	JPanel p9 = new JPanel();
		p9.setBorder(new LineBorder(Color.green, 2));
		p9.setLayout(new GridLayout(3,3,0,0));

		jtf61.setFont(new Font("Courie",Font.BOLD,40));
		jtf63.setFont(new Font("Courie",Font.BOLD,40));
		jtf70.setFont(new Font("Courie",Font.BOLD,40));
		jtf71.setFont(new Font("Courie",Font.BOLD,40));
		jtf79.setFont(new Font("Courie",Font.BOLD,40));
		jtf80.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l62 = new JLabel(" 3");
		l62.setForeground(Color.blue);
		l62.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l72 = new JLabel(" 5");
		l72.setForeground(Color.blue);
		l72.setFont(new Font("Courie",Font.BOLD,40));

		JLabel l81 = new JLabel(" 4");
		l81.setForeground(Color.blue);
		l81.setFont(new Font("Courie",Font.BOLD,40));	

		p9.add(jtf61);
		p9.add(l62);
		p9.add(jtf63);
		p9.add(jtf70);
		p9.add(jtf71);
		p9.add(l72);
		p9.add(jtf79);
		p9.add(jtf80);
		p9.add(l81);

		jtf1.setForeground(Color.black);
		jtf2.setForeground(Color.black);
		jtf3.setForeground(Color.black);
		jtf6.setForeground(Color.black);
		jtf7.setForeground(Color.black);
		jtf8.setForeground(Color.black);
		jtf9.setForeground(Color.black);
		jtf10.setForeground(Color.black);
		jtf11.setForeground(Color.black);
		jtf12.setForeground(Color.black);
		jtf14.setForeground(Color.black);
		jtf15.setForeground(Color.black);
		jtf16.setForeground(Color.black);
		jtf18.setForeground(Color.black);
		jtf19.setForeground(Color.black);
		jtf21.setForeground(Color.black);
		jtf22.setForeground(Color.black);
		jtf25.setForeground(Color.black);
		jtf26.setForeground(Color.black);
		jtf28.setForeground(Color.black);
		jtf30.setForeground(Color.black);
		jtf31.setForeground(Color.black);
		jtf32.setForeground(Color.black);
		jtf33.setForeground(Color.black);
		jtf34.setForeground(Color.black);
		jtf38.setForeground(Color.black);
		jtf39.setForeground(Color.black);
		jtf41.setForeground(Color.black);
		jtf43.setForeground(Color.black);
		jtf44.setForeground(Color.black);
		jtf48.setForeground(Color.black);
		jtf49.setForeground(Color.black);
		jtf50.setForeground(Color.black);
		jtf51.setForeground(Color.black);
		jtf52.setForeground(Color.black);
		jtf54.setForeground(Color.black);
		jtf56.setForeground(Color.black);
		jtf57.setForeground(Color.black);
		jtf60.setForeground(Color.black);
		jtf61.setForeground(Color.black);
		jtf63.setForeground(Color.black);
		jtf64.setForeground(Color.black);
		jtf66.setForeground(Color.black);
		jtf67.setForeground(Color.black);
		jtf68.setForeground(Color.black);
		jtf70.setForeground(Color.black);
		jtf71.setForeground(Color.black);
		jtf73.setForeground(Color.black);
		jtf74.setForeground(Color.black);
		jtf75.setForeground(Color.black);
		jtf76.setForeground(Color.black);
		jtf79.setForeground(Color.black);
		jtf80.setForeground(Color.black);

	JPanel p10 = new JPanel();
		p10.setBorder(new LineBorder(Color.yellow, 5));
		p10.setLayout(new GridLayout(3,3,0,0));

		p10.add(p1);
		p10.add(p2);
		p10.add(p3);
		p10.add(p4);
		p10.add(p5);
		p10.add(p6);
		p10.add(p7);
		p10.add(p8);
		p10.add(p9);

		JPanel p11 = new JPanel();

		jbt1 = new JButton("Answer");
		jbt2 = new JButton("Clear");
		jbt3 = new JButton("Check");

		p11.setLayout(new GridLayout(3,1));

		p11.add(jbt1);
		p11.add(jbt2);
		p11.add(jbt3);

		add(p10,BorderLayout.CENTER);
		add(p11,BorderLayout.EAST);

		jbt1.addActionListener(new Listener1());
		jbt2.addActionListener(new Listener2());
		jbt3.addActionListener(new Listener3());

	}

	class Listener1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			jtf1.setForeground(Color.red);
			jtf2.setForeground(Color.red);
			jtf3.setForeground(Color.red);
			jtf6.setForeground(Color.red);
			jtf7.setForeground(Color.red);
			jtf8.setForeground(Color.red);
			jtf9.setForeground(Color.red);
			jtf10.setForeground(Color.red);
			jtf11.setForeground(Color.red);
			jtf12.setForeground(Color.red);
			jtf14.setForeground(Color.red);
			jtf15.setForeground(Color.red);
			jtf16.setForeground(Color.red);
			jtf18.setForeground(Color.red);
			jtf19.setForeground(Color.red);
			jtf21.setForeground(Color.red);
			jtf22.setForeground(Color.red);
			jtf25.setForeground(Color.red);
			jtf26.setForeground(Color.red);
			jtf28.setForeground(Color.red);
			jtf30.setForeground(Color.red);
			jtf31.setForeground(Color.red);
			jtf32.setForeground(Color.red);
			jtf33.setForeground(Color.red);
			jtf34.setForeground(Color.red);
			jtf38.setForeground(Color.red);
			jtf39.setForeground(Color.red);
			jtf41.setForeground(Color.red);
			jtf43.setForeground(Color.red);
			jtf44.setForeground(Color.red);
			jtf48.setForeground(Color.red);
			jtf49.setForeground(Color.red);
			jtf50.setForeground(Color.red);
			jtf51.setForeground(Color.red);
			jtf52.setForeground(Color.red);
			jtf54.setForeground(Color.red);
			jtf56.setForeground(Color.red);
			jtf57.setForeground(Color.red);
			jtf60.setForeground(Color.red);
			jtf61.setForeground(Color.red);
			jtf63.setForeground(Color.red);
			jtf64.setForeground(Color.red);
			jtf66.setForeground(Color.red);
			jtf67.setForeground(Color.red);
			jtf68.setForeground(Color.red);
			jtf70.setForeground(Color.red);
			jtf71.setForeground(Color.red);
			jtf73.setForeground(Color.red);
			jtf74.setForeground(Color.red);
			jtf75.setForeground(Color.red);
			jtf76.setForeground(Color.red);
			jtf79.setForeground(Color.red);
			jtf80.setForeground(Color.red);
			
			jtf1.setText("9");
			jtf2.setText("6");
			jtf3.setText("3");
			jtf6.setText("2");
			jtf7.setText("5");
			jtf8.setText("8");
			jtf9.setText("7");
			jtf10.setText("8");
			jtf11.setText("1");
			jtf12.setText("4");
			jtf14.setText("7");
			jtf15.setText("5");
			jtf16.setText("9");
			jtf18.setText("3");
			jtf19.setText("5");
			jtf21.setText("7");
			jtf22.setText("8");
			jtf25.setText("4");
			jtf26.setText("6");
			jtf28.setText("2");
			jtf30.setText("8");
			jtf31.setText("4");
			jtf32.setText("1");
			jtf33.setText("6");
			jtf34.setText("7");
			jtf38.setText("9");
			jtf39.setText("6");
			jtf41.setText("5");
			jtf43.setText("2");
			jtf44.setText("1");
			jtf48.setText("1");
			jtf49.setText("2");
			jtf50.setText("9");
			jtf51.setText("8");
			jtf52.setText("3");
			jtf54.setText("6");
			jtf56.setText("7");
			jtf57.setText("9");
			jtf60.setText("4");
			jtf61.setText("8");
			jtf63.setText("2");
			jtf64.setText("6");
			jtf66.setText("2");
			jtf67.setText("3");
			jtf68.setText("8");
			jtf70.setText("1");
			jtf71.setText("9");
			jtf73.setText("3");
			jtf74.setText("8");
			jtf75.setText("5");
			jtf76.setText("9");
			jtf79.setText("6");
			jtf80.setText("7");
			
		}
	}

	class Listener2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			jtf1.setForeground(Color.black);
			jtf2.setForeground(Color.black);
			jtf3.setForeground(Color.black);
			jtf6.setForeground(Color.black);
			jtf7.setForeground(Color.black);
			jtf8.setForeground(Color.black);
			jtf9.setForeground(Color.black);
			jtf10.setForeground(Color.black);
			jtf11.setForeground(Color.black);
			jtf12.setForeground(Color.black);
			jtf14.setForeground(Color.black);
			jtf15.setForeground(Color.black);
			jtf16.setForeground(Color.black);
			jtf18.setForeground(Color.black);
			jtf19.setForeground(Color.black);
			jtf21.setForeground(Color.black);
			jtf22.setForeground(Color.black);
			jtf25.setForeground(Color.black);
			jtf26.setForeground(Color.black);
			jtf28.setForeground(Color.black);
			jtf30.setForeground(Color.black);
			jtf31.setForeground(Color.black);
			jtf32.setForeground(Color.black);
			jtf33.setForeground(Color.black);
			jtf34.setForeground(Color.black);
			jtf38.setForeground(Color.black);
			jtf39.setForeground(Color.black);
			jtf41.setForeground(Color.black);
			jtf43.setForeground(Color.black);
			jtf44.setForeground(Color.black);
			jtf48.setForeground(Color.black);
			jtf49.setForeground(Color.black);
			jtf50.setForeground(Color.black);
			jtf51.setForeground(Color.black);
			jtf52.setForeground(Color.black);
			jtf54.setForeground(Color.black);
			jtf56.setForeground(Color.black);
			jtf57.setForeground(Color.black);
			jtf60.setForeground(Color.black);
			jtf61.setForeground(Color.black);
			jtf63.setForeground(Color.black);
			jtf64.setForeground(Color.black);
			jtf66.setForeground(Color.black);
			jtf67.setForeground(Color.black);
			jtf68.setForeground(Color.black);
			jtf70.setForeground(Color.black);
			jtf71.setForeground(Color.black);
			jtf73.setForeground(Color.black);
			jtf74.setForeground(Color.black);
			jtf75.setForeground(Color.black);
			jtf76.setForeground(Color.black);
			jtf79.setForeground(Color.black);
			jtf80.setForeground(Color.black);

			//Clear textfield
			jtf1.setText("");
			jtf2.setText("");
			jtf3.setText("");
			jtf6.setText("");
			jtf7.setText("");
			jtf8.setText("");
			jtf9.setText("");
			jtf10.setText("");
			jtf11.setText("");
			jtf12.setText("");
			jtf14.setText("");
			jtf15.setText("");
			jtf16.setText("");
			jtf18.setText("");
			jtf19.setText("");
			jtf21.setText("");
			jtf22.setText("");
			jtf25.setText("");
			jtf26.setText("");
			jtf28.setText("");
			jtf30.setText("");
			jtf31.setText("");
			jtf32.setText("");
			jtf33.setText("");
			jtf34.setText("");
			jtf38.setText("");
			jtf39.setText("");
			jtf41.setText("");
			jtf43.setText("");
			jtf44.setText("");
			jtf48.setText("");
			jtf49.setText("");
			jtf50.setText("");
			jtf51.setText("");
			jtf52.setText("");
			jtf54.setText("");
			jtf56.setText("");
			jtf57.setText("");
			jtf60.setText("");
			jtf61.setText("");
			jtf63.setText("");
			jtf64.setText("");
			jtf66.setText("");
			jtf67.setText("");
			jtf68.setText("");
			jtf70.setText("");
			jtf71.setText("");
			jtf73.setText("");
			jtf74.setText("");
			jtf75.setText("");
			jtf76.setText("");
			jtf79.setText("");
			jtf80.setText("");
		}
	}

	class Listener3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			int tf1 = Integer.parseInt(jtf1.getText());
			int tf2 = Integer.parseInt(jtf2.getText());
			int tf3 = Integer.parseInt(jtf3.getText());
			int tf6 = Integer.parseInt(jtf6.getText());
			int tf7 = Integer.parseInt(jtf7.getText());
			int tf8 = Integer.parseInt(jtf8.getText());
			int tf9 = Integer.parseInt(jtf9.getText());
			int tf10 = Integer.parseInt(jtf10.getText());
			int tf11 = Integer.parseInt(jtf11.getText());
			int tf12 = Integer.parseInt(jtf12.getText());
			int tf14 = Integer.parseInt(jtf14.getText());
			int tf15 = Integer.parseInt(jtf15.getText());
			int tf16 = Integer.parseInt(jtf16.getText());
			int tf18 = Integer.parseInt(jtf18.getText());
			int tf19 = Integer.parseInt(jtf19.getText());
			int tf21 = Integer.parseInt(jtf21.getText());
			int tf22 = Integer.parseInt(jtf22.getText());
			int tf25 = Integer.parseInt(jtf25.getText());
			int tf26 = Integer.parseInt(jtf26.getText());
			int tf28 = Integer.parseInt(jtf28.getText());
			int tf30 = Integer.parseInt(jtf30.getText());
			int tf31 = Integer.parseInt(jtf31.getText());
			int tf32 = Integer.parseInt(jtf32.getText());
			int tf33 = Integer.parseInt(jtf33.getText());
			int tf34 = Integer.parseInt(jtf34.getText());
			int tf38 = Integer.parseInt(jtf38.getText());
			int tf39 = Integer.parseInt(jtf39.getText());
			int tf41 = Integer.parseInt(jtf41.getText());
			int tf43 = Integer.parseInt(jtf43.getText());
			int tf44 = Integer.parseInt(jtf44.getText());
			int tf48 = Integer.parseInt(jtf48.getText());
			int tf49 = Integer.parseInt(jtf49.getText());
			int tf50 = Integer.parseInt(jtf50.getText());
			int tf51 = Integer.parseInt(jtf51.getText());
			int tf52 = Integer.parseInt(jtf52.getText());
			int tf54 = Integer.parseInt(jtf54.getText());
			int tf56 = Integer.parseInt(jtf56.getText());
			int tf57 = Integer.parseInt(jtf57.getText());
			int tf60 = Integer.parseInt(jtf60.getText());
			int tf61 = Integer.parseInt(jtf61.getText());
			int tf63 = Integer.parseInt(jtf63.getText());
			int tf64 = Integer.parseInt(jtf64.getText());
			int tf66 = Integer.parseInt(jtf66.getText());
			int tf67 = Integer.parseInt(jtf67.getText());
			int tf68 = Integer.parseInt(jtf68.getText());
			int tf70 = Integer.parseInt(jtf70.getText());
			int tf71 = Integer.parseInt(jtf71.getText());
			int tf73 = Integer.parseInt(jtf73.getText());
			int tf74 = Integer.parseInt(jtf74.getText());
			int tf75 = Integer.parseInt(jtf75.getText());
			int tf76 = Integer.parseInt(jtf76.getText());
			int tf79 = Integer.parseInt(jtf79.getText());
			int tf80 = Integer.parseInt(jtf80.getText());

			if(tf1 == 9 && tf2 == 6 && tf3 == 3 && tf6 == 2 && tf7 == 5 && 
				tf8 == 8 && tf9 == 7 && tf10 == 8 && tf11 == 1 && tf12 == 4 && 
				tf14 == 7 && tf15 == 5 && tf16 == 9 && tf18 == 3 && tf19 == 5 && 
				tf21 == 7 && tf22 == 8 && tf25 == 4 && tf26 == 6 && tf28 == 2 && 
				tf30 == 8 && tf31 == 4 && tf32 == 1 && tf33 == 6 && tf34 == 7 && 
				tf38 == 9 && tf39 == 6 && tf41 == 5 && tf43 == 2 && tf44 == 1 &&
				tf48 == 1 && tf49 == 2 && tf50 == 9 && tf51 == 8 && tf52 == 3 && 
				tf54 == 6 && tf56 == 7 && tf57 == 9 && tf60 == 4 && tf61 == 8 && 
				tf63 == 2 && tf64 == 6 && tf66 == 2 && tf67 == 3 && tf68 == 8 && 
				tf70 == 1 && tf71 == 9 && tf73 == 3 && tf74 == 8 && tf75 == 5 && 
				tf76 == 9 && tf79 == 6 && tf80 == 7) {

					JFrame frame2 = new JFrame();
					frame2.setTitle("Winner!");
					JLabel jl = new JLabel("Congratulation!");

					jl.setForeground(Color.red);
					jl.setFont(new Font("Courie",Font.BOLD,150));

					frame2.add(jl);

					frame2.pack();
					frame2.setLocationRelativeTo(null); // Center the frame		
					frame2.setVisible(true);
			}else {

				JFrame frame3 = new JFrame();
				frame3.setTitle("Loser");
				JLabel j2 = new JLabel("Fail...");

				j2.setForeground(Color.red);
				j2.setFont(new Font("Courie",Font.BOLD,150));

				frame3.add(j2);

				frame3.pack();
				frame3.setLocationRelativeTo(null); // Center the frame		
				frame3.setVisible(true);
			}
		}
	}

	public static void main(String[] args) {
		JFrame frame = new Sudoku();
		frame.setTitle("U10316024_Sudoku");
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); 
	}
}
