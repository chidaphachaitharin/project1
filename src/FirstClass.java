public class FirstClass {
    public static void main(String[] args) {

        float weight = 83.0f;
        float mars = (weight * .38F);
        double mard = mars;
        int mari = (int)mars;
        String mars4 = String.format("%.4f", mars);
        char marc = (char) mars;


        System.out.print(weight + " kg on Earth is "+mars +" kg on Mars \n") ;
        System.out.print("Kilograms on Mars after converting to double "+mard+"\n" );
        System.out.print("Kilograms on Mars displayed to four decimal places: " + mars4+"\n");
        System.out.print("Kilograms on Mars when casted to integer "+mari+"\n" );
        System.out.print("The ASCII table equivalent of marsWeigtInInt is : "+marc+"\n" );
        System.out.print("An examole of a mathematical operation on the char type: "+marc+"\n" );



    }
}
