import java.io.*;
import java.io.IOException;
class createFile
{
       public static void main(String[] args)
   {
     try
     {
      File f=new File("D://Pratice//createfile.txt"); 
      
      
          if(f.createNewFile())
          {
              System.out.println("File Successfully Creat..!");
          }
          else
          {
               System.out.println("File Already Exist..!");
          }
        }
    catch(IOException i)
   {
       System.out.println("Exception Handled..!");
       i.printStackTrace();
    }
  }
}