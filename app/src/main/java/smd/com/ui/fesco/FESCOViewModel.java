package smd.com.ui.fesco;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FESCOViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FESCOViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is FESCO fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}