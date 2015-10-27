package de.codebuster.florian.portfolio;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Created by florian on 10/27/15.
 */
public class ToastClickListener implements View.OnClickListener {
    MainActivity ctx;
    CharSequence msg;

    public ToastClickListener(CharSequence msg, MainActivity ctx) {
        this.msg = msg;
        this.ctx = ctx;
    }

    @Override
    public void onClick(View view) {
        if (ctx.getToast() != null) {
            ctx.getToast().cancel();
        }

        ctx.setToast(Toast.makeText(
                this.ctx,
                this.msg,
                Toast.LENGTH_SHORT
        ));

        ctx.getToast().show();
    }
}
