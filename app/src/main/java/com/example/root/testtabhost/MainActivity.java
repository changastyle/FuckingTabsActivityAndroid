package com.example.root.testtabhost;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

import com.example.root.testtabhost.activities.Tab1;
import com.example.root.testtabhost.activities.Tab2;


public class MainActivity extends TabActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TabHost tabHost = this.getTabHost();

        TabHost.TabSpec primerSpec = tabHost.newTabSpec("TAB1");
        primerSpec.setIndicator("Ingrese 5 Numeros");
        primerSpec.setContent(new Intent(this, Tab1.class));



        TabHost.TabSpec segundoSpec = tabHost.newTabSpec("TAB2");
        segundoSpec.setIndicator("Eliga 5 Sueños");
        segundoSpec.setContent(new Intent(this, Tab2.class));


        tabHost.addTab(primerSpec);
        tabHost.addTab(segundoSpec);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
