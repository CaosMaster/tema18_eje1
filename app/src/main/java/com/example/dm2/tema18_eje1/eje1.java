package com.example.dm2.tema18_eje1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class eje1 extends AppCompatActivity {

    private Spinner spinner;
    private TextView txtinformacion;
    private String opcionseleccionada="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eje1);

        spinner=(Spinner) findViewById(R.id.btnspiner);
        txtinformacion=(TextView) findViewById(R.id.txtinfo);


        final String[] paises= new String[]{"España","Francia","Venezuela","Alemania","Japon"};

        final ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,paises);

        adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adaptador);

                spinner.setOnItemSelectedListener(
                   new AdapterView.OnItemSelectedListener() {
                       public void onItemSelected(AdapterView<?> AdapterView, View view, int i, long j) {
                           opcionseleccionada = adaptador.getItem(i).toString();

                           if (opcionseleccionada.equals("España")){
                                txtinformacion.setText("superficie : 505.990 km²"+"\n numero del habitantes: 46,56 millones ");
                           }

                           if (opcionseleccionada.equals("Francia")){
                               txtinformacion.setText("superficie : 643.801 km²"+"\n numero del habitantes: 66,9 millones ");
                           }

                           if (opcionseleccionada.equals("Venezuela")){
                               txtinformacion.setText("superficie : 916.445 km²"+"\n numero del habitantes: 31,57 millones  ");
                           }

                           if (opcionseleccionada.equals("Alemania")){
                               txtinformacion.setText("superficie : 357.376 km²"+"\n numero del habitantes: 82,67 millones  ");
                           }

                           if (opcionseleccionada.equals("Japon")){
                               txtinformacion.setText("superficie : 377.962 km²"+"\n numero del habitantes: 127 millones ");
                           }
                       }

                       public void onNothingSelected(AdapterView<?> AdaterView) {

                       }
                   }

        );
    }

}
