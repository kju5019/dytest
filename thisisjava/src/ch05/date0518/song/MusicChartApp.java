package ch05.date0518.song;

public class MusicChartApp {

	public static void main(String[] args) {

		Song[] songArray =new Song[3];
		songArray[0] = new Song("밤편지", "아이유", "밤편지", "김제회,김희원","아이유","20190324");
		songArray[1] = new Song("밤편지", "아이유", "밤편지", "김제회,김희원","아이유","20190324");
		songArray[2] = new Song("밤편지", "아이유", "밤편지", "김제회,김희원","아이유","20190324");
		
		MusicChart mc = new MusicChart(songArray);
		mc.printMusicChart();
	}

}
