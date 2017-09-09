package com.alicelab.crazydreamer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton chatButton = findViewById(R.id.chatButton);
        chatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, UserActivity.class);
                startActivity(intent);
            }
        });

        ImageButton othersButton = findViewById(R.id.othersButton);
        othersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, OthersActivity.class);
                startActivity(intent);
            }
        });
    }
}
