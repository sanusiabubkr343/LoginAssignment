package com.example.loginassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    TextInputEditText emailText;
    TextInputEditText passwordField;
    TextInputLayout passwordLayout;
    TextInputLayout emailLayout;
    MaterialButton loginButton;


    String realPassword = "Anova_96";
    String realEmail = "acceptjava@gmail.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        passwordField = findViewById(R.id.passwordField);
        emailText = findViewById(R.id.emailField);
        passwordLayout = findViewById(R.id.passwordLayout);
        emailLayout = findViewById(R.id.emailLayout);
        loginButton= findViewById(R.id.LoginButton);





        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = Objects.requireNonNull(passwordField.getText()).toString().trim();
                String email = Objects.requireNonNull(emailText.getText()).toString().trim();

                // Setting the layout error colour to null
                passwordLayout.setError(null);
                emailLayout.setError(null);

                // checking conditions

                if ( !password.isEmpty() && !email.isEmpty()) {

                    passwordLayout.setError(null);
                    emailLayout.setError(null);

                       if ( !password.equals(realPassword)) {
                        passwordLayout.setError("Error");
                           Toast.makeText(MainActivity.this, "Incorrect Password", Toast.LENGTH_SHORT).show();
                      }

                       else if ( !email.equals(realEmail)) {
                         emailLayout.setError("Error");
                         Toast.makeText(MainActivity.this, "Incorrect Email", Toast.LENGTH_SHORT).show();
                       }

                       else {
                           Toast.makeText(MainActivity.this, "Ok", Toast.LENGTH_SHORT).show();
                           //todo  move to next activity
                           startActivity(new Intent(MainActivity.this,ListActivity.class));
                           finish();
                       }



                }
                else {

                    if (password.isEmpty() || !password.equals(realPassword)) {
                        passwordLayout.setError("Error");
                    }

                    if (email.isEmpty() || !email.equals(realEmail)) {
                        emailLayout.setError("Error");
                    }
                    Toast.makeText(MainActivity.this, "Empty field not required", Toast.LENGTH_SHORT).show();


                }


            }
        });

    }
}