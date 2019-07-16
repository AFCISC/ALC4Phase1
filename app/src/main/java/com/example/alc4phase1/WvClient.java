package com.example.alc4phase1;


import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WvClient extends WebViewClient {

    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError er) {
        handler.proceed();
        // Ignore SSL certificate errors
    }
}