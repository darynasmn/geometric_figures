public class Quadrangle extends GeometricFigures{

    public Quadrangle(double recX1, double recY1,  double recX2, double recY2,  double recX3, double recY3, double angleBAD) {
        super( recX1, recY1, recX2, recY2,recX3, recY3, angleBAD);
    }
    double recAB;
    double recAD;
    double angle;
    @Override

    public double areaOfREC(double recX1, double recY1, double recX2, double recY2, double recX3, double recY3,double angleBAD ){
        double underAB = Math.pow(recX2-recX1,2) + Math.pow(recY2-recY1, 2);
        recAB = Math.sqrt(underAB);
        double underAD= Math.pow(recX3-recX1,2) + Math.pow(recY3-recY1,2);
        recAD = Math.sqrt(underAD);
        angle = Math.sin(Math.toRadians(angleBAD));
        return recAB*recAD*angle;
    }
    @Override
    public double perimeter(double recX1, double recY1, double recX2, double recY2, double recX3, double recY3){
        double underAB = Math.pow(recX2-recX1,2) + Math.pow(recY2-recY1, 2);
        recAB = Math.sqrt(underAB);
        double underAD= Math.pow(recX3-recX1,2) + Math.pow(recY3-recY1,2);
        recAD = Math.sqrt(underAD);
        return 2*(recAB+recAD);
    }
    @Override
    public double areaOfR(double recX1, double recY1, double recX2, double recY2, double recX3, double recY3){
        double underAB = Math.pow(recX2-recX1,2) + Math.pow(recY2-recY1, 2);
        recAB = Math.sqrt(underAB);
        double underAD= Math.pow(recX3-recX1,2) + Math.pow(recY3-recY1,2);
        recAD = Math.sqrt(underAD);
        return recAB*recAD;
    }

}
