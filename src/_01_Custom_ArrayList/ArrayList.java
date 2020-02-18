package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] al;
	public ArrayList() {
		al = (T[])(new Object[0]);
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return al[loc];
	}
	
	public void add(T val) {
		T[] arrlist = (T[])(new Object[al.length + 1]);
		for(int i = 0; i < al.length; i++) {
			arrlist[i] = al[i];
		}
		arrlist[arrlist.length - 1] = val;
		al = arrlist;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] arrlist = (T[])(new Object[al.length + 1]);
		for(int i = 0; i < loc; i++) {
			arrlist[i] = al[i];
		}
		for(int i = al.length - 1; i > loc; i--) {
			arrlist[i+1] = al[i];
			System.out.println(arrlist[i+1]);
		}
		arrlist[loc] = val;
		al = arrlist;
		for(int i = 0; i < al.length; i++) {
			System.out.println(al[i]);
		}
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		al[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}