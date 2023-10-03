package com.example.proj3;
/** @author Created by karin on 18/9/2023.
 * @version 0.0
 * @since 18/9/2023
 *In this Activity you will have the option to choose another color in addition to the other three colors
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

public class MainActivity2 extends AppCompatActivity {
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn2 = findViewById(R.id.btn2);
        // This parameter is of intent type and it receives the intent that is assigned from the first activity
        Intent intent = getIntent();
    }
    /**
     * The action accepts a parameter of type menu
     * The action activates the context menu and adds another option to choose
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.tafrit, menu);
        menu.add(0,0,350, "Yellow");
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
        else if(str.equals("Yellow")){
            setActivityBackgroundColor(Color.parseColor("#FFFF00"));
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
     * It sends the intent to the previous activity
     */
    public void go2(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}