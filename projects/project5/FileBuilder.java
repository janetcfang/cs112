/*

	mp3 builder
	@author Janet Fang
	
*/
import java.io.File;
import java.util.ArrayList;

public class FileBuilder {
		
	public static ArrayList<File> findFiles(String directory){
		ArrayList<File> result = new ArrayList<File>();
		findFiles(new File(directory), result);
		return result;
	}

	//helper private method
	private static void findFiles(File input, ArrayList<File> result){
		
		if(input.isFile()){
			if(input.getName().endsWith(".mp3")){
				result.add(input);
			}
		} else if(input.isDirectory()){
			File[] children = input.listFiles();
			for(File f: children){
				findFiles(f, result);
			}
		}
	}

}
