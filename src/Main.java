import com.jjh.hashtables.HashTable;


public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.put(6, "Jenny");
        hashTable.put(8, "Clide");
        hashTable.put(11, "Bony");
        hashTable.put(6, "Jinha");
        hashTable.remove(6);
        System.out.println(hashTable.get(6));
    }
}