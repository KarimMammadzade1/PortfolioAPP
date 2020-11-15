package com.example.portfoliokerim;

import com.example.portfoliokerim.SideMenu.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MenuUtil {

    public static final int HOME_FRAGMENT_CODE = 0;
    public static final int CV_FRAGMENT_CODE = 1;
    public static final int PORTFOLIO_FRAGMENT_CODE = 2;
    public static final int TEAM_FRAGMENT_CODE = 3;

    public static List<MenuItem> getMenuList() {
        List<MenuItem> list = new ArrayList<>();
        list.add(new MenuItem(R.drawable.iconhome, HOME_FRAGMENT_CODE, true));
        list.add(new MenuItem(R.drawable.ic_school_black_24dp, CV_FRAGMENT_CODE, false));
        list.add(new MenuItem(R.drawable.ic_dashboard_black_24dp, PORTFOLIO_FRAGMENT_CODE, false));
        list.add(new MenuItem(R.drawable.ic_group_black_24dp, TEAM_FRAGMENT_CODE, false));

        return list;
    }

}
