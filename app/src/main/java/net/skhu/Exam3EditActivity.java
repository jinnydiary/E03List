package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exam3EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam3_edit);

        Button button = (Button) findViewById(R.id.btnExam3);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.editExam3);
                String title = editText.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("title", title);
                setResult(RESULT_OK, intent);
                finish();

            }
        };
        button.setOnClickListener(listener);
    }
}
