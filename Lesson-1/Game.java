package com.myfirstgame.game; // название вашего java пакета

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Game extends ApplicationAdapter {

	private SpriteBatch batch;
	private Texture texture;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		// вместо "image.jpg" вводите имя вашего изображения
		texture = new Texture("image.jpg");
	}

	@Override
	public void render () {
		// задаем цвет очистки экрана
		Gdx.gl.glClearColor(0.1f, 0.2f, 0.3f, 1);
		// очищаем экран
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		// между begin и end рисуем изображение
		batch.begin();
		batch.draw(texture,20,20);
		batch.end();


	}
	
	@Override
	public void dispose () {
		// избавляемся от текстуры и упаковщика спрайтов
		batch.dispose();
		texture.dispose();

	}
}
