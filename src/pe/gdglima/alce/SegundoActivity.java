package pe.gdglima.alce;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SegundoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);
	    Log.i("Mensaje", "2.- Paso por onCreate() 2 !! ");
	}
	
	
	
	
	
}
