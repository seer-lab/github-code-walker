package com.example.adam.myapplication;

import android.view.View;

/**
 * Created by Adamin on 2016-08-15.
 *
 * Listener for highlighting selected files.
 *
 */
public abstract class HighlightListener implements View.OnClickListener {
    SelectHighlight selector;
    String name;
    String rawUrl;
    ShowCode showCode;
        public HighlightListener(SelectHighlight selector, String name, String rawUrl, ShowCode showCode){
            super();
            this.selector = selector;
            this.name = name;
            this.rawUrl = rawUrl;
            this.showCode = showCode;
        }
}
