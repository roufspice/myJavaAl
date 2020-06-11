package myJavaAl_20200611;

public class Song {
	
	public final String title;
	public final Artist art;
	public final Album alb;
	
		//잘모르겠으니 앨범으로 하자
	
	//생성자
	public Song(String title, Artist art, Album alb) {
		this.title = title;
		this.art = art;
		this.alb = alb;
		
	}
	

	
	
	//getter setter;

	public String toString() {
		return title + " - " + art.artistName + "\n" + alb.albumTitle + "(" + alb.releaseYear+")";
		
		
	}


	
	
	

}
