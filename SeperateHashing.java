import Components.LinkedList;

public class SeperateHashing<T extends Comparable<T>> {
	int m;
	LinkedList<T>[] table;

	public SeperateHashing(int n) {
		this.m = n / 5;
		this.table = new LinkedList[m];
		for (int i = 0; i < m; i++) {
			table[i] = new LinkedList<>();
		}
	}

	public void insert(T data) {
		// find the index using the hash function
		// int index = hashCode() % m;
		int index = data.hashCode() % m;
		// if we took the modulo with respect to another number also we will get the
		// data be condensed in one place, so the mapping properties are important
		table[index].insertFirst(data); //unsorted addition, assuming they all have the same key?
	}

	public T search(T data) {
		int index = data.hashCode() % m;
		return table[index].search(data);
	}
	public T delete(T data) {
		int index = data.hashCode() % m;
		return table[index].delete(data);
	}

	public String toString() {
		String str = "index"+" "+ "data"+"\n";
		for (int i = 0; i < m; i++) {
			str += i + " " + table[i].toString() + "\n";
		}
		return str;
	}

}
