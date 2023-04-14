//public : 누구나 가져갈 수 있는 클래스
//protected : 패키지 안에서 또는 상속 받은 클래스에서만 사용 가능
//default(package) : 같은 패키지 안에서만 사용
//private : 같은 클래스 안에서만 사용.

public class Main {
	public static void main(String[] args) {
		User user = new User();
		Wolf wolf = new Wolf();
		user.attack(wolf);
	}
}
