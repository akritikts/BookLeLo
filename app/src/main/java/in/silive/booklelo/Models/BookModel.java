package in.silive.booklelo.Models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by akriti on 13/9/16.
 */
public class BookModel implements Parcelable{
    public String Title;
    public String BranchCategory;
    public String BookSemCategory;
    public String URL;
    public String RelativeURL;

    public BookModel(String title, String size) {
        this.Title = title;
    }

    public BookModel() {
    }

    public String getExamCategory() {
        return BranchCategory;
    }

    public void setExamCategory(String examCategory) {
        BranchCategory = examCategory;
    }


    public String getBookSemCategory() {
        return BookSemCategory;
    }

    public void setBookSemCategory(String bookSemCategory) {
        BookSemCategory = bookSemCategory;
    }

    public String getRelativeURL() {
        return RelativeURL;
    }

    public void setRelativeURL(String relativeURL) {
        RelativeURL = relativeURL;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public BookModel(Parcel in){
        Title = in.readString();
        BranchCategory = in.readString();
        BookSemCategory = in.readString();
        URL = in.readString();
        RelativeURL = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Title);
        parcel.writeString(BranchCategory);
        parcel.writeString(BookSemCategory);
        parcel.writeString(URL);
        parcel.writeString(RelativeURL);
    }
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        @Override
        public BookModel createFromParcel(Parcel parcel) {
            return new BookModel(parcel);
        }

        @Override
        public BookModel[] newArray(int i) {
            return new BookModel[i];
        }
    };

    @SuppressWarnings("serial")
    public static class PapersList extends ArrayList<BookModel> {
    }

}
