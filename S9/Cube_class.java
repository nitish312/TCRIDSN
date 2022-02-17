 class Cube{
    private int length ;
    private int breadth;
    private int height;

    //method
    public void input(int l, int b, int h){
        length=l;
        breadth=b;
        height=h;
    }

    //method
    public int volume(){
        return (length*breadth*height);
    }
 }

public class Cube_class {
    public static void main(String[] args) {
        Cube cube1 = new Cube() ;
        cube1.input(10,20,10);

//        cube1.length=10;
//        cube1.breadth=10;
//        cube1.height=10;

        System.out.println("Cube Volume" + cube1.volume());
    }
}