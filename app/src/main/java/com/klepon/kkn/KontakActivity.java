package com.klepon.kkn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.klepon.kkn.adapters.adapterKontak;
import com.klepon.kkn.adapters.adapterKuliner;
import com.klepon.kkn.model.modelKontak;

import java.util.ArrayList;
import java.util.List;

import static java.net.Proxy.Type.HTTP;

public class KontakActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private adapterKontak adapter;
    private ArrayList<modelKontak> KontakAL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontak);
    }



    public void Telefon(View view) {
        Toast.makeText(this, "Mengarah ke aplikasi Telepon", Toast.LENGTH_SHORT).show();
        Uri number = Uri.parse("tel: 02476922081");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);

        startActivity(callIntent);
    }

    public void Instagram(View view) {
        Toast.makeText(this, "Mengarah Ke Instagtam Keluarahan Pongangan", Toast.LENGTH_SHORT).show();
        Uri uri = Uri.parse("http://instagram/_u/pongangansquad");

        Intent insta = new Intent(Intent.ACTION_VIEW,uri);
        insta.setPackage("com.instagram.android");

        if(isIntentAvailable(getApplicationContext(),insta)){
            startActivity(insta);
        }else{
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/pongangansquad")));
        }
    }

    public void Email(View view) {
        Toast.makeText(this, "Mengarah Ke Email", Toast.LENGTH_SHORT).show();
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO,
                Uri.fromParts("mailto", "kelurahanpongangan@gmail.com", null));
        //emailIntent.putExtra(Intent.EXTRA_EMAIL, /*...*/);
        //emailIntent.putExtra(Intent.EXTRA_SUBJECT, /*...*/);
        //emailIntent.putExtra(Intent.EXTRA_TEXT, /*...*/);
        startActivityForResult(emailIntent, 1);


    }

    private boolean isIntentAvailable(Context ctx, Intent intent){
        final PackageManager packageManager = ctx.getPackageManager();
        List<ResolveInfo> list = packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
        return list.size() >0;
    }
}
