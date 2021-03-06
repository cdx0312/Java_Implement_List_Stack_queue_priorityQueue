/**
 * Created by cdxu0 on 2017/7/6.
 */
public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("American");
        System.out.println("(1) " + list);

        list.add(0,"Canada");
        System.out.println("(2) " + list);

        list.add("Russia");
        System.out.println("(3) " + list);

        list.add("France");
        System.out.println("(4) " + list);

        list.add(2,"Germany");
        System.out.println("(5) " + list);

        list.add(5,"Norway");
        System.out.println("(6) " + list);

        list.remove("Canada");
        System.out.println("(7) " + list);

        list.remove(2);
        System.out.println("(8) " + list);

        list.remove(list.size() - 1);
        System.out.print("(9) " + list + "\n(10) ");

        for (String s : list) {
            System.out.print(s.toUpperCase() + " ");
        }
    }
}
