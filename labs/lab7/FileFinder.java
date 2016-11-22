/*

	FileFinder class
	@author Janet Fang

*/
import java.io.File;
import java.util.HashMap;

public class FileFinder{
		
	public static HashMap<String, Integer> findFiles(String directory){

		HashMap<String, Integer> result = new HashMap<String, Integer>();

		findFiles(new File(directory), result);

		return result;
	}


	//helper private method
	private static void findFiles(File input, HashMap<String, Integer> result){
		

		if(input.isFile()){
			String fileName = input.getName();
			String ext = fileName.substring(fileName.lastIndexOf(".")+1, fileName.length());

			if(!result.containsKey(ext)){
				result.put(ext, 1);
			} else{
				int current = result.get(ext);
				result.put(ext, current+1);
			}
		} else if(input.isDirectory()){
			File[] children = input.listFiles();
			for(File f: children){
				findFiles(f, result);
			}
		}
	}

	public static void main(String[] args){

		if(args.length != 1) {
			System.out.println("Error: incorrect number of arguments.");
			System.exit(1); 
		}
		

		HashMap<String, Integer> result = findFiles(args[0]);

		for(String key: result.keySet()){
			System.out.println(key + ": " + result.get(key));
		}


	}


}
