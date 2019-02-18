package edu.stts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity {

    TextView tvinfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvinfo=findViewById(R.id.textView);
        if (getIntent()!=null)
        {
            Intent pemanggil = getIntent(); //mendapatkan pemanggil HomeActivity
            tvinfo.setText( pemanggil.getStringExtra("username"));//buat ganti textview
        }
        else
        {
            Intent i=new Intent(this,MainActivity.class);
            startActivity(i);
        }

        //Toast.makeText(this, "Welcome " + pemanggil.getStringExtra("username"), Toast.LENGTH_SHORT).show();
        //mbox
    }
}
