public class whileloop
{
   public static void main (String[] args) 
   {
       int c=0;
       int i=1;
    int n=5;
    while(i<=n)
    {
          c=c+i;
          i++;
        System.out.println(c);
    }
    System.out.println("the sum upto 5 is "+c);
   }
}