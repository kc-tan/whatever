package gui;

import com.tomtessier.scrollabledesktop.BaseInternalFrame;

public class LogInternalFrame extends BaseInternalFrame {

	/**
	 * Create the frame.
	 */
	public LogInternalFrame() {
		setBounds(100, 100, 275, 414);
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setVisible(true);
		this.setTitle("Log");
	}

}
