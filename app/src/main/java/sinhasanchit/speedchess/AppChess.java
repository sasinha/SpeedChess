package sinhasanchit.speedchess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AppChess extends AppCompatActivity {

    TextView showWhiteTimer = (TextView) findViewById(R.id.textView);


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChessTimer whiteTimer = new ChessTimer();
        whiteTimer.setTime = 3000;
        whiteTimer.start();
        showWhiteTimer.setText("yes");


    }
}
