package br.com.kleinkauf.semacademicacalc.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.Button;
import android.widget.EditText;
import br.com.kleinkauf.semacademicacalc.CalcActivity;
import br.com.kleinkauf.semacademicacalc.R;

public class CalcActivityTest extends ActivityInstrumentationTestCase2<CalcActivity> {

	private CalcActivity calc;
	private EditText txt1;
	private EditText txt2;
	private Button btnSoma;

	public CalcActivityTest() {
//		super( "br.com.kleinkauf.semacademicacalc", CalcActivity.class );
		super( CalcActivity.class );
	}

	@Override
	protected void setUp() throws Exception {
		calc = this.getActivity();
		txt1 = (EditText) calc.findViewById( R.id.txt1 );
		txt2 = (EditText) calc.findViewById( R.id.txt2 );
		btnSoma = (Button) calc.findViewById( R.id.btnSoma );
	}

	
	@UiThreadTest
	public void testAplicacao() {
		assertNotNull( calc );
		assertNotNull( txt1 ); 
		assertNotNull( txt2 );
		assertNotNull( btnSoma );
		
		txt1.setText( "5" );
		txt2.setText( "11" );
		assertEquals( 16D, calc.calculaSoma( txt1, txt2 ), 16D );
	}

	/*
 	fail(String)	
 						Deixe o método falhar. Pode ser usado para verificar se uma determinada parte do código 
 						não é atingido. Ou ter um teste de falha antes do código de teste é implementado.
	
	assertTrue([message], boolean condition)	 
						Verifica se a condição booleana é verdadeira.
	
	assertsEquals([String message], expected, actual)	 
						Testes que dois valores são iguais.
	
	assertsEquals([String message], expected, actual, tolerance)	 
						Teste que valores float ou double corresponder. A tolerância é o número de decimais 
						que devem ser o mesmo.
	
	assertNull([message], object)	
						Verifica se o objeto é nulo.
	
	assertNotNull([message], object)	 
						Verifica se o objeto não é nulo.
	
	assertSame([String], expected, actual)	 
						Verifica se as duas variáveis ​​se referem ao mesmo objeto.
	
	assertNotSame([String], expected, actual)
						Verifica se as duas variáveis ​​se referem a objetos diferentes.
	 
	*/
}