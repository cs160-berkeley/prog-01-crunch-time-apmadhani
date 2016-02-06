package cs160.apmadhani.crunchtime;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private int calories;
    private EditText calorie;
    private EditText pushup;
    private EditText situp;
    private EditText jumpingjacks;
    private EditText jogging;
    private EditText pullup;
    private EditText legLift;
    private EditText squat;
    private EditText cycling;
    private EditText plank;
    private EditText swimming;
    private EditText stairclimbing;
    private EditText walking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calories = 0;
        calorie = (EditText) findViewById(R.id.calNum);
        pushup = (EditText) findViewById(R.id.pushupNum);
        situp = (EditText) findViewById(R.id.situpNum);
        jumpingjacks = (EditText) findViewById(R.id.jumpingJacksNum);
        jogging = (EditText) findViewById(R.id.joggingNum);
        pullup = (EditText) findViewById(R.id.pullupsNum);
        legLift = (EditText) findViewById(R.id.legLiftsNum);
        squat = (EditText) findViewById(R.id.squatsNum);
        cycling = (EditText) findViewById(R.id.cyclingNum);
        plank = (EditText) findViewById(R.id.planksNum);
        swimming = (EditText) findViewById(R.id.swimmingNum);
        stairclimbing = (EditText) findViewById(R.id.stairClimbingNum);
        walking = (EditText) findViewById(R.id.walkingNum);

        calorie.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (calorie.hasFocus()){
                    try {
                        calories = Integer.parseInt(s.toString());
                        pushup.setText("" + calories * 350 / 100);
                        situp.setText("" + calories * 200 / 100);
                        squat.setText("" + calories * 225 / 100);
                        legLift.setText("" + calories * 25 / 100);
                        plank.setText("" + calories * 25 / 100);
                        jumpingjacks.setText("" + calories * 10 / 100);
                        pullup.setText("" + calories);
                        cycling.setText("" + calories * 12 / 100);
                        walking.setText("" + calories * 20 / 100);
                        jogging.setText("" + calories * 12 / 100);
                        swimming.setText("" + calories * 13 / 100);
                        stairclimbing.setText("" + calories * 15 / 100);
                    } catch (NumberFormatException e){
                            Log.e("error", "error", e);
                            pushup.setText(null);
                            situp.setText(null);
                            squat.setText(null);
                            legLift.setText(null);
                            plank.setText(null);
                            jumpingjacks.setText(null);
                            pullup.setText(null);
                            cycling.setText(null);
                            walking.setText(null);
                            jogging.setText(null);
                            swimming.setText(null);
                            stairclimbing.setText(null);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        pushup.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (pushup.hasFocus()) {
                    try {
                        calories = Integer.parseInt(s.toString()) * 100 / 350;
                        calorie.setText("" + calories);
                        situp.setText("" + calories * 200 / 100);
                        squat.setText("" + calories * 225 / 100);
                        legLift.setText("" + calories * 25 / 100);
                        plank.setText("" + calories * 25 / 100);
                        jumpingjacks.setText("" + calories * 10 / 100);
                        pullup.setText("" + calories);
                        cycling.setText("" + calories * 12 / 100);
                        walking.setText("" + calories * 20 / 100);
                        jogging.setText("" + calories * 12 / 100);
                        swimming.setText("" + calories * 13 / 100);
                        stairclimbing.setText("" + calories * 15 / 100);
                    } catch (NumberFormatException e) {
                        Log.e("error", "error", e);
                        calorie.setText(null);
                        situp.setText(null);
                        squat.setText(null);
                        legLift.setText(null);
                        plank.setText(null);
                        jumpingjacks.setText(null);
                        pullup.setText(null);
                        cycling.setText(null);
                        walking.setText(null);
                        jogging.setText(null);
                        swimming.setText(null);
                        stairclimbing.setText(null);

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        situp.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (situp.hasFocus()) {
                    try {
                        calories = Integer.parseInt(s.toString()) * 100 / 200;
                        calorie.setText("" + calories);
                        pushup.setText("" + calories * 350 / 100);
                        squat.setText("" + calories * 225 / 100);
                        legLift.setText("" + calories * 25 / 100);
                        plank.setText("" + calories * 25 / 100);
                        jumpingjacks.setText("" + calories * 10 / 100);
                        pullup.setText("" + calories);
                        cycling.setText("" + calories * 12 / 100);
                        walking.setText("" + calories * 20 / 100);
                        jogging.setText("" + calories * 12 / 100);
                        swimming.setText("" + calories * 13 / 100);
                        stairclimbing.setText("" + calories * 15 / 100);
                    } catch (NumberFormatException e) {
                        Log.e("error", "error", e);
                        pushup.setText(null);
                        calorie.setText(null);
                        squat.setText(null);
                        legLift.setText(null);
                        plank.setText(null);
                        jumpingjacks.setText(null);
                        pullup.setText(null);
                        cycling.setText(null);
                        walking.setText(null);
                        jogging.setText(null);
                        swimming.setText(null);
                        stairclimbing.setText(null);

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        swimming.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (swimming.hasFocus()) {
                    try {
                        calories = Integer.parseInt(s.toString()) * 100 / 13;
                        calorie.setText("" + calories);
                        pushup.setText("" + calories * 350 / 100);
                        squat.setText("" + calories * 225 / 100);
                        legLift.setText("" + calories * 25 / 100);
                        plank.setText("" + calories * 25 / 100);
                        jumpingjacks.setText("" + calories * 10 / 100);
                        pullup.setText("" + calories);
                        cycling.setText("" + calories * 12 / 100);
                        walking.setText("" + calories * 20 / 100);
                        jogging.setText("" + calories * 12 / 100);
                        situp.setText("" + calories * 200 / 100);
                        stairclimbing.setText("" + calories * 15 / 100);
                    } catch (NumberFormatException e) {
                        Log.e("error", "error", e);
                        pushup.setText(null);
                        situp.setText(null);
                        squat.setText(null);
                        legLift.setText(null);
                        plank.setText(null);
                        jumpingjacks.setText(null);
                        pullup.setText(null);
                        cycling.setText(null);
                        walking.setText(null);
                        jogging.setText(null);
                        calorie.setText(null);
                        stairclimbing.setText(null);

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        squat.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (squat.hasFocus()) {
                    try {
                        calories = Integer.parseInt(s.toString()) * 100 / 225;
                        calorie.setText("" + calories);
                        pushup.setText("" + calories * 350 / 100);
                        situp.setText("" + calories * 200 / 100);
                        legLift.setText("" + calories * 25 / 100);
                        plank.setText("" + calories * 25 / 100);
                        jumpingjacks.setText("" + calories * 10 / 100);
                        pullup.setText("" + calories);
                        cycling.setText("" + calories * 12 / 100);
                        walking.setText("" + calories * 20 / 100);
                        jogging.setText("" + calories * 12 / 100);
                        swimming.setText("" + calories * 13 / 100);
                        stairclimbing.setText("" + calories * 15 / 100);
                    } catch (NumberFormatException e) {
                        Log.e("error", "error", e);
                        pushup.setText(null);
                        situp.setText(null);
                        calorie.setText(null);
                        legLift.setText(null);
                        plank.setText(null);
                        jumpingjacks.setText(null);
                        pullup.setText(null);
                        cycling.setText(null);
                        walking.setText(null);
                        jogging.setText(null);
                        swimming.setText(null);
                        stairclimbing.setText(null);

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        legLift.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (legLift.hasFocus()) {
                    try {
                        calories = Integer.parseInt(s.toString()) * 100 / 25;
                        calorie.setText("" + calories);
                        pushup.setText("" + calories * 350 / 100);
                        squat.setText("" + calories * 225 / 100);
                        situp.setText("" + calories * 200 / 100);
                        plank.setText("" + calories * 25 / 100);
                        jumpingjacks.setText("" + calories * 10 / 100);
                        pullup.setText("" + calories);
                        cycling.setText("" + calories * 12 / 100);
                        walking.setText("" + calories * 20 / 100);
                        jogging.setText("" + calories * 12 / 100);
                        swimming.setText("" + calories * 13 / 100);
                        stairclimbing.setText("" + calories * 15 / 100);
                    } catch (NumberFormatException e) {
                        Log.e("error", "error", e);
                        pushup.setText(null);
                        situp.setText(null);
                        squat.setText(null);
                        calorie.setText(null);
                        plank.setText(null);
                        jumpingjacks.setText(null);
                        pullup.setText(null);
                        cycling.setText(null);
                        walking.setText(null);
                        jogging.setText(null);
                        swimming.setText(null);
                        stairclimbing.setText(null);

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        plank.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (plank.hasFocus()) {
                    try {
                        calories = Integer.parseInt(s.toString()) * 100 / 25;
                        calorie.setText("" + calories);
                        pushup.setText("" + calories * 350 / 100);
                        squat.setText("" + calories * 225 / 100);
                        legLift.setText("" + calories * 25 / 100);
                        situp.setText("" + calories * 200 / 100);
                        jumpingjacks.setText("" + calories * 10 / 100);
                        pullup.setText("" + calories);
                        cycling.setText("" + calories * 12 / 100);
                        walking.setText("" + calories * 20 / 100);
                        jogging.setText("" + calories * 12 / 100);
                        swimming.setText("" + calories * 13 / 100);
                        stairclimbing.setText("" + calories * 15 / 100);
                    } catch (NumberFormatException e) {
                        Log.e("error", "error", e);
                        pushup.setText(null);
                        situp.setText(null);
                        squat.setText(null);
                        legLift.setText(null);
                        calorie.setText(null);
                        jumpingjacks.setText(null);
                        pullup.setText(null);
                        cycling.setText(null);
                        walking.setText(null);
                        jogging.setText(null);
                        swimming.setText(null);
                        stairclimbing.setText(null);

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        jumpingjacks.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (jumpingjacks.hasFocus()) {
                    try {
                        calories = Integer.parseInt(s.toString()) * 100 / 10;
                        calorie.setText("" + calories);
                        pushup.setText("" + calories * 350 / 100);
                        squat.setText("" + calories * 225 / 100);
                        legLift.setText("" + calories * 25 / 100);
                        plank.setText("" + calories * 25 / 100);
                        situp.setText("" + calories * 200 / 100);
                        pullup.setText("" + calories);
                        cycling.setText("" + calories * 12 / 100);
                        walking.setText("" + calories * 20 / 100);
                        jogging.setText("" + calories * 12 / 100);
                        swimming.setText("" + calories * 13 / 100);
                        stairclimbing.setText("" + calories * 15 / 100);
                    } catch (NumberFormatException e) {
                        Log.e("error", "error", e);
                        pushup.setText(null);
                        situp.setText(null);
                        squat.setText(null);
                        legLift.setText(null);
                        plank.setText(null);
                        calorie.setText(null);
                        pullup.setText(null);
                        cycling.setText(null);
                        walking.setText(null);
                        jogging.setText(null);
                        swimming.setText(null);
                        stairclimbing.setText(null);

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        pullup.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (pullup.hasFocus()) {
                    try {
                        calories = Integer.parseInt(s.toString());
                        calorie.setText("" + calories);
                        pushup.setText("" + calories * 350 / 100);
                        squat.setText("" + calories * 225 / 100);
                        legLift.setText("" + calories * 25 / 100);
                        plank.setText("" + calories * 25 / 100);
                        jumpingjacks.setText("" + calories * 10 / 100);
                        situp.setText("" + calories*200/100);
                        cycling.setText("" + calories * 12 / 100);
                        walking.setText("" + calories * 20 / 100);
                        jogging.setText("" + calories * 12 / 100);
                        swimming.setText("" + calories * 13 / 100);
                        stairclimbing.setText("" + calories * 15 / 100);
                    } catch (NumberFormatException e) {
                        Log.e("error", "error", e);
                        pushup.setText(null);
                        situp.setText(null);
                        squat.setText(null);
                        legLift.setText(null);
                        plank.setText(null);
                        jumpingjacks.setText(null);
                        calorie.setText(null);
                        cycling.setText(null);
                        walking.setText(null);
                        jogging.setText(null);
                        swimming.setText(null);
                        stairclimbing.setText(null);

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        cycling.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (cycling.hasFocus()) {
                    try {
                        calories = Integer.parseInt(s.toString()) * 100 / 12;
                        calorie.setText("" + calories);
                        pushup.setText("" + calories * 350 / 100);
                        squat.setText("" + calories * 225 / 100);
                        legLift.setText("" + calories * 25 / 100);
                        plank.setText("" + calories * 25 / 100);
                        jumpingjacks.setText("" + calories * 10 / 100);
                        pullup.setText("" + calories);
                        situp.setText("" + calories * 200 / 100);
                        walking.setText("" + calories * 20 / 100);
                        jogging.setText("" + calories * 12 / 100);
                        swimming.setText("" + calories * 13 / 100);
                        stairclimbing.setText("" + calories * 15 / 100);
                    } catch (NumberFormatException e) {
                        Log.e("error", "error", e);
                        pushup.setText(null);
                        situp.setText(null);
                        squat.setText(null);
                        legLift.setText(null);
                        plank.setText(null);
                        jumpingjacks.setText(null);
                        pullup.setText(null);
                        calorie.setText(null);
                        walking.setText(null);
                        jogging.setText(null);
                        swimming.setText(null);
                        stairclimbing.setText(null);

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        walking.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (walking.hasFocus()) {
                    try {
                        calories = Integer.parseInt(s.toString()) * 100 / 20;
                        calorie.setText("" + calories);
                        pushup.setText("" + calories * 350 / 100);
                        squat.setText("" + calories * 225 / 100);
                        legLift.setText("" + calories * 25 / 100);
                        plank.setText("" + calories * 25 / 100);
                        jumpingjacks.setText("" + calories * 10 / 100);
                        pullup.setText("" + calories);
                        cycling.setText("" + calories * 12 / 100);
                        situp.setText("" + calories * 200 / 100);
                        jogging.setText("" + calories * 12 / 100);
                        swimming.setText("" + calories * 13 / 100);
                        stairclimbing.setText("" + calories * 15 / 100);
                    } catch (NumberFormatException e) {
                        Log.e("error", "error", e);
                        pushup.setText(null);
                        situp.setText(null);
                        squat.setText(null);
                        legLift.setText(null);
                        plank.setText(null);
                        jumpingjacks.setText(null);
                        pullup.setText(null);
                        cycling.setText(null);
                        calorie.setText(null);
                        jogging.setText(null);
                        swimming.setText(null);
                        stairclimbing.setText(null);

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        jogging.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (jogging.hasFocus()) {
                    try {
                        calories = Integer.parseInt(s.toString()) * 100 / 12;
                        calorie.setText("" + calories);
                        pushup.setText("" + calories * 350 / 100);
                        squat.setText("" + calories * 225 / 100);
                        legLift.setText("" + calories * 25 / 100);
                        plank.setText("" + calories * 25 / 100);
                        jumpingjacks.setText("" + calories * 10 / 100);
                        pullup.setText("" + calories);
                        cycling.setText("" + calories * 12 / 100);
                        walking.setText("" + calories * 20 / 100);
                        situp.setText("" + calories * 200 / 100);
                        swimming.setText("" + calories * 13 / 100);
                        stairclimbing.setText("" + calories * 15 / 100);
                    } catch (NumberFormatException e) {
                        Log.e("error", "error", e);
                        pushup.setText(null);
                        situp.setText(null);
                        squat.setText(null);
                        legLift.setText(null);
                        plank.setText(null);
                        jumpingjacks.setText(null);
                        pullup.setText(null);
                        cycling.setText(null);
                        walking.setText(null);
                        calorie.setText(null);
                        swimming.setText(null);
                        stairclimbing.setText(null);

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        stairclimbing.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (stairclimbing.hasFocus()) {
                    try {
                        calories = Integer.parseInt(s.toString()) * 100 / 15;
                        calorie.setText("" + calories);
                        pushup.setText("" + calories * 350 / 100);
                        squat.setText("" + calories * 225 / 100);
                        legLift.setText("" + calories * 25 / 100);
                        plank.setText("" + calories * 25 / 100);
                        jumpingjacks.setText("" + calories * 10 / 100);
                        pullup.setText("" + calories);
                        cycling.setText("" + calories * 12 / 100);
                        situp.setText("" + calories * 200 / 100);
                        jogging.setText("" + calories * 12 / 100);
                        swimming.setText("" + calories * 13 / 100);
                        walking.setText("" + calories * 20 / 100);
                    } catch (NumberFormatException e) {
                        Log.e("error", "error", e);
                        pushup.setText(null);
                        situp.setText(null);
                        squat.setText(null);
                        legLift.setText(null);
                        plank.setText(null);
                        jumpingjacks.setText(null);
                        pullup.setText(null);
                        cycling.setText(null);
                        walking.setText(null);
                        jogging.setText(null);
                        swimming.setText(null);
                        calorie.setText(null);

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });






    }
}
