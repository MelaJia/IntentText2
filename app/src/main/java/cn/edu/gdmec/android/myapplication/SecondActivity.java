package cn.edu.gdmec.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private Button btn;
    private EditText et_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn=findViewById(R.id.btn);
        et_content=findViewById(R.id.et_content);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content=null;
                content=et_content.getText().toString();
                Intent intent=new Intent();
                intent.putExtra("cc",content);
                setResult(RESULT_OK,intent);
                //一定要finish（）否则不跳转
                finish();


            }
        });
    }
}
