
public class TreeAppMain {

    public static void main(String[] args) {

        printTree(10);

        easyPrint();

    }

    public static int printTree(int rowNumber){

        int space = rowNumber - 1;
        int star = 1;

        for(int rowCounter = 0; rowCounter < rowNumber; rowCounter++){
            for(int k = 0; k < space; k++){
                System.out.print(" ");
            }
            for(int j = 0; j < star; j++){
                System.out.print("*");
            }
            System.out.println("");
            space--;
            star += 2;
        }

        System.out.println("");

        return star;
    }

    public static void easyPrint(){

        System.out.println("     *");
        System.out.println("    ***");
        System.out.println("   *****");
        System.out.println("  *******");
        System.out.println(" *********");
        System.out.println("***********");
        System.out.println("");

    }
}
