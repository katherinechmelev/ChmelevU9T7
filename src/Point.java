public class Point {

    private int x;
    private int y;
    private String label;

    public Point(String label, int x, int y){
        this.label=label;
        this.x=x;
        this.y=y;
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
        return(this.x==other.x) && (this.y==other.y);
    }

}
