package mao.android_experiment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ViewFlipper;

public class MainActivity8 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        ViewFlipper viewFlipper = findViewById(R.id.ViewFlipper);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.startFlipping();
    }
}