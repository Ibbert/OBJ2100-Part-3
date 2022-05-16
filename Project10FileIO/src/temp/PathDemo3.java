package temp;

import java.nio.file.*;
import static java.nio.file.AccessMode.*;
import java.io.IOException;
public class PathDemo3{
	
   public static void main(String[] args){
      Path filePath =
         Paths.get("/Users/bobanvesin/temp/Data.txt");
      System.out.println("Path is " + filePath.toString());
      try{
         filePath.getFileSystem().provider().checkAccess(filePath, READ);
         System.out.println("File can be read");
      }catch(IOException e){
         System.out.println("File cannot be used for this application");
      }
   }
}
