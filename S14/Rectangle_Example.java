class Rectangle
{
    int length;
    int breadth ;

    public Rectangle (int length, int breadth){
        this.length= length;
        this.breadth=breadth;
    }
    public int displayArea(){
         return breadth*length;
    }
}

class Rectangle_Example {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4,5);
        Rectangle rec2 = new Rectangle(5,8);

        System.out.println("Area of rectangle 1 is: "+ rec1.displayArea());
        System.out.println("Area of rectangle 2 is: "+ rec2.displayArea());
    }
}