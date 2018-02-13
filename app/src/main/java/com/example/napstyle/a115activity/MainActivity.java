package com.example.napstyle.a115activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ListView list;
    private ArrayList<String> metodos;
    private ArrayAdapter<String> adap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        metodos = new ArrayList<>();
        metodos.add("onCreate()\nSe llama en la creación de la actividad. Se utiliza para " +
                "realizar todo tipo de inicializaciones, como la creación de la interfaz de " +
                "usuario o la inicialización de estructuras de datos. Puede recibir información " +
                "de estado dela actividad (en una instancia de la clase Bundle), por si se " +
                "reanuda desde una actividad que ha sido destruida y vuelta a crear.\n");
        metodos.add("onStart()\nNos indica que la actividad está a punto de ser mostrada al usuario.\n");
        metodos.add("onResume()\nSe llama cuando la actividad va a comenzar a interactuar con el " +
                "usuario. Es un buen lugar para lanzar las animaciones y la música.\n");
        metodos.add("onPause()\nIndica que la actividad está a punto de ser lanzada a segundo " +
                "plano, normalmente porque otra actividad es lanzada. Es el lugar adecuado para " +
                "detener animaciones, música o almacenar los datos que estaban en edición.\n");
        metodos.add("onStop()\nLa actividad ya no va a ser visible para el usuario. Ojo si hay " +
                "muy poca memoria, es posible que la actividad se destruya sin llamar a este método.\n");
        metodos.add("onRestart()\nIndica que la actividad va a volver a ser representada después " +
                "de haber pasado por onStop().\n");
        metodos.add("onDestroy()\nSe llama antes de que la actividad sea totalmente destruida.\n");

        adap = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,metodos);

        list = (ListView)findViewById(R.id.lista);
        list.setAdapter(adap);

    }
}
