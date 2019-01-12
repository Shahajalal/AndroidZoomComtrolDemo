package com.example.shahajalalsamrat.zoomcontroldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ZoomControls zoomControls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageviewid);
        zoomControls=findViewById(R.id.zoomcontrolid);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Zoom in",Toast.LENGTH_SHORT).show();
                float x=imageView.getScaleX();
                float y=imageView.getScaleY();

                imageView.setScaleX((float) x+1);
                imageView.setScaleY((float) y+1);
            }
        });

        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Zoom out",Toast.LENGTH_SHORT).show();
                float x=imageView.getScaleX();
                float y=imageView.getScaleY();

                if(x>1&&y>1) {
                    imageView.setScaleX((float) x - 1);
                    imageView.setScaleY((float) y - 1);
                }
            }
        });
    }
}
