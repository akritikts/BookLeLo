package in.silive.booklelo.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.silive.booklelo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SlideThreeIntro extends Fragment {


    public SlideThreeIntro() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_slide_three_intro, container, false);
    }

}