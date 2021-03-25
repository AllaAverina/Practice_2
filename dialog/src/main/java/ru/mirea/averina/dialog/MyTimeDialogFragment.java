package ru.mirea.averina.dialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyTimeDialogFragment extends DialogFragment {
    int myHour, myMinute;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        TimePickerDialog tpd = new TimePickerDialog(getActivity(), tl, myHour, myMinute,
                true);
        return tpd;
    }

    TimePickerDialog.OnTimeSetListener tl = new TimePickerDialog.OnTimeSetListener() {
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            myHour = hourOfDay;
            myMinute = minute;
            Toast.makeText(getActivity(),
                    "Time is " + myHour + " hours " + myMinute + " minutes",
                    Toast.LENGTH_LONG).show();
        }
    };
}
