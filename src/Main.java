
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try {
			EntierNaturel e1 = new EntierNaturel(0);
			e1.decrementer();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}*/
		
		
		try {
			EntierNaturel e1 = new EntierNaturel(0);
			e1.decrementer();
		} catch (NombreNegatifException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

	}

}
