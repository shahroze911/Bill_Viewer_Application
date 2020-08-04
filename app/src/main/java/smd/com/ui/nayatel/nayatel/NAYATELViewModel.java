package smd.com.ui.nayatel.nayatel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NAYATELViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NAYATELViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is NAYATEL Fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}