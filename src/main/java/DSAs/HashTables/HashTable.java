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
        _capacity = 10;
        KeyValuePair<K,V>[] pairs = new KeyValuePair[_capacity];
        _pairs = pairs;
        _count = 0;
        _linearProbeFactor = 1;
        _maxLoadFactor = 2.0F / 3.0F;
        _resizeTreshold = (int)Math.floor(_capacity * _maxLoadFactor);
    }

    public void add(K key, V value){
        KeyValuePair<K, V> pair = get(key);
        if(pair != null){
            pair.Value = value;
            return;
        }

        pair = new KeyValuePair<>(key, value);
        int hashed = hash(key);
        int index = hashed;

        int counter = 0;
        while(_pairs[index] != null){
            index = (hashed + probe(counter)) % _capacity;
            counter++;
        }

        _pairs[index] = pair;
        _count++;
        if(_count >= _resizeTreshold) resize();
    }

    public int hash(K key){
        return (key.hashCode() & 0x7FFFFFFF) % _capacity;
    }

    public KeyValuePair<K,V> getAt(int index){
        return _pairs[index];
    }

    public KeyValuePair<K,V> get(K key){
        int hashed = hash(key);
        KeyValuePair<K,V> pair = _pairs[hashed];
        if(pair == null) return null;

        int counter = 0;
        while(!pair.Key.equals(key)){
            int index = (hashed + probe(counter)) % _capacity;
            pair = _pairs[index];
            if(pair == null) return null;
            counter++;
        }

        return pair;
    }

    public V getValue(K key){
        KeyValuePair<K,V> pair = get(key);
        if(pair == null) return null;

        return pair.Value;
    }

    public boolean keyExists(K key){
        if(get(key) == null) return false;
        return true;
    }

    public void remove(K key){
        if(!keyExists(key)) return;
        _pairs[indexOf(key)] = null;
    }

    public int getSize(){
        return _capacity;
    }

    public int indexOf(K key){
        for(int i = 0; i < _capacity; i++){
            if(_pairs[i] != null)
                if(_pairs[i].Key.equals(key)){
                    return i;
                }
        }

        return -1;
    }

    private void resize(){
        _count = 0;
        _capacity *= 2;
        KeyValuePair<K, V>[] newPairs = new KeyValuePair[_capacity];
        KeyValuePair<K, V>[] oldPairs = _pairs;
        _pairs = newPairs;
        _resizeTreshold = (int)Math.floor(_capacity * _maxLoadFactor);
        for(KeyValuePair<K, V> p: oldPairs){
            if(p != null)
                add(p.Key, p.Value);
        }
    }

    private int probe(int factor){
        return _linearProbeFactor * factor;
    }
}
