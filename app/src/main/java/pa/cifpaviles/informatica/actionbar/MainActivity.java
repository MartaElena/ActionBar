package pa.cifpaviles.informatica.actionbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Le decimos al Activity que tiene un Toolbar asociado
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar (myToolbar);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_favorite:
                action("Suma");
                return true;
            case R.id.action_settings:
                action("Configuración");
                return true;
            case R.id.action_help:
                action("Ayuda");
                return true;
            case R.id.action_about:
                action("Acerca de");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void action(String  resid) {
        Toast.makeText(this, resid, Toast.LENGTH_SHORT).show();
    }



}