package com.wangrj;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.net.MalformedURLException;

/**
 * by wangrongjun on 2018/2/13.
 */
public class TestWebView extends Application {

    @Override
    public void start(final Stage stage) throws MalformedURLException {
        stage.setWidth(500);
        stage.setHeight(500);
        WebView webView = new WebView();
        webView.getEngine().load(getClass().getResource("html/index.html").toString());
        Scene scene = new Scene(webView, 400, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}