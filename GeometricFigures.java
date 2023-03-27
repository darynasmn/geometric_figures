public class GeometricFigures {
    private static double circleAx, circleAy, middleOx, middleOy;
    private static double recX1, recY1, recX2, recY2,  recX3, recY3, angleBAD;
    private static double trAB, trAC, trBAD;

    public GeometricFigures(double recX1, double recY1,  double recX2, double recY2,  double recX3, double recY3,  double angleBAD) {
        this.recX1 = recX1;
        this.recY1 = recY1;
        this.recX2 = recX2;
        this.recY2 = recY2;
        this.recX3 = recX3;
        this.recY3 = recY3;
        this.angleBAD = angleBAD;
    }
    public GeometricFigures(double circleAx, double circleAy, double middleOx, double middleOy){
        this.circleAx = circleAx;
        this.circleAy = circleAy;
        this.middleOx = middleOx;
        this.middleOy = middleOy;
    }
    public GeometricFigures(double trAB, double trAC, double trBAD){
        this.trAB = trAB;
        this.trAC = trAC;
        this.trBAD = trBAD;
    }

    public double getCircleAx() {return circleAx;}

    public void setCircleAx() {this.circleAx = circleAx;}

    public double getCircleAy() {return circleAy;}

    public void setCircleAy() {this.circleAy = circleAy;}

    public double getMiddleOx() {return middleOx;}

    public void setMiddleOx() {this.middleOx = middleOx;}

    public double getMiddleOy() {return middleOy;}

    public void setMiddleOy() {this.middleOy = middleOy;}
    double radius;

    public double radius(double circleAx, double circleAy, double middleOx, double middleOy){
        double underRadius = Math.pow(circleAx-middleOx,2) + Math.pow(circleAy - middleOy, 2);
        radius = Math.sqrt(underRadius);
        return radius;
    }
    public double areaOfCircle(){
        return 2*Math.pow(radius, 2)* Math.PI;
    }
    public double longOfCircle(){
        return 2*radius*Math.PI;
    }

    public double getRecX1() {
        return recX1;
    }

    public void setRecX1(int recX1) {
        this.recX1 = recX1;
    }

    public double getRecY1() {
        return recY1;
    }

    public void setRecY1(int recY1) {
        this.recY1 = recY1;
    }


    public double getRecX2() {return recX2;}

    public void setRecX2(int recX2) {
        this.recX2 = recX2;
    }

    public double getRecY2() {
        return recY2;
    }

    public void setRecY2(int recY2) {
        this.recY2 = recY2;
    }


    public double getRecX3() {
        return recX3;
    }

    public void setRecX3(int recX3) {
        this.recX3 = recX3;
    }

    public double getRecY3() {
        return recY3;
    }

    public void setRecY3(int recY3) {this.recY3 = recY3;}


    public double getAngleBAD(){return angleBAD;}
    public void setAngleBAD(double angleBAD){this.angleBAD=angleBAD;}
    double recAB;
    double recAD;
    double angle;

    public double areaOfREC(double recX1, double recY1, double recX2, double recY2, double recX3, double recY3, double angelBAD){
        double underAB = Math.pow(recX2-recX1,2) + Math.pow(recY2-recY1, 2);
        recAB = Math.sqrt(underAB);
        double underAD= Math.pow(recX3-recX1,2) + Math.pow(recY3-recY1,2);
        recAD = Math.sqrt(underAD);
        angle = Math.sin(Math.toRadians(angleBAD));
        return recAB*recAD*angle;
    }
    public double perimeter(double recX1, double recY1, double recX2, double recY2, double recX3, double recY3){
        double underAB = Math.pow(recX2-recX1,2) + Math.pow(recY2-recY1, 2);
        recAB = Math.sqrt(underAB);
        double underAD= Math.pow(recX3-recX1,2) + Math.pow(recY3-recY1,2);
        recAD = Math.sqrt(underAD);
        return 2*(recAB+recAD);
    }
    public double areaOfR(double recX1, double recY1, double recX2, double recY2, double recX3, double recY3){
        double underAB = Math.pow(recX2-recX1,2) + Math.pow(recY2-recY1, 2);
        recAB = Math.sqrt(underAB);
        double underAD= Math.pow(recX3-recX1,2) + Math.pow(recY3-recY1,2);
        recAD = Math.sqrt(underAD);
        return recAB*recAD;
    }

    public double getTrAB(){return trAB;}
    public void setTrAB(double trAB){this.trAB=trAB;}

    public double getTrAC(){return trAC;}
    public void setTrAC(double trAC){this.trAC=trAC;}

    public double getTrBAD(){return trBAD;}
    public void setTrBAD(double trBAD){this.trBAD=trBAD;}
    double heightOfTriangle;

    public double height(double trAB,int trBAD, double trAC){
        double h1 = Math.sin(Math.toRadians(trBAD))*trAB;
        heightOfTriangle = Math.round(h1);
        return heightOfTriangle;
    }
    public double areaOfTriangle(double trAC){
        return (heightOfTriangle*trAC)*(1/2);
    }
    public double perimeterTR(double trAC, double trAB){
        return (2*trAB) + trAC;
    }
}
