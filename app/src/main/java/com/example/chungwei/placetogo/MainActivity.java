package com.example.chungwei.placetogo;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.chungwei.placetogo.services.APIAIService;

import ai.api.AIListener;
import ai.api.AIServiceException;
import ai.api.model.AIError;
import ai.api.model.AIResponse;

public class MainActivity extends AppCompatActivity implements AIListener {

    private APIAIService apiaiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize API.AI service
        apiaiService = new APIAIService(this, this);

        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = ((EditText) findViewById(R.id.editText)).getText().toString();
                SendRequest(text);
            }
        });
    }

    private void SendRequest(String text) {
        AsyncTask<String, Void, AIResponse> task = new AsyncTask<String, Void, AIResponse>() {
            @Override
            protected AIResponse doInBackground(String... strings) {
                try {
                    return apiaiService.textRequest(strings[0]);
                } catch (AIServiceException e) {
                    //handle error
                    return null;
                }
            }

            @Override
            protected void onPostExecute(AIResponse aiResponse) {
                //get the result here

                Log.i("API.AI Result", aiResponse.getResult().getAction());
            }
        };

        task.execute(text);
    }

    @Override
    public void onResult(AIResponse result) {

    }

    @Override
    public void onError(AIError error) {

    }

    @Override
    public void onAudioLevel(float level) {

    }

    @Override
    public void onListeningStarted() {

    }

    @Override
    public void onListeningCanceled() {

    }

    @Override
    public void onListeningFinished() {

    }
}
