class animal
{
    int legs=4;
    public void animalchar()
    {
    System.out.println("i can eat and walk");
    }
}
class dog extends animal
{
    public void dogchar()
    {
       
    System.out.println("i can bark");
    }
}
class inherit{
    public static void main (String[] args) {
        
        dog obj= new dog();
        obj.dogchar();
        obj.animalchar();
    }
    
}