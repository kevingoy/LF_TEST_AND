package com.lafourchette.test_lf_kg.utils;

import com.lafourchette.test_lf_kg.R;

public enum Currency {

    EUR (R.string.eur_currency);

    private int currencyId;

    Currency(int currencyId){
        this.currencyId = currencyId;
    }

    public int getCurrencyId(){
        return currencyId;
    }
}