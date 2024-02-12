
public class HashNode2 <T extends Comparable<T>>{
	private T data;
	private char flag ='E';
	final char D ='D';
	final char E ='E';
	final char F ='F';
	
	public HashNode2(T data) {
		this.data = data;
		flag = 'F';
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public char getFlag() {
		return flag;
	}

	public void setFlag(char flag) {
		this.flag = flag;
	}
	
	public boolean isEmpty() {
		if(flag=='E' || flag=='D') {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "data";
	}

}











