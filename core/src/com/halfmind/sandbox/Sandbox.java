package com.halfmind.sandbox;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.halfmind.sandbox.handlers.AssetHandler;

public class Sandbox extends ApplicationAdapter {
	
	private SpriteBatch batch;
	private BitmapFont font;

	@Override
	public void create () {
		batch = new SpriteBatch();
		font = new BitmapFont(Gdx.files.internal("font/BMFonts/pusab_sandbox.fnt"),
	            Gdx.files.internal("font/BMFonts/pusab_sandbox.png"), false);
		
		AssetHandler.load();
		
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		font.draw(batch, "FPS: " + Gdx.graphics.getFramesPerSecond(),0, Gdx.graphics.getHeight());
		batch.draw(AssetHandler.texture, 0, 0);
		batch.end();
	}
}
