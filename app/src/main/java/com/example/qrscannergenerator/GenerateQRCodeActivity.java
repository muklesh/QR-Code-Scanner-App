package com.example.qrscannergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.zxing.WriterException;

import androidmads.library.qrgenearator.QRGContents;
import androidmads.library.qrgenearator.QRGEncoder;

public class GenerateQRCodeActivity extends AppCompatActivity {

    private TextView qrCodeTV;
    private ImageView qrCodeIV;
    private TextInputEditText dataEdt;
    private Button generateQRBTN;
    private QRGEncoder qrgEncoder;
    private Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_qrcode);
        qrCodeTV = findViewById(R.id.idTVGenerateQR);
        qrCodeIV = findViewById(R.id.idIVQRCode);
        dataEdt = findViewById(R.id.idEdtData);
        generateQRBTN = findViewById(R.id.idBtnGenerateQR);
//        generateQRBTN.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View V) {
//                String data = dataEdt.getText().toString();
//                if (data.isEmpty()){
//                    Toast.makeText(GenerateQRCodeActivity.this,"Please enter some data to generate QR Code......",Toast.LENGTH_SHORT).show();
//                }else {
//                    WindowManager manager = (WindowManager) getSystemService(WINDOW_SERVICE);
//                    Display display = manager.getDefaultDisplay();
//                    Point point = new Point();
//                    display.getSize(point);
//                    int width = point.x;
//                    int height = point.y;
//                    int dimen = width<height ? width:height;
//                    dimen = dimen * 3/4;
//
//                    qrgEncoder = new QRGEncoder(dataEdt.getText().toString(),null, QRGContents.Type.TEXT,dimen);
//                    try {
//                        bitmap =  qrgEncoder.encodeAsBitmap();
//                        qrCodeIV.setVisibility(View.GONE);
//                        qrCodeIV.setImageBitmap(bitmap);
//                    }catch (WriterException e){
//                        e.printStackTrace();
//                    }
//
//                }
//            }
//        });
    }
}