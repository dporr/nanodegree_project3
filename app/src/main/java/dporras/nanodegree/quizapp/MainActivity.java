package dporras.nanodegree.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private RadioButton q1_radio_ukulele;
    private RadioButton q1_radio_drums;
    private RadioButton q1_radio_guitar;
    private CheckBox q2_hendrix;
    private CheckBox q2_trump;
    private CheckBox q2_watters;
    private CheckBox q2_clapton;
    private EditText q3_mannish_boy;
    private EditText q4_harmonica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void initLayoutComponents(){
        RadioButton q1_radio_ukulele = (RadioButton) findViewById(R.id.q1_radio_ukulele);
        RadioButton q1_radio_drums = (RadioButton) findViewById(R.id.q1_radio_drums);
        RadioButton q1_radio_guitar = (RadioButton) findViewById(R.id.q1_radio_guitar);
        CheckBox q2_hendryx = (CheckBox) findViewById(R.id.q2_hendrix);
        CheckBox q2_trump = (CheckBox) findViewById(R.id.q2_trump);
        CheckBox q2_watters = (CheckBox) findViewById(R.id.q2_watters);
        CheckBox q2_clapton = (CheckBox) findViewById(R.id.q2_clapton);
        EditText q3_mannish_boy = (EditText) findViewById(R.id.q3_mannish_boy);
        EditText q4_harmonica = (EditText) findViewById(R.id.q4_harmonica);
    }

}
