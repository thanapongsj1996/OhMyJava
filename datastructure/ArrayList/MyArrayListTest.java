package datastructure.ArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList l = new MyArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        for (int i = 0; i < 10; i++) {
            l.add((int)(Math.random()*100));
        }

        System.out.println(l);
        System.out.println(l.get(3));
        l.set(99, 2);
        System.out.println(l);


        MyArrayListOfT lt = new MyArrayListOfT<String>();
        lt.add("boy");
        System.out.println(lt.get(0));

        MyArrayListOfT lt2 = new MyArrayListOfT<Integer>();
        lt2.add(11);
        lt2.add(12);
        lt2.add(13);
        System.out.println(lt2.get(1));
        lt2.removeAt(1);
        System.out.println(lt2.get(1));
    }
}
