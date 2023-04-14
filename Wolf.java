public class Wolf implements Monster{
	public int hp = 100;


	@Override
	public void damaged(int attack) {
		hp-=attack;
		System.out.println("hp = "+hp);

	}
}
