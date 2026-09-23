package ru.tvoyhod.app

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        webView = WebView(this)
        setContentView(webView)

        window.statusBarColor = android.graphics.Color.rgb(5, 9, 11)
        window.navigationBarColor = android.graphics.Color.rgb(5, 9, 11)

        webView.settings.apply {
            javaScriptEnabled = true
            domStorageEnabled = true
            mediaPlaybackRequiresUserGesture = false
        }

        webView.webViewClient = WebViewClient()

        val html = """
            <!doctype html>
            <html>
            <head>
                <meta name="viewport"
                      content="width=device-width,initial-scale=1">
                <style>
                    html,body{
                        margin:0;
                        width:100%;
                        height:100%;
                        background:#05090b;
                        color:#fff;
                        font-family:sans-serif;
                    }
                    body{
                        display:flex;
                        align-items:center;
                        justify-content:center;
                        text-align:center;
                    }
                    .ok{
                        font-size:28px;
                        line-height:1.6;
                    }
                    strong{color:#42dfd1}
                </style>
            </head>
            <body>
                <div class="ok">
                    ТВОЙ ХОД<br>
                    <strong>WEBVIEW CORE OK</strong>
                </div>
            </body>
            </html>
        """.trimIndent()

        webView.loadDataWithBaseURL(
            "https://app.local/",
            html,
            "text/html",
            "UTF-8",
            null
        )
    }

    override fun onDestroy() {
        webView.destroy()
        super.onDestroy()
    }
}
