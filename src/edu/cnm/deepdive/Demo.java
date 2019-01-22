package edu.cnm.deepdive;

public class Demo
{
public static void main (String[] args) //basically int main from C++
{
  System.out.println("Hello, World!");  //System is a class, out is an item, println is a function/method
  long msSinceStart = System.currentTimeMillis();
  double secondsSinceStart = msSinceStart / 1000.0; //the .0 makes 1000 a double precision floating point value
  long truncated = (long) secondsSinceStart; //the (long) tells Java to treat the double as a long instead.
  long rounded = Math.round(secondsSinceStart);
  System.out.println(secondsSinceStart);
  System.out.println(truncated);
  System.out.println(rounded);
}
}
