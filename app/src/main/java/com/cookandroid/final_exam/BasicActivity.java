package com.cookandroid.final_exam;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BasicActivity extends AppCompatActivity {
    private WebView webView;
    private WebSettings webSettings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        webView = findViewById(R.id.container);
        webView.setWebViewClient(new WebViewClient());
        webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportMultipleWindows(false);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setSupportZoom(false);
        webSettings.setBuiltInZoomControls(false);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
        webSettings.setDomStorageEnabled(true);
        webView.loadUrl("https://www.youtube.com/watch?v=gx4iWqxzHqs");

        final Button btn_naver = findViewById(R.id.btn_naver);
        final Button btn_kakao = findViewById(R.id.btn_kakao);

        Button back = findViewById(R.id.backBtn);

        btn_naver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_naver.setBackgroundColor(Color.parseColor("#FF9999"));
                btn_kakao.setBackgroundColor(Color.parseColor("#FFCC00"));
                webView.loadUrl("https://www.youtube.com/watch?v=gx4iWqxzHqs");
            }
        });

        btn_kakao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_naver.setBackgroundColor(Color.parseColor("#FFCC00"));
                btn_kakao.setBackgroundColor(Color.parseColor("#FF9999"));
                webView.loadUrl("https://www.youtube.com/watch?v=IGrbmhBLRyE");
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
