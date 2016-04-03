package teste;

public class Testando {
	
	 public boolean validaNome(){
	        String email = "adson@teste.com.";

	        boolean re = email.matches(".+@.+\\.\\w{3}|.+@.+\\.\\w{3}\\.\\w{2}");//compara e retorna um bolleano

	            if (re == false) {
	                return false;
	            } else {
	                return true;
	            }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Testando test = new Testando();
		
		System.out.println(test.validaNome());
		
	}

}
