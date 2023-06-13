import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int randomVar = (int) (Math.random() * 15) + 5;
        List<Integer> myList = new LinkedList<Integer>();

        //filling in myList with random numbers
        for (int i = 0; i < 20; i++) {
            myList.add((int) (Math.random() * 20));
        }
        System.out.println("Existing list:" + "\n" + myList);
        System.out.println("Random number: " + randomVar);

        int tempVar = 0;

        // sorting by the principle "numbers less than or equal to random to the left, and numbers greater than random to the right"
        for (int i = 0, j = myList.size() - 1; i < myList.size(); i++) {
            if (i < j) {
                while (myList.get(i) > randomVar) {
                        tempVar = myList.set(j, myList.get(i));
                        j--;
                        myList.set(i, tempVar);
                        if (i == j) break;
                    }
                }
            }

        //sorting depends on random number: smaller numbers - to the left,
        // large ones - to the right,
        // random number separates them
        for (int i = 0, j = myList.size() - 1; i < myList.size(); i++) {
            if (myList.get(i) == randomVar) {
                if (i == j) break;
                if (myList.get(i) == myList.get(j)) {
                    j--;
                }
                while (myList.get(j) > myList.get(i)) {
                    j--;
                    if (i == j) break;
                    if (myList.get(i) == myList.get(j)) {
                        j--;
                    }
                }
                tempVar = myList.set(j, myList.get(i));
                myList.set(i, tempVar);
                if (i == j) break;
            }
        }

        System.out.println("List sorted by random number: \n" + myList);
    }
}