package com.example.simplymessanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		EditText editTextMessage = findViewById(R.id.editTextMessage);
		Button buttonSendMessage = findViewById(R.id.buttonSendMessage);
		buttonSendMessage.setOnClickListener(v -> {
			launchNextScreen(editTextMessage.getText().toString());
		});
	}

	private void launchNextScreen(String message) {

		Intent intent = new Intent(this, ReceivedMessageActivity.class);
		intent.putExtra("messageText", message);
		startActivity(intent);

	}

}