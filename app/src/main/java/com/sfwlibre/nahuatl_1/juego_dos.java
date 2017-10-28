package com.sfwlibre.nahuatl_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class juego_dos extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_dos);
    }

    public void sendMessage(View view){
        String message = "";
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.nivel_1:
                if (checked)
                Toast.makeText(this, R.string.mensaje, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, juego_3.class);
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
                break;
            case R.id.nivel_2:
                if (checked)
                    message = "nivel 1";
                Intent playTwo = new Intent(this, juego_dos.class);
                playTwo.putExtra(EXTRA_MESSAGE, message);
                startActivity(playTwo);
                break;
            case R.id.nivel_3:
                if(checked)

                break;
            default:
                System.out.println("No se encuentra la opción");
        }
    }
}
