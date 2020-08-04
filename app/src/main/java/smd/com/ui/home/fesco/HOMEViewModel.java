package smd.com.ui.home.fesco;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HOMEViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HOMEViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is HOME Fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}