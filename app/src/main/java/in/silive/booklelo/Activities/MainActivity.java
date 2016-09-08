package in.silive.booklelo.Activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import in.silive.booklelo.R;
import yalantis.com.sidemenu.interfaces.Resourceble;
import yalantis.com.sidemenu.model.SlideMenuItem;
import yalantis.com.sidemenu.util.ViewAnimator;

public class MainActivity extends AppCompatActivity implements ActionBarDrawerToggle.DelegateProvider {
    DrawerLayout drawerLayout;
    Fragment container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        ViewAnimator viewAnimator = new ViewAnimator<>(ActionBarActivity.this,
                new ArrayList<Resourceble>(),
                (LinearLayout) findViewById(R.id.left_drawer),
                container, drawerLayout);
        private List<SlideMenuItem> list = new ArrayList<>();

        SlideMenuItem menuItem0 = new SlideMenuItem("Close", R.mipmap.ic_launcher);
        list.add(menuItem0);
        SlideMenuItem menuItem = new SlideMenuItem("Building", R.mipmap.ic_launcher);
        list.add(menuItem);
        SlideMenuItem menuItem2 = new SlideMenuItem("Book", R.mipmap.ic_launcher);
        list.add(menuItem2);

        viewAnimator = new ViewAnimator<>(this, list, container, drawerLayout, this);
    }
    @Override
    public void onDrawerSlide(View drawerView, float slideOffset) {
        super.onDrawerSlide(drawerView, slideOffset);
        if (slideOffset > 0.6 && viewAnimator.getLinearLayout().getChildCount() == 0)
            viewAnimator.showMenuContent();
    }
    @Override
    public void onDrawerClosed(View view) {
        super.onDrawerClosed(view);
        viewAnimator.getLinearLayout().removeAllViews();
        viewAnimator.getLinearLayout().invalidate();
    }


}
