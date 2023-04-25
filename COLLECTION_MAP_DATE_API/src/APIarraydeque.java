import java.util.*;

public class APIarraydeque
{
    public static void main(String[] args)
    {
        ArrayDeque ad1 = new ArrayDeque();

        ad1.add("kj");
        ad1.add(8);
        System.out.println(ad1);
        ad1.add(6);
        ad1.add(6);
        ad1.addFirst(9);
        ad1.addLast(78);
        System.out.println(ad1);
        ad1.offer(500);
        ad1.offerFirst(1);
        ad1.offerLast(10);
        System.out.println(ad1);

    }


}

