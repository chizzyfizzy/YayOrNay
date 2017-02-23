package com.ist440.mitchell.yay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

import java.util.ArrayList;
import java.util.List;



public class FrontPage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);
        initializeUI();
        listViewItemClick();
        uploadButtonClick();

    }

    public void initializeUI(){
        //initialize variables here
        ListView categoryListView = (ListView)findViewById(R.id.categoriesListView);
        ArrayList<String> categoryArray = new ArrayList<String>();

        //Create dummy data
        categoryArray.add("Technology");
        categoryArray.add("Cars");
        categoryArray.add("Books");
        categoryArray.add("Arts & Crafts");
        categoryArray.add("Toys");
        //Create Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, categoryArray);

        //Put data into listview
        categoryListView.setAdapter(adapter);

    }

    public void listViewItemClick(){
        final ListView categoryListView = (ListView) findViewById(R.id.categoriesListView);
        categoryListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Intent intent;

                switch(position) {
                    case 0:
                        intent = new Intent(FrontPage.this, Technology.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(FrontPage.this, Cars.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(FrontPage.this, Books.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(FrontPage.this, ArtsCrafts.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(FrontPage.this, Toys.class);
                        startActivity(intent);
                        break;
                }




            }
        });
    }

    public void uploadButtonClick(){
        Button uB = (Button) findViewById(R.id.uploadButton);
        uB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FrontPage.this, ChosenCategory.class);
                startActivity(intent);
            }
        });
    }


}

/* Trying to get SPinner on click action fixed
    public void initializeUI(){

        //create list of dummy data
        ArrayList<String> spinnerArray = new ArrayList<String>();
        spinnerArray.add("Technology");
        spinnerArray.add("Cars");
        spinnerArray.add("Books");
        spinnerArray.add("Arts & Crafts");

        //Create Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);

        //Putt data in spinner
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sItems = (Spinner) findViewById(R.id.spinnerList);
        sItems.setAdapter(adapter);


        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
    }
        sItems.setOnItemClickListener(new OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id){

            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        });

    }
}*/
