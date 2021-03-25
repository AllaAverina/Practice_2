package ru.mirea.averina.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDialog(View view) {
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }


    public void onClickShowTimePickerDialog(View view) {
        MyTimeDialogFragment tdf = new MyTimeDialogFragment();
        tdf.show(getSupportFragmentManager(), "mirea");
    }

    public void onClickShowDatePickerDialog(View view) {
        MyDateDialogFragment ddf = new MyDateDialogFragment();
        ddf.show(getSupportFragmentManager(), "mirea");
    }

    public void onClickShowProgressDialog(View view) {
        MyProgressDialogFragment pdf = new MyProgressDialogFragment();
        pdf.show(getSupportFragmentManager(), "mirea");
    }
}