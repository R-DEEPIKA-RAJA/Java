class father
{
    void dispf(){
    System.out.println("father");
}
}

class son extends father
{
    void disps(){
    System.out.println("son");
}
}

class daughter extends father
{
    void dispd(){
    System.out.println("daughter");
}
}

class granddaughter extends daughter
{ 
    void dispg(){
    System.out.println("granddaughter");
}
}

class hybridinherit
{
    public static void main (String[] args) {
        father objf = new father();
        son objs= new son();
        daughter objd = new daughter();
        granddaughter objg = new granddaughter();
        objf.dispf();
        objs.dispf();
        objs.disps();
        objd.dispf();
        objd.dispd();
        objg.dispd();
        objg.dispg();
    }
}