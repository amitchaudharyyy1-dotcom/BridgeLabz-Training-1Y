import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 10, 30, 20, 40));
        list = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(list);
    }
}