class methods
{
    void display()
    {
        System.out.println("i am void");
    }
    void display(int  a)
    {
        System.out.println(a);
    }
}
class polymorphism
{
    public static void main (String[] args) {
    methods obj  = new methods();
    obj.display();
    obj.display(10);
    }
}