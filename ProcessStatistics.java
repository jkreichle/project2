package textstatistics;


import java.io.File;

/**
 *
 * 
 *
 *
 * @author Pluska
 */

public class ProcessStatistics{
    
    public static void main(String[] args){

            String textfile = ("/home/user/NetBeansProjects/TextStatistics/src/textstatistics/Decl-usa.txt");
        
		//if statement, is args.length > 0

		//while loop to check for all args
        
                File file = new File(textfile);//replace 0 with variable

                if(file.exists()){

                    TextStatistics ts = new TextStatistics(file);

                    System.out.println("the total number of lines is " + ts.getLineCount());
                    System.out.println ("the total number of words are " +ts.getWordCount());
                    System.out.println("the total number of characters are " +ts.getCharCount());
                    System.out.println("the average word length is " +ts.getAverageWordLength());
                    System.out.println("~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("thank you");
                    System.out.println(ts.getLetterCount());
                    System.out.println(ts.getWordLengthCount());
                }
    
    }
    
}
