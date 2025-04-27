import java.util.Random;

public class MainForHashTable {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>();

        Random random = new Random();

        // 1000 elements
        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = MyTestingClass.randomInstance(random);
            String value = "Student" + i;
            table.put(key, value);
        }

        table.printChains();
    }
}

