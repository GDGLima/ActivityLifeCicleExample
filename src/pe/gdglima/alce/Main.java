package pe.gdglima.alce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
    /** Called when the activity is first created. */
	
	private Button btnHola;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.i("Mensaje", "1.- Paso por onCreate() ");
        btnHola = (Button)findViewById(R.id.btnHola);
            
        btnHola.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			     
				Intent i = new Intent(Main.this, SegundoActivity.class);
				startActivity(i);
			}
		});
    }
    
    @Override
    protected void onResume() {
    	super.onResume();
    	Log.i("Mensaje", "3.- Paso por onResume() ");
    }
    
    
}