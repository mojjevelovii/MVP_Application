package ru.shumilova.mvp_application.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ru.shumilova.mvp_application.R;
import ru.shumilova.mvp_application.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainView {
    private EditText etTextInput;
    private Button btnAddText;
    private TextView tvTextOutput;

    MainPresenter mainPresenter = new MainPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initButton();
        mainPresenter.setMainView(this);
    }

    @Override
    public void showTextData(String text) {
        tvTextOutput.setText(text);
    }

    private void initView() {
        etTextInput = findViewById(R.id.et_textInput);
        btnAddText = findViewById(R.id.btn_addText);
        tvTextOutput = findViewById(R.id.tv_textOutput);
    }

    private void initButton() {
        btnAddText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = etTextInput.getText().toString();
                mainPresenter.updateTextData(text);
                etTextInput.setText("");
            }
        });
    }
}