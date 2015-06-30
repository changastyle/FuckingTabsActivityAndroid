package com.example.root.testtabhost.Fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.root.testtabhost.R;

public class Fragment1 extends Fragment
{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        inflater.inflate(R.layout.seleccionNumeros,container,false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
