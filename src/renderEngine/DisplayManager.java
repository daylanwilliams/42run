package renderEngine;

import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;

public class DisplayManager {
	private static final int WIDTH = 1024;
	private static final int HEIGHT = 800;
	private static final int FPS_CAPS = 120;
	private static int COUNTER = 0;
	
	private static long lastFrameTime;
	private static float delta;
	
	public static void createDisplay() {
		ContextAttribs attribs = new ContextAttribs(3, 2)
				.withForwardCompatible(true)
				.withProfileCore(true);
		
		try {
			Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
			Display.setTitle("42 run" + " | " + counter());
			Display.create(new PixelFormat(), attribs);
			
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		
		GL11.glViewport(0, 0, WIDTH, HEIGHT);
		lastFrameTime = getCurrentTime();
	}
	
	public static void updateDisplay() {
		
		Display.sync(FPS_CAPS);
		Display.update();
		long currentFrameTime = getCurrentTime();
		delta =(currentFrameTime - lastFrameTime)/1000f;
		lastFrameTime = currentFrameTime;
	}
	
	public static int counter() {
	
		for(int i=0; i<1000;i++) {
			COUNTER++;
		}
		//TimeUnit.SECONDS.sleep(5);
		return COUNTER;	
	}
	
	public static float getFrameTimeSeconds() {
		return delta;
	}
	
	public static void closeDisplay() {
		Display.destroy();
	}
	
	private static long getCurrentTime() {
		return Sys.getTime()*100/Sys.getTimerResolution();
	}
}
