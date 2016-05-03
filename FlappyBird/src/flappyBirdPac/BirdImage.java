package flappyBirdPac;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class BirdImage {
	
	private BufferedImage img = null;
	private static int bird_dia = 40;
	public static int x = (GamePanel.WIDTH/2)-bird_dia/2;
	public static int y = GamePanel.HEIGHT/2;
	
	
	public BirdImage(){
		
		LoadImage();
	}


	private void LoadImage() {
		
		try{
			img = ImageIO.read(new File("C:/Users/Piotr.Piotr-Komputer/git1/FlappyBird/Images/Bird.png"));
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

	
}