package it.jaschke.alexandria;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class About extends Fragment {

    public About(){ }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_about, container, false);
        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof Activity) {
            Activity mActivity = (Activity) context;
            mActivity.setTitle(R.string.about);
        }
    }

    @Override
    public void onResume() {
        super.onResume();

        //Extra error case: When press back button set the title.
        ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle(R.string.about);
    }

}
