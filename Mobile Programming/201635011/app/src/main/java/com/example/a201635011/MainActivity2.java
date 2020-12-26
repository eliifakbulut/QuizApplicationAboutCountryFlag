package com.example.a201635011;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    public static final String result = new String();
    private Button correctAnswerButton;
    private int score = 0;
    private int questionCounter = 0;
    private Question [] questions = new Question[] {
            new Question(R.drawable.africa, R.string.q1, R.string.Africa,new int[]{ R.string.Senegal, R.string.Mali, R.string.Liberia, R.string.Germany}),
            new Question(R.drawable.albania, R.string.q1, R.string.Albania,new int[]{ R.string.Angola, R.string.Africa, R.string.Algeria, R.string.Armenia}),
            new Question(R.drawable.angola, R.string.q1, R.string.Angola,new int[]{ R.string.Senegal, R.string.Mali, R.string.Liberia, R.string.Germany}),
            new Question(R.drawable.australia, R.string.q1, R.string.Australia,new int[]{ R.string.NewZealand, R.string.UnitedKingdom, R.string.Portugal, R.string.Belgium}),
            new Question(R.drawable.belgium, R.string.q1, R.string.Belgium,new int[]{ R.string.Armenia, R.string.SaintLucia, R.string.Macedonia, R.string.Germany}),
            new Question(R.drawable.bf, R.string.q1, R.string.BurkinaFaso,new int[]{ R.string.Sudan, R.string.Nicaragua, R.string.Morocco, R.string.Azerbaijan}),
            new Question(R.drawable.cambodia, R.string.q1, R.string.Cambodia,new int[]{ R.string.Salvador, R.string.Liberia, R.string.Gabon, R.string.Egypt}),
            new Question(R.drawable.cameroon, R.string.q1, R.string.Cameroon,new int[]{ R.string.Sudan, R.string.Indonesia, R.string.Kenya, R.string.Lithuania}),
            new Question(R.drawable.chile, R.string.q1, R.string.Chile,new int[]{ R.string.China, R.string.Argentina, R.string.Moldova, R.string.Azerbaijan}),
            new Question(R.drawable.congo, R.string.q1, R.string.Congo,new int[]{ R.string.Monaco, R.string.Netherlands, R.string.Comoros, R.string.Indonesia}),
            new Question(R.drawable.cuba, R.string.q1, R.string.Cuba,new int[]{ R.string.Brazil, R.string.Morocco, R.string.EastTimor, R.string.Salvador}),
            new Question(R.drawable.dr, R.string.q1, R.string.DominicanRepublic,new int[]{ R.string.Ecuador, R.string.Haiti, R.string.Iraq, R.string.Iran}),
            new Question(R.drawable.england, R.string.q1, R.string.England,new int[]{ R.string.Georgia, R.string.Israel, R.string.Liberia, R.string.Germany}),
            new Question(R.drawable.france, R.string.q1, R.string.France,new int[]{ R.string.Finland, R.string.Nicaragua, R.string.Netherlands, R.string.Italy}),
            new Question(R.drawable.germany, R.string.q1, R.string.Germany,new int[]{ R.string.Belgium, R.string.Denmark, R.string.SriLanka, R.string.Australia}),
            new Question(R.drawable.guatemala, R.string.q1, R.string.Guatemala,new int[]{ R.string.Greece, R.string.Ghana, R.string.Guyana, R.string.Ukraine}),
            new Question(R.drawable.hungary, R.string.q1, R.string.Hungary,new int[]{ R.string.Ireland, R.string.Jordan, R.string.Kazakhstan, R.string.Azerbaijan}),
            new Question(R.drawable.iceland, R.string.q1, R.string.Iceland,new int[]{ R.string.Australia, R.string.Luxembourg, R.string.NorthKorea, R.string.Russia}),
            new Question(R.drawable.india, R.string.q1, R.string.India,new int[]{ R.string.Libya, R.string.Palestine, R.string.Russia, R.string.Mexico}),
            new Question(R.drawable.ireland, R.string.q1, R.string.Ireland,new int[]{ R.string.France, R.string.Romania, R.string.Thailand, R.string.Iceland}),
            new Question(R.drawable.italy, R.string.q1, R.string.Italy,new int[]{ R.string.Sweden, R.string.Nigeria, R.string.Iran, R.string.France}),
            new Question(R.drawable.jordan, R.string.q1, R.string.Jordan,new int[]{ R.string.Lebanon, R.string.Malawi, R.string.Pakistan, R.string.Salvador}),
            new Question(R.drawable.kiribati, R.string.q1, R.string.Kiribati,new int[]{ R.string.Paraguay, R.string.Rwanda, R.string.Serbia, R.string.Mexico}),
            new Question(R.drawable.lebanon, R.string.q1, R.string.Lebanon,new int[]{ R.string.Sudan, R.string.Syria, R.string.Turkmenistan, R.string.Libya}),
            new Question(R.drawable.libya, R.string.q1, R.string.Libya,new int[]{ R.string.Bulgaria, R.string.Afghanistan, R.string.Bahrain, R.string.Mexico}),
            new Question(R.drawable.luxembourg, R.string.q1, R.string.Luxembourg,new int[]{ R.string.France, R.string.Monaco, R.string.Netherlands, R.string.Zambia}),
            new Question(R.drawable.madagascar, R.string.q1, R.string.Madagascar,new int[]{ R.string.Finland, R.string.Germany, R.string.Kuwait, R.string.Iran}),
            new Question(R.drawable.maldives, R.string.q1, R.string.Maldives,new int[]{ R.string.Greece, R.string.Thailand, R.string.Latvia, R.string.SriLanka}),
            new Question(R.drawable.mauritius, R.string.q1, R.string.Mauritius,new int[]{ R.string.Liberia, R.string.Mexico, R.string.Myanmar, R.string.Nepal}),
            new Question(R.drawable.mexico, R.string.q1, R.string.Mexico,new int[]{ R.string.Portugal, R.string.Sudan, R.string.Kuwait, R.string.Iran}),
            new Question(R.drawable.mongolia, R.string.q1, R.string.Mongolia,new int[]{ R.string.Montenegro, R.string.Belarus, R.string.Cambodia, R.string.Madagascar}),
            new Question(R.drawable.namibia, R.string.q1, R.string.Namibia,new int[]{ R.string.Slovakia, R.string.Slovenia, R.string.Africa, R.string.Nepal}),
            new Question(R.drawable.nz, R.string.q1, R.string.NewZealand,new int[]{ R.string.Estonia, R.string.Guatemala, R.string.Paraguay, R.string.Lithuania}),
            new Question(R.drawable.niger, R.string.q1, R.string.Niger,new int[]{ R.string.Zambia, R.string.Thailand, R.string.Kuwait, R.string.Nigeria}),
            new Question(R.drawable.norway, R.string.q1, R.string.Norway,new int[]{ R.string.Denmark, R.string.England, R.string.Italy, R.string.Russia}),
            new Question(R.drawable.png, R.string.q1, R.string.PapuaNewGuinea,new int[]{ R.string.Qatar, R.string.Kuwait, R.string.Austria, R.string.Bahrain}),
            new Question(R.drawable.poland, R.string.q1, R.string.Poland,new int[]{ R.string.Brazil, R.string.Ukraine, R.string.Switzerland, R.string.Czechia}),
            new Question(R.drawable.qatar, R.string.q1, R.string.Qatar,new int[]{ R.string.Bahrain, R.string.Kuwait, R.string.Russia, R.string.Oman}),
            new Question(R.drawable.romania, R.string.q1, R.string.Romania,new int[]{ R.string.Colombia, R.string.Russia, R.string.Croatia, R.string.Ecuador}),
            new Question(R.drawable.sm, R.string.q1, R.string.SanMarino,new int[]{ R.string.France, R.string.Spain, R.string.Turkmenistan, R.string.Turkey}),
            new Question(R.drawable.slovenia, R.string.q1, R.string.Slovenia,new int[]{ R.string.Slovakia, R.string.Somalia, R.string.SierraLeone, R.string.Ukraine}),
            new Question(R.drawable.singapore, R.string.q1, R.string.Singapore,new int[]{ R.string.China, R.string.SouthKorea, R.string.Nepal, R.string.Cameroon}),
            new Question(R.drawable.spain, R.string.q1, R.string.Spain,new int[]{ R.string.Portugal, R.string.Germany, R.string.Italy, R.string.France}),
            new Question(R.drawable.sweden, R.string.q1, R.string.Sweden,new int[]{ R.string.NewZealand, R.string.Switzerland, R.string.Brazil, R.string.Venezuela}),
            new Question(R.drawable.tanzania, R.string.q1, R.string.Tanzania,new int[]{ R.string.Nepal, R.string.Vietnam, R.string.Andorra, R.string.Mozambique}),
            new Question(R.drawable.turkey, R.string.q1, R.string.Turkey,new int[]{ R.string.Azerbaijan, R.string.Kazakhstan, R.string.Tunisia, R.string.China}),
            new Question(R.drawable.ukrain, R.string.q1, R.string.Ukraine,new int[]{ R.string.Sweden, R.string.Romania, R.string.Russia, R.string.Slovenia}),
            new Question(R.drawable.usa, R.string.q1, R.string.UnitesStatesOfAmerica,new int[]{ R.string.England, R.string.Canada, R.string.Colombia, R.string.Morocco}),
            new Question(R.drawable.venezuela, R.string.q1, R.string.Venezuela,new int[]{ R.string.Syria, R.string.Indonesia, R.string.Africa, R.string.Cambodia}),
            new Question(R.drawable.wales, R.string.q1, R.string.Wales,new int[]{ R.string.Ireland, R.string.Lesotho, R.string.CostaRica, R.string.Indonesia})};

    private Question randomQuestions[] = new  Question[25];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView usernameTextView = findViewById(R.id.userNameTextView);
        TextView scoreTextView = findViewById(R.id.scoreTextView);
        TextView questionNumberTextView = findViewById(R.id.questionNumberTextView);
        Button answerButton1 = this.findViewById(R.id.answer1Button);
        Button answerButton2 = this.findViewById(R.id.answer2Button);
        Button answerButton3 = this.findViewById(R.id.answer3Button);
        Button answerButton4 = this.findViewById(R.id.answer4Button);
        Button answerButton5 = this.findViewById(R.id.answer5Button);
        TextView questionText = this.findViewById(R.id.questionTextView);
        ImageView questionImage = this.findViewById(R.id.questionImage);
        scoreTextView.setText("Score: 0");
        usernameTextView.setText(getIntent().getStringExtra(MainActivity.userName));
        mixAndChooseQuestions(questions, randomQuestions);
        updateQuestion(randomQuestions[questionCounter], questionImage,questionText, new Button[] {answerButton1,answerButton2,answerButton3,answerButton4,answerButton5} );
        questionNumberTextView.setText("1/"+randomQuestions.length);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Handler hndler= new Handler();
                if (v.getId() == correctAnswerButton.getId()){
                    v.setBackgroundColor(Color.GREEN);
                    score += 100/randomQuestions.length;
                    scoreTextView.setText("Score: "+score);
                }else{
                    v.setBackgroundColor(Color.RED);
                }
                questionCounter++;hndler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(questionCounter==randomQuestions.length){
                            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                            intent.putExtra(result, usernameTextView.getText().toString()+"\nScore: "+ score + "/100\nCorrect Answer: "+ (int)(((double)score/100)*randomQuestions.length) + "\nWrong Answer: "+ (int)(((double)(100-score)/100)*randomQuestions.length));
                            startActivity(intent);
                        }else {
                            updateQuestion(randomQuestions [questionCounter], questionImage, questionText, new Button[]{answerButton1, answerButton2, answerButton3, answerButton4, answerButton5});
                            questionNumberTextView.setText((questionCounter+1)+"/"+randomQuestions.length);
                        }
                    }
                }, 1000);
            }
        };
        answerButton1.setOnClickListener(onClickListener);
        answerButton2.setOnClickListener(onClickListener);
        answerButton3.setOnClickListener(onClickListener);
        answerButton4.setOnClickListener(onClickListener);
        answerButton5.setOnClickListener(onClickListener);
    }

    void mixAndChooseQuestions(Question questions[], Question randomQuestions[]){
        Random random = new Random();
        ArrayList<Question> questionsTemp = new ArrayList<>();
        while (questionsTemp.size() != randomQuestions.length){
            Question questionTmp = questions[random.nextInt(50)];
            if (!questionsTemp.contains(questionTmp)){
                    questionsTemp.add(questionTmp);
            }
        }
        for (int i = 0; i<randomQuestions.length; i++){
            randomQuestions[i]=questionsTemp.get(i);
        }
    }


    void updateQuestion(Question question , ImageView questionImage, TextView questionText , Button buttons [] ){

        questionImage.setImageResource(question.getImage());
        questionText.setText(question.getQuestionId());
        ArrayList<Integer> answers = new ArrayList<>();
        answers.add(question.getTrueAnswerId());
        answers.add(question.getFalseAnswers()[0]);
        answers.add(question.getFalseAnswers()[1]);
        answers.add(question.getFalseAnswers()[2]);
        answers.add(question.getFalseAnswers()[3]);
        ArrayList <Integer> sortedAnswer = new ArrayList<>();
        Random random = new Random();
        while(sortedAnswer.size()<5){
            int randomNum = random.nextInt(5);
            if(!sortedAnswer.contains(answers.get(randomNum))){
                sortedAnswer.add(answers.get(randomNum));
            }
        }
        for(int j = 0 ; j < 5 ; j++){
            buttons[j].setText(sortedAnswer.get(j));
            buttons[j].setBackgroundColor(Color.GRAY);
            if (sortedAnswer.get(j) .equals(question.getTrueAnswerId())){
                correctAnswerButton = buttons[j];
            }
        }
    }
}
