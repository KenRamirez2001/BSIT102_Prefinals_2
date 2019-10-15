import java.util.ArrayList;
import java.util.Scanner;
import java.util.Base64;
  
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class isangmalakingawit
{
    public static void main(String[] args) throws IOException
    {   
    	//ArrayList
    	ArrayList<String> words = new ArrayList<String>();
    	//Use scanner to enter words
    	Scanner scan = new Scanner(System.in);
    	Boolean isDone = false;
    	
    	//to executed repeatedly based on a given condition 
    	while(!isDone)
    	{
    		//I used string word to determined the word
    		String word = scan.nextLine();
    		if(!word.equals(":q"))
    		
    		{
    			//to convert from string to byte array 
    			byte[] encodedBytes = Base64.getEncoder().encode((word + "\n").getBytes());
    			words.add(new String(encodedBytes));
    		}
    		else
    		{
    			isDone = true;
    		}
    	}
    	//I used myfile to write character oriented data to file
    	FileWriter myfile = new FileWriter("awit.klr"); 
    	for(String b: words)
    	{
    		myfile.write(b);    
    	}
    	//close the scanner
      	myfile.close();  

    	
                   
       	
    }
}
