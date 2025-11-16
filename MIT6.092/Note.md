# MIT6092

Course: Other
Created Date: 7 November 2025

```java
	import java.util.ArrayList;
	import java.util.TreeSet;
	import java.util.HashSet;
	import java.util.Map;
	import java.util.TreeMap;
	import java.util.HashMap;
	
	class Test {
		Class[] ArrayName = new Class[itemIndex];
		
		ArrayList<Class> ArrayListName = new ArrayList<Class>();
		ArrayListName.add(itemName);
		ArrayListName.size();
		ArrayListName.get(itemIndex);
		ArrayListName.set(itemIndex, itemName);
		ArrayListName.remove(itemIndex);
		for (String s : ArrayName) {
			// s = itemName
		}
		
		// No array index
		// From lowest to highest
		TreeSet<Class> TreeSetName = new TreeSet<Class>();
		TreeSetName.add(itemName);
		TreeSetName.size();
		TreeSetName.first();
		TreeSetName.last();
		TreeSetName.remove(itemName);
		for (String s : TreeSetName) {
			// s = itemName
		}
		
		// No array index
		// Pseudo-random
		HashSet<Class> HashSetName = new HashSet<Class>();
		
		TreeMap<Class, Class> TreeMapName = new TreeMap<Class, Class>();
		TreeMapName.put(key, value);
		TreeMapName.size();
		TreeMapName.remove(key);
		TreeMapName.get(key); // return the value
		for (String s : TreeMapName.keySet()) {
			// s = key
		}
		for (String s : TreeMapName.values()) {
			// s = value
		}
		for (Map.Entry<Class, Class> pairs : TreeMapName.entrySet()) {
			// pairs: "key" → "value"
			System.out.println(pairs); // output: key=value
			Class key = pairs.getKey(); // key = key in pairs
			Class value = pairs.getValue(); // value = value in pairs
		}
		
		HashMap<Class, Class> HashMapName = new HashMap<Class, Class>();
	}
```

```java
assert num >= 0;
// if num >= 0, the program will continue.
```

```java
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public static void main(String[] args) throws IOException {
	FileReader reader = new reader(String fileName);
	BufferedReader line = new BufferedReader(reader);
	
	line.readLine();
}
```