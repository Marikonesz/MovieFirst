package com.example.moviefirst.Models;

/**
 * Created by васыль on 21.01.2017.
 */

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


public class Search_Item implements Serializable, Parcelable
{

    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("Year")
    @Expose
    private String year;
    @SerializedName("imdbID")
    @Expose
    private String imdbID;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("Poster")
    @Expose
    private String poster;
    public final static Parcelable.Creator<Search_Item> CREATOR = new Creator<Search_Item>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Search_Item createFromParcel(Parcel in) {
            Search_Item instance = new Search_Item();
            instance.title = ((String) in.readValue((String.class.getClassLoader())));
            instance.year = ((String) in.readValue((String.class.getClassLoader())));
            instance.imdbID = ((String) in.readValue((String.class.getClassLoader())));
            instance.type = ((String) in.readValue((String.class.getClassLoader())));
            instance.poster = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Search_Item[] newArray(int size) {
            return (new Search_Item[size]);
        }

    }
            ;
    private final static long serialVersionUID = 8465335427735736377L;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(title);
        dest.writeValue(year);
        dest.writeValue(imdbID);
        dest.writeValue(type);
        dest.writeValue(poster);
    }

    public int describeContents() {
        return 0;
    }

}