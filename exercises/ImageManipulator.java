/*
	A class with several methods to manipulate jpg images.
	Exercise @author Janet Fang
*/

public class ImageManipulator {
	/*
		Creates an inversion of the original image by setting the red 
		value for each pixel to be 255 minus the original red value, 
		and the same for green and blue.  
		@param inputfile - the name of the file where the original
		image is stored
		@param outputfile - the name of the file where the negative 
		image will be stored
	*/
	public void makeNegative(String inputfile, String outputfile) {
		Picture picture = new Picture(inputfile); //create photo
		int width = picture.getWidth(); //call getWidth method
		int height = picture.getHeight(); //call getHeight method

		for(int w = 0; w < width; w++){ //iterate through columns
			for(int h = 0; h < height; h++){ //iterate through rows

				Pixel p = picture.getPixel(w,h);
				int red = 255 - p.getRed(); //255 is max of RGB, 255 - color = new color: negative
				int green = 255 - p.getGreen();
				int blue = 255 - p.getBlue();

				Pixel pixelNew = new Pixel(red, green, blue); 
				picture.setPixel(w, h, pixelNew); //setting new colors, replacing colors
			}
		}

		picture.store(outputfile);

	}

	/*
		Takes as input a floating point number between 0 and 1 that indicates
		by how much the image should be lightened. For each pixel, it will set
		its new red value to be (1-amount)oldred + amount * 255, doing the 
		same for green and blue.
		@param inputfile - the name of the file where the original
		image is stored
		@param outputfile - the name of the file where the lightened 
		image will be stored
		@param amount - the amount by which the image will be lightened

	      Hint: if you multiply an integer by a floating point number Java will
	      automatically convert the result to a floating point number. For these
	      exercises, you will need to convert that result back into an integer
	      (as the RGB values for the pixel must be whole numbers). To do this, 
	      you may using casting to convert a double to an int by truncating.
	      Example below:
	      
	      int original = 5;
	      double resultDouble = 5 * .55;
	      int resultInt = (int)resultDouble;

	*/
	public void lighten(String inputfile, String outputfile, double amount) {
		Picture picture = new Picture(inputfile); //create photo
		int width = picture.getWidth(); //call getWidth method
		int height = picture.getHeight(); //call getHeight method

		for(int w = 0; w < width; w++){ //iterate through columns
			for(int h = 0; h < height; h++){ //iterate through rows

				Pixel p = picture.getPixel(w,h);

				double red = ((1 - amount) * p.getRed() + amount * 255);
				int resultRed = (int)red;

				double green = ((1 - amount) * p.getGreen() + amount * 255);
				int resultGreen = (int)green;

				double blue = ((1 - amount) * p.getBlue() + amount * 255);
				int resultBlue = (int)blue;

				Pixel pixelNew = new Pixel(resultRed, resultGreen, resultBlue); 
				picture.setPixel(w, h, pixelNew); //setting new colors, replacing colors
			}
		}
		picture.store(outputfile);
	}

	/*
		Converts the image to "black and white" by setting the red, 
		green, and blue value for each pixel to be 30% of the old 
		red value + 59% of the old green value + 11% of the old blue 
		value for that pixel (see: http://en.wikipedia.org/wiki/Grayscale).
		@param inputfile - the name of the file where the original
		image is stored
		@param outputfile - the name of the file where the greyscale 
		image will be stored
	*/
	public void makeGreyscale(String inputfile, String outputfile) {

		Picture picture = new Picture(inputfile); //create photo
		int width = picture.getWidth(); //call getWidth method
		int height = picture.getHeight(); //call getHeight method

		for(int w = 0; w < width; w++){ //iterate through columns 
			for(int h = 0; h < height; h++){ //iterate through rows

				Pixel p = picture.getPixel(w,h);

				double greyscale = (0.3 * p.getRed()) + (0.59 * p.getGreen()) + (0.11 * p.getBlue());

				int resultRed = (int)greyscale;
				int resultGreen = (int)greyscale;
				int resultBlue = (int)greyscale;

				Pixel pixelNew = new Pixel(resultRed, resultGreen, resultBlue); 
				picture.setPixel(w, h, pixelNew); //setting new colors, replacing colors

			}
		}
		picture.store(outputfile);
	}

	/*
		Takes as input a number of pixels and scrolls the image by 
		that amount horizontally.  The image will be shifted to the 
		left, and the leftmost numpixels will appear on the right 
		side of the image.
		@param inputfile - the name of the file where the original
		image is stored
		@param outputfile - the name of the file where the scrolled 
		image will be stored
		@param numpixels - the amount by which the image will be scrolled
	*/
	public void scrollHorizontal(String inputfile, String outputfile, int numpixels) {

		Picture picture = new Picture(inputfile); //create photo
		Picture temp = new Picture(inputfile); //temp

		int width = picture.getWidth(); //call getWidth method
		int height = picture.getHeight(); //call getHeight method	

		for(int w = 0; w < width; w++){
			for(int h = 0; h < height; h++){

				Pixel p = temp.getPixel(w,h);
				int newWidth = ((w-numpixels)%width + width) % width;
				picture.setPixel(newWidth, h, p);

			}
		}
		picture.store(outputfile);

	}

}
