package com.example.computecirclearea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Helper Method to change the content of any given TextView GUI
     * @param id for any given TextView
     * @param newContents
     */
    private void setContentOfTextView(int id, String newContents){
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }
    /**
     * Helper Method to retrieve the content of Edittext
     * @param id for any given EditText
     * @return String
     */
    private  String getContentOfEditText(int id){
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String str =editText.getText().toString();
        return str;
    }

    public void ComputeArea (View view){

        String inputstr = getContentOfEditText(R.id.inputRadius);
        double radius = Double.parseDouble(inputstr);
        double area = radius * radius * Math.PI;
        String output = String.format("%.1f",area);
        setContentOfTextView(R.id.outputResult, output);

    }

}
