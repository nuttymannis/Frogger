import java.awt.*;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class Frogger extends JFrame
{
	private static final int WIDTH = 224;
	private static final int HEIGHT = 256;
	
	public Frogger() throws IOException
	{
		super("FROGGER");
		
		setSize(WIDTH,HEIGHT);
		setLocation(650,0);
		
		
		setVisible(true);	

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main( String args[] ) throws IOException
	{
		Frogger run = new Frogger();
	}
}
