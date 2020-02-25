package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	T[] al;

	public ArrayList() {
		al = (T[]) (new Object[0]);
	}

	public T get(int loc) throws IndexOutOfBoundsException {
		return al[loc];
	}

	public void add(T val) {
		T[] arrlist = (T[]) (new Object[al.length + 1]);

		for (int i = 0; i < al.length; i++) {
			arrlist[i] = al[i];
		}
		arrlist[arrlist.length - 1] = val;
		al = arrlist;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] arrlist = (T[]) (new Object[al.length + 1]);
		for (int i = 0; i < loc; i++) {
			arrlist[i] = al[i];
		}
		arrlist[loc] = val;
		arrlist[loc + 1] = al[loc];
		for (int i = loc + 1; i < arrlist.length; i++) {
			if (i != arrlist.length - 1) {
				arrlist[i + 1] = al[i];
			}
		}

		al = arrlist;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		al[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] arrlist = (T[]) (new Object[al.length - 1]);

		for (int i = 0; i < loc; i++) {
			arrlist[i] = al[i];
		}
		for (int i = loc + 1; i < al.length; i++) {
			if (i != 0) {
				arrlist[i - 1] = al[i];
			}
		}
	
	al = arrlist;
	}

	public boolean contains(T val) {
		for (int i = 0; i < al.length; i++) {
			if (al[i] == val) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		
		return al.length;
	}
}