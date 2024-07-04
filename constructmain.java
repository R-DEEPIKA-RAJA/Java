class construct
{
    String name;
    long rollno;
    int rank;
    construct(String str , int num)
    {
       name=str;
       rollno=num;
    }
}
    class constructmain
    {
    public static void main (String[] args) 
    {
        construct obj = new construct("deeps",14);
        System.out.println(obj.name);
        System.out.println(obj.rollno);
    }
}
