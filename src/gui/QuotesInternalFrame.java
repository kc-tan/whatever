package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class QuotesInternalFrame extends JInternalFrame {
	/**
	 * Create the frame.
	 */
	public QuotesInternalFrame() {
		setBounds(100, 100, 275, 414);
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setVisible(true);
		this.setTitle("Quotes");
	}

}
