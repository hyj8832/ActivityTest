package com.example.admin.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
      EditText editName,editTel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butMain=(Button)findViewById(R.id.but_main);
        butMain.setOnClickListener(butMainHandler);//이벤트 감시자 설정
        editName=(EditText)findViewById(R.id.edit_name);
        editTel=(EditText)findViewById(R.id.edit_tel);
    }
    View.OnClickListener butMainHandler=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);//새로시작할 액티비티 인턴트 객체!
            //메인에서 세컨드를 실행시킨다는 것
            String name= editName.getText().toString();
            String tel= editTel.getText().toString();
            intent.putExtra("name",name);
            intent.putExtra("tel",tel);//이름,값
            startActivity(intent);

        }
    };//익명클래스는 ;를 끝에 붙인다.


}
