package ucucite.edu.agrihouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class AgriHouseList extends AppCompatActivity {

    GridView listView;
    GridViewAdapter adapter;
    String[] title;
    String[] description;
    int[] icon;
    ArrayList<Model> arrayList = new ArrayList<Model>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agri_house_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Agri House");

        title = new String[]{"Alugbati","Ampalaya","Banana","Cabbage","Calamansi","Carrots","Celery","Cocumber",
                "Corn","Eggplant","Ginger","Kangkong","Lettuce","Manggo","Mustasa","Onion","Papaya","Patola","Rice",
                "Sigarilyas","Sitaw","Upo","Watermelon"};
        description = new String[]{
                "Click to View Details","Click to View Details","Click to View Details","Click to View Details","Click to View Details",
                "Click to View Details","Click to View Details","Click to View Details","Click to View Details","Click to View Details",
                "Click to View Details","Click to View Details","Click to View Details","Click to View Details","Click to View Details",
                "Click to View Details","Click to View Details","Click to View Details","Click to View Details","Click to View Details",
                "Click to View Details","Click to View Details","Click to View Details",
               };
        icon = new int[]{R.drawable.alugbati, R.drawable.ampalaya, R.drawable.banana, R.drawable.cabbage, R.drawable.calamansi, R.drawable.carrots,
                R.drawable.celery, R.drawable.cocumber,R.drawable.corn,R.drawable.eggplant,R.drawable.ginger,R.drawable.kangkong,
                R.drawable.lettuce,R.drawable.mango,R.drawable.mustasa,R.drawable.onion,R.drawable.papaya,R.drawable.patola,
                R.drawable.rice,R.drawable.sigarilyas,R.drawable.sitaw,R.drawable.upo,R.drawable.watermelon};


        listView = findViewById(R.id.gridview);

        for (int i =0; i<title.length; i++){
            Model agri = new Model(title[i], description[i], icon[i]);
            //bind all strings in an array
            arrayList.add(agri);
        }

        //pass results to GridViewAdapter class
        adapter = new GridViewAdapter(this, arrayList);

        //bind the adapter to the GridView
        listView.setAdapter(adapter);

    }

    //Search data Code
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.search_view);
        SearchView searchView = (SearchView)myActionMenuItem.getActionView();
        searchView.setQueryHint("Search Seed...");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener()

        {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    adapter.filter(s);
                }
                return true;
            }
        });
        return true;
    }



    //About us and Exit
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.aboutus){
            Intent intent = new Intent(this, Developers.class);
            startActivity(intent);

        }else if(item.getItemId()==R.id.exit)
        {
            new AlertDialog.Builder(AgriHouseList.this)
                    .setTitle("AgriHouse")
                    .setMessage("Are you sure you want to exit?")
                    .setIcon(R.drawable.agrilogo)
                    .setPositiveButton("YES",
                            new DialogInterface.OnClickListener() {
                                @TargetApi(11)
                                public void onClick(DialogInterface dialog, int id) {
                                    finishAffinity();
                                }
                            })
                    .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                        @TargetApi(11)
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    }).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
