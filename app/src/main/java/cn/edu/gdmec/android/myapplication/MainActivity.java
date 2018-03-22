package cn.edu.gdmec.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView t_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t_content=findViewById(R.id.t_content);
        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        switch (requestCode){
//            case 1:
//                if (resultCode==RESULT_OK){
//                    String returnedData=data.getStringExtra("cc");
//                    t_content.setText(data.getStringExtra("cc"));
//                }
//                break;
//            default:
//        }
        t_content.setText("您输入的内容为："+data.getStringExtra("cc"));

    }
}
