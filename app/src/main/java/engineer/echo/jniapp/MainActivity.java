package engineer.echo.jniapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import engineer.echo.jnilib.Echo;

public class MainActivity extends AppCompatActivity {

    private TextView tvCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvCode = findViewById(R.id.tv_version_app);
        tvCode.setText(String.valueOf(Echo.vercode()));
    }
}
