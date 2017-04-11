package kr.hs.emirim.wkddbwls145.chasooyeon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String TAG= "차수연 : Main";
    private ImageView mImageViewFriendVisual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate 메소드 호출~");
        setContentView(R.layout.activity_main);
        mImageViewFriendVisual = (ImageView) findViewById(R.id.friend_Visual);
        Log.d(TAG, "activity_main 레이아웃 세팅~");
    }
    void onclick(View view){
        Log.d(TAG, "onClick 메소드 호출~");
        Log.d(TAG, "클릭된 뷰 id :" + view.getId());
        switch(view.getId() ){
            case R.id.button1:
                Log.d(TAG, "버튼1 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.photo1);
                Toast.makeText(this, "애들아 펜타곤 신곡 나왔어!! 들어~~", Toast.LENGTH_SHORT).show();break;
            case R.id.button2:
                Log.d(TAG, "버튼2 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.photo2);
                Toast.makeText(this, "애들아 블락비 신곡 나왔어!! 들어~~", Toast.LENGTH_SHORT).show();break;
            case R.id.button3:
                Log.d(TAG, "버튼3 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.photo3);
                Toast.makeText(this, "하..진호 너무 잘생겼어..(감탄)", Toast.LENGTH_SHORT).show();break;
            case R.id.button4:
                Log.d(TAG, "버튼4 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.photo4);
                Toast.makeText(this, "뭐가?", Toast.LENGTH_SHORT).show();break;
            case R.id.button5:
                Log.d(TAG, "버튼5 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.photo5);
                Toast.makeText(this, "(웃긴표정을 지으며 입을 살짝벌리며 나를 바라봄)", Toast.LENGTH_SHORT).show();break;
            default:
                Log.d(TAG, "모르는 녀석 클릭");
                Toast.makeText(this, "뭐라하는지 모르겠어용", Toast.LENGTH_SHORT).show();


        }
        Log.d(TAG, "onclick 메소드 무사히 종료");
//        if(view.getId() == R.id.button1)
//        Toast.makeText(this, "작동 해요!", Toast.LENGTH_SHORT).show();
    }
}
