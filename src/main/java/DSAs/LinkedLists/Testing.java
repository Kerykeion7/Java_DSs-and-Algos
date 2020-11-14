package DSAs.LinkedLists;

public class Testing {
    public static void main(String[] args){
        SinglyLinkedList<String> lst = new SinglyLinkedList<String>();
        
        System.out.println("IS EMPTY: " + lst.is_empty());
        System.out.println("FRONT: " + lst.get_front());
        System.out.println("BACK: " + lst.get_back());
        lst.push_front("e");
        System.out.println("IS EMPTY: " + lst.is_empty());
        lst.push_front("d");
        lst.push_front("c");
        lst.push_front("b");
        lst.push_front("a");
        System.out.println("SIZE ONE: " + lst.get_size());
        lst.push_back("f");
        lst.push_back("g");
        lst.push_back("h");
        System.out.println("SIZE TWO: " + lst.get_size());
        //lst.pop_front();
        //lst.pop_back();
        /*lst.pop_back();
        lst.pop_back();
        lst.pop_back();
        System.out.println("FRONT POPPED: " + lst.pop_front());
        System.out.println("BACK POPPED: " + lst.pop_back());*/
        /*System.out.println("GET AT FROM START 0: " + lst.get_at(0));
        System.out.println("GET AT FROM START 3: " + lst.get_at(3));
        System.out.println("GET AT FROM START 7: " + lst.get_at(7));
        System.out.println("GET AT FROM START -1: " + lst.get_at(-1));
        System.out.println("GET AT FROM END 0: " + lst.get_at_from_end(0));
        System.out.println("GET AT FROM END 3: " + lst.get_at_from_end(3));
        System.out.println("GET AT FROM END 7: " + lst.get_at_from_end(7));
        System.out.println("GET AT FROM END 8: " + lst.get_at_from_end(8));*/
        System.out.println("FIRST: " + lst.get_front());
        System.out.println("LAST: " + lst.get_back());
        lst.push_at("TEST ONE", 0);
        lst.push_at("TEST TWO", 3);
        lst.push_at("TEST THREE", 8);
        lst.push_at("TEST FOUR", 11);
        lst.push_at("TEST FIVE", 11);
        lst.remove("TEST FIVE");
        lst.remove("TEST FOUR");
        lst.remove("TEST THREE");
        lst.remove("TEST TWO");
        lst.remove("TEST ONE");
        /*lst.remove_at(11);
        lst.remove_at(11);
        lst.remove_at(8);
        lst.remove_at(3);
        lst.remove_at(0);*/
        lst.reverse();
        System.out.println("FIRST AFTER REVERSE: " + lst.get_front());
        System.out.println("LAST AFTER REVERSE: " + lst.get_back());
        lst.reverse();
        for(SinglyLinkedNode<String> node: lst){
            System.out.println("LOOP NODE VALUE: " + node.Value);
        }
        System.out.println("SIZE THREE: " + lst.get_size());
    }
}
