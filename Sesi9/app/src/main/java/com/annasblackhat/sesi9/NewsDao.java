package com.annasblackhat.sesi9;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by annasblackhat on 14/08/18
 */

@Dao
public interface NewsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void save(News news);

    @Update
    void update(News news);

    @Delete
    void delete(News news);

    @Query("SELECT * FROM news")
    List<News> getAllNews();

    @Query("SELECT * FROM news WHERE id= :id")
    News getNewsById(int id);

    @Query("SELECT * FROM news")
    LiveData<List<News>> getAllNewsLive();
}
