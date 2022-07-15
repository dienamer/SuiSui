package SuiSui.zz.sprite;

import javafx.scene.image.Image;

public abstract class Role {
    private String role_name;
    private double role_x;
    private double role_y;
    private double role_hight;
    private double role_width;
    private Image image;

    public Role(String role_name, double role_x, double role_y, double role_hight, double role_width, Image image) {
        this.role_name = role_name;
        this.role_x = role_x;
        this.role_y = role_y;
        this.role_hight = role_hight;
        this.role_width = role_width;
        this.image = image;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public double getRole_x() {
        return role_x;
    }

    public void setRole_x(double role_x) {
        this.role_x = role_x;
    }

    public double getRole_y() {
        return role_y;
    }

    public void setRole_y(double role_y) {
        this.role_y = role_y;
    }

    public double getRole_hight() {
        return role_hight;
    }

    public void setRole_hight(double role_hight) {
        this.role_hight = role_hight;
    }

    public double getRole_width() {
        return role_width;
    }

    public void setRole_width(double role_width) {
        this.role_width = role_width;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
