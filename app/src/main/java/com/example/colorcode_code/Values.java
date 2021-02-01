package com.example.colorcode_code;

import android.app.Application;
import android.graphics.drawable.ColorDrawable;
import android.widget.Spinner;

import java.util.Hashtable;
import java.util.Locale;

public class Values extends Application {
    Hashtable<String, Integer> dict_ring;
    Hashtable<String, Double> dict_multi;
    Hashtable<String, Double> dict_tole;

    public void Init() {
        try {
            dict_ring = new Hashtable<String, Integer>() {
                {
                    put(getResources().getStringArray(R.array.rings)[0], 0);
                }

                {
                    put(getResources().getStringArray(R.array.rings)[1], 1);
                }

                {
                    put(getResources().getStringArray(R.array.rings)[2], 2);
                }

                {
                    put(getResources().getStringArray(R.array.rings)[3], 3);
                }

                {
                    put(getResources().getStringArray(R.array.rings)[4], 4);
                }

                {
                    put(getResources().getStringArray(R.array.rings)[5], 5);
                }

                {
                    put(getResources().getStringArray(R.array.rings)[6], 6);
                }

                {
                    put(getResources().getStringArray(R.array.rings)[7], 7);
                }

                {
                    put(getResources().getStringArray(R.array.rings)[8], 8);
                }

                {
                    put(getResources().getStringArray(R.array.rings)[9], 9);
                }
            };
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            dict_multi = new Hashtable<String, Double>() {
                {
                    put(getResources().getStringArray(R.array.multi)[0], 10d);
                }

                {
                    put(getResources().getStringArray(R.array.multi)[1], 100d);
                }

                {
                    put(getResources().getStringArray(R.array.multi)[2], 1000d);
                }

                {
                    put(getResources().getStringArray(R.array.multi)[3], 10000d);
                }

                {
                    put(getResources().getStringArray(R.array.multi)[4], 100000d);
                }

                {
                    put(getResources().getStringArray(R.array.multi)[5], 1000000d);
                }

                {
                    put(getResources().getStringArray(R.array.multi)[6], 10000000d);
                }

                {
                    put(getResources().getStringArray(R.array.multi)[7], 0.1);
                }

                {
                    put(getResources().getStringArray(R.array.multi)[8], 0.01);
                }
            };
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            dict_tole = new Hashtable<String, Double>() {
                {
                    put(getResources().getStringArray(R.array.tole)[0], 0.1);
                }

                {
                    put(getResources().getStringArray(R.array.tole)[1], 0.2);
                }

                {
                    put(getResources().getStringArray(R.array.tole)[2], 0.05);
                }

                {
                    put(getResources().getStringArray(R.array.tole)[3], 0.025);
                }

                {
                    put(getResources().getStringArray(R.array.tole)[4], 0.01);
                }

                {
                    put(getResources().getStringArray(R.array.tole)[5], 0.5);
                }

                {
                    put(getResources().getStringArray(R.array.tole)[6], 0.10);
                }
            };
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void setColor(Spinner sp, String color) {

        if (color.equals(getResources().getStringArray(R.array.all_rings)[0])) {
            sp.setBackground(new ColorDrawable(getResources().getColor(R.color.Black, getTheme())));
        } else if (color.equals(getResources().getStringArray(R.array.all_rings)[1])) {
            sp.setBackground(new ColorDrawable(getResources().getColor(R.color.Brown, getTheme())));
        } else if (color.equals(getResources().getStringArray(R.array.all_rings)[2])) {
            sp.setBackground(new ColorDrawable(getResources().getColor(R.color.Red, getTheme())));
        } else if (color.equals(getResources().getStringArray(R.array.all_rings)[3])) {
            sp.setBackground(new ColorDrawable(getResources().getColor(R.color.Orange, getTheme())));
        } else if (color.equals(getResources().getStringArray(R.array.all_rings)[4])) {
            sp.setBackground(new ColorDrawable(getResources().getColor(R.color.Yellow, getTheme())));
        } else if (color.equals(getResources().getStringArray(R.array.all_rings)[5])) {
            sp.setBackground(new ColorDrawable(getResources().getColor(R.color.Green, getTheme())));
        } else if (color.equals(getResources().getStringArray(R.array.all_rings)[6])) {
            sp.setBackground(new ColorDrawable(getResources().getColor(R.color.Blue, getTheme())));
        } else if (color.equals(getResources().getStringArray(R.array.all_rings)[7])) {
            sp.setBackground(new ColorDrawable(getResources().getColor(R.color.Purple, getTheme())));
        } else if (color.equals(getResources().getStringArray(R.array.all_rings)[8])) {
            sp.setBackground(new ColorDrawable(getResources().getColor(R.color.Grey, getTheme())));
        } else if (color.equals(getResources().getStringArray(R.array.all_rings)[9])) {
            sp.setBackground(new ColorDrawable(getResources().getColor(R.color.White, getTheme())));
        } else if(color.equals(getResources().getStringArray(R.array.all_rings)[10])){
            sp.setBackground(new ColorDrawable(getResources().getColor(R.color.Gold, getTheme())));
        } else if (color.equals(getResources().getStringArray(R.array.all_rings)[11])) {
            sp.setBackground(new ColorDrawable(getResources().getColor(R.color.Silver, getTheme())));
        }
    }

    public String formatNumber(Double count) {
        if (count < 1000) return "" + count;
        int exp = (int) (Math.log(count) / Math.log(1000));
        return String.format(Locale.getDefault(), "%.1f %c", count / Math.pow(1000, exp),"kMG".charAt(exp-1));
    }
}
