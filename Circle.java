public class Circle extends GeometricFigures{
    /**
     * methods for circles
     * @param circleAx
     * @param circleAy
     * @param middleOx
     * @param middleOy
     */
    public Circle(double circleAx, double circleAy, double middleOx, double middleOy) {
        super(circleAx, circleAy, middleOx, middleOy);
    }
    double radius;

    @Override
    public double radius(double circleAx, double circleAy, double middleOx, double middleOy){
        double underRadius = Math.pow(circleAx-middleOx,2) + Math.pow(circleAy - middleOy, 2);
        radius = Math.sqrt(underRadius);
        return radius;
    }
    @Override
    public double areaOfCircle(){
        return Math.pow(radius, 2)* Math.PI;
    }
    @Override
    public double longOfCircle(){
        return 2*radius*Math.PI;
    }
}
