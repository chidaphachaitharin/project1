public class FirstClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many pounds (lbs) do you weigh? : ") ;
        double weight = input.nextDouble();
        double mars = (weight * .38);

        System.out.print("You weigh " + mars + " lbs on Mars \n");


    }
}
