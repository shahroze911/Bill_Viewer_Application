package smd.com.ui.fesco;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
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

public class FESCOFragment extends Fragment {

    private FESCOViewModel fescoViewModel;
    private WebView mWebView;
    ProgressBar progressBar;
    String url = "http://fesco.com.pk/default.asp";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        fescoViewModel =
                ViewModelProviders.of(this).get(FESCOViewModel.class);
        View root = inflater.inflate(R.layout.fragment_fesco, container, false);
        WebView web_view=(WebView) root.findViewById(R.id.webView);
        progressBar = (ProgressBar) root.findViewById(R.id.progressBar);
        // wv.setWebViewClient(new MyBrowser());
        web_view.setWebViewClient(new myWebClient());
        web_view.getSettings().setJavaScriptEnabled(true);
        web_view.getSettings().setBuiltInZoomControls(true);
        web_view.getSettings().setDisplayZoomControls(false);
        web_view.loadUrl(url);

/*
        web_view.getSettings().setJavaScriptEnabled(true);
        web_view.getSettings().setLoadsImagesAutomatically(true);
        web_view.getSettings().setJavaScriptEnabled(true);
        web_view.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        web_view.getSettings().setBuiltInZoomControls(true);
        web_view.getSettings().setSupportZoom(true);
        web_view.getSettings().setDisplayZoomControls(true);
        web_view.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);
        web_view.setWebViewClient(new WebViewClient());
        web_view.loadUrl("http://fesco.com.pk/default.asp");

 */
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