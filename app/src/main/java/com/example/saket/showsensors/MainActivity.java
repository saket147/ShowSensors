package com.example.saket.showsensors;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity
{
    TextView tv;
    private SensorManager sensorManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textView);
        tv.setVisibility(View.GONE);
        sensorManager=(SensorManager)getSystemService(SENSOR_SERVICE);
        List<Sensor> list=sensorManager.getSensorList(Sensor.TYPE_ALL);
        for (int i = 1; i < list.size(); i++) {
            tv.setVisibility(View.VISIBLE);
            tv.append("\n" + list.get(i).getName() + "\n" + list.get(i).getVendor() + "\n" + list.get(i).getVersion());
        }

    }
    /*@Override
    public boolean OncreateOptionMenu(Menu menu)
    {
        getMenuInflater().inflate(R.);
    }*/
    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
}
