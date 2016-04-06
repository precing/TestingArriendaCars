import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;

public class calculadoraTest {
	private Calculadora calculadora;
	
	@Before 
	public void setup() throws Exception{
		 calculadora =new Calculadora();
		 System.out.println("hola");
	}
 @Test
 public void sumaDosMasTresEsCinco(){
	 /*arrange*/
	  //calculadora =new Calculadora();
	 
	 /*act*/
	 int resultado=calculadora.suma(2,3);
	 
	 /*assert*/
	 assertThat(resultado,is(5));
	 
 }
 
 @Test
 public void restaCuatroMenosTresUno(){
	 /*arrange*/
	  //calculadora =new Calculadora();
	 
	 /*act*/
	 int resultado=calculadora.resta(4,3);
	 
	 /*assert*/
	 assertThat(resultado,is(1));
	 
 }
 
}
