package Main;
import java.awt.*;
import javax.swing.*;

/**
 * A window containing a PIN entry pad.
 */
public class PINPadWindow extends JFrame
{
    /**
     * Default Constructor.
     */
    public PINPadWindow()
    {
        super();
        setupLayout();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setResizable(false);
    }

    /**
     * Setup and layout this PINPadWindow
     */
    private void setupLayout()
    {
        Container     contentPane;

        setSize(300, 300); 
        
        Display border = new Display();
        NumberPad numPad = new NumberPad();
        contentPane = getContentPane();
        contentPane.add(border);
        contentPane.add(numPad);
        
        // Layout this PINPadWindow
    }
}
