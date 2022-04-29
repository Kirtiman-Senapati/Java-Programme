import java.io.FileReader;
 import java.io.IOException;
import java.util.Scanner;
 class TestFileReader
  {  
     public static void main(String[] args) 
      {
           try
          {
            FileReader v= new FileReader("D:\\Pratice\\createFile.txt");
             Scanner dataReader=new Scanner(v);
             while(dataReader.hasNextLine())
              {
                String fileData=dataReader.nextLine();
                System.out.println(fileData);
              } 
              dataReader.close();
           }
          catch(IOException e)
          {
              System.out.println(e);
              e.printStackTrace();
          }
       }
}   