package phamtanphat.ptp.khoaphamtraining.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void addAndroid(View v){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        AndroidFragment androidFragment = new AndroidFragment(color);
        fragmentTransaction.add(R.id.linearContainer,androidFragment,"fragmentAndroid");
        fragmentTransaction.commit();

    }
    public void addIos(View v){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        IosFragment iosFragment = new IosFragment();
        fragmentTransaction.add(R.id.linearContainer,iosFragment,"fragmentios");
        fragmentTransaction.commit();

    }
    public void removeAndroid(View v){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        AndroidFragment androidFragment = (AndroidFragment) fragmentManager.findFragmentByTag("fragmentAndroid");
        if (androidFragment != null){
            fragmentTransaction.remove(androidFragment);
            fragmentTransaction.commit();
            getCountFragmentInActivity();
        }

    }
    public void replaceAndroid(View v){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        AndroidFragment androidFragment = new AndroidFragment(color);
        fragmentTransaction.replace(R.id.linearContainer,androidFragment);
        fragmentTransaction.commit();

    }
    private void getCountFragmentInActivity(){
        Log.d("BBB",fragmentManager.getFragments().size() + "" );
    }
}
