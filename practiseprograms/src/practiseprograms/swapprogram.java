package practiseprograms;

public class swapprogram {
	 int x=10,y=20;             
     public void swapwot()
     {    x=x+y;
         y=x-y;
         x=x-y;
     }
     public void swapwt()
     {    int temp;
         temp =x;
         x=y;
         y=temp;
     }
     public void display()
     {    System.out.println ("value of x: "+x+"  value of y: "+y);
     }
 }


