interface father 
{
    abstract void call();
    abstract void talk();
}
class interfac implements father
{
    public void call()
    {
        System.out.println("calling");
    }
    public void talk()
    {
        System.out.println("talking");
    }
}
class interfaceconcept{
 public static void main (String[] args) 
    {
       interfac obj = new interfac();
       obj.call();
       obj.talk();
    }
}