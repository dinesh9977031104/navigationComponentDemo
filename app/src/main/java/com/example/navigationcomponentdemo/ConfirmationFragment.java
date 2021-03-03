package com.example.navigationcomponentdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ConfirmationFragment extends Fragment {

    View view;

    TextView name, amount;

    public ConfirmationFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_confirmation, container, false);

        name = view.findViewById(R.id.name);
        amount = view.findViewById(R.id.amount);

        name.setText(ConfirmationFragmentArgs.fromBundle(getArguments()).getName());
        amount.setText(""+ConfirmationFragmentArgs.fromBundle(getArguments()).getAmount());

        return view;
    }
}