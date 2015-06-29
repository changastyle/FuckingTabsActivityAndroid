package com.example.root.testtabhost;

import android.app.TabActivity;
import android.content.Intent;
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

        // Inbox Tab
        TabHost.TabSpec inboxSpec = tabHost.newTabSpec("TAB1");
        // Tab Icon
        inboxSpec.setIndicator("TABB");
        Intent inboxIntent = new Intent(this, Tab1.class);
        // Tab Content
        inboxSpec.setContent(inboxIntent);



        TabHost.TabSpec segundoSpec = tabHost.newTabSpec("TAB2");
        segundoSpec.setIndicator("TAB2");
        segundoSpec.setContent(new Intent(this,Tab2.class));

      /*  // Outbox Tab
        TabSpec outboxSpec = tabHost.newTabSpec(OUTBOX_SPEC);
        outboxSpec.setIndicator(OUTBOX_SPEC, getResources().getDrawable(R.drawable.icon_outbox));
        Intent outboxIntent = new Intent(this, OutboxActivity.class);
        outboxSpec.setContent(outboxIntent);

        // Profile Tab
        TabSpec profileSpec = tabHost.newTabSpec(PROFILE_SPEC);
        profileSpec.setIndicator(PROFILE_SPEC, getResources().getDrawable(R.drawable.icon_profile));
        Intent profileIntent = new Intent(this, ProfileActivity.class);
        profileSpec.setContent(profileIntent);*/

        // Adding all TabSpec to TabHost
        tabHost.addTab(inboxSpec); // Adding Inbox tab
        tabHost.addTab(segundoSpec);
       //tabHost.addTab(outboxSpec); // Adding Outbox tab
        //tabHost.addTab(profileSpec); // Adding Profile tab
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
