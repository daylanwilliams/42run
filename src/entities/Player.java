package entities;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.util.vector.Vector3f;

import models.TexturedModel;
import renderEngine.DisplayManager;
import terrains.Terrain;
import textures.ModelTexture;

public class Player extends Entity {
	
	private static final float GRAVITY = -1000;
	private static final float JUMP_POWER = 500;
	private static final float TERRAIN_HEIGHT = 0;
	
	private float currentSpeed = 0;
	private float currentTurnSpeed = 0;
	private float upwardsSpeed = 0;
	
	private Boolean isInAir = false;

	public Player(TexturedModel model, Vector3f position, float rotX, float rotY, float rotZ, float scale) {
		super(model, position, rotX, rotY, rotZ, scale);

	}

	public void move(Terrain terrain) {
		checkInputs(terrain);
		super.increaseRotation(0, currentTurnSpeed * DisplayManager.getFrameTimeSeconds(), 0);
		float distance = currentSpeed * DisplayManager.getFrameTimeSeconds();
		float dx = (float) (distance * Math.sin(Math.toRadians(super.getRotY())));
		float dz = (float) (distance * Math.cos(Math.toRadians(super.getRotY())));
		super.increasePosition(dx, 0, dz);
		upwardsSpeed += GRAVITY * DisplayManager.getFrameTimeSeconds() - 10;
		super.increasePosition(0, upwardsSpeed * DisplayManager.getFrameTimeSeconds() , 0);
		if(super.getPosition().y < TERRAIN_HEIGHT) {
			upwardsSpeed = 0;
			isInAir = false;
			super.getPosition().y = TERRAIN_HEIGHT;
		}
	}
	
	private void jump() {
		if(!isInAir) {
		this.upwardsSpeed = JUMP_POWER;
		isInAir = true;
		}
	}
	
	private void checkInputs(Terrain terrain) {

		if(Keyboard.isKeyDown(Keyboard.KEY_LEFT)) {
			if (getposX() == 0)
				setposX(15);
			else if(getposX() == -15)
				setposX(0);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) {
			if (getposX() == 0)
				setposX(-15);
			else if(getposX() == 15)
				setposX(0);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_SPACE)) {
			jump();
		}
		
	}
	public boolean getInAir()
	{
		return this.isInAir;
	}
}
