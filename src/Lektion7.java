public class Lektion7 {

    public static void main(String[] args) {

        double[] myList = new double[10];
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++)
            myList[i] = input.nextDouble();


        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 100;
        }

        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }

        double total = 0;
        for (int i = 0; i <myList.length; i++) {
            total += myList[i];
        }

        double max = myList[0];
        for (int i = 1; i <myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }

        int indexOfMax = 0;
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
                indexOfMax = i;
            }
        }

        for (int i = myList.length - 1; i > 0; i--) {
            int j = (int)(Math.random() * (i + 1));

            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }

        for (int i = 1; i <myList.length; i++) {
            myList[i - 1] = myList[i];
        }


    }
}
