package Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A numeric keypad
 */
public class NumberPad extends    JPanel
{
    /**
     * Default Constructor
     */
    public NumberPad()
    {
        super();
        setupLayout();
    }

    /**
     * Setup and layout this NumberPad
     */
    private void setupLayout()
    {
        // Setup and layout this NumberPad
    	Container numPad = new JPanel();
    	numPad.setLayout(new GridLayout(4,3));
    	
    	for(int i = 1; i <= 12; i++) {
    		if(i == 10) {
    			numPad.add(new Button("DEL"));
    		} else if (i == 11 ){
    			numPad.add(new Button(Integer.toString(i-i)));
    		} else if (i == 12 ){
    			numPad.add(new Button("C"));
    		} else {
    			numPad.add(new Button(Integer.toString(i)));
    		}
    	}
    	
    	add(numPad);
    }
}
