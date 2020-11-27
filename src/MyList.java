import java.util.ArrayList;

public class MyList<T extends Number> {
    private ArrayList<T> listOfNum;

    public ArrayList<T> getList() {
        return listOfNum;
    }

    MyList(ArrayList<T> listOfNum) {
        this.listOfNum = listOfNum;
    }


    public void add(T par) {
        getList().add(par);
    }

    public T largestNum() {
        T max = getList().get(0);
        for (T res : getList()) {
            if (max.doubleValue() < res.doubleValue()) {
                max = res;
            }
        }
        return max;
    }

    public T smallestNum() {
        T min = getList().get(0);
        for (T result : getList()) {
            if (min.doubleValue() > result.doubleValue()) {
                min = result;
            }
        }
        return min;
    }
}

