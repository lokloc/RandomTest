package com.example.quizz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class CategoriesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Categories");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.rv);

        LinearLayoutManager layoutManager = new LinearLayoutManager();
        layoutManager.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        List<CategoryModel> list = new ArrayList<>();
        list.add(new CategoryModel("","카테고리(1)"));
        list.add(new CategoryModel("","카테고리(2)"));
        list.add(new CategoryModel("","카테고리(3)"));
        list.add(new CategoryModel("","카테고리(4)"));
        list.add(new CategoryModel("","카테고리(5)"));
        list.add(new CategoryModel("","카테고리(6)"));
        list.add(new CategoryModel("","카테고리(7)"));
        list.add(new CategoryModel("","카테고리(8)"));
        list.add(new CategoryModel("","카테고리(9)"));
        list.add(new CategoryModel("","카테고리(10)"));
        list.add(new CategoryModel("","카테고리(11)"));
        list.add(new CategoryModel("","카테고리(12)"));

        CategoryAdapter adapter = new CategoryAdapter(list);
        recyclerView.setAdapter(adapter);
    }

/*    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){

            finish();
        }
        return super.onOptionsItemSelected(item);*/
    }
}
