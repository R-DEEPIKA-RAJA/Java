public class applyform
{
    String name;
    long rollno;
    int rank;
    public void display()
    {
      System.out.println(name);
      System.out.println(rollno);
      System.out.println(rank);
    }
   public static void main (String[] args) 
    {
         applyform deepika= new applyform();
         deepika.name="deepika";
         deepika.rollno=2113017;
         deepika.rank=1;
         deepika.display();
    }
}