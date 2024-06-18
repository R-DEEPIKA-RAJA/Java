/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class TypeCasting
{
    public static void main(String[] args) {
        int a=10;
        int b=4;
         float f=a/b;                              /* implicit conversion*/
         float g=(float)a/(float)b;                 /*explicit conversion*/
         System.out.println(g);
        
        System.out.println(f);
        
        
    }
}