package kr.hs.emirim.wkddbwls145.chasooyeon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void onclick(View view){
        switch(view.getId() ){
            case R.id.button1:
                Toast.makeText(this, "애들아 펜타곤 신곡 나왔어!! 들어~~", Toast.LENGTH_SHORT).show();break;
            case R.id.button2:
                Toast.makeText(this, "애들아 블락비 신곡 나왔어!! 들어~~", Toast.LENGTH_SHORT).show();break;
            case R.id.button3:
                Toast.makeText(this, "하..진호 너무 잘생겼어..(감탄)", Toast.LENGTH_SHORT).show();break;
            case R.id.button4:
                Toast.makeText(this, "뭐가?", Toast.LENGTH_SHORT).show();break;
            case R.id.button5:
                Toast.makeText(this, "(웃긴표정을 지으며 입을 살짝벌리며 나를 바라봄)", Toast.LENGTH_SHORT).show();break;
            default:
                Toast.makeText(this, "뭐라하는지 모르겠어용", Toast.LENGTH_SHORT).show();


        }
//        if(view.getId() == R.id.button1)
//        Toast.makeText(this, "작동 해요!", Toast.LENGTH_SHORT).show();
    }
}
