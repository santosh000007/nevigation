package com.example.santoz.nevigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbarMain);
        toolbar.setTitle("Navigation");

        // Create the AccountHeader
        AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(R.drawable.header)
                .addProfiles(
                        new ProfileDrawerItem().withName("santosh sb").withEmail("bhattaraisantosh07@gmail.com").withIcon(getResources().getDrawable(R.drawable.profile))
                )
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean currentProfile) {
                        return false;
                    }
                })
                .build();

        //if you want to update the items at a later time it is recommended to keep it in a variable
        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1).withName("Home").withIcon(getResources().getDrawable(R.drawable.home));
        PrimaryDrawerItem item2 = new PrimaryDrawerItem().withIdentifier(2).withName("Settings").withIcon(getResources().getDrawable(R.drawable.setting));
        PrimaryDrawerItem item3 = new PrimaryDrawerItem().withIdentifier(3).withName("Apps & games").withIcon(getResources().getDrawable(R.drawable.apps));
        PrimaryDrawerItem item4 = new PrimaryDrawerItem().withIdentifier(4).withName("Movies").withIcon(getResources().getDrawable(R.drawable.images));
        PrimaryDrawerItem item5 = new PrimaryDrawerItem().withIdentifier(5).withName("Add account").withIcon(getResources().getDrawable(R.drawable.account));
        PrimaryDrawerItem item6 = new PrimaryDrawerItem().withIdentifier(6).withName("Log Out").withIcon(getResources().getDrawable(R.drawable.logout));
//create the drawer and remember the `Drawer` result object
        Drawer result = new DrawerBuilder()
                .withActivity(this)
                .withAccountHeader(headerResult)
                .withToolbar(toolbar)
                .addDrawerItems(
                        item1,item2,item3,item4,item5,item6
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        // do something with the clicked item :D
                        switch(position) {

                            case 1: break;
                            case 2: break;
                        }
                        return true;
                    }
                })
                .build();
    }
}
