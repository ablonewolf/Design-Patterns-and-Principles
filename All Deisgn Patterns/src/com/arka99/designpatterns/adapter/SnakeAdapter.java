package com.arka99.designpatterns.adapter;

import com.arka99.designpatterns.abstractfactory.Snack;

public class SnakeAdapter implements Animal{
    public Snake snake;

    public SnakeAdapter(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void run() {
        this.snake.move();
    }
}
