package smd.com.ui.sngpl;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SNGPLViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SNGPLViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is SNGPL Fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}