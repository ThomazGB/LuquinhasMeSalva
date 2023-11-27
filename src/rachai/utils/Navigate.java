package rachai.utils;

import javax.swing.JFrame;

public class Navigate {
    private JFrame actualScreen;
    private JFrame registro;
    private JFrame login;

    public Navigate(JFrame login, JFrame registro) {
        this.actualScreen = registro;
        this.registro = registro;
        this.login = login;
    }

    public void show() {
        actualScreen.setVisible(true);
    }

    public JFrame getActualScreen() {
        return actualScreen;
    }

    public void setActualScreen(String screen) {
        actualScreen.setVisible(false);
        switch(screen) {
            case "registro":
                this.actualScreen = registro;
                break;
            case "login":
                this.actualScreen = login;
                break;
            default:
                this.actualScreen = login;
        }
        actualScreen.setVisible(true);
    }
    
    public JFrame getRegistro() {
        return registro;
    }

    public void setRegistro(JFrame registro) {
        this.registro = registro;
    }

    public JFrame getLogin() {
        return login;
    }

    public void setLogin(JFrame login) {
        this.login = login;
    }
}