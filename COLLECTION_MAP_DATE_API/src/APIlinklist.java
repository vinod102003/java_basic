import java.util.*;

public class APIlinklist {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(100);
        ll.add(200);
        ll.add(300);
        System.out.println(ll);
        LinkedList ll2 = new LinkedList();
        ll2.add("pw skill");
        ll2.add(45);
        ll2.add('e');
        ll2.add(0.78);
        System.out.println(ll2);

        LinkedList ll3 = new LinkedList();
        ll3.add(10);
        ll3.add(1870);
        ll3.add(106);
        ll3.add(150);
        ll3.add(150);
        ll3.addFirst("pw ");
        ll3.addLast("java");
        System.out.println(ll3);
        ll3.add(2,"kl");
        System.out.println(ll3);
        System.out.println(ll3.peek());
        System.out.println(ll3);
        System.out.println(ll3.poll());
        System.out.println(ll3);
        System.out.println(ll3.get(2));
        System.out.println(ll3.indexOf("kl"));
        System.out.println(ll3.getFirst());
        System.out.println(ll3.getLast());
        System.out.println(ll3.indexOf(150));
        System.out.println(ll3.lastIndexOf(150));

    }
}
