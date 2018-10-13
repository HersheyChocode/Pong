package w5day1hw;

import apcs.Window;

public class Ball {	
	
	//variables
	int radius = 10;
	int x = Window.random(radius, Window.width()-radius);
	int y = Window.random(radius, Window.height()-radius);
	int score1 = 0;
	int score2 = 0;
	String color = "red";
	
	int dy = 10;
	int dx = 5;
	
	public Ball (String col, int dx, int dy) {
		this.color = col;
		this.dy = dy;
		this.dx = dx;
	}
	
	//methods
	public void reflect() {
		if (x-radius<=0) {
			dx = -dx;
			score2 += 1;
		} if(x+radius>=Window.width()) {
			dx = -dx;
			score1 += 1;
		}
		if (y-radius<=0||y+radius>=Window.height()) {
			dy = -dy;
		}
	}
	public void move() {
			x += dx;
			y += dy;
			reflect();
	}
	public void draw() {
		Window.out.color(color);
		Window.out.circle(x,y,radius);
		move();
	}
}
