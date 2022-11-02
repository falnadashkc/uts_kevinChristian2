package KevinChristian.uts.uts_kevinchristian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckedTextView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView tv_namalengkap, tv_nomor;
private CheckedTextView ctv_FB, ctv_IG, ctv_WS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_namalengkap = findViewById(R.id.tv_namalengkap);
        tv_nomor = findViewById(R.id.tv_nomor);
        ctv_FB = findViewById(R.id.ctv_FB);
        ctv_IG = findViewById(R.id.ctv_IG);
        ctv_WS = findViewById(R.id.ctv_WS);

        Intent intent = getIntent();
        tv_namalengkap.setText(intent.getStringExtra("varNama"));
        tv_nomor.setText(intent.getStringExtra("varNomor"));
        ctv_FB.setText(intent.getStringExtra("varFB"));
        ctv_IG.setText(intent.getStringExtra("varIG"));
        ctv_WS.setText(intent.getStringExtra("varWS"));
    }
}