package myJavaAl_20200611;

public class PlayListDemo {

	public static void main(String[] args) {

		Artist keithJarrett = new Artist("Keith Jarrett");

		Album theMelodyAtNightWithYou = new Album("The Melody At Night With You", 1999, keithJarrett);
		theMelodyAtNightWithYou.addTrack(new Song("I Loves You, Porgy", keithJarrett, theMelodyAtNightWithYou));
		theMelodyAtNightWithYou.addTrack(new Song("I Got It Bad (and That Ain't Good)", keithJarrett, theMelodyAtNightWithYou));
		theMelodyAtNightWithYou.addTrack(new Song("Don't Ever Leave Me", keithJarrett, theMelodyAtNightWithYou));
		theMelodyAtNightWithYou.addTrack(new Song("Someone to Watch over Me", keithJarrett, theMelodyAtNightWithYou));
		
		 Album insideOut = new Album("Inside Out", 2001, keithJarrett);
	     insideOut.addTrack(new Song("From the Body", keithJarrett, insideOut));
	     insideOut.addTrack(new Song("Inside Out", keithJarrett, insideOut));

	     keithJarrett.addAlbum(theMelodyAtNightWithYou);
	     keithJarrett.addAlbum(insideOut);
	        
	        
	        System.out.println(keithJarrett.getAlbums().get(0).getTrack(2).toString());
	        //I Got It Bad (and That Ain't Good) - Keith Jarrett
	        //The Melody At Night With You(1999)
	        System.out.println();

	}

}
