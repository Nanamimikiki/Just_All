package segments;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Segment> segments = new ArrayList<>();
        segments.add(new Segment(new Dot(), new Dot()));
        segments.add(new Segment(new Dot(), new Dot()));
        segments.add(new Segment(new Dot(), new Dot()));
        segments.add(new Segment(new Dot(), new Dot()));
        segments.add(new Segment(new Dot(), new Dot()));
        segments.add(new Segment(new Dot(), new Dot()));
        segments.add(new Segment(new Dot(), new Dot()));
        segments.add(new Segment(new Dot(), new Dot()));
        segments.add(new Segment(new Dot(), new Dot()));
        segments.add(new Segment(new Dot(), new Dot()));
        segments.add(new Segment(new Dot(), new Dot()));
        segments.add(new Segment(new Dot(), new Dot()));
        segments.add(new Segment(new Dot(), new Dot()));
        segments.add(new Segment(new Dot(), new Dot()));
        segments.add(new Segment(new Dot(), new Dot()));
        Double temp = 0.0;
        for (Segment segment: segments) {
            Double length = segment.getLength();
            System.out.println(length);
            temp = Math.max(temp, length);
        }
        System.out.println(temp);
    }
}
