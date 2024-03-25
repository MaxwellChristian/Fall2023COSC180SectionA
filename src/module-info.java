module Fall2023COSC180SectionA {
    requires javafx.graphics;
    requires javafx.controls;
    requires java.sql;

    exports gui;
    exports gui.animations;
    exports gui.clock_demo;
    exports gui.student_demo;
    exports gui.tic_tac_toe;

    exports lo_networking;
    exports lo_jdbc;

}