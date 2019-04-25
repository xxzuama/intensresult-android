package com.example.intensresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final int RC_EDIT_NAME=12;
    @BindView(R.id.text_view_result)
    TextView textViewResult;
    @BindView(R.id.btn_edit)
    Button btnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_edit)
    public void onViewClicked(){
        Intent intent = new Intent(MainActivity.this, EditNameActivity.class);
        startActivityForResult(intent, RC_EDIT_NAME);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if (requestCode == RC_EDIT_NAME&&resultCode == RESULT_OK){
            String name = data.getExtras().getString(EditNameActivity.EXTRA_NAME);
            textViewResult.setText(name);
        }
    }
}
