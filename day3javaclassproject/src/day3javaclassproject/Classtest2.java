package day3javaclassproject;

public class Classtest2 {
	int a,b;
	Classtest2(int i,int j)
    {    a=i;
        b=j;
    }
    void meth( Classtest2 of)
    {    of.a=a*2;
        of.b=b/2;
    }
}
class cbr
{    public static void main(String args [ ])
    {    Classtest2 t=new Classtest2(4,5);
        System.out.println("Before calling a="+t.a+"b="+t.b);
        t.meth(t);
        System.out.println("After calling a="+t.a+"b="+t.b);
    }
}
