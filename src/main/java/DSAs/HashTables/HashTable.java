package DSAs.HashTables;

@SuppressWarnings("unchecked")
public class HashTable<K, V> {
    private KeyValuePair<K, V>[] _pairs;
    private int _count;
    private int _capacity;
    private int _linearProbeFactor;
    private float _maxLoadFactor;
    private int _resizeTreshold;


    public HashTable(){
        KeyValuePair<K,V>[] pairs = (KeyValuePair<K,V>[])new Object[10];
        _pairs = pairs;
        _count = 0;
        _capacity = 10;
        _linearProbeFactor = 1;
        _maxLoadFactor = 2.0F / 3.0F;
        _resizeTreshold = (int)Math.floor(_capacity * _maxLoadFactor);
    }
}
