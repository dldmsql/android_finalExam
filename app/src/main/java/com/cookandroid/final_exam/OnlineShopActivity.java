package com.cookandroid.final_exam;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class OnlineShopActivity  extends AppCompatActivity {
    private WebView webView;
    private WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online);

        final Button btn_coupang = findViewById(R.id.btn_coupang);
        final Button btn_market = findViewById(R.id.btn_market);

        Button back = findViewById(R.id.backBtn);

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
        webView.loadUrl("https://www.youtube.com/watch?v=FWDa7tnPgm4");

        btn_coupang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_coupang.setBackgroundColor(Color.parseColor("#FF9999"));
                btn_market.setBackgroundColor(Color.parseColor("#FFCC00"));
                webView.loadUrl("https://www.youtube.com/watch?v=FWDa7tnPgm4");

            }
        });

        btn_market.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_coupang.setBackgroundColor(Color.parseColor("#FFCC00"));
                btn_market.setBackgroundColor(Color.parseColor("#FF9999"));
                webView.loadUrl("https://youtu.be/bUaS22iXcAo");

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
