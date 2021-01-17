package senanayake.udayanga.com.section4_basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {

        int id = view.getId();
        String name = "";

        name = view.getResources().getResourceEntryName(id);


        int resourceId = getResources().getIdentifier(name, "raw", getPackageName());

        MediaPlayer player = MediaPlayer.create(this, resourceId);
        player.start();

        Log.i("Button taped", name);
        Log.i("Resource ID", Integer.toString(resourceId));
    }
}