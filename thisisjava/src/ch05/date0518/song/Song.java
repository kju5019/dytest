package ch05.date0518.song;

public class Song {
	private String title;
	private String singer;
	private String album;
	private String composer;
	private String lyricist;
	private String releaseDate;
	
	public Song(String title, String singer, String album,
				String composer, String lyricist, String releaseDate) {
		this.title = title;
		this.singer = singer;
		this.album = album;
		this.composer = composer;
		this.lyricist = lyricist;
		this.releaseDate = releaseDate;
	}
	
	public void printInfo() {
		System.out.println("제목="+title);
		System.out.println("제목="+singer);
		System.out.println("앨범="+album);
		System.out.println("작곡="+composer);
		System.out.println("작사="+lyricist);			
		System.out.println("발매일="+dotreleaseDate(releaseDate));		
	}
	
	public String dotreleaseDate(String releaseDate) {
		String yearNum = releaseDate.substring(0,4);
		String monthNum = releaseDate.substring(4,6);
		String dayNum = releaseDate.substring(6);
		return yearNum+"."+monthNum+"."+dayNum;
	}

}
