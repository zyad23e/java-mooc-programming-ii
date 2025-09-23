
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        MagicSquare ted = new MagicSquare(3);
        ted.placeValue(0, 0, 8);
        ted.placeValue(0, 1, 1);
        ted.placeValue(0, 2, 6);
        ted.placeValue(1, 0, 3);
        ted.placeValue(1, 1, 5);
        ted.placeValue(1, 2, 7);
        ted.placeValue(2, 0, 4);
        ted.placeValue(2, 1, 9);
        ted.placeValue(2, 2, 2);
        System.out.println(ted.sumsOfDiagonals());
        
        //MagicSquareFactory msFactory = new MagicSquareFactory();
        //System.out.println(msFactory.createMagicSquare(5));
    }
}
