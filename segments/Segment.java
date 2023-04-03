package segments;

public class Segment {
    private Dot firstDot ;
    private Dot secondDot;


    public Segment(Dot firstDot, Dot secondDot) {
        this.firstDot = firstDot;
        this.secondDot = secondDot;
    }

    public double getLength(){
        int x1 = firstDot.getA();
        int y1 = firstDot.getB();
        int x2 = secondDot.getA();
        int y2 = secondDot.getA();
        return Math.sqrt(Math.abs(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }
}
