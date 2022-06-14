/*class BC 
{
    
}*/
class cat
{
   void eat()
   {
     int speedlimit=90;
   }
   
}
class Dog extends cat
{
   
   public char[] speedlimit;

   void eat()
   {
       int speedlimit =150;
   }
}
class BC
{
   public static  void main(String[] args)
    {
        Dog obj=new Dog();
        System.out.println(obj.speedlimit);
    }
}