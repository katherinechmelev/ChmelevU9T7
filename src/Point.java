public class Point {

    private int x;
    private int y;
    private String label;

    public Point(int x, int y, String label){
        this.x=x;
        this.y=y;
        this.label=label;
    }

    @Override
    public String toString(){
        return "Point " + label + " is at x = " + x + ", y= " + y;
    }

    @Override
    public boolean equals(Object j){
        if(!(j instanceof Point)){
            return false;
        }

        Point other = (Point) j;

    }

}
