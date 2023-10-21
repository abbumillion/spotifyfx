module com.spotifyfx.fxspotify {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires javafx.base;



    opens com.spotifyfx.fxspotify to javafx.fxml;
    exports com.spotifyfx.fxspotify;
}