package cn.edu.jnu.x2020101350;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button button=this.findViewById(R.id.button);
        EditText textView=this.findViewById(R.id.textView);
        TextView textView1=this.findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textView.getText().toString();
                String[] split = s.split(",");
                Game g=new Game();
                for (int i = 0; i < split.length; i++) {
                    g.roll(Integer.parseInt(split[i]));
                }
                textView1.setText(""+g.score());

            }
        });
    }
}