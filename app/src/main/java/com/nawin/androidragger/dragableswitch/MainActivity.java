package com.nawin.androidragger.dragableswitch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.nawin.androidragger.switchlibrary.DraggableSwitch;

public class MainActivity extends AppCompatActivity {
    DraggableSwitch draggableSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        draggableSwitch = (DraggableSwitch) findViewById(R.id.draggableSwitch);
//        draggableSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                    if (isChecked){
//                        Toast.makeText(MainActivity.this, "dekheo ta yar", Toast.LENGTH_LONG).show();
//                    }else {
//                        Toast.makeText(MainActivity.this, "dekhena ta yar", Toast.LENGTH_LONG).show();
//
//                    }
//            }
//        });

    }

}
