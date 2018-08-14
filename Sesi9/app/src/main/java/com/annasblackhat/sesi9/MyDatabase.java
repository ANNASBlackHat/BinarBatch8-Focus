package com.annasblackhat.sesi9;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by annasblackhat on 14/08/18
 */

@Database(entities = {News.class}, version = 2)
public abstract class MyDatabase extends RoomDatabase {

    abstract NewsDao getNewsDao();

}
