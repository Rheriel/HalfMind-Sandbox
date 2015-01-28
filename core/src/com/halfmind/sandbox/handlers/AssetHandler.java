package com.halfmind.sandbox.handlers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasSprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetHandler {
	
	public static Texture texture;
	public static TextureRegion textureRegion;
	
	public static TextureAtlas textureAtlas;
	
	public static AtlasSprite atlasSprite;
	public static AtlasRegion atlasRegion;
	
	public static void load(){
		texture = new Texture("evilSpikes.png");
	}
	
}
