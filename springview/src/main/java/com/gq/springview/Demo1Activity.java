package com.gq.springview;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.liaoinstan.springview.container.DefaultFooter;
import com.liaoinstan.springview.container.DefaultHeader;
import com.liaoinstan.springview.widget.SpringView;

/**
 * 默认情况
 */
public class Demo1Activity extends AppCompatActivity{

    private SpringView springView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo1);
        setTitle("默认刷新动画");

        springView = (SpringView) findViewById(R.id.springview);
        springView.setType(SpringView.Type.OVERLAP);


        springView.setListener(new SpringView.OnFreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        springView.onFinishFreshAndLoad();
                    }
                }, 1000);
            }

            @Override
            public void onLoadmore() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        springView.onFinishFreshAndLoad();
                    }
                }, 1000);
            }
        });
        springView.setHeader(new DefaultHeader(this));
        springView.setFooter(new DefaultFooter(this));
    }
}
