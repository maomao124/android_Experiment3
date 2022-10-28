package mao.android_experiment3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;

public class MainActivity7 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        Button button = findViewById(R.id.Button_);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                View view = LayoutInflater.from(MainActivity7.this).inflate(R.layout.item_popup, null);
                PopupWindow popupWindow = new PopupWindow(view,
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
                popupWindow.setBackgroundDrawable(new ColorDrawable(0x44000000));
                popupWindow.setFocusable(true);
                popupWindow.setTouchable(true);
                popupWindow.setTouchInterceptor(new View.OnTouchListener()
                {
                    @Override
                    public boolean onTouch(View v, MotionEvent event)
                    {
                        // 这里如果返回true的话，touch事件将被拦截
                        // 拦截后 PopupWindow的onTouchEvent不被调用，这样点击外部区域无法dismiss
                        return false;
                    }
                });
                popupWindow.showAsDropDown(button, 0, 30);
            }
        });

    }
}