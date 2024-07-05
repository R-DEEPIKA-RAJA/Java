class animal
{
    void display()
    {
        int leg=4;
        System.out.println("i can eat and walk");
    }
}

class dogs extends animal{
    void display0()
    {
        System.out.println(" i have 4 legs ");
    }
}

class lion extends dogs{
    void display1()
    {
        System.out.println("i can roar");
    }
}

class multilevelinherit
{
    public static void main (String[] args) {
    animal obj  = new animal();
    dogs obj1 = new dogs();
    lion obj2 = new lion();
    obj1.display0();
    obj2.display0();
    obj.display();
    obj1.display();
    obj2.display();
    obj2.display1();
    }
}