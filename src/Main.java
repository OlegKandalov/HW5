import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> intNum = new MyList<>(new ArrayList<>());
        intNum.add(12);
        intNum.add(345);
        intNum.add(-23);
        int min = intNum.smallestNum();
        int max = intNum.largestNum();
        System.out.println(min);
        System.out.println(max);

        MyList<Double> doubleNum = new MyList<>(new ArrayList<>());
        doubleNum.add(2.4);
        doubleNum.add(3.5);
        doubleNum.add(10.3);
        double miniDouble = doubleNum.smallestNum();
        double maxiDouble = doubleNum.largestNum();
        System.out.println(miniDouble);
        System.out.println(maxiDouble);
    }
}
