public class TesterPr6 {
    public static void main(String[] args) {
        do {
            System.out.println("This method calculates the areas of the bases, volumes and heights of straight and inclined parallelepipeds");
            int choose = DataInPut.getInt("Choose which geometric shape we will count:\n1 - circle\n2 - quadrangle\n3 - equilateral triangle:");
            while (choose > 3 && choose < 1) {
                choose = DataInPut.getInt("The specified method is incorrect. Enter again: ");
            }
            switch(choose){
                case 1 ->{
                    int circleAx = DataInPut.getInt("Enter the x coordinate of point A: ");
                    int circleAy = DataInPut.getInt("Enter the y coordinate of point A: ");
                    int middleOx = DataInPut.getInt("Enter the x coordinate of circle: ");
                    int middleOy = DataInPut.getInt("Enter the y coordinate of circle's centre: ");
                    Circle circle = new Circle(circleAx, circleAy, middleOx, middleOy);
                    System.out.println("Radius: " + circle.radius(circleAx, circleAy, middleOx, middleOy));
                    System.out.println("Circle area: " + circle.areaOfCircle());
                    System.out.println("Circuit: " + circle.longOfCircle());
                }
                case 2 ->{
                    int recX1 = DataInPut.getInt("Enter the x coordinate of point A: ");
                    int recY1 = DataInPut.getInt("Enter the y coordinate of point A: ");
                    int recX2 = DataInPut.getInt("Enter the x coordinate of point B: ");
                    int recY2 = DataInPut.getInt("Enter the y coordinate of point B: ");
                    int recX3 = DataInPut.getInt("Enter the x coordinate of point D: ");
                    int recY3 = DataInPut.getInt("Enter the y coordinate of point D: ");
                    int angleBAD = DataInPut.getInt("Enter the angle of inclination of side BAD: ");
                    Quadrangle quadrangle = new Quadrangle( recX1, recY1,  recX2, recY2, recX3, recY3, angleBAD);
                    System.out.println("Area of ​​the quadrilateral: " + quadrangle.areaOfREC(recX1,  recY1, recX2, recY2,  recX3,  recY3, angleBAD));
                    System.out.println("Perimeter of a quadrilateral: " + quadrangle.perimeter(recX1, recY1, recX2, recY2,  recX3, recY3));
                    System.out.println("                                           ");
                    Rectangle rectangle = new Rectangle( recX1, recY1, recX2, recY2,  recX3, recY3,  angleBAD);
                    System.out.println("Area of ​​the quadrilateral: " + rectangle.areaOfR(recX1,  recY1, recX2, recY2,  recX3,  recY3));
                    System.out.println("Perimeter of a quadrilateral: " + rectangle.perimeter(recX1, recY1, recX2, recY2,  recX3, recY3));
                    System.out.println("                ");
                }
                case 3->{
                    int trAB = DataInPut.getInt("Enter the length of AB: ");
                    int trAC = DataInPut.getInt("Enter the length of AC: ");
                    int trBAD = DataInPut.getInt("Enter the angle BAC: ");
                    Triangle triangle = new Triangle(trAB, trAC, trBAD);
                    System.out.println("The height of the triangle: " + triangle.height(trAB, trBAD, trAC));
                    System.out.println("Area of ​​the triangle: " + triangle.areaOfTriangle(trAC));
                    System.out.println("Perimeter of a triangle: " + triangle.perimeterTR( trAC, trAB));
                }
            }
        } while (DataInPut.getInt("Enter zero to terminate the program: ") != 0);
    }
}
