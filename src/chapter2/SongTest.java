package chapter2;

public class SongTest {

	public static void main(String[] args) {
		
		Song song = new Song();
		song.setTitle("좋은날");
		song.setAlbum("Real");
		song.setArtist("아이유");
		song.setComposer("이민수");
		song.setTrack(3);
		song.setYear(2010);
		
		song.show();
		
		
		Song song2 = new Song("Real2", "아이유", "이민수", "좋은날2", 4, 2018);
		song2.show();
		
		Song song3 = new Song("Real3", "아이유", "", "", 0, 0);
		song3.show();
		
		Song song4 = new Song("너를만나", "폴킴");
		song4.show();
	}

}
