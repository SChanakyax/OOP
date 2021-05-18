package objectPassing;

public class Squre {
	private int len;
	private int wid;
	
	public Squre(int len, int wid) {
		this.len = len;
		this.wid = wid;
	}
	
	public boolean compareWith(Squre obj) {
		
		if(this.len == obj.len && this.wid == obj.wid) {
			return true;
		}else
			return false;
	}
	
	public Squre(Squre newSqure) {
		this.len = newSqure.len;
		this.wid = newSqure.wid;
	}
	
}
