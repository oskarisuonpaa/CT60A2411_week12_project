package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class AddItemFragment extends Fragment {

    View view;
    MainActivity activity;
    EditText editTextTitle;
    EditText editTextAdditionalNotes;
    CheckBox checkBoxIsImportant;
    Button buttonAddItem;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_add_item, container, false);

        activity = (MainActivity) getActivity();

        editTextTitle = view.findViewById(R.id.editTextTitle);
        editTextAdditionalNotes = view.findViewById(R.id.editTextAdditionalNotes);
        checkBoxIsImportant = view.findViewById(R.id.checkBoxIsImportant);
        buttonAddItem = view.findViewById(R.id.buttonAddItem);

        buttonAddItem.setOnClickListener(view -> {
            String title = editTextTitle.getText().toString();
            boolean isImportant = checkBoxIsImportant.isChecked();
            String additionalNotes = editTextAdditionalNotes.getText().toString();
            Item item;
            if (additionalNotes.matches("")){
                item = new Item(title, isImportant);
            } else {
                item = new Item(title, isImportant, additionalNotes);
            }

            activity.addItem(item);
        });

        return view;
    }
}