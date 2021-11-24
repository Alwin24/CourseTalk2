package com.example.chatapp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.database.FirebaseListAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class CourseList extends AppCompatActivity {

    private static final int RC_SIGN_IN = 1;
    private FirebaseAnalytics mFirebaseAnalytics;
    private FirebaseListAdapter<ChatMessage> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);


        if(FirebaseAuth.getInstance().getCurrentUser() == null) {
            // Start sign in/sign up activity
            startActivityForResult(
                    AuthUI.getInstance()
                            .createSignInIntentBuilder()
                            .build(),RC_SIGN_IN);
        } else {
            // User is already signed in. Therefore, display
            // a welcome Toast
            Toast.makeText(this,
                    "Welcome " + FirebaseAuth.getInstance()
                            .getCurrentUser()
                            .getDisplayName(),
                    Toast.LENGTH_LONG)
                    .show();

        }

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);

        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent Course1Activity = new Intent(CourseList.this, Course1Activity.class);
                Course1Activity.putExtra("course","Applied philosophy");
                startActivity(Course1Activity);
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent Course2Activity = new Intent(CourseList.this, Course2Activity.class);
                Course2Activity.putExtra("course","Public policy");
                startActivity(Course2Activity);
            }

        });
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent Course3Activity = new Intent(CourseList.this, Course3Activity.class);
                Course3Activity.putExtra("course","Modern fiction");
                startActivity(Course3Activity);
            }

        });
        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent Course4Activity = new Intent(CourseList.this, Course4Activity.class);
                Course4Activity.putExtra("course","Eco criticism");
                startActivity(Course4Activity);
            }

        });
        button5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent Course5Activity = new Intent(CourseList.this, Course5Activity.class);
                Course5Activity.putExtra("course","Creative writing");
                startActivity(Course5Activity);
            }

        });
    }
}