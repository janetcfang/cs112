/*

	MP3 Player
	@author Janet Fang

*/
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;


public class MP3Player {

	//data members
	ArrayList<File> myMp3;
	String[] myArtists;
	String[] mySongs;
	int myCount;

	//constructor
	public MP3Player(ArrayList<File> mp3List){
		myMp3 = new ArrayList<File>(mp3List);
		myArtists = new String[myMp3.size()];
		mySongs = new String[myMp3.size()];
		myCount = 0;

		for(int i = 0; i < myMp3.size(); i++){
			//create an audio file
			try{
				AudioFile f = AudioFileIO.read(myMp3.get(i));
				Tag tag = f.getTag();
				addSong(tag.getFirst(FieldKey.TITLE));
				addArtist(tag.getFirst(FieldKey.ARTIST));
			} catch(Exception e){
			}
		} 
	}

	public void addArtist(String artist){
		for(int i = 0; i < myCount; i++){
			if(artist.compareTo(myArtists[i]) < 1){
				for(int j = myCount-1; j >= i; j--){
					myArtists[j+1] = myArtists[j];
				}
				myArtists[i] = artist;
				myCount++;
				return;
			}
		}
		myArtists[myCount] = artist;
		myCount++;
	}

	public void addSong(String song){
		for(int i = 0; i < myCount; i++){
			if(song.compareTo(mySongs[i]) < 1){
				for(int j = myCount-1; j >= i; j--){
					mySongs[j+1] = mySongs[j];
				}
				mySongs[i] = song;
				return;
			}
		}
		mySongs[myCount] = song;
	}

	//Print Artist
	public void printArtists(){
		String str = "";
		for(int i = 0; i < myCount; i ++){
			str += (i+1) + ". " + myArtists[i] + "\n";
		}
		System.out.println(str);
	}

	//Print Song
	public void printSongs(){
		String str = "";
		for(int i = 0; i < myCount; i ++){
			str += (i+1) + ". " + mySongs[i]+ "\n";
		}
		System.out.println(str);
	}

}
