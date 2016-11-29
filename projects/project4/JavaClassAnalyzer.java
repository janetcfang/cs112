/*

	Main Driver
	@author Janet Fang

*/
import java.util.ArrayList;
import java.io.File;

public class JavaClassAnalyzer {
	public static void main(String[] args){

		if(args.length != 1) {
			System.out.println("Error: incorrect number of arguments.");
			System.exit(1); 
		}
			
		String input = args[0];

		FileFinder finder = new FileFinder();
		ArrayList<File> myFiles = finder.findFiles(input);

		ArrayList<JavaFile> validFiles = new ArrayList<JavaFile>();
		ArrayList<JavaFile> invalidFiles = new ArrayList<JavaFile>();

		for(int i = 0; i < myFiles.size(); i++){
			JavaFile temp = new JavaFile(myFiles.get(i));
			if(temp.getValid()){
				validFiles.add(temp);
			} else{
				invalidFiles.add(temp);			
			}
		}


		System.out.println("Valid Classes - Total: " + validFiles.size());

		int totSLOC = 0;
		int comments = 0;

		for(int i = 0; i < validFiles.size(); i ++){
			System.out.println("Class: " + validFiles.get(i).getClassName() + " [" + validFiles.get(i).getFilePath() + "]");

			int total = validFiles.get(i).getTotalLines();
			System.out.println("\tSLOC: " + total);
			totSLOC += total;

			int com = (total - validFiles.get(i).getCommentLines());
			System.out.println("\tSLOC (excluding comments): " + com);
			comments += com;
		}

		System.out.println("Total SLOC: " + totSLOC);

		System.out.println("Total SLOC (excluding comments): " + comments);

		System.out.println("Invalid Classes:");

		for(int i = 0; i < invalidFiles.size(); i++){
			System.out.println(invalidFiles.get(i).getFilePath());
		}
		
		
	}


}
