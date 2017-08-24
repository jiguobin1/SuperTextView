package jiguobin.example.com.supertextview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.allen.library.SuperTextView;

public class MainActivity extends AppCompatActivity {
    String string;

    private SuperTextView superTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        superTextView = (SuperTextView) findViewById(R.id.superTextView);
        superTextView.setOnSuperTextViewClickListener(new SuperTextView.OnSuperTextViewClickListener() {
            @Override
            public void onClickListener(SuperTextView superTextView) {
                Toast.makeText(MainActivity.this, "整个item的点击事件", Toast.LENGTH_SHORT).show();
            }
        });
        superTextView.setLeftTopTvClickListener(new SuperTextView.OnLeftTopTvClickListener() {
            @Override
            public void onClickListener() {
                Toast.makeText(MainActivity.this, "左侧顶部TextView的点击事件", Toast.LENGTH_SHORT).show();
            }
        });
        superTextView.setLeftTvClickListener(new SuperTextView.OnLeftTvClickListener() {
            @Override
            public void onClickListener() {
                Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
            }
        });
        superTextView.setLeftBottomTvClickListener(new SuperTextView.OnLeftBottomTvClickListener() {
            @Override
            public void onClickListener() {
                Toast.makeText(MainActivity.this, "左侧底部TextView的点击事件", Toast.LENGTH_SHORT).show();
            }
        });
        superTextView.setCenterTopTvClickListener(new SuperTextView.OnCenterTopTvClickListener() {
            @Override
            public void onClickListener() {
                Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
            }
        });
        superTextView .setCenterTvClickListener(new SuperTextView.OnCenterTvClickListener() {
            @Override
            public void onClickListener() {
                Toast.makeText(MainActivity.this, "4", Toast.LENGTH_SHORT).show();
            }
        });
        superTextView.setCenterBottomTvClickListener(new SuperTextView.OnCenterBottomTvClickListener() {
            @Override
            public void onClickListener() {
                Toast.makeText(MainActivity.this, "底部居中TextView点击事件", Toast.LENGTH_SHORT).show();
            }
        });
        superTextView.setRightTopTvClickListener(new SuperTextView.OnRightTopTvClickListener() {
            @Override
            public void onClickListener() {
                Toast.makeText(MainActivity.this, "6", Toast.LENGTH_SHORT).show();
            }
        });
        superTextView.setRightTvClickListener(new SuperTextView.OnRightTvClickListener() {
            @Override
            public void onClickListener() {
                Toast.makeText(MainActivity.this, "7", Toast.LENGTH_SHORT).show();
            }
        });
        superTextView.setRightBottomTvClickListener(new SuperTextView.OnRightBottomTvClickListener() {
            @Override
            public void onClickListener() {
                Toast.makeText(MainActivity.this, "8", Toast.LENGTH_SHORT).show();
            }
        });
        superTextView.setLeftImageViewClickListener(new SuperTextView.OnLeftImageViewClickListener(){

            @Override
            public void onClickListener(ImageView imageView) {
                Toast.makeText(MainActivity.this, "左侧图标的点击事件", Toast.LENGTH_SHORT).show();
            }
        });
        superTextView.setRightImageViewClickListener(new SuperTextView.OnRightImageViewClickListener() {

            @Override
            public void onClickListener(ImageView imageView) {
                Toast.makeText(MainActivity.this, "右边图片", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
