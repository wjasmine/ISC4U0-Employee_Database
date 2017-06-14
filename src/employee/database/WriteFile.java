
package employee.database;

/* this class saves a text file to the path FILENAME
 * the information for the textfile is in the document "Format of Text File"
 */

//import java classes
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class WriteFile {

    //this class has the attributes path, or where the file is created/saved
    //append to file is a boolean that shows the program whether to append the file (true) 
    //or overwrite the file (false) 
    private String path;
    private boolean appendToFile = false;
    
    //constructor
    //this constructor automatically set appendToFile as false
    public WriteFile(String filePath) {
        path = filePath;
    }
    
    //second constructor
    //this constructor is made to have the option to set appendToFile as true
    public WriteFile(String filePath, boolean appendValue) {
        path = filePath;
        appendToFile = appendValue;
    }

    //this method writes a line to the file
    public void writeToFile(String textLine) throws IOException {
        FileWriter write = new FileWriter(path, appendToFile);

        PrintWriter printLine = new PrintWriter(write);

        printLine.printf("%s" + "%n" , textLine);

        //close the file
        printLine.close();
    }
    
    //this method clear the file by setting the appendToFile as false
    public void overwriteFile () throws IOException {
        FileWriter write = new FileWriter(path, false);

        PrintWriter printLine = new PrintWriter(write);

        //close the file
        printLine.close();
    }

    
}
