package pe.edu.tecsup.componentesui

import android.R
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity


class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        class WebViewActivity : AppCompatActivity() {
            private var webView: WebView? = null
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_web_view)
                webView = findViewById<View>(R.id.webview) as WebView
                webView!!.loadUrl("https://material.io/")
            }
        }

    }
}