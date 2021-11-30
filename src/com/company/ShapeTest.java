package com.company;

public class ShapeTest
{
    public static void main(String[] args)
    {
        Shape[] shapes = new Shape[6];

        shapes[0] = new Square(2.0);
        shapes[1] = new Triangle(3.0, 3.0);
        shapes[2] = new Circle(5.0);
        shapes[3] = new Sphere(3.0);
        shapes[4] = new Cube(4.0);
        shapes[5] = new Tetrahedron(2.0);

        for(Shape s : shapes)
        {
            if(s instanceof TwoDimensionalShape)
                System.out.printf("\nTwoDimensionalShape %sArea: %.2f\n", s.toString(),((TwoDimensionalShape) s).calculateArea() );
            else if(s instanceof ThreeDimensionalShape)
                System.out.printf("\nThreeDimensionalShape %sSurface Area: %.2f\nVolume: %.2f\n", s.toString(),
                        ((ThreeDimensionalShape) s).calculateArea(),
                        ((ThreeDimensionalShape) s).calculateVolume());
        }
    }

}