package employee.database;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
/* this class reads each line in the text file path
 * there is a method to calculate the number of lines in the text file
 * then, the program saves each line for processing
 * bufferedreader and filereader are used for this process
 */
public class ReadFile {
    private String path;
    
    //constructor
    public ReadFile (String filePath){
        path = filePath;
    }
    
    //this method opens the file and return each line as an array
    public String [] OpenFile() throws IOException{
        FileReader fr = new FileReader (path);
        BufferedReader textReader = new BufferedReader (fr);
        
        //the method readLines is called to determine the number of lines in the file
        int numberOfLines = readLines();
        
        //an array with an index equal to the number of lines is created
        String [] textData = new String [numberOfLines];
        
        //each line is stored onto its proper index in the array
        for (int i = 0; i < numberOfLines; i++){
            textData[i] = textReader.readLine ();
        }
        //the file is closed
        textReader.close ();
        
        //the array with all the lines in the text file is returned
        return textData;
    }
    
    //this method determines how many lines are in the text file
    int readLines () throws IOException {
        FileReader fileToRead = new FileReader (path);
        BufferedReader bf = new BufferedReader (fileToRead);
        
        //initialize new variables to save a temporary line and to save how many lines there are
        String someLine;
        int numberOfLines = 0;
        
        //while the line have something stored in it, variable numberOfLines increases in value by 1
        //when there are no more lines left, the program has successfully determine the total
        //number of lines in the textfile
        while ((someLine = bf.readLine ())!= null){
            numberOfLines ++;
        }
        
        //close the file
        bf.close ();
        
        return numberOfLines;
    }
    
}
