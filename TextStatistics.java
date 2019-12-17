package textstatistics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Object;

/**
 *
 * 
 *
 * @author Pluska
 */

//TODO: implement the TextStatisticsInterface
public class TextStatistics implements TextStatisticsInterface{

    //Declare additional variables here
    private File textFile;
    private Scanner fileScan;
    //Be mindful of these when counting the words and their lengths
    //They should not be included as words or counted in the length of the word
    private final String REGEX = "\\W+";
    private int lineCount, wordCount, charCount, letterCount[], wordLengthCount[];
    private double averageWordLength;
    private String results;
    private double totalwordcount = 0.0;
    private double totalcharcount = 0.0;

    public TextStatistics(File file) {
        
        textFile = file;

        try {

            fileScan = new Scanner(textFile);

            while(fileScan.hasNextLine()){
                String line = fileScan.nextLine();
                //prints out character count by taking the lenght of every line and adding one tot ake into account the new line chatracter
                charCount += line.length() + 1;
               //this gives the wordcount by splitting each line into an array with a space split and prints  out the length of the array 
                String[] spacecount = line.split (" ");
                   wordCount += spacecount.length;
                   
                   
               //average word length    
              String[] tempavg = {line};   
              int count = 0;
              //splits the words into a tangible number
              
                  String[] words = line.split(" ");
                   totalwordcount = words.length;
                   //uses a for loop to count total letter characters
                   for(int i = 0; i < line.length(); i++){
                      if (Character.isLetter(line.charAt(i)))
                    count++;
                   }
                   averageWordLength = count / totalwordcount;
              
//attempt at character count array, using ascii to find the amount of each character's code
               /*
               
                String linelower = line.toLowerCase();
                for(char c = 0; c <= linelower.length(); c++){
                 if (!Character.isLetter(c)){
                     int index = (int) c-97;
                  
                    letterCount[index]++;       
                 
                 */   
                 
                
                
                
               
                lineCount++;
            }
		
  
            
        } catch (FileNotFoundException ex) {

            System.out.println("File cannot be located.");
        }
    
    }
    
    @Override
    public int getLineCount() {

        return lineCount;
    }

    @Override
    public int getWordCount() {

        return wordCount;
    }

    @Override
    public int getCharCount() {

        return charCount;
    }

    @Override
    public int[] getLetterCount() {

        return letterCount;
    }

    @Override
    public int[] getWordLengthCount() {

        return wordLengthCount;
    }

    @Override
    public double getAverageWordLength() {

        return averageWordLength;
    }
    

    //TODO: Complete the toString method which prints out the results
    public String toString(){
	
  	return results;
    }
    
}
