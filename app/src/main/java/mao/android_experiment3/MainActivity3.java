package mao.android_experiment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import mao.android_experiment3.adapter.ListViewAdapter;
import mao.android_experiment3.entity.ListViewInfo;

public class MainActivity3 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ListView listView = findViewById(R.id.ListView);

        List<ListViewInfo> list = new ArrayList<>(10);

        list.add(new ListViewInfo()
                .setTitle("electronic gadgets1")
                .setIcon(R.mipmap.ic_launcher_round)
                .setContent("electronic gadgets"));

        list.add(new ListViewInfo()
                .setTitle("electronic gadgets2")
                .setIcon(R.mipmap.ic_launcher_round)
                .setContent("electronic gadgets"));

        list.add(new ListViewInfo()
                .setTitle("electronic gadgets3")
                .setIcon(R.mipmap.ic_launcher_round)
                .setContent("electronic gadgets"));

        list.add(new ListViewInfo()
                .setTitle("electronic gadgets4")
                .setIcon(R.mipmap.ic_launcher_round)
                .setContent("electronic gadgets"));

        list.add(new ListViewInfo()
                .setTitle("electronic gadgets5")
                .setIcon(R.mipmap.ic_launcher_round)
                .setContent("electronic gadgets"));

        list.add(new ListViewInfo()
                .setTitle("electronic gadgets6")
                .setIcon(R.mipmap.ic_launcher_round)
                .setContent("electronic gadgets"));

        list.add(new ListViewInfo()
                .setTitle("electronic gadgets7")
                .setIcon(R.mipmap.ic_launcher_round)
                .setContent("electronic gadgets"));

        list.add(new ListViewInfo()
                .setTitle("electronic gadgets8")
                .setIcon(R.mipmap.ic_launcher_round)
                .setContent("electronic gadgets"));

        list.add(new ListViewInfo()
                .setTitle("electronic gadgets9")
                .setIcon(R.mipmap.ic_launcher_round)
                .setContent("electronic gadgets"));

        list.add(new ListViewInfo()
                .setTitle("electronic gadgets10")
                .setIcon(R.mipmap.ic_launcher_round)
                .setContent("electronic gadgets"));

        ListViewAdapter listViewAdapter = new ListViewAdapter(this, list);

        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                toastShow("201913030234: I like " + list.get(position).getTitle());
            }
        });
    }

    /**
     * 显示消息
     *
     * @param message 消息
     */
    private void toastShow(String message)
    {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}