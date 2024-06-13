package Practise;


class Video{
	void video() {
		System.out.println("play video");
	}
}
class Music{
	void music() {
		System.out.println("play music");
	}
}


public class MediaPlayer {

	public static void main(String[] args) {
		Video v=new Video();
		v.video();
		Music m1=new Music();
		m1.music();
		
		
		

	}

}
