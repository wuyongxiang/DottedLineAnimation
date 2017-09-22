package com.xiangzi.dottedlineanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

public class ByNaiveActivity extends AppCompatActivity {

    private RelativeLayout rel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_by_naive);
        rel = (RelativeLayout) findViewById(R.id.rel);
        DLAnimView dlAnimView = new DLAnimView(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(  RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        rel.addView(dlAnimView,layoutParams);
    }
}
