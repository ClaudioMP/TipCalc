package edu.galileo.claudio.tipcalc;

import android.app.Application;

/**
 * Created by claudio on 31-05-16.
 */
public class TipCalcApp extends Application{
    private static final String ABOUT_URL = "http://www.udec.cl/~clmaldonado";
    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
