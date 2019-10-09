package com.example.quizzapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scores = 0;
     // Declare all views

    private RadioGroup one;
    private EditText two;
    private LinearLayout three;
    private CheckBox threeA,threeB,threeC,threeD;
    private EditText four;
    private RadioGroup five;
    private EditText six;
    private LinearLayout seven;
    private CheckBox sevenA,sevenB,sevenC,sevenD;
    private EditText eight;
    private RadioGroup nine;
    private EditText ten;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize all views
        one =(RadioGroup)findViewById(R.id.q_one_rg);
        two =(EditText)findViewById(R.id.two_answer);
        three =(LinearLayout) findViewById(R.id.checkbox_question3);
        threeA =(CheckBox)findViewById(R.id.question_three_a);
        threeB =(CheckBox)findViewById(R.id.question_seven_b);
        threeC =(CheckBox)findViewById(R.id.question_three_c);
        threeD =(CheckBox)findViewById(R.id.question_three_d);
        four =(EditText)findViewById(R.id.four_answer);
        five = (RadioGroup)findViewById(R.id.q_five_rg);
        six = (EditText)findViewById(R.id.six_answer);
        seven =(LinearLayout)findViewById(R.id.checkbox_question7);
        sevenA =(CheckBox)findViewById(R.id.question_seven_a);
        sevenB =(CheckBox)findViewById(R.id.question_seven_b);
        sevenC =(CheckBox)findViewById(R.id.question_seven_c);
        sevenD =(CheckBox)findViewById(R.id.question_seven_d);
        eight = (EditText)findViewById(R.id.eight_answer);
        nine =(RadioGroup)findViewById(R.id.q_nine_rg);
        ten =(EditText)findViewById(R.id.ten_answer);

    }
    /**
     * Submit Answer
     * @param view
     */
    public void submitAnswer(View view){
        int totalScores = 10;
        // check for all answer
        checkAnswwer();
        // show score
        if(scores == totalScores){
            showToastmessage(getString(R.string.all_answer) +" You scored " +  String.valueOf(scores) + " out of 10");

        }else {
            showToastmessage(getString(R.string.all_question) +" You scored " +  String.valueOf(scores) + " out of 10");

        }
    }
    /**
     * Check all the answer and increase the score
     * For each answer 1point will get added in scores
     */


    private void checkAnswwer() {
         scores = 0;

         //check for questions
        if(one.getCheckedRadioButtonId() == R.id.q_one_c){
            increaseScore();
        }
        if(two.getText().toString().equalsIgnoreCase("Vulcanizing")){
            increaseScore();
        }
        if(threeA.isChecked() && threeC.isChecked() && !threeB.isChecked() && !threeD.isChecked()){
            increaseScore();
        }
        if(four.getText().toString().equalsIgnoreCase("Gravity")){
            increaseScore();
        }
        if(five.getCheckedRadioButtonId() == R.id.q_five_b){
            increaseScore();
        }
        if(six.getText().toString().equalsIgnoreCase("Clouds")|| (six.getText().toString().equalsIgnoreCase("Cloud")
        )){
            increaseScore();
        }
        if(sevenC.isChecked() && sevenD.isChecked() && !sevenA.isChecked() && !sevenB.isChecked()){
            increaseScore();
        }
        if(eight.getText().toString().equalsIgnoreCase("Wrist")){
            increaseScore();
        }
        if(nine.getCheckedRadioButtonId()== R.id.q_nine_b){
            increaseScore();
        }
        if(ten.getText().toString().equalsIgnoreCase("Smelting"));
            increaseScore();
    }
    private  void increaseScore(){
        scores += 1;

    }

    /**
     * To display toast message
     * @param  message
     */

    private void showToastmessage(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

}
