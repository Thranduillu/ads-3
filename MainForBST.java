public class MainForBST {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();

        // Вставляем элементы
        bst.put(5, "Five");
        bst.put(2, "Two");
        bst.put(8, "Eight");
        bst.put(1, "One");
        bst.put(3, "Three");

        System.out.println("Size after insertion: " + bst.size());

        // Получаем элемент
        System.out.println("Get key 2: " + bst.get(2));

        // Удаляем элемент
        bst.delete(2);

        System.out.println("Size after deletion: " + bst.size());
        System.out.println("Get key 2 after deletion: " + bst.get(2));

        System.out.println("\nBST in-order traversal:");
        for (BST.Entry<Integer, String> entry : bst) {
            System.out.println(entry.key + " => " + entry.value);
        }
    }
}
