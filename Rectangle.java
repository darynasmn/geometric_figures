public class Rectangle extends Quadrangle{
    /**
     * methods for rectangles
     * @param recX1
     * @param recY1
     * @param recX2
     * @param recY2
     * @param recX3
     * @param recY3
     * @param angleBAD
     */
    public Rectangle(double recX1, double recY1,  double recX2, double recY2,  double recX3, double recY3, double angleBAD) {
        super( recX1, recY1, recX2, recY2,recX3, recY3, angleBAD);
    }
    double recAB;
    double recAD;
    double angle;

    public double areaOfR(double recX1, double recY1, double recX2, double recY2, double recX3, double recY3){
        double underAB = Math.pow(recX2-recX1,2) + Math.pow(recY2-recY1, 2);
        recAB = Math.sqrt(underAB);
        double underAD= Math.pow(recX3-recX1,2) + Math.pow(recY3-recY1,2);
        recAD = Math.sqrt(underAD);
        return recAB*recAD;
    }
    public double perimeter(double recX1, double recY1, double recX2, double recY2, double recX3, double recY3){
        double underAB = Math.pow(recX2-recX1,2) + Math.pow(recY2-recY1, 2);
        recAB = Math.sqrt(underAB);
        double underAD= Math.pow(recX3-recX1,2) + Math.pow(recY3-recY1,2);
        recAD = Math.sqrt(underAD);
        return 2*(recAB+recAD);
    }

}
