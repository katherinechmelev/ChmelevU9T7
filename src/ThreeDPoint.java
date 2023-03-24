public class ThreeDPoint extends Point{

    private int z;

    public ThreeDPoint(String label, int x, int y, int z){
        super(label, x, y);
        this.z=z;
    }

    @Override
    public String toString(){
        return super.toString() + ", z = " + z;
    }

    @Override
    public boolean equals(Object x){
        if(!(x instanceof ThreeDPoint)){
            return false;
        }

        ThreeDPoint other = (ThreeDPoint) x;
        return super.equals(x) && this.z==other.z;
    }

}
