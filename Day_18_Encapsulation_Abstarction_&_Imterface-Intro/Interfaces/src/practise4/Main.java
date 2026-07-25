package practise4;

public class Main {
	public static void main(String[] args) {
		SmartPhone sm = new SmartPhone();
		sm.takePhoto();
		sm.playMusic();
		System.out.println("HashCode of the sm ref object -> "+sm.hashCode());
		
		SmartPhone sm1 = new SmartPhone();
		sm.playMusic();
		System.out.println("HashCode of the sm ref object -> "+sm1.hashCode());
		System.out.println(sm.equals(sm1));
	}
}
