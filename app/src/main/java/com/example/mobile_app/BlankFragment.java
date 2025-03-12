package com.example.mobile_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class BlankFragment extends Fragment {
    private EditText editText;
    private Button button;
    private TextView outputText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        editText = view.findViewById(R.id.editText);
        button = view.findViewById(R.id.button);
        outputText = view.findViewById(R.id.outputText);

        button.setOnClickListener(v -> {
            String input = editText.getText().toString();
            if (!input.isEmpty()) {
                outputText.setText(input);
                Toast.makeText(getActivity(), "Text updated!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getActivity(), "Enter text first", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}