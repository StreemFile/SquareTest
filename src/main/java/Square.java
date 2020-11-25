/**
 * Created by IntelliJ IDEA.
 * SquareTest.Square
 *
 * @Autor: vovamv
 * @DateTime: 11/23/20|1:11 пп
 * @Version Square: 1.0
 */

public class Square {

    private double sideLength;

    public Square() {
    }

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public double getPerimeter() {
        return this.getSideLength() * 4;
    }

    public  double getArea(){
        return Math.pow(this.getSideLength(),2);
    }

    public double getDiagonal(){
        return this.getSideLength()*Math.sqrt(2);
    }

    public double getRadiusOfCircumscribedCircle(){
        return this.getDiagonal()/2;
    }

    public double getRadiusOfInscribedCircle(){
        return this.getSideLength()/(double)2;
    }

}
