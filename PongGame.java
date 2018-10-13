package w5day1hw;

import apcs.Window;

public class PongGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Window.size(500, 700);
		Window.out.background("white");
		
		Ball ball = new Ball("white",10,10);
		Paddle paddle1 = new Paddle(10,Window.height()/2,"pink");
		Paddle paddle2 = new Paddle(490,Window.height()/2,"pink");
		while(true) {
			Window.frame();//frame
			Window.out.background("light green");//Background
			Window.out.color("light blue");//Paint color change
			Window.out.rectangle(Window.width()/2, Window.height()/2, Window.width()/40, Window.height());//Middle sector
			Window.out.color("black");//Color change
			Window.out.print("Player One: " + ball.score1, Window.width()/4, 20);//Prints score
			Window.out.print("Player Two: " + ball.score2, Window.width()*3/4, 20);//Prints score

			ball.draw();
			
			paddle1.draw();
			paddle1.move("up", "down");
			paddle1.reflect(ball);
			
			paddle2.draw();
			paddle2.move("w", "s");
			paddle2.reflect(ball);
		}
		

	}

}
