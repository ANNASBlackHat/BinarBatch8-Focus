package com.annasblackhat.sesi9;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.migration.Migration;
import android.support.annotation.NonNull;

/**
 * Created by annasblackhat on 14/08/18
 */
public class DbMigration {
    public static Migration Migration_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(@NonNull SupportSQLiteDatabase database) {
            database.execSQL("ALTER table news add column datePublish INTEGER default '0'");
        }
    };
}
