import org.junit.Assert;

public class SquareTest {
    Square square = new Square(5);
    @org.junit.Test
    public void getPerimeter() {
        Assert.assertEquals(20,square.getPerimeter(),3);
    }

    @org.junit.Test
    public void getArea() {
        Assert.assertEquals(25, square.getArea(),3);
    }

    @org.junit.Test
    public void getDiagonal() {
        Assert.assertEquals(7.07107, square.getDiagonal(),0.0001);
    }

    @org.junit.Test
    public void getRadiusOfCircumscribedCircle() {
        Assert.assertEquals(3.53553, square.getRadiusOfCircumscribedCircle(),0.0001);
    }

    @org.junit.Test
    public void getRadiusOfInscribedCircle() {
        Assert.assertEquals(2.5, square.getRadiusOfInscribedCircle(),0.0001);
    }
}