package com.annasblackhat.sesi9;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverter;
import android.arch.persistence.room.TypeConverters;

import java.util.Date;

/**
 * Created by annasblackhat on 14/08/18
 */

@Entity
@TypeConverters(DateConverter.class)
public class News {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String content;
    private Date datePublish;

    public News(String title, String content, Date datePublish) {
        this.title = title;
        this.content = content;
        this.datePublish = datePublish;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatePublish() { return datePublish; }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
