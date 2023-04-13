package ch16;

public class GameTest {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.Play(1);
		
		AdvancedLevel alevel = new AdvancedLevel();
		player.upgradeLevel(alevel);
		player.Play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.Play(3);
		
	}

}
