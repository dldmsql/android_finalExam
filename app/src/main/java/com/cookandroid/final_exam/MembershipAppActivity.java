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

public class MembershipAppActivity  extends AppCompatActivity {
    private WebView webView;
    private WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membership);

        final Button btn_skt = findViewById(R.id.btn_skt);
        final Button btn_kt = findViewById(R.id.btn_kt);
        final Button btn_lg = findViewById(R.id.btn_lg);
        Button back = findViewById(R.id.backBtn);

        webView = findViewById(R.id.container);
        webView.setWebViewClient(new WebViewClient()); // 클릭시 새창 안뜨게
        webSettings = webView.getSettings(); //세부 세팅 등록
        webSettings.setJavaScriptEnabled(true); // 웹페이지 자바스클비트 허용 여부
        webSettings.setSupportMultipleWindows(false); // 새창 띄우기 허용 여부
        webSettings.setJavaScriptCanOpenWindowsAutomatically(false); // 자바스크립트 새창 띄우기(멀티뷰) 허용 여부
        webSettings.setLoadWithOverviewMode(true); // 메타태그 허용 여부
        webSettings.setUseWideViewPort(true); // 화면 사이즈 맞추기 허용 여부
        webSettings.setSupportZoom(false); // 화면 줌 허용 여부
        webSettings.setBuiltInZoomControls(false); // 화면 확대 축소 허용 여부
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN); // 컨텐츠 사이즈 맞추기
        webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE); // 브라우저 캐시 허용 여부
        webSettings.setDomStorageEnabled(true); // 로컬저장소 허용 여부
        webView.loadUrl("https://post.naver.com/my.nhn?memberNo=32011753"); // 웹뷰에 표시할 웹사이트 주소, 웹뷰 시작

        btn_skt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_skt.setBackgroundColor(Color.parseColor("#FF9999"));
                btn_kt.setBackgroundColor(Color.parseColor("#FFCC00"));
                btn_lg.setBackgroundColor(Color.parseColor("#FFCC00"));

                webView.loadUrl("https://post.naver.com/my.nhn?memberNo=32011753"); // 웹뷰에 표시할 웹사이트 주소, 웹뷰 시작
            }
        });

        btn_kt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_skt.setBackgroundColor(Color.parseColor("#FFCC00"));
                btn_kt.setBackgroundColor(Color.parseColor("#FF9999"));
                btn_lg.setBackgroundColor(Color.parseColor("#FFCC00"));
                webView.loadUrl("https://post.naver.com/viewer/postView.nhn?volumeNo=28659930&memberNo=30305360&vType=VERTICAL"); // 웹뷰에 표시할 웹사이트 주소, 웹뷰 시작

            }
        });

        btn_lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_skt.setBackgroundColor(Color.parseColor("#FFCC00"));
                btn_kt.setBackgroundColor(Color.parseColor("#FFCC00"));
                btn_lg.setBackgroundColor(Color.parseColor("#FF9999"));
                webView.loadUrl("https://www.youtube.com/watch?v=yGWpzUY4gQA"); // 웹뷰에 표시할 웹사이트 주소, 웹뷰 시작

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
