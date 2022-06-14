 import java.io.FileWriter;
 import java.io.IOException;
 class DemoFileWrite
 {
    public static void main(String[] args) 
    {
        try
        {
           FileWriter v= new FileWriter("D:\\createFile.txt");
            v.write("\n My name is kirtiman \n my aim is to do something for country ");
            v.close();
            System.out.println("comtent is successfully wrote in File");
        }
        catch(IOException e)
        {
         System.out.println(e);
         e.printStackTrace();
        }
    }   
}
