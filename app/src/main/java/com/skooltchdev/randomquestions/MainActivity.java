package com.skooltchdev.randomquestions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private ImageView mImage;
    private TextView mQuestion;
    private Button mButton;
    private int mQuestionNumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImage = (ImageView)findViewById(R.id.imageView);
        mQuestion = (TextView)findViewById(R.id.questionView);
        mButton = (Button)findViewById(R.id.buttonView);

        //Shuffle questions
        shuffleQuestions();

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateQuestion();
            }
        });




    }

    public void updateQuestion(){
        mImage.setImageResource(questions[mQuestionNumber].getmImage());
        mQuestion.setText(questions[mQuestionNumber].getmQuestion());
        mQuestionNumber++;
    }

    Magnetism m01 = new Magnetism(R.drawable.img_0512, "Magnets have two poles - North and South.");
    Magnetism m02 = new Magnetism(R.drawable.img_0516, "This is a horse shoe magnet.");
    Magnetism m03 = new Magnetism(R.drawable.img_0521, "The Earth is magnetic.");
    Magnetism m04 = new Magnetism(R.drawable.img_0522, "You can see magnetic fields with your eyes");

    Magnetism [] questions = new Magnetism [] {
      m01, m02, m03, m04
    };

    public void shuffleQuestions(){
        Collections.shuffle(Arrays.asList(questions));
    }


}
