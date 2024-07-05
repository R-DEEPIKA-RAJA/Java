class methods
{
    void display()
    {
        int a=5;
        System.out.println("i am void function");
    }
}
class types extends methods{
    void display(int  a)
    {
        System.out.println(a);
    }
}
class overriding
{
    public static void main (String[] args) {
    methods obj  = new methods();
    types obj1 = new types();
    obj.display();
    obj1.display(10);
    obj.display();
    }
}