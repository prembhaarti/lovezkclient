package com.love.ui;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ChildrenTextAreaKeyListener implements KeyListener {

	private JTextArea textArea;
	private JComboBox jComboBox;
	public ChildrenTextAreaKeyListener(JTextArea textArea, JComboBox comboBox) {
		this.textArea = textArea;
		this.jComboBox = comboBox;
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_C && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
			String text = jComboBox.getEditor().getItem().toString();
			if(text.endsWith("/")) {
				jComboBox.getEditor().setItem(text + textArea.getSelectedText());
			}
			else {
				jComboBox.getEditor().setItem(text + "/" + textArea.getSelectedText());
				jComboBox.setFocusable(true);
			}
			jComboBox.revalidate();
			jComboBox.repaint();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}
