package com.example.testcalc;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.annotation.SuppressLint;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    double num=0; // number
    double [] num_arr = new double[100];
    int i = 0; //for num array

    char[] op_arr = new char[100];
    int j=0;

    boolean mul=false; //if the next num is to be multiplied with the previous num.

    boolean min=false; //if the number is negative, by default it will be positive.

    boolean div = false; // if the next num is to be divided with the previous num

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void one(View v){

        // resetting answer text to nothing in case there was an answer previously
        TextView ah = findViewById(R.id.answer_hello);
        ah.setText("");


        TextView msg = findViewById(R.id.msg);
        msg.setText(""); //we make msg empty in case there was an error
        // message before

        TextView h = findViewById(R.id.hello);
        String new_h=h.getText()+"1";  // concatenating the new number

        num=num*10+1; // to make the number to put in num_arr

        h.setText(new_h);
    }

    public void two(View v){

        // resetting answer text to nothing in case there was an answer previously
        TextView ah = findViewById(R.id.answer_hello);
        ah.setText("");


        TextView msg = findViewById(R.id.msg);
        msg.setText("");//we make msg empty in case there was an error
        // message before

        TextView h = findViewById(R.id.hello);
        String new_h=h.getText()+"2"; // concatenating the new number

        num = num*10+2;  // to make the number to put in num_arr

        h.setText(new_h);
    }

    public void three(View v){

        // resetting answer text to nothing in case there was an answer previously
        TextView ah = findViewById(R.id.answer_hello);
        ah.setText("");

        TextView msg = findViewById(R.id.msg);
        msg.setText("");//we make msg empty in case there was an error
        // message before

        TextView h = findViewById(R.id.hello);
        String new_h=h.getText()+"3"; // concatenating the new number

        num = num*10+3;  // to make the number to put in num_arr

        h.setText(new_h);
    }

    public void four(View v){

        // resetting answer text to nothing in case there was an answer previously
        TextView ah = findViewById(R.id.answer_hello);
        ah.setText("");

        TextView msg = findViewById(R.id.msg);
        msg.setText("");//we make msg empty in case there was an error
        // message before

        TextView h = findViewById(R.id.hello);
        String new_h=h.getText()+"4"; // concatenating the new number

        num = num*10+4;  // to make the number to put in num_arr

        h.setText(new_h);
    }

    public void five(View v){

        // resetting answer text to nothing in case there was an answer previously
        TextView ah = findViewById(R.id.answer_hello);
        ah.setText("");

        TextView msg = findViewById(R.id.msg);
        msg.setText("");//we make msg empty in case there was an error
        // message before

        TextView h = findViewById(R.id.hello);
        String new_h=h.getText()+"5"; // concatenating the new number

        num = num*10+5;  // to make the number to put in num_arr

        h.setText(new_h);
    }

    public void six(View v){

        // resetting answer text to nothing in case there was an answer previously
        TextView ah = findViewById(R.id.answer_hello);
        ah.setText("");

        TextView msg = findViewById(R.id.msg);
        msg.setText("");//we make msg empty in case there was an error
        // message before

        TextView h = findViewById(R.id.hello);
        String new_h=h.getText()+"6"; // concatenating the new number

        num = num*10+6;  // to make the number to put in num_arr

        h.setText(new_h);
    }

    public void seven(View v){


        // resetting answer text to nothing in case there was an answer previously
        TextView ah = findViewById(R.id.answer_hello);
        ah.setText("");

        TextView msg = findViewById(R.id.msg);
        msg.setText("");//we make msg empty in case there was an error
        // message before

        TextView h = findViewById(R.id.hello);
        String new_h=h.getText()+"7"; // concatenating the new number

        num = num*10+7;  // to make the number to put in num_arr

        h.setText(new_h);
    }

    public void eight(View v){


        // resetting answer text to nothing in case there was an answer previously
        TextView ah = findViewById(R.id.answer_hello);
        ah.setText("");

        TextView msg = findViewById(R.id.msg);
        msg.setText("");//we make msg empty in case there was an error
        // message before

        TextView h = findViewById(R.id.hello);
        String new_h=h.getText()+"8"; // concatenating the new number

        num = num*10+8;  // to make the number to put in num_arr

        h.setText(new_h);
    }

    public void nine(View v){


        // resetting answer text to nothing in case there was an answer previously
        TextView ah = findViewById(R.id.answer_hello);
        ah.setText("");

        TextView msg = findViewById(R.id.msg);
        msg.setText("");//we make msg empty in case there was an error
        // message before

        TextView h = findViewById(R.id.hello);
        String new_h=h.getText()+"9"; // concatenating the new number

        num = num*10+9;  // to make the number to put in num_arr

        h.setText(new_h);
    }

    public void zero(View v){


        // resetting answer text to nothing in case there was an answer previously
        TextView ah = findViewById(R.id.answer_hello);
        ah.setText("");

        TextView msg = findViewById(R.id.msg);
        msg.setText("");//we make msg empty in case there was an error
        // message before

        TextView h = findViewById(R.id.hello);

        int len = h.length();

        if (len==0){ // because if len is zero then the check to see if last character will fail
                    // since we are taking index of len -1 which is -1

            String new_h=h.getText()+"0"; // concatenating the new number

            num = num*10+0;  // to make the number to put in num_arr

            h.setText(new_h);
        }

        else if (h.getText().toString().charAt(len-1)=='/'){
            msg.setText("Division by zero is not possible.");
        }

        else{
            String new_h=h.getText()+"0"; // concatenating the new number

            num = num*10+0;  // to make the number to put in num_arr

            h.setText(new_h);
        }




    }

    public void plus(View v){


        // resetting answer text to nothing in case there was an answer previously
        TextView ah = findViewById(R.id.answer_hello);
        ah.setText("");

        TextView h = findViewById(R.id.hello);

        // getting the length of the string to check if the last letter
        //is already '+'

        int len= h.length();
        String str_h = h.getText().toString(); //char sequence to string
        char last = 'e'; //initializing last with random value

        if (len !=0){
            last = str_h.charAt(len-1);
        }


        if (last=='+'){ // if last letter is '+', no need to put '+' again
            TextView msg = findViewById(R.id.msg);
            msg.setText("You have already put a '+' symbol!");
        }
        else{
            String new_h=h.getText()+"+";
            h.setText(new_h);

            if (new_h.length() != 1){ // if new_h length is 1, then that means string is "+" which
                                        //means there was no num before it
                if (min){
                    num=-num; // if number is negative
                    min = false;
                }

                if (new_h.charAt(new_h.length()-2)=='x'){
                    //do nothing because 'x' is already pushing a number into an array and we dont
                    //want to do that twice.

                }

                else if (mul){
                    num_arr[i-1]=num_arr[i-1]*num;
                    num_arr[i]=0;
                    mul=false;
                }
                else if (div){ // if mul is true, that means this current num is to be multiplied with
                    //the previous num and put in the previous nums place.
                    num_arr[i-1]=num_arr[i-1]/num; // we put the multiplied num into the index of the first
                    //multiplicator

                    num_arr[i]=0;  // we make the current num as 0 since the current num exists as a product
                    // with the first multiplicator in the index of the first multiplicator

                    num=0;  // we reset num to zero as we always do

                    div=false; //reset mul to false since we finished multiplying.
                }
                else{
                    num_arr[i]=num; // we can now put num in array since num is complete
                    i++;
                }



                num=0; //reset num

            }


        }

    }

    public void minus(View v){


        //same process as plus


        // resetting answer text to nothing in case there was an answer previously
        TextView ah = findViewById(R.id.answer_hello);
        ah.setText("");


        TextView h = findViewById(R.id.hello);
        String new_h=h.getText()+"-";
        h.setText(new_h);
        int len = new_h.length();

        if (len != 1){ // if new_h length is 1, then that means string is "-" which
            //means there was no num before it
            if (min){
                num=-num; // if number is negative
                min = false;
            }

            if (new_h.charAt(len-2)=='x' || new_h.charAt(len-2)=='+' || new_h.charAt(len-2)=='/'){
                //do nothing because 'x' is already pushing a number into an array and we dont
                     //want to do that twice.

                }

                else if (mul){
                    num_arr[i-1]=num_arr[i-1]*num;
                    num_arr[i]=0;
                    mul=false;
                }

                else if (div){ // if mul is true, that means this current num is to be multiplied with
                //the previous num and put in the previous nums place.
                num_arr[i-1]=num_arr[i-1]/num; // we put the multiplied num into the index of the first
                //multiplicator

                num_arr[i]=0;  // we make the current num as 0 since the current num exists as a product
                // with the first multiplicator in the index of the first multiplicator

                num=0;  // we reset num to zero as we always do

                div=false; //reset mul to false since we finished multiplying.
                 }

                else{
                    num_arr[i]=num; // we can now put num in array since num is complete
                    i++;
                }


                num=0; //reset num





        }

        // exclusive to minus
        min = true; //setting minus for next number



    }

    public void multiply(View v){ // make case for two multiplication signs

        TextView h = findViewById(R.id.hello);
        String expression = h.getText().toString(); // making the expression to string
        int len = expression.length(); // getting length of expression to check last and first char

        if (len==0){
            TextView msg = findViewById(R.id.msg);
            msg.setText("Invalid expression: You cannot put a 'x' when there are no numbers.");
        }

        else{
            if (min){
                num=-num; // if number is negative
                min = false;
            }


            num_arr[i]=num; // we can now put num in array since num is complete
             // for the next num

            if (mul==true){ // if mul is true, that means this current num is to be multiplied with
                //the previous num and put in the previous nums place.
                num_arr[i-1]=num_arr[i-1]*num; // we put the multiplied num into the index of the first
                                                //multiplicator

                num_arr[i]=0;  // we make the current num as 0 since the current num exists as a product
                                // with the first multiplicator in the index of the first multiplicator

                num=0;  // we reset num to zero as we always do

                mul=false; //reset mul to false since we finished multiplying.
            }
            else{
                i++; // if we dont multiply then we need to increment index to go on to the next index
                        // for the next num
            }

            String new_h=h.getText()+"x";
            h.setText(new_h);
            mul=true; //since we are putting another 'x', it means mul is true because we are gonna multiply
                        // the previous num with the current num whatever the user inputs


            num=0; //resets num to zero

        }

    }

    public void divide(View v){ //make case for two division signs

        TextView h = findViewById(R.id.hello);
        String expression = h.getText().toString(); // making the expression to string
        int len = expression.length(); // getting length of expression to check last and first char

        if (len==0){
            TextView msg = findViewById(R.id.msg);
            msg.setText("Invalid expression: You cannot put a '/' when there are no numbers.");
        }

        else{
            if (min){
                num=-num; // if number is negative
                min = false;
            }


            num_arr[i]=num; // we can now put num in array since num is complete
            // for the next num

            if (mul==true){ // if mul is true, that means this current num is to be multiplied with
                //the previous num and put in the previous nums place.
                num_arr[i-1]=num_arr[i-1]*num; // we put the multiplied num into the index of the first
                //multiplicator

                num_arr[i]=0;  // we make the current num as 0 since the current num exists as a product
                // with the first multiplicator in the index of the first multiplicator

                num=0;  // we reset num to zero as we always do

                mul=false; //reset mul to false since we finished multiplying.
            }
            else if (div==true){ // if mul is true, that means this current num is to be multiplied with
                //the previous num and put in the previous nums place.
                num_arr[i-1]=num_arr[i-1]/num; // we put the multiplied num into the index of the first
                //multiplicator

                num_arr[i]=0;  // we make the current num as 0 since the current num exists as a product
                // with the first multiplicator in the index of the first multiplicator

                num=0;  // we reset num to zero as we always do

                div=false; //reset mul to false since we finished multiplying.
            }
            else{
                i++; // if we dont multiply then we need to increment index to go on to the next index
                // for the next num
            }



            String new_h=h.getText()+"/";
            h.setText(new_h);
            div=true; //since we are putting another 'x', it means mul is true because we are gonna multiply
            // the previous num with the current num whatever the user inputs


            num=0; //resets num to zero

        }

    }




    public void equal(View v){
        //All error messages:

        TextView h = findViewById(R.id.hello);
        String expression = h.getText().toString(); // making the expression to string
        int len = expression.length(); // getting length of expression to check last xchar

        char last = expression.charAt(len-1); //error message if last char is an operator
        if (last == '+' || last == '-' || last == '/' || last == 'x'){
            TextView msg = findViewById(R.id.msg);
            msg.setText("Invalid expression: You need to put a number after a numerical operator.");
        }

        else{ // if no error messages:

            if (min){
                num=-num; // if number is negative
                min = false;
            }

            if (mul){
                num_arr[i-1]=num_arr[i-1]*num;
                num_arr[i]=0;
                num=0;
                mul=false;
            }
            else if (div){
                num_arr[i-1]=num_arr[i-1]/num;
                num_arr[i]=0;
                num=0;
                mul=false;
            }
            else{
                num_arr[i]=num;
                i++;
            }

            double sum= Arrays.stream(num_arr).sum();


            String str_sum = sum +"";
            TextView ah = findViewById(R.id.answer_hello);
            h.setText("");
            ah.setText(str_sum);




            //Resetting everything

            num=0; // number
            num_arr = new double[100];
            i = 0; //for num array

            mul=false; //if the next num is to be multiplied with the previous num.

            min=false; //if the number is negative, by default it will be positive.

            div = false; // if the next num is to be divided with the previous num





        }


    }

}