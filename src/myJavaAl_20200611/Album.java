package myJavaAl_20200611;

import java.util.ArrayList;

public class Album {

	// 인스턴스 변수
	public final String albumTitle;
	public final int releaseYear;
	public final Artist art;
	

	private final ArrayList<Song> tracks = new ArrayList<>(); // 앨범안에 담을 노래들 = 트랙

	// 생성자
	public Album(String albumTitle, int releaseYear, Artist art) {
		super();
		this.albumTitle = albumTitle;
		this.releaseYear = releaseYear;
		this.art = art;

	}

	// 메소드 트랙에 노래추가하는 메소드
	public void addTrack(Song s) {
		tracks.add(s); // 트랙에 노래 추가됨!

	}
	
	//메소드 트랙에 노래가져오는 메소드
	public Song getTrack(int index) {
		
		if(index <1 || tracks.size()> index) {
			return null;
		}
		
		//앨범트랙은 1번부터 진행되고 index는 0번부터니까
		return tracks.get(index-1);
	}
	

}
