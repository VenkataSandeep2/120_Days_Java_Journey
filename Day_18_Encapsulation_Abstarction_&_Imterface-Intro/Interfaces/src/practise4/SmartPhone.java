package practise4;

public class SmartPhone implements Camera,MusicPlay
{
	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone take's the photo's ");
	}
	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone to play the music's");
	}

}
