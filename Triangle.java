public class Triangle extends GeometricFigures{
    /**
     * methods for triangles
     * @param trAB
     * @param trAC
     * @param trBAD
     */
    public Triangle(double trAB, double trAC, double trBAD) {
        super(trAB, trAC, trBAD);
    }
    double heightOfTriangle;
    @Override
    public double height(double trAB,int trBAD, double trAC){
        double h1 = Math.sin(Math.toRadians(trBAD))*trAB;
        heightOfTriangle = Math.round(h1);
        return heightOfTriangle;
    }
    @Override
    public double areaOfTriangle(double trAC){
        return ((heightOfTriangle*trAC)/2);
    }
    @Override
    public double perimeterTR(double trAC, double trAB){
        return (2*trAB) + trAC;
    }
    public String toString(){
        return "";
    }
}
