package com.sfwlibre.nahuatl_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayMessageActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
    }

    public void sendMessage(View view){
        String message = "";
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.resp_uno:
                if (checked)
                    Toast.makeText(this, R.string.mensaje, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, juego_3.class);
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
                break;
            case R.id.resp_dos:
                if (checked)
                    message = "nivel 1";
                Intent playTwo = new Intent(this, juego_dos.class);
                Toast.makeText(this, R.string.mensaje, Toast.LENGTH_SHORT).show();
                playTwo.putExtra(EXTRA_MESSAGE, message);
                startActivity(playTwo);
                break;
            case R.id.resp_tres:
                if(checked)

                Toast.makeText(this, R.string.mensaje, Toast.LENGTH_SHORT).show();
                break;
            default:
                System.out.println("No se encuentra la opción");
        }
    }
}
