package 五目並べ;

import javax.swing.JFrame;

class Frame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JFrame frame = new JFrame("五目並べ");
		
		Panel p = new Panel();
		frame.add(p);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1200,900);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

}
