package abbyrhies.ronquillo.ronquilloabbyrhiespracticalexam2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText FNtext;
    EditText LNtext;
    EditText Exam1text;
    EditText Exam2text;
    Button Avebtn;
    TextView ResultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Exam1text = (EditText) findViewById(R.id.Exam1text);
        Exam2text = (EditText) findViewById(R.id.Exam2text);
        ResultText = (TextView) findViewById(R.id.ResultText);
        Avebtn = (Button) findViewById(R.id.Avebtn);

        Avebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = 0;
                float num2 = 0;
                float result = 0;

                if (TextUtils.isEmpty(Exam1text.getText().toString())
                        || TextUtils.isEmpty(Exam2text.getText().toString())) {
                    return;
                }

                num1 = Float.parseFloat(Exam1text.getText().toString());
                num2 = Float.parseFloat(Exam2text.getText().toString());

                switch (v.getId()) {
                    case R.id.Avebtn:
                        result = (num1 + num2) / 2;
                        break;
                        
                }

                ResultText.setText("Your average is " + result);
            }
        });
    }
}
