package com.example.shanay.internship;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {
    ListView list;
    int n;
    String[] web = {
            "SAIBA",
            "SATA",
            "BimaPro",
            "SARB",
            "TrOMA",
            "MORE",

    } ;
    Integer[] imageId = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomList adapter = new
                CustomList(MainActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
          n=position;

                if(n!=5) {
                    Intent i = new Intent(MainActivity.this, Description.class);
                    i.putExtra("no",n);
                    startActivity(i);
                }
                else
                {
                    Intent i = new Intent(MainActivity.this, WebpageListActivity.class);

                    startActivity(i);
                }

            }
        });

    }
   /* public void onClick(View view){
        if(n!=5) {
            Intent i = new Intent(this, Description.class);
            startActivity(i);
        }
        else
        {
            Intent i = new Intent(this, More.class);
            startActivity(i);
        }



    }*/

}