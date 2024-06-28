public class dowhile
{
   public static void main (String[] args) 
   {
       int c=0;
       int i=1;
    int n=5;
    do
    {
          c=c+i;
          i++;
        System.out.println(c);
    }while(i<6);
    System.out.println("the sum upto 5 is "+c);
   }
}