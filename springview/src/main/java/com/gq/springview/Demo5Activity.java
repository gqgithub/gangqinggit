package com.gq.springview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.liaoinstan.springview.container.AcFunFooter;
import com.liaoinstan.springview.container.AcFunHeader;
import com.liaoinstan.springview.widget.SpringView;

/**
 * 长颈鹿刷新
 */
public class Demo5Activity extends AppCompatActivity {
    private SpringView springView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo5);
        setTitle("长颈鹿刷新");

        springView = (SpringView) findViewById(R.id.springview);
        springView.setGive(SpringView.Give.NONE);
        springView.setType(SpringView.Type.OVERLAP);

        springView.setListener(new SpringView.OnFreshListener() {
            @Override
            public void onRefresh() {
            }

            @Override
            public void onLoadmore() {
            }
        });
        springView.setHeader(new AcFunHeader(this, R.drawable.acfun_header));
        springView.setFooter(new AcFunFooter(this, R.drawable.acfun_footer));
    }
}
