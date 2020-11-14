package DSAs.Vectors;

public class Vector {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray(2);
        arr.push(1);
        arr.push(1);
        arr.push(2);
        arr.push(3);
        arr.push(100);
        arr.push(5000);
        arr.push(4);
        arr.push(5);
        arr.push(1);
        arr.push(6);
        arr.push(1);
        arr.prepend(0);
        arr.removeAt(5);
        arr.removeAt(5);
        arr.remove(1);
        arr.pop();
        arr.pop();

        int counter = 0;
        for(Object item: arr){
            System.out.println("Array[" + counter + "]: " + item);
            counter++;
        }

        System.out.println("Count: " + arr.Count);
        System.out.println("Length: " + arr.length());
        System.out.println("Capacity: " + arr.capacity());
    }
}
