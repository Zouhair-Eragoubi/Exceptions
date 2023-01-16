
public class EntierNaturel {
	
	private int val;
	

	public EntierNaturel(int val) throws NombreNegatifException {
		if(val<0) throw new NombreNegatifException("Nombre doit etre positive");
		this.val = val;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	
	public void decrementer() throws NombreNegatifException {
		int val = --this.val;
		if(val < 0) throw new NombreNegatifException("Nombre doit etre positive");
		this.val = val;
	}
	
	

}
