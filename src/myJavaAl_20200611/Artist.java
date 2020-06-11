package myJavaAl_20200611;

import java.util.ArrayList;

public class Artist {
	
	//인스턴스 변수 하나 아티스트 이름! 
	public final String artistName;
	
	
	//생성자
	
	public Artist(String artistName) {
		this.artistName = artistName;
	}
	
	private final ArrayList<Album> albumList = new ArrayList<Album>();
	
	public String getArtistName() {
		return artistName;
	}



	
	
	//앨범 추가하는 메소드
	public void addAlbum(Album alb) {
		
		albumList.add(alb);
	}
	//앨범가져오는 메소드
	public ArrayList<Album> getAlbums() {
		
		
		return albumList;
	}
	

}
