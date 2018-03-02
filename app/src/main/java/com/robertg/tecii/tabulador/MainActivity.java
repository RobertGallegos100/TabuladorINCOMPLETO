package com.robertg.tecii.tabulador;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button boton1, boton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = (Button)findViewById(R.id.button1);
        boton2 = (Button)findViewById(R.id.button2);



    }

    @Override
    public void onClick(View view) {

        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction transaction = fragmentManager.beginTransaction();

        Fragment1 fragment = new Fragment1();
        transaction.add(R.id.Layoutprincipal, fragment);

        transaction.commit();

    }
}
