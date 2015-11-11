package com.example.mengxl.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by mengxl on 15/11/9.
 */


public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
