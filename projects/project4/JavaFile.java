/*

	Java File Class
	@author Janet Fang

*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaFile {

	boolean valid;
	int totalLines;
	int commentLines;
	String filePath;
	String className;

	//constructor
	public JavaFile(File file){
		this.valid = false;
		this.totalLines = 0;
		this.commentLines = 0;
		this.filePath = file.getAbsolutePath();
		this.className = "";
		checkValid(file);
		process(file);
	}

	//getters
	public boolean getValid(){
		return this.valid;
	}

	public int getTotalLines(){
		return this.totalLines;
	}

	public int getCommentLines(){
		return this.commentLines;
	}

	public String getFilePath(){
		return this.filePath;
	}

	public String getClassName(){
		return this.className;
	}

	//process method
	public void process(File file){

		boolean inComment = false;

		//read in each line of file
		try(Scanner input = new Scanner(file)) {
			//String line = input.nextLine();
			while(input.hasNextLine()){
	    		String line = input.nextLine();
	    		this.totalLines+=1;
	    		if(line.startsWith("//")){
	    			this.commentLines+=1;
		    	} else if(line.startsWith("/*")){
		    			while(!line.endsWith("*/")){
		    				this.commentLines+=1;
		    				line = input.nextLine();
	    				}
	    		}
	    	}
	    } catch(FileNotFoundException fnf) {
				System.out.println("File not found.");
	            System.out.println(fnf.getMessage());
	            System.exit(1);
	    }	

	}



	public void checkValid(File file){

		try(Scanner input = new Scanner(file)){
			String line = input.nextLine();
			while(!line.contains(" class ")){
				line = input.nextLine();
			}

			//get class name
			int index = line.indexOf("class");
			String className = line.substring(index+6, line.length()-2);

			this.className = className;

			//get file name
			String fileName = file.getName();
			int index2 = fileName.lastIndexOf(".");
			fileName = fileName.substring(0,index2);

			this.valid = (className.equals(fileName));
		} catch(FileNotFoundException fnf){
			System.out.println("File not found.");
	        System.out.println(fnf.getMessage());
	        System.exit(1);
		}



	}
}
