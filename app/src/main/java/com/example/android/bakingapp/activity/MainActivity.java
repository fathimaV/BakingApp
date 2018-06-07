package com.example.android.bakingapp.activity;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.test.espresso.IdlingResource;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.bakingapp.R;
import com.example.android.bakingapp.util.SimpleIdlingResource;

public class MainActivity extends AppCompatActivity {

    private static boolean mTwoPane;

    @Nullable
    private SimpleIdlingResource mIdlingResource;

    @VisibleForTesting
    @NonNull
    public IdlingResource getIdlingResource() {
        if (mIdlingResource == null) {
            mIdlingResource = new SimpleIdlingResource();
        }
        return mIdlingResource;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (findViewById(R.id.tab_list_recipe_container) != null) {
            mTwoPane = true;
        } else {
            mTwoPane = false;
        }

        getIdlingResource();
//        implementation fileTree(dir: 'libs', include: ['*.jar'])
//        implementation 'com.android.support:support-vector-drawable:27.1.1'
//        implementation 'com.android.support:appcompat-v7:27.1.1'
//        implementation 'com.android.support.constraint:constraint-layout:1.1.0'
//        testImplementation 'junit:junit:4.12'
//        androidTestImplementation 'com.android.support.test:runner:1.0.2'
//        androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.2'
//        androidTestCompile 'com.android.support:support-annotations:26.1.0'
//        compile 'com.android.support:design:27.1.1'
//        compile 'com.jakewharton:butterknife:8.6.0'
//        compile 'com.squareup.retrofit2:retrofit:2.3.0'
//        compile 'com.squareup.retrofit2:converter-gson:2.3.0'
//        compile 'com.squareup.picasso:picasso:2.5.2'
//        compile 'com.android.support:design:27.1.1'
//        compile 'io.reactivex.rxjava2:rxjava:2.0.1'
//        compile 'com.android.support:cardview-v7:27.1.1'
//        compile 'io.reactivex.rxjava2:rxandroid:2.0.1'
//        compile 'com.squareup.retrofit2:adapter-rxjava2:2.3.0'
//        compile 'com.google.android.exoplayer:exoplayer:r2.2.0'
//        annotationProcessor 'com.jakewharton:butterknife-compiler:8.6.0'
//        compile 'com.android.support.test.espresso:espresso-idling-resource:3.0.1'
    }



    public static boolean getNoPane() {
        return mTwoPane;
    }
}

