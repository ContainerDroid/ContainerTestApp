package org.lineageosplus.containertest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import cyanogenmod.app.ContainerManager;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView text;
    private Integer times = 0;
    private ContainerManager containerManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        text = (TextView) findViewById(R.id.text);

        containerManager = ContainerManager.getInstance(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                times++;
                containerManager.sayHelloTo("Ioana for " + times + " times");
            }
        });

    }
}
