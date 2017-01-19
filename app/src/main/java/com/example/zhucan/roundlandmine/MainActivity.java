package com.example.zhucan.roundlandmine;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button bt = (Button) findViewById(R.id.button1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this).setTitle("用户协议")
                        .setIcon(R.mipmap.ic_launcher).setMessage("一切解释权归本公司所有");
                setPositiveButton(builder);
                setNegativeButton(builder).create().show();



            }
            private AlertDialog.Builder setPositiveButton(AlertDialog.Builder builder){
                return builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"已阅读本内容",Toast.LENGTH_LONG).show();
                    }
                });
            }
            private AlertDialog.Builder setNegativeButton(AlertDialog.Builder builder){
                return builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"不同意本协议",Toast.LENGTH_LONG).show();
                    }
                });
            }

        });
    }
            public void ture(View view) {
                Intent intent = new Intent(MainActivity.this, Useragree.class);
                startActivity(intent);

            }
        }
