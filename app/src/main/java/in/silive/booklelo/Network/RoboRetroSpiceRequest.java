package in.silive.booklelo.Network;

/**
 * Created by akriti on 13/9/16.
 */
public class RoboRetroSpiceRequest extends RetrofitSpiceRequest<BookModel.BooksList, BookLeLo> {


    public RoboRetroSpiceRequest() {
        super(BookModel.PapersList.class, BookLeLo.class);

    }


    @Override
    public BookModel.PapersList loadDataFromNetwork() throws Exception {

        return getService().papersList();
    }
}
