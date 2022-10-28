package mao.android_experiment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity6 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        String strings[] =
                {
                        "subjects1",
                        "subjects2",
                        "subjects3",
                        "subjects4",
                        "subjects5",
                        "subjects6",
                        "subjects7",
                        "subjects8",
                        "subjects9",
                        "subjects10",
                };

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.AutoCompleteTextView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1
                , strings);

        autoCompleteTextView.setAdapter(arrayAdapter);
    }

}