public class Scanner {
    public static void main(String [] args){
        Scanner input = new Scanner();
         double hypotenuse = 0;
         double base = 0;
         double height = 0;

         System.out.println("Enter the value of base :");

         System.out.println("Enter the value of height :");

         hypotenuse = Math.sqrt(base * base + height * height);
         System.out.println("");
         System.out.println("The hypotenuse of right-an triangle is :");
    }


}
