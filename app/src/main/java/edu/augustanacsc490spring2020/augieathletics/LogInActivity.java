package edu.augustanacsc490spring2020.augieathletics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import edu.augustanacsc490spring2020.augieathletics.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LogInActivity extends AppCompatActivity {

    private FirebaseAuth myAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        myAuth = FirebaseAuth.getInstance();
    }

    @Override public void onStart() {
        super.onStart();

        //Check if user is signed in (non-null) and update UI accordingly
        FirebaseUser currentUser = myAuth.getCurrentUser();
//        updateUI(currentUser);
    }
}