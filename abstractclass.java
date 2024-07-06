abstract class computer
{
    void turnon()
    {
        System.out.println("turn on");
    }
}
class hp extends computer 
{
    void disp(){
    System.out.println("turn off");
}
}
class abstractclass
{
    public static void main (String[] args) {
        hp obj = new hp();
        obj.turnon();
        obj.disp();
    }
}