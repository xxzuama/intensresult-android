package com.example.intensresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EditNameActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "EXTRA_NAME";
    @BindView(R.id.editText2)
    EditText editText2;
    @BindView(R.id.btn_save)
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_name);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_save)
    public void onViewClicked() {
        String name = editText2.getText().toString();
        Intent intent = new Intent();
        intent.putExtra(EXTRA_NAME, name);
        setResult(RESULT_OK, intent);
        finish();
    }
}
