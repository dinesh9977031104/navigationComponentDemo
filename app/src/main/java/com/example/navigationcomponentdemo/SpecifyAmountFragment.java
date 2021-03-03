package com.example.navigationcomponentdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class SpecifyAmountFragment extends Fragment {

    View view;
    Button send, cancel;
    EditText editText;

    public SpecifyAmountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_specify_amount, container, false);



        editText = view.findViewById(R.id.editText);
        send = view.findViewById(R.id.send);
        cancel = view.findViewById(R.id.cancel);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavDirections navDirections = SpecifyAmountFragmentDirections.actionSpecifyAmountFragmentToConfirmationFragment(
                        SpecifyAmountFragmentArgs.fromBundle(getArguments()).getName(),
                        Integer.parseInt(editText.getText().toString())
                );

                Navigation.findNavController(view).navigate(navDirections);
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigateUp();
            }
        });

        return view;
    }
}