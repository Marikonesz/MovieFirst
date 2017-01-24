package com.example.moviefirst.Models;



        import java.io.Serializable;
        import java.util.List;

        import android.os.Parcel;
        import android.os.Parcelable;
        import android.os.Parcelable.Creator;
        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang3.builder.EqualsBuilder;
        import org.apache.commons.lang3.builder.HashCodeBuilder;
        import org.apache.commons.lang3.builder.ToStringBuilder;


public class Search implements Serializable, Parcelable
{

    @SerializedName("Search")
    @Expose
    private List<Search_Item> search = null;
    @SerializedName("totalResults")
    @Expose
    private String totalResults;
    @SerializedName("Response")
    @Expose
    private String response;
    public final static Parcelable.Creator<Search> CREATOR = new Creator<Search>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Search createFromParcel(Parcel in) {
            Search instance = new Search();
            in.readList(instance.search, (Search_Item.class.getClassLoader()));
            instance.totalResults = ((String) in.readValue((String.class.getClassLoader())));
            instance.response = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Search[] newArray(int size) {
            return (new Search[size]);
        }

    }
            ;
    private final static long serialVersionUID = 2829258857972871700L;

    public List<Search_Item> getSearch() {
        return search;
    }

    public void setSearch(List<Search_Item> search) {
        this.search = search;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(search);
        dest.writeValue(totalResults);
        dest.writeValue(response);
    }

    public int describeContents() {
        return 0;
    }

}