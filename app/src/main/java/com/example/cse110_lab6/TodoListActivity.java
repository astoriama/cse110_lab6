package com.example.cse110_lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class TodoListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_list);

        List<TodoListItem> todos = TodoListItem.loadJSON(this, "demo_todo.json");
        Log.d("TodoListActivity", todos.toString());
    }
}