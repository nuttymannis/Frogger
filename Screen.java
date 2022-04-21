import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JPanel;

public class Screen extends JPanel  implements Runnable  {
	
	private File Screen;

	
	public Screen()
	{
		setBackground(Color.WHITE);
		
		Screen= new File("screen.png");
		
		setFocusable( true );
		new Thread(this).start();
	}
	
	
	public void paint(Graphics window) 
	{
		window.clearRect( 0,0, 1280, 1280);
		try {
			window.drawImage(ImageIO.read(Screen), 0, 0, 896, 1024, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public void run()
	{
		try
		{
			while( true )

			{
			   Thread.sleep(100);
			   repaint();
			}
		}
		catch( Exception e )
		{
			
		}
	}

}
