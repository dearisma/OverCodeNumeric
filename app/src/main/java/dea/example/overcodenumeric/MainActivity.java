package dea.example.overcodenumeric;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.startapp.android.publish.adsCommon.StartAppSDK;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ad from StartApp
        StartAppSDK.init(this, "203392459", true);
    }
}
