package KevinChristian.uts.uts_kevinchristian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText et_namalengkap, et_nomor;
private CheckBox CB_FB, CB_IG, CB_WS;
private Button btn_daftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_namalengkap = findViewById(R.id.et_namalengkap);
        et_nomor = findViewById(R.id.et_nomor);

        CB_FB = findViewById(R.id.CB_FB);
        CB_IG = findViewById(R.id.CB_IG);
        CB_WS = findViewById(R.id.CB_WS);

        btn_daftar = findViewById(R.id.btn_Daftar);
        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.CB_FB:
                        if(CB_FB.isChecked())
                            Toast.makeText(getApplicationContext(), "Facebook", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.CB_IG:
                        if(CB_IG.isChecked())
                            Toast.makeText(getApplicationContext(), "Instagram", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.CB_WS:
                        if(CB_WS.isChecked())
                            Toast.makeText(getApplicationContext(), "Website", Toast.LENGTH_SHORT).show();
                }
                String nama, nomor, facebook, instagram, website;
                int selectedID;

                nama = et_namalengkap.getText().toString();
                nomor = et_nomor.getText().toString();
                facebook = CB_FB.getText().toString();
                instagram = CB_IG.getText().toString();
                website = CB_WS.getText().toString();

                if (nama.trim().equals("")){

                    et_namalengkap.setError("Nama tidak boleh kosong!");
                }
                else if(nomor.trim().equals("")){
                    et_nomor.setError("Nomor tidak boleh kosong!");
                }
                else if(!CB_FB.isChecked()&&!CB_IG.isChecked()&&!CB_WS.isChecked()){
                    Toast.makeText(getApplicationContext(),"Harus memilih salah satu", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("varNama", nama);
                    intent.putExtra("varNomor", nomor);
                    intent.putExtra("varFB", facebook);
                    intent.putExtra("varIG", instagram);
                    intent.putExtra("varWS", website);
                    startActivity(intent);
                }
            }
        });
        ;
    }
}