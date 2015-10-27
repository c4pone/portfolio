package de.codebuster.florian.portfolio;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Created by florian on 10/27/15.
 */
public class ToastClickListener implements View.OnClickListener {
    Context ctx;
    CharSequence msg;

    public ToastClickListener(CharSequence msg, Context ctx) {
        this.msg = msg;
        this.ctx = ctx;
    }

    @Override
    public void onClick(View view) {
        Toast toast = Toast.makeText(
                this.ctx,
                this.msg,
                Toast.LENGTH_SHORT);
        toast.show();
    }
}
