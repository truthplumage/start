public class User {
	public int hp = 100;
	public int attack = 10;
	public void attack(Monster monster){
		monster.damaged(attack);
	}
}
