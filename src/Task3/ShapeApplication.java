package Task3;

public class ShapeApplication {
    public static void main(String[] args) {
        Square square1 = new Square(10,20);
        Square square2 = new Square(100,-20);
        Square square3 = new Square(0,30);
        Square square4 = new Square(150,2000);
        Square square5 = new Square(108,-70);
        Square square6 = new Square(1,280);
        Square[] squares = new Square[] {square1, square2, square3, square4, square5, square6};

        shapeCheck(squares);
    }

     static void shapeCheck(Square square[]){
        for (int i=0; i<square.length; i++){
            if (square[i].getLength() <=0 || square[i].getWidth() <=0){
                System.out.println("The shape is invalid! a side can only be greater than 0, length: "+square[i].getLength()+" , width: "+square[i].getWidth());
            }else {
                System.out.print("The shape is valid!");
                square[i].printSquareInformation();
            }
        }
     }
}
