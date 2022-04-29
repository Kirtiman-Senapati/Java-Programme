 class Add 
 {
    int add(int a,int b)
   {
       return(a+b);
   }   
    float add(float x, float y, float z)
   {
       return(x+y+z);
   }
       
}
class Adder
{
    public static void main(String[] args) 
    { 
        Add obj= new Add();  
        System.out.println(obj.add (5,7));
        System.out.println(obj.add(5,7,2));
    } 
}