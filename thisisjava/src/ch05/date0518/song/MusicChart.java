package ch05.date0518.song;

public class MusicChart {
	Song[] songArray;
	
	public MusicChart(Song[] songArray) {
		this.songArray = songArray;
	}
	
	public void printMusicChart() {
		System.out.println("===== Music Chart =====");
		for(int i=0; i<songArray.length; i++) {
			System.out.println(i+1+".");
			songArray[i].printInfo();
		}
	}

}
