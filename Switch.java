 public class  Switch
 {
    public static void main(String[]args)
    {
       
    
        char attendance ='o';
        switch(attendance)
        {
            case 'o':
                System.out.println("on duty");
                break;
            case 'p':
                System.out.println("present");
                break;
            case 'a':
                System.out.println("absent");
                break;
            default:
                System.out.println("invalid");
        }
        
        
    }
}