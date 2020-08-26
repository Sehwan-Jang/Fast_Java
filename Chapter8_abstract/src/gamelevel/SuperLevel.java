package gamelevel;

public class SuperLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("아주 아주 빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("매우 매우 높이 jump 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("한바퀴 돕니다.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("************현재 고급자입니다***********");
		
	}
}
