package smd.com.ui.hesco;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HESCOViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HESCOViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is HESCO Fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}