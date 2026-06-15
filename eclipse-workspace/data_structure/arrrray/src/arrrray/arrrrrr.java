package arrrray;

public class arrrrrr {

    public static void main(String args[]) {

        double[] myArray = {1.9, 2.3, 4, 5};

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        double total = 0;

        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];
        }

        System.out.println("Total = " + total);

        double max = myArray[0];

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] > max) {
                max = myArray[i];
            }

        }

        System.out.println("Max is " + max);

    }

}
    
    

