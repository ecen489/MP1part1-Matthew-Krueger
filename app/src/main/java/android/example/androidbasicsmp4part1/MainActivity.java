package android.example.androidbasicsmp4part1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_click(View view) {
        TextView text_val = (TextView) findViewById(R.id.MyTextView);
        EditText edit_val = (EditText) findViewById(R.id.MyEditText);

        String holdString = edit_val.getText().toString();
        text_val.setText(holdString);

        edit_val.getText().clear();

        Toast.makeText(this, "Let's Toast!", Toast.LENGTH_SHORT).show();
    }
}
