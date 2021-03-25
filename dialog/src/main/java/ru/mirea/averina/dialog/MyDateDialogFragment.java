package ru.mirea.averina.dialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyDateDialogFragment extends DialogFragment {
    int myYear, myMonth, myDay;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        DatePickerDialog tpd = new DatePickerDialog(getActivity(), dl, myYear, myMonth, myDay);
        return tpd;
    }

    DatePickerDialog.OnDateSetListener dl = new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            myYear = year;
            myMonth = monthOfYear + 1;
            myDay = dayOfMonth;
            Toast.makeText(getActivity(), "Date is " + myDay + "." + myMonth + "." + myYear,
                    Toast.LENGTH_LONG).show();
        }
    };
}
