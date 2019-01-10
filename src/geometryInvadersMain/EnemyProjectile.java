package geometryInvadersMain;

import static org.lwjgl.opengl.GL11.GL_TRIANGLES;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glColor4f;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glVertex2f;

public class EnemyProjectile extends Projectile {

	public EnemyProjectile (float xPos, float yPos, float launch){
		
		super (xPos, yPos, launch);
	}
	
	@Override
	// render method
	public void render (){
		
		glBegin (GL_TRIANGLES);
		
			glColor4f (1, 0, 0, 0);
			glVertex2f (xPos - 0.01f, yPos + this.launch);
			glVertex2f (xPos + 0.01f, yPos + this.launch);
			glVertex2f (xPos, -0.04f + yPos + this.launch);

		glEnd();
	}
	
	// getXPos method
	public float getXPos (){
		
		return xPos;
	}
	
	// getYPos method
	public float getYPos (){
		
		// 0.7f is the length of the triangle, so this method returns the point of the Projectile
		return -0.07f + yPos + this.launch;
	}
	
}
