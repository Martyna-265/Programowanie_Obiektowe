package pl.edu.pw.mini.po.reverse_engineering.app.panels;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyBottomPanel extends JPanel {

	public MyBottomPanel(MyGraphicPanel graphicPanel) {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JButton button = new JButton();
		button.setText("Get rays");
		add(button);
		
		JTextField text = new JTextField();
		text.setEnabled(false);
		text.setText("");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("" + graphicPanel.getRays());
			}
		});
		
		add(text);
		
		setPreferredSize(new Dimension(500, (int) getMinimumSize().getHeight()));
		
	}
	
}
