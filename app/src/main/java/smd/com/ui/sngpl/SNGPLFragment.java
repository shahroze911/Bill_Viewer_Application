package smd.com.ui.sngpl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import smd.com.R;
import smd.com.ui.fesco.FESCOFragment;

public class SNGPLFragment extends Fragment {
    private SNGPLViewModel SNGPLViewModel;
    private WebView mWebView;
    ProgressBar progressBar;
    String url = "https://www.sngpl.com.pk/web/login.jsp?mdids=85";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SNGPLViewModel =
                ViewModelProviders.of(this).get(SNGPLViewModel.class);
        View root = inflater.inflate(R.layout.fragment_sngpl, container, false);
        WebView web_view=(WebView) root.findViewById(R.id.webView);
        progressBar = (ProgressBar) root.findViewById(R.id.progressBar);
        // wv.setWebViewClient(new MyBrowser());
        web_view.setWebViewClient(new SNGPLFragment.myWebClient());
        web_view.getSettings().setJavaScriptEnabled(true);
        web_view.getSettings().setBuiltInZoomControls(true);
        web_view.getSettings().setDisplayZoomControls(false);
        web_view.loadUrl(url);
        return root;
    }
    public  class myWebClient extends WebViewClient{

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {

            super.onPageStarted(view, url, favicon);
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            progressBar.setVisibility(View.VISIBLE);
            view.loadUrl(url);
            return true;
        }
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            progressBar.setVisibility(View.GONE);
        }
    }
}