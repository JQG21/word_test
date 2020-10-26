package com.example.word_test;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.word_test.word.WordContent;

public class MainActivity extends AppCompatActivity implements ItemFragment.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onItemClick(WordContent.WordItem wordItem) {
        DetailFragment detailFragment = (DetailFragment)getSupportFragmentManager().findFragmentById(R.id.wordDetail);

        if(detailFragment !=null){
            detailFragment.updataView(wordItem);
        }
        else {
            DetailFragment newFragment = new DetailFragment();
            Bundle args = new Bundle();

            args.putSerializable(DetailFragment.ARG_PARAM,wordItem);
            newFragment.setArguments(args);

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.wordDetail,newFragment);
            transaction.commit();
        }
    }
}