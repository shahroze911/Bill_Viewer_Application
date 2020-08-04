package smd.com.ui.gepco;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GEPCOViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GEPCOViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}