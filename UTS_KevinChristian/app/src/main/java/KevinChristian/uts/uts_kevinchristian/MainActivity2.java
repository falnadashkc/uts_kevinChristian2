package KevinChristian.uts.uts_kevinchristian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView tv_namalengkap, tv_nomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_namalengkap = findViewById(R.id.tv_namalengkap);
        tv_nomor = findViewById(R.id.tv_nomor);

        Intent intent = getIntent();
        tv_namalengkap.setText(intent.getStringExtra("varNama"));
        tv_nomor.setText(intent.getStringExtra("varNomor"));
    }
}