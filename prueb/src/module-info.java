module prueb {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	opens controller to javafx.graphics, javafx.fxml, javafx.base;
	
	opens application to javafx.graphics, javafx.fxml, javafx.base;
	
	opens model to javafx.base;
}
