package com.example.portfoliokerim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.portfoliokerim.CV.CVFragment;
import com.example.portfoliokerim.Home.HomeFragment;
import com.example.portfoliokerim.Portfolio.PortfolioFragment;
import com.example.portfoliokerim.SideMenu.Callback;
import com.example.portfoliokerim.SideMenu.MenuAdapter;
import com.example.portfoliokerim.SideMenu.MenuItem;
import com.example.portfoliokerim.Team.FragmentTeam;

import java.util.List;

public class MainActivity extends AppCompatActivity implements Callback {
    RecyclerView rvmenu;
    List<MenuItem> menuItems;
    MenuAdapter adapter;

    int selectedmenupos=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        //sethomefragment();
        //setCVFragment();
        //setteamfragment();

        sethomefragment();

       // setportfoliofragment();
        setupSideMenu();
    }

    private void setupSideMenu() {
        rvmenu = findViewById(R.id.rvsidemenu);


        menuItems = MenuUtil.getMenuList();
        adapter = new MenuAdapter(menuItems, this);
        rvmenu.setAdapter(adapter);
        rvmenu.setLayoutManager(new LinearLayoutManager(this));


    }

    void setportfoliofragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new PortfolioFragment()).commit();

    }

    void sethomefragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();
    }

    void setCVFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new CVFragment()).commit();
    }

    void setteamfragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new FragmentTeam()).commit();
    }

    @Override
    public void onSideMenuitemclick(int i) {
        switch (menuItems.get(i).getCode()) {
            case MenuUtil.HOME_FRAGMENT_CODE:
                sethomefragment();
                break;
            case MenuUtil.CV_FRAGMENT_CODE:
                setCVFragment();
                break;
            case MenuUtil.TEAM_FRAGMENT_CODE:
                setteamfragment();
                break;
            case MenuUtil.PORTFOLIO_FRAGMENT_CODE:
                setportfoliofragment();
                break;
            default:
                sethomefragment();


        }
        menuItems.get(selectedmenupos).setSelected(false);
        menuItems.get(i).setSelected(true);
        selectedmenupos=i;
        adapter.notifyDataSetChanged();
    }
}
