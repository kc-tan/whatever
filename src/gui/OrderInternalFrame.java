package gui;

import javax.swing.JInternalFrame;

public class OrderInternalFrame extends JInternalFrame {

	/**
	 * Create the frame.
	 */
	public OrderInternalFrame() {
		setBounds(100, 100, 275, 414);
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setVisible(true);
		this.setTitle("Order");
	}
}
