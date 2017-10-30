package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by alessio.lagonigro on 30/10/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
