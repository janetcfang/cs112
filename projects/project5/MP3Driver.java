/*

    MP3 Driver
    @author Janet Fang

*/
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class MP3Driver {
    public static void main(String[] args){

        //Command line
        if(args.length != 1) {
            System.out.println("Error: incorrect number of arguments.");
            System.exit(1);
        }

        String input = args[0];

        FileBuilder builder = new FileBuilder();

        ArrayList<File> myFiles = builder.findFiles(input);

        if(myFiles.size() == 0){
            System.out.println("No mp3 file found.");
            System.exit(1);
        }

        MP3Player mp3 = new MP3Player(myFiles);

        Player player = null;

        //Print Display Options
        System.out.println("Welcome to the MP3 Player, please select one of the following options:");

        Scanner inputFile = new Scanner(System.in);

        int choice = 0;
        while (choice != 5) {
            System.out.println("1. List all MP3s sorted by song title");
            System.out.println("2. List all MP3s sorted by artist");
            System.out.println("3. Play MP3");
            System.out.println("4. Stop playback");
            System.out.println("5. Exit the program");
            System.out.println("Please enter a number 1-5");

            choice = inputFile.nextInt();
            while(choice < 1 || choice > 5){

                if(choice < 1 || choice > 5){
                    System.out.println("Invalid option, please pick a number 1-5: ");
                }

                System.out.println("1. List all MP3s sorted by song title");
                System.out.println("2. List all MP3s sorted by artist");
                System.out.println("3. Play MP3");
                System.out.println("4. Stop playback");
                System.out.println("5. Exit the program");
                System.out.println("Please enter a number 1-5");

                choice = inputFile.nextInt();

            }

            //list mp3 song title
            if(choice == 1){
                mp3.printSongs();
            }

            //list mp3 artist
            if(choice == 2){
                mp3.printArtists();
            }

            //play mp3
            if(choice == 3 || choice == 4 || choice == 5){

                if(choice == 3) {
                    //check if player exists
                    //if it doesnt
                    mp3.printSongs();
                    int song = -1;
                    while (song < 0 || song > myFiles.size()) {
                      System.out.println("Please enter the song number you wish to play: ");
                      song = inputFile.nextInt()-1;
                      if(choice < 0 || choice > myFiles.size()) {
                          System.out.println("Invalid option, please try again. ");
                      }
                    }

                    //create a new player for specific mp3 file
                    try{
                        Player anotherPlayer = new Player(new FileInputStream(myFiles.get(song).getAbsolutePath()));
                        //create a new thread to start playback
                        //the run method will not be called until the thread is started
                        //if the play method is not called from a thread the the rest of the program
                        //will block until the entire song has played
                        player = anotherPlayer;
                        Thread t = new Thread() {
                            public void run() {
                                try {
                                    anotherPlayer.play();
                                } catch(Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        };
                        //start the thread
                        //only when start is called does the run method of the thread get called
                        t.start();
                    } catch(Exception e) {

                    }
                }

                if (choice != 3) {
                    //if player exists and is playing
                    player.close();

                    if(choice == 5) {
                        System.exit(0);
                    }
                }


            }
        }

    }
}
