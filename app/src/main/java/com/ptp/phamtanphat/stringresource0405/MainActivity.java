package com.ptp.phamtanphat.stringresource0405;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnDangnhap;
    EditText edtTk,edtMk;
    TextView txtKetqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDangnhap = findViewById(R.id.buttonDangnhap);
        edtMk = findViewById(R.id.edittextmatkhau);
        edtTk = findViewById(R.id.edittexttaikhoan);
        txtKetqua = findViewById(R.id.textviewketqua);

        btnDangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taikhoan = edtTk.getText().toString();
                String matkhau = edtMk.getText().toString();

                String outputtk = getResources().getString(R.string.outputtaikhoan);
                String outputmk = getResources().getString(R.string.outputmatkhau);


                txtKetqua.setText(outputtk  + taikhoan + "\n" + outputmk + matkhau);
            }
        });
    }
}
