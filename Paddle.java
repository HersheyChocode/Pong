package w5day1hw;
import apcs.Window;
public class Paddle {
	//Variables
	int paddleWidth = 10;//Width of paddle
	int paddleHeight = 60;//Height of paddle
	int x = 0;
	int y = 0;
	String color = "";
	//Methods
	public Paddle(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public void draw() {
		Window.out.color(color);
		Window.out.rectangle(x,y,paddleWidth,paddleHeight);
	}
	
	public void move(String keyUp, String keyDown) {
		if (Window.key.pressed(keyUp)&&y-paddleHeight/2> 0) {//If up is pressed
			y -= 10; //Paddle moves up
		} else if (Window.key.pressed(keyDown)&&y+paddleHeight/2<Window.height()) { //else if down is pressed
			y += 10; //Paddle moves down
		}
	}
	
	public void reflect(Ball ball) {
		if (x>Window.width()/2&&ball.x+ball.radius>=x-paddleWidth/2&&ball.x+ball.radius<Window.width()) {
			if (ball.y-ball.radius<=y+paddleHeight/2) {
				ball.dx = -ball.dx;
				ball.dy = -ball.dy;
			}
		}
		if (x<Window.width()/2&&ball.x-ball.radius<=x+paddleWidth/2&&ball.x-ball.radius>0) {
			if (ball.y-ball.radius<=y+paddleHeight/2) {
				ball.dx = -ball.dx;
				ball.dy = -ball.dy;
			}
		}
	}

}
