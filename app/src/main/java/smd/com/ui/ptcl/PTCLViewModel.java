package smd.com.ui.ptcl;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PTCLViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PTCLViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is PTCL Fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}