package in.lavit.eventhandlingdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToastMessage(View view) {
        Toast.makeText(this,"Hello I am Clicked",Toast.LENGTH_LONG).show();
    }
}
