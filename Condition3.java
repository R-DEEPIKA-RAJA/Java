 public class  Condition3
 {
    public static void main(String[]args)
    {
       
    
        char attendance ='p';
        int total = 40;
        if(attendance =='p')
         {
             System.out.println("present");
            if(total>=50)
            {
                System.out.println("class conducted");
            }
            else{
                System.out.println("not conducted");
            }
    
        }
        else{
            System.out.println("absent");
        }
    }
}