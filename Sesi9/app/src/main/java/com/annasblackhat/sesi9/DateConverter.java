package com.annasblackhat.sesi9;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;

/**
 * Created by annasblackhat on 14/08/18
 */
public class DateConverter {

    @TypeConverter
    public Long convertToLong(Date date){
        return date.getTime();
    }

    @TypeConverter
    public Date convertToDate(Long dateLong){
        return new Date(dateLong);
    }
}
