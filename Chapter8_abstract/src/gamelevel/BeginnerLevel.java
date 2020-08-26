package gamelevel;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("못하지롱~");
	}

	@Override
	public void turn() {
		System.out.println("못하지롱~");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("************현재 초급자입니다***********");
		
	}

	
}
