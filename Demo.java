 class D
 {
    void drink ()
    {
      System.out.println("i drink cofee"); 
    }
}
class M extends D
{
    void drink()
    {
      // super.drink();
      System.out.println("i drink tea");
    }

}
class Demo
{
 public static void main(String[] args) 
{  
  D R = new D();
  R.drink();
}
}//it is use for demo