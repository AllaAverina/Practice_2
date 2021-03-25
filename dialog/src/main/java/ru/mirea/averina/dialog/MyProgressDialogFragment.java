package ru.mirea.averina.dialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        ProgressDialog pd = new ProgressDialog(getActivity());
        pd.setTitle("Прогресс");
        pd.setMessage("Подождите...");
        pd.setButton(Dialog.BUTTON_POSITIVE, "Подождать", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(getActivity(), "Дождались!", Toast.LENGTH_LONG).show();
            }
        });
        return pd;
    }
}
