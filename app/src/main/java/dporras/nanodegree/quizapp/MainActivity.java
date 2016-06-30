package dporras.nanodegree.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    private CheckBox q2_hendrix;
    private CheckBox q2_trump;
    private CheckBox q2_watters;
    private CheckBox q2_clapton;
    private EditText q3_mannish_boy;
    private EditText q4_harmonica;

    private int totalScore;

    private String Q3_ANSWER="Mannish Boy";
    private String Q4_ANSWER="Harmonica";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initLayoutComponents();
    }
    private void initLayoutComponents(){
        q2_hendrix = (CheckBox) findViewById(R.id.q2_hendrix);
        q2_trump = (CheckBox) findViewById(R.id.q2_trump);
        q2_watters = (CheckBox) findViewById(R.id.q2_watters);
        q2_clapton = (CheckBox) findViewById(R.id.q2_clapton);
        q3_mannish_boy = (EditText) findViewById(R.id.q3_mannish_boy);
        q4_harmonica = (EditText) findViewById(R.id.q4_harmonica);
    }


    /**
     * Sumbit the quiz for evaluating
     * @param view
     */
    public void submitQuizz(View view){
        //Lower case q3 answer is the same as expected, give 1 point
        if(q3_mannish_boy.getText().toString().toLowerCase().equals(Q3_ANSWER.toLowerCase()))
            totalScore++;

        //Lower case q4 answer is the same as expected, give 1 point
        if(q4_harmonica.getText().toString().toLowerCase().equals(Q4_ANSWER.toLowerCase()))
            totalScore++;

        //If any blues player is checked gives 1 point, if trump is checked user failed to answer
        if(!q2_trump.isChecked() &&
                (q2_clapton.isChecked() || q2_hendrix.isChecked() || q2_watters.isChecked()))
            totalScore++;

        //Displays the final result
        String result = "Congrats! Your total Score is: " + totalScore +" of 4 total possible points!";
        Toast.makeText(MainActivity.this, result , Toast.LENGTH_LONG).show();

        cleanInputs();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.q1_radio_ukulele:
                break;
            case R.id.q1_radio_drums:
                break;
            case R.id.q1_radio_guitar:
                totalScore++;
        }
    }

    private void cleanInputs(){
        totalScore=0;


    }
}
