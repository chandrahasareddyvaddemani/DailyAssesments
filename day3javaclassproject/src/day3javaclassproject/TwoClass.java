package day3javaclassproject;

public class TwoClass {

	float length, breadth;
    void getdata(float a, float b)
    {    length = a;
        breadth = b;
    }
}
class Area
{    public static void main(String args[ ])
    {    float area;
        TwoClass Rectangle = new TwoClass();
        Rectangle.getdata(5,5);
        area = Rectangle.length * Rectangle.breadth;
        System.out.println("Area : "+area);
    }
	
}
