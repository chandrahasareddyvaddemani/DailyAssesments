
public class cube {
	int length = 10;
    int breadth = 10;
    int height = 10;
    public int getVolume()
    {    return (length * breadth * height);
    }
    public static void main(String[ ] args)
    {
        cube c;         // Creates a Cube Reference
        c = new cube();     // Creates an Object of Cube
        System.out.println("VolumeofCubeis:" + c.getVolume());
    }

}
