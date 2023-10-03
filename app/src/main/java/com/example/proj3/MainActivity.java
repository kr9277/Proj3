package com.example.proj3;
/** @author Created by karin on 18/9/2023.
 * @version 0.0
 * @since 18/9/2023
 *The application has a general menu with 3 colors, clicking on any color will change the background on the screen to the corresponding color
 */

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
    }
    /**
     * The action accepts a parameter of type menu
     * The action activates the context menu
     */
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.tafrit, menu);
        return super.onCreateOptionsMenu(menu);
    }
    /**
     * The operation accepts as a variable parameter a menu bar type selected by the user
     * The action calls the sub-function and changes the color of the screen according to the selected option
     */
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        String str = item.getTitle().toString();
        if(str.equals("Red")){
            setActivityBackgroundColor(Color.parseColor("#FF0000"));
        }
        else if(str.equals("Green")){
            setActivityBackgroundColor(Color.parseColor("#00FF00"));
        }
        else if(str.equals("Blue")){
            setActivityBackgroundColor(Color.parseColor("#0000FF"));
        }
        return super.onOptionsItemSelected(item);
    }
    /**
     * This is a subfunction that gets as a color parameter
     * The function changes the color of the screen to the color it received
     */
    public void setActivityBackgroundColor(int color) {
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }
    /**
     * This function will be called when the user will press the button
     * It sends the intent to the next activity
     */
    public void go(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}