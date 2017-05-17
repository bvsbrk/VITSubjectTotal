package com.bharath.vitsubjecttotal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class TandPandL extends AppCompatActivity {
    EditText cat1,cat2,fat,das,theoryCredits,projectMarks,labMarks;
    TextView result;
    int c1,c2,f,da,tcredits,project,lab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tand_pand_l);
        cat1=(EditText)findViewById(R.id.cat1);
        cat2=(EditText)findViewById(R.id.cat2);
        fat=(EditText)findViewById(R.id.fat);
        das=(EditText)findViewById(R.id.daTotal);
        theoryCredits=(EditText)findViewById(R.id.credits);
        projectMarks=(EditText)findViewById(R.id.projectMarks);
        labMarks=(EditText)findViewById(R.id.labMarks);
        result=(TextView)findViewById(R.id.result);
        cat1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                result.setText(process()+"");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        cat2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                result.setText(process()+"");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        fat.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                result.setText(process()+"");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        das.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                result.setText(process()+"");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        theoryCredits.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                result.setText(process()+"");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        projectMarks.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                result.setText(process()+"");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        labMarks.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                result.setText(process()+"");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
    public int process() {
        if ((cat1.getText().toString()).equals("")) {
            c1 = 0;
        }
        else {
            c1=Integer.parseInt(cat1.getText().toString());
        }
        if ((cat2.getText().toString()).equals("")) {
            c2 = 0;
        }
        else {
            c2=Integer.parseInt(cat2.getText().toString());
        }
        if ((fat.getText().toString()).equals("")) {
            f = 0;
        }
        else {
            f=Integer.parseInt(fat.getText().toString());
        }
        if ((das.getText().toString()).equals("")) {
            da = 0;
        }
        else {
            da=Integer.parseInt(das.getText().toString());
        }
        if ((theoryCredits.getText().toString()).equals("")) {
            tcredits = 0;
        }
        else {
            tcredits=Integer.parseInt(theoryCredits.getText().toString());
        }
        if ((projectMarks.getText().toString()).equals("")) {
            project = 0;
        }
        else {
            project=Integer.parseInt(projectMarks.getText().toString());
        }
        if ((labMarks.getText().toString()).equals("")) {
            lab = 0;
        }
        else {
            lab=Integer.parseInt(labMarks.getText().toString());
        }

        return (int) Math.floor((tcredits*(((c1+c2)*0.3)+da+0.4*f)+project+lab)/(tcredits+2));
    }
}
