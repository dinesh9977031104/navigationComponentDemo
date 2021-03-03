package com.example.navigationcomponentdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainFragment extends Fragment {

   View view;
   Button viewTransaction,send_money,view_balance;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_main,container,false);
        viewTransaction = view.findViewById(R.id.view_transaction);
        send_money = view.findViewById(R.id.send_money);
        view_balance = view.findViewById(R.id.view_balance);


        viewTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_transactionFragment);
            }
        });

        send_money.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_recipientFragment);
            }
        });

        view_balance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_viewBalanceFragment3);
            }
        });

        return view;
    }
}