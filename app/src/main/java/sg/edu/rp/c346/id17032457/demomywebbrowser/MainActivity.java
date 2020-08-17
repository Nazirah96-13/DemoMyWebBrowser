package sg.edu.rp.c346.id17032457.demomywebbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Declare the variable
    Button btnLoadURL;
    WebView wvMPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind the variables
        btnLoadURL = findViewById(R.id.buttonLoad);
        wvMPage = findViewById(R.id.webViewMyPage);
        wvMPage.setWebViewClient(new WebViewClient());


        // Tell the WebView to enable javascript execution
        wvMPage.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        //	Disable file access within WebView.
        wvMPage.getSettings().setAllowFileAccess(false);
        //Enable the built-in zoom control for the webView
        wvMPage.getSettings().setBuiltInZoomControls(true);


        // implement the onClick method for the button, to load the grab url in webview
        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.grab.com/sg/";
                wvMPage.loadUrl(url);
            }
        });
    }
}
