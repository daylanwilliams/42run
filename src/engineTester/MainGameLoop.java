package engineTester;

import java.util.ArrayList;
import java.util.Random;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.util.vector.Vector3f;

import Shaders.StaticShader;
import entities.Camera;
import entities.Entity;
import entities.Light;
import entities.Player;
import models.TexturedModel;
import models.rawModel;
import renderEngine.DisplayManager;
import renderEngine.Loader;
import renderEngine.MasterRenderer;
import renderEngine.OBJLoader;
import terrains.Terrain;
import renderEngine.EntityRenderer;
import textures.ModelTexture;

public class MainGameLoop {
	
	public static void random(Entity tables)
	{
		Random rand = new Random();
		int n = rand.nextInt(3) + 1;
		if (n == 1)
			tables.setposX(15);
		else if (n == 2)
			tables.setposX(0);
		else if (n == 3)
			tables.setposX(-15);
	}

	public static void main(String[] args) {
		
		DisplayManager.createDisplay();
		Loader loader = new Loader();
		
		float z = -0.6f;
		int distance = 40;
		boolean gameStart = false;
		int score_timer = 0;
		int score = 0;
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		rawModel chair = OBJLoader.loadObjModel("chair", loader);		
		TexturedModel staticchair = new TexturedModel(chair, new ModelTexture(loader.loadTexture("red")));
		ModelTexture texturechair = staticchair.getTexture();
		ModelTexture texturechair2 = staticchair.getTexture();
		ModelTexture texturechair3 = staticchair.getTexture();
		ModelTexture texturechair4 = staticchair.getTexture();

		texturechair.setShineDamper(10);
		texturechair.setReflectivity(1);
		texturechair2.setShineDamper(10);
		texturechair2.setReflectivity(1);
		texturechair3.setShineDamper(10);
		texturechair3.setReflectivity(1);
		texturechair4.setShineDamper(10);
		texturechair4.setReflectivity(1);
		
		ArrayList<Entity> chairs = new ArrayList<Entity>();
		for (int x = 0; x < 10; x++)
			chairs.add(new Entity(staticchair, new Vector3f(0,0,0),0,0,0,1));
		for (int i = 0; i < chairs.size(); i++)
		{
			chairs.get(i).setposZ((distance * (i + 1)));
		}
		chairs.get(0).increasePosition(15, 0, 0);
		chairs.get(1).increasePosition(0, 0, 0);
		chairs.get(2).increasePosition(15, 0, 0);
		chairs.get(3).increasePosition(-15, 0, 0);
		chairs.get(4).increasePosition(0, 0, 0);
		chairs.get(5).increasePosition(15, 0, 0);
		chairs.get(6).increasePosition(-15, 0, 0);
		chairs.get(7).increasePosition(0, 0, 0);
		chairs.get(8).increasePosition(15, 0, 0);
		chairs.get(9).increasePosition(-15, 0, 0);
////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		ArrayList<Entity> chairs2 = new ArrayList<Entity>();
		for (int x = 0; x < 10; x++)
			chairs2.add(new Entity(staticchair, new Vector3f(0,0,0),0,0,0,1));
		for (int i = 0; i < chairs2.size(); i++)
		{
			chairs2.get(i).setposZ((distance * (i + 1) + 400));
		}
		chairs2.get(0).increasePosition(15, 0, 0);
		chairs2.get(1).increasePosition(0, 0, 0);
		chairs2.get(2).increasePosition(15, 0, 0);
		chairs2.get(3).increasePosition(-15, 0, 0);
		chairs2.get(4).increasePosition(0, 0, 0);
		chairs2.get(5).increasePosition(15, 0, 0);
		chairs2.get(6).increasePosition(-15, 0, 0);
		chairs2.get(7).increasePosition(0, 0, 0);
		chairs2.get(8).increasePosition(15, 0, 0);
		chairs2.get(9).increasePosition(-15, 0, 0);
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		rawModel mac = OBJLoader.loadObjModel("imac", loader);		
		TexturedModel staticmac = new TexturedModel(mac, new ModelTexture(loader.loadTexture("red")));
		ModelTexture texturemac = staticmac.getTexture();
		ModelTexture texturemac2 = staticmac.getTexture();
		ModelTexture texturemac3 = staticmac.getTexture();
		ModelTexture texturemac4 = staticmac.getTexture();

		texturemac.setShineDamper(10);
		texturemac.setReflectivity(1);
		texturemac2.setShineDamper(10);
		texturemac2.setReflectivity(1);
		texturemac3.setShineDamper(10);
		texturemac3.setReflectivity(1);
		texturemac4.setShineDamper(10);
		texturemac4.setReflectivity(1);
		
		ArrayList<Entity> macs = new ArrayList<Entity>();
		for (int x = 0; x < 10; x++)
			macs.add(new Entity(staticmac, new Vector3f(0,0,0),0,0,0,1));
		for (int i = 0; i < macs.size(); i++)
		{
			macs.get(i).setposZ((distance * (i + 1) + 400));
		}
		macs.get(0).increasePosition(15, 0, 0);
		macs.get(1).increasePosition(0, 0, 0);
		macs.get(2).increasePosition(15, 0, 0);
		macs.get(3).increasePosition(-15, 0, 0);
		macs.get(4).increasePosition(0, 0, 0);
		macs.get(5).increasePosition(15, 0, 0);
		macs.get(6).increasePosition(-15, 0, 0);
		macs.get(7).increasePosition(0, 0, 0);
		macs.get(8).increasePosition(15, 0, 0);
		macs.get(9).increasePosition(-15, 0, 0);
		macs.get(0).increaseRotation(0, 180, 0);
		macs.get(1).increaseRotation(0, 180, 0);
		macs.get(2).increaseRotation(0, 180, 0);
		macs.get(3).increaseRotation(0, 180, 0);
		macs.get(4).increaseRotation(0, 180, 0);
		macs.get(5).increaseRotation(0, 180, 0);
		macs.get(6).increaseRotation(0, 180, 0);
		macs.get(7).increaseRotation(0, 180, 0);
		macs.get(8).increaseRotation(0, 180, 0);
		macs.get(9).increaseRotation(0, 180, 0);
//////////////////////////////////////////////////////////////////////////////////////////////////////
		ArrayList<Entity> macs2 = new ArrayList<Entity>();
		for (int x = 0; x < 10; x++)
			macs2.add(new Entity(staticmac, new Vector3f(0,0,0),0,0,0,1));
		for (int i = 0; i < macs2.size(); i++)
		{
			macs2.get(i).setposZ(distance * (i + 1));
		}
		macs2.get(0).increasePosition(15, 0, 0);
		macs2.get(1).increasePosition(0, 0, 0);
		macs2.get(2).increasePosition(15, 0, 0);
		macs2.get(3).increasePosition(-15, 0, 0);
		macs2.get(4).increasePosition(0, 0, 0);
		macs2.get(5).increasePosition(15, 0, 0);
		macs2.get(6).increasePosition(-15, 0, 0);
		macs2.get(7).increasePosition(0, 0, 0);
		macs2.get(8).increasePosition(15, 0, 0);
		macs2.get(9).increasePosition(-15, 0, 0);
		macs2.get(0).increaseRotation(0, 180, 0);
		macs2.get(1).increaseRotation(0, 180, 0);
		macs2.get(2).increaseRotation(0, 180, 0);
		macs2.get(3).increaseRotation(0, 180, 0);
		macs2.get(4).increaseRotation(0, 180, 0);
		macs2.get(5).increaseRotation(0, 180, 0);
		macs2.get(6).increaseRotation(0, 180, 0);
		macs2.get(7).increaseRotation(0, 180, 0);
		macs2.get(8).increaseRotation(0, 180, 0);
		macs2.get(9).increaseRotation(0, 180, 0);

///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		rawModel table = OBJLoader.loadObjModel("table", loader);		
		TexturedModel statictable = new TexturedModel(table, new ModelTexture(loader.loadTexture("stallTexture")));
		ModelTexture texturetable = statictable.getTexture();
		ModelTexture texturetable2 = statictable.getTexture();
		ModelTexture texturetable3 = statictable.getTexture();
		ModelTexture texturetable4 = statictable.getTexture();

		texturetable.setShineDamper(10);
		texturetable.setReflectivity(1);
		texturetable2.setShineDamper(10);
		texturetable2.setReflectivity(1);
		texturetable3.setShineDamper(10);
		texturetable3.setReflectivity(1);
		texturetable4.setShineDamper(10);
		texturetable4.setReflectivity(1);
		ArrayList<Entity> tables = new ArrayList<Entity>();
		for (int x = 0; x < 10; x++)
			tables.add(new Entity(statictable, new Vector3f(0,0,0),0,0,0,1));
		
		for (int i = 0; i < tables.size(); i++)
		{
			tables.get(i).setposZ((distance * (i + 1) + 400));
		}
		tables.get(0).increasePosition(15, 0, 0);
		tables.get(1).increasePosition(0, 0, 0);
		tables.get(2).increasePosition(15, 0, 0);
		tables.get(3).increasePosition(-15, 0, 0);
		tables.get(4).increasePosition(0, 0, 0);
		tables.get(5).increasePosition(15, 0, 0);
		tables.get(6).increasePosition(-15, 0, 0);
		tables.get(7).increasePosition(0, 0, 0);
		tables.get(8).increasePosition(15, 0, 0);
		tables.get(9).increasePosition(-15, 0, 0);
///////////////////////////////////////////////////////////////////////////////////////////////////////////
		ArrayList<Entity> tables2 = new ArrayList<Entity>();
		for (int x = 0; x < 10; x++)
			tables2.add(new Entity(statictable, new Vector3f(0,0,0),0,0,0,1));
		
		for (int i = 0; i < tables2.size(); i++)
		{
			tables2.get(i).setposZ((distance * (i + 1)));
		}
		tables2.get(0).increasePosition(15, 0, 0);
		tables2.get(1).increasePosition(0, 0, 0);
		tables2.get(2).increasePosition(15, 0, 0);
		tables2.get(3).increasePosition(-15, 0, 0);
		tables2.get(4).increasePosition(0, 0, 0);
		tables2.get(5).increasePosition(15, 0, 0);
		tables2.get(6).increasePosition(-15, 0, 0);
		tables2.get(7).increasePosition(0, 0, 0);
		tables2.get(8).increasePosition(15, 0, 0);
		tables2.get(9).increasePosition(-15, 0, 0);

///////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		rawModel floorOBJ = OBJLoader.loadObjModel("floor", loader);		
		TexturedModel staticObj = new TexturedModel(floorOBJ, new ModelTexture(loader.loadTexture("white")));
		ModelTexture textureObj = staticObj.getTexture();
		ModelTexture textureObj2 = staticObj.getTexture();
		
		textureObj.setShineDamper(10);
		textureObj.setReflectivity(1);
		textureObj2.setShineDamper(10);
		textureObj2.setReflectivity(1);
		
		Entity floor1 = new Entity(staticObj, new Vector3f(0,0,0),0,0,0,1);
		floor1.increasePosition(0, 0, 320);
		Entity floor2 = new Entity(staticObj, new Vector3f(0,0,0),0,0,0,1);
		floor2.increasePosition(0, 0, 720);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		rawModel Walls = OBJLoader.loadObjModel("test_wall2", loader);
		
		TexturedModel staticWall = new TexturedModel(Walls, new ModelTexture(loader.loadTexture("brick")));
		ModelTexture texture = staticWall.getTexture();
		ModelTexture texture2 = staticWall.getTexture();
		ModelTexture texture3 = staticWall.getTexture();
		ModelTexture texture4 = staticWall.getTexture();
		
		texture.setShineDamper(10);
		texture.setReflectivity(1);
		texture2.setShineDamper(10);
		texture2.setReflectivity(1);
		texture3.setShineDamper(10);
		texture3.setReflectivity(1);
		texture4.setShineDamper(10);
		texture4.setReflectivity(1);
		
		Entity wall1_left = new Entity(staticWall, new Vector3f(0,0,0),0,0,0,1);
		Entity wall2_right = new Entity(staticWall, new Vector3f(0,0,0),0,0,0,1);
		Entity wall3_left = new Entity(staticWall, new Vector3f(0,0,0),0,0,0,1);
		Entity wall4_right = new Entity(staticWall, new Vector3f(0,0,0),0,0,0,1);
		Light light = new Light(new Vector3f(0,0,2), new Vector3f(1,1,1));

		wall2_right.increasePosition(-5, 0, 320);
		wall4_right.increasePosition(-5, 0, 720);
		wall1_left.increasePosition(46, 0, 320);
		wall3_left.increasePosition(46, 0, 720);
		
		Terrain terrain = new Terrain(0,0,loader,new ModelTexture(loader.loadTexture("brick")));
		MasterRenderer renderer = new MasterRenderer();
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		rawModel human = OBJLoader.loadObjModel("person", loader);
		TexturedModel humanModel = new TexturedModel(human, new ModelTexture(loader.loadTexture("playerTexture")));
		
		Player player = new Player(humanModel, new Vector3f(0, 0, 0), 0, 0, 0, 1);
		Camera camera = new Camera(player);
		
		while (!Display.isCloseRequested()) {
			if (gameStart == true)
			{
				
				wall2_right.increasePosition(0, 0, z);
				wall1_left.increasePosition(0, 0, z);
				wall4_right.increasePosition(0, 0, z);
				wall3_left.increasePosition(0, 0, z);
				floor1.increasePosition(0, 0, z);
				floor2.increasePosition(0, 0, z);
				for (int i = 0; i < tables.size(); i++)
					tables.get(i).increasePosition(0, 0, z);
				for (int i = 0; i < tables2.size(); i++)
					tables2.get(i).increasePosition(0, 0, z);
				
				for (int i = 0; i < macs.size(); i++)
					macs.get(i).increasePosition(0, 0, z);
				
				for (int i = 0; i < macs2.size(); i++)
					macs2.get(i).increasePosition(0, 0, z);
				
				for (int i = 0; i < chairs.size(); i++)
					chairs.get(i).increasePosition(0, 0, z);
				
				for (int i = 0; i < chairs2.size(); i++)
					chairs2.get(i).increasePosition(0, 0, z);
			}
			else
			{
				
				if(Keyboard.isKeyDown(Keyboard.KEY_RETURN))
				{
					wall1_left.setposZ(320);
					wall3_left.setposZ(720);
					wall2_right.setposZ(320);
					wall4_right.setposZ(720);
					floor1.setposZ(320);
					floor2.setposZ(720);
					for (int i = 0; i < tables.size(); i++)
					{
						tables.get(i).setposZ((distance * (i + 1) + 400));
					}
					
					for (int i = 0; i < tables2.size(); i++)
					{
						tables2.get(i).setposZ(distance * (i + 1));
					}
					
					for (int i = 0; i < macs.size(); i++)
					{
						macs.get(i).setposZ((distance * (i + 1) + 400));
					}
					
					for (int i = 0; i < macs2.size(); i++)
					{
						macs2.get(i).setposZ((distance * (i + 1)));
					}

					for (int i = 0; i < chairs.size(); i++)
					{
						chairs.get(i).setposZ((distance * (i + 1) + 400));
					}
					
					for (int i = 0; i < chairs2.size(); i++)
					{
						chairs2.get(i).setposZ((distance * (i + 1)));
					}
					
					gameStart = true;
				}
			}
			camera.move();
			player.move(terrain);
			renderer.processEntity(player);
			renderer.processEntity(wall2_right);
			renderer.processEntity(wall1_left);
			renderer.processEntity(wall3_left);
			renderer.processEntity(wall4_right);
			renderer.processEntity(floor1);
			renderer.processEntity(floor2);
			for (int i = 0; i < tables.size(); i++)
				renderer.processEntity(tables.get(i));
			
			for (int i = 0; i < tables2.size(); i++)
				renderer.processEntity(tables2.get(i));
			
			for (int i = 0; i < macs.size(); i++)
				renderer.processEntity(macs.get(i));
			
			for (int i = 0; i < macs2.size(); i++)
				renderer.processEntity(macs2.get(i));
			
			for (int i = 0; i < chairs.size(); i++)
				renderer.processEntity(chairs.get(i));
			
			for (int i = 0; i < chairs2.size(); i++)
				renderer.processEntity(chairs2.get(i));
			
			renderer.render(light, camera);
	
			DisplayManager.updateDisplay();
			for (int i = 0; i < tables.size(); i++)
				if ((tables.get(i).getposZ() < 5) && (tables.get(i).getposZ() > -3))
					if ((player.getposX() == tables.get(i).getposX()) && player.getInAir() == false)
						gameStart = false;
			
			for (int i = 0; i < tables2.size(); i++)
				if ((tables2.get(i).getposZ() < 5) && (tables2.get(i).getposZ() > -3))
					if ((player.getposX() == tables2.get(i).getposX()) && player.getInAir() == false)
						gameStart = false;
			if (floor1.getposZ() < -130)
			{
				floor1.increasePosition(0, 0, floor2.getposZ() + 530);
				wall1_left.increasePosition(0, 0, wall3_left.getposZ() + 530);
				wall2_right.increasePosition(0, 0, wall4_right.getposZ() + 530);
				for (int i = 0; i < tables2.size(); i++)
				{
					tables2.get(i).setposZ((distance * (i + 1) + 400));
					
					random(tables2.get(i));
					macs2.get(i).setposZ((distance * (i + 1) + 400));
					macs2.get(i).setposX(tables2.get(i).getposX());
					chairs2.get(i).setposZ((distance * (i + 1) + 400));
					chairs2.get(i).setposX(tables2.get(i).getposX());
				}

			}
			else if (floor2.getposZ() < -130)
			{
				floor2.increasePosition(0, 0, floor1.getposZ() + 530);
				wall3_left.increasePosition(0, 0, wall1_left.getposZ() + 530);
				wall4_right.increasePosition(0, 0, wall2_right.getposZ() + 530);
				for (int i = 0; i < tables.size(); i++)
				{
					tables.get(i).setposZ((distance * (i + 1) + 400));
					random(tables.get(i));
					macs.get(i).setposZ((distance * (i + 1) + 400));
					macs.get(i).setposX(tables.get(i).getposX());
					chairs.get(i).setposZ((distance * (i + 1) + 400));
					chairs.get(i).setposX(tables.get(i).getposX());
				}
				
			}
			if (gameStart == true)
			{
				score_timer++;
				if (score_timer > 100)
				{
					score_timer = 0;
					score++;
					Display.setTitle("Dwilliam: 42 run" + " | Score: " + score);
				}
			}
			else
				score = 0;
			if(Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)) {
				renderer.cleanUP();
				loader.cleanUP();
				DisplayManager.closeDisplay();
				break;
			}

		}
	}

}
