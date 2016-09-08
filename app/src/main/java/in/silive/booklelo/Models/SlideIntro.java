package in.silive.booklelo.Models;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro2;

import in.silive.booklelo.Activities.MainActivity;
import in.silive.booklelo.Fragments.SlideOneIntro;
import in.silive.booklelo.Fragments.SlideThreeIntro;
import in.silive.booklelo.Fragments.SlideTwoIntro;

/**
 * Created by akriti on 8/9/16.
 */
public class SlideIntro extends AppIntro2 {
    Fragment slides;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_slide_intro);
        //View view = View.inflate(getApplicationContext(),R.layout.activity_slide_intro,null);
        //slides = (Fragment)view.findViewById(R.id.slides);
        addSlide(new SlideOneIntro());
        addSlide(new SlideTwoIntro());
        addSlide(new SlideThreeIntro());
        //showSkipButton(true);
        setProgressButtonEnabled(true);
        setVibrate(true);
        setVibrateIntensity(20);


    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        // Do something when users tap on Skip button.
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        // Do something when users tap on Done button.
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }

}
