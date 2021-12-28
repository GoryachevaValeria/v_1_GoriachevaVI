package com.example.goryacheva_v_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class foto extends AppCompatActivity implements OnClickListener {
    ImageView btnMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto);
        btnMap = (ImageView) findViewById(R.id.imageView14);
        btnMap.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        Intent intent;
        intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:55.0372437,82.9159798"));
        startActivity(intent);

    }
}