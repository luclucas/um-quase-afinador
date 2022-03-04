package com.lulu.umquaseafinador;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    private MediaPlayer[] mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        mp = new MediaPlayer[6];
        salvarSons();
    }

    public void tocaMizinha(View view){
        if(mp[0] != null){
            estaTocando();
            mp[0].start();
        }
    }
    public void tocaSi(View view){
        if(mp[1] != null){
            estaTocando();
            mp[1].start();
        }
    }
    public void tocaSol(View view){
        if(mp[2] != null){
            estaTocando();
            mp[2].start();
        }
    }
    public void tocaRe(View view){
        if(mp[3] != null){
            estaTocando();
            mp[3].start();
        }
    }
    public void tocaLa(View view){
        if(mp[4] != null){
            estaTocando();
            mp[4].start();
        }
    }
    public void tocaMi(View view){
        if(mp[5] != null){
            estaTocando();
            mp[5].start();
        }
    }
    private void estaTocando(){
        for(int i = 0; i < 6; i++){
            if(mp[i].isPlaying()){
                mp[i].stop();
            }
        }
        salvarSons();
    }

    private void salvarSons(){
        mp[0] = MediaPlayer.create(getApplicationContext(), R.raw.e);
        mp[1] = MediaPlayer.create(getApplicationContext(), R.raw.b);
        mp[2] = MediaPlayer.create(getApplicationContext(), R.raw.g);
        mp[3] = MediaPlayer.create(getApplicationContext(), R.raw.d);
        mp[4] = MediaPlayer.create(getApplicationContext(), R.raw.a);
        mp[5] = MediaPlayer.create(getApplicationContext(), R.raw.mi);

    }
}