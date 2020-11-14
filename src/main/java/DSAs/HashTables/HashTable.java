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
        KeyValuePair<K,V>[] pairs = new KeyValuePair[10];
        _pairs = pairs;
        _count = 0;
        _capacity = 10;
        _linearProbeFactor = 1;
        _maxLoadFactor = 2.0F / 3.0F;
        _resizeTreshold = (int)Math.floor(_capacity * _maxLoadFactor);
    }

    public void add(K key, V value){
        KeyValuePair<K, V> pair = new KeyValuePair<>(key, value);

        int hashed = hash(key);

        int counter = 0;
        while(_pairs[hashed] != null){
            hashed += probe(counter);
            counter++;
        }

        _pairs[hashed] = pair;
        _count++;
        if(_count >= _resizeTreshold) resize();
    }

    public int hash(K key){
        return (key.hashCode() & 0x7FFFFFFF) % _capacity;
    }

    public KeyValuePair<K,V> getAt(int index){
        return _pairs[index];
    }

    private void resize(){
        // Still to be implemented.
    }

    private int probe(int factor){
        return _linearProbeFactor * factor;
    }
}
