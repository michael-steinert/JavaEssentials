import java.util.LinkedList;
import java.util.List;

public class PrimitivesAndTheirObjects {
    public static void main(String[] args) {
        Integer number = 1;

        List<Integer> integerList = new LinkedList<>();
        integerList.add(number);

        System.out.println(integerList);
    }
}
