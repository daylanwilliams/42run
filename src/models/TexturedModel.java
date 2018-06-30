package models;

import textures.ModelTexture;

public class TexturedModel {
	
	private rawModel Rawmodel;
	private ModelTexture texture;
	
	public TexturedModel(rawModel model, ModelTexture texture) {
		this.Rawmodel = model;
		this.texture = texture;
	}

	public rawModel getRawmodel() {
		return Rawmodel;
	}

	public ModelTexture getTexture() {
		return texture;
	}
	
}
