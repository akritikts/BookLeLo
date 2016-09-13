package in.silive.booklelo.Network;

/**
 * Created by akriti on 13/9/16.
 */
public interface BookLeLo {
    @GET("/getallpapers")
    BookModel.BooksList booksList();
}
