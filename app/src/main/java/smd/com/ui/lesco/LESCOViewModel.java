package smd.com.ui.lesco;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LESCOViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LESCOViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is LESCO Fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}