package day5javatraining;

class Car
{
String vin, description;
public boolean equals(Object other)
// Depends on vin only
{
if (!(other instanceof Car))
return false;
else
return vin.equalsIgnoreCase(((Car)other).vin);
}
public int hashCode() { return vin.hashCode();} // Depends on vin only
public Car(String v, String d) { vin = v; description = d; }
public String toString() { return vin + " " + description; }
}
