package com.example.colorcode_code;

import android.app.Application;

import java.util.Hashtable;

public class Values extends Application {

    Hashtable<String, Double> dict_ring;
    Hashtable<String, Double> dict_multi;
    Hashtable<String, Double> dict_tole;

    public void Init() {
        try {
            dict_ring = new Hashtable<String, Double>() {
                {
                    put(getResources().getStringArray(R.array.rings)[0], 0.0);
                }

                {
                    put(getResources().getStringArray(R.array.rings)[1], 1.0);
                }

                {
                    put(getResources().getStringArray(R.array.rings)[2], 2.0);
                }

                {
                    put(getResources().getStringArray(R.array.rings)[3], 3.0);
                }

                {
                    put(getResources().getStringArray(R.array.rings)[4], 4.0);
                }

                {
                    put(getResources().getStringArray(R.array.rings)[5], 5.0);
                }

                {
                    put(getResources().getStringArray(R.array.rings)[6], 6.0);
                }

                {
                    put(getResources().getStringArray(R.array.rings)[7], 7.0);
                }

                {
                    put(getResources().getStringArray(R.array.rings)[8], 8.0);
                }

                {
                    put(getResources().getStringArray(R.array.rings)[9], 9.0);
                }
            };
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            dict_multi = new Hashtable<String, Double>() {
                {
                    put(getResources().getStringArray(R.array.multi)[0], 10.0);
                }

                {
                    put(getResources().getStringArray(R.array.multi)[1], 100.0);
                }

                {
                    put(getResources().getStringArray(R.array.multi)[2], 1000.0);
                }

                {
                    put(getResources().getStringArray(R.array.multi)[3], 10000.0);
                }

                {
                    put(getResources().getStringArray(R.array.multi)[4], 100000.0);
                }

                {
                    put(getResources().getStringArray(R.array.multi)[5], 1000000.0);
                }

                {
                    put(getResources().getStringArray(R.array.multi)[6], 10000000.0);
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

    public Hashtable<String, Double> getDict_Ring() {
        return dict_ring;
    }

    public Hashtable<String, Double> getDict_Multi() {
        return dict_multi;
    }

    public Hashtable<String, Double> getDict_Tole() {
        return dict_tole;
    }

    /*public void getDict_Ring(int index) {
        //return dict_ring[index];
    }

    public Hashtable<String, Double> getDict_Multi(int index) {
        return dict_multi;
    }

    public Hashtable<String, Double> getDict_Tole(int index) {
        return dict_tole;
    }

    public Hashtable<String, Double> getDict_Ring(String key) {
        return dict_ring;
    }

    public Hashtable<String, Double> getDict_Multi(String key) {
        return dict_multi;
    }

    public Hashtable<String, Double> getDict_Tole(String key) {
        return dict_tole;
    }

    public Hashtable<String, Double> getDict_Ring(Double value) {
        return dict_ring;
    }

    public Hashtable<String, Double> getDict_Multi(Double value) {
        return dict_multi;
    }

    public Hashtable<String, Double> getDict_Tole(Double value) {
        return dict_tole;
    }*/

}
