package SuiSui.zz.sprite;

import javafx.scene.image.Image;
import javafx.scene.media.AudioClip;

import java.util.Map;

public class Person extends Role{
    private String person_name;
    private String person_sex;
    private int person_age;
    private AudioClip person_sound;
    private Map<String,Image> person_clouth;

    public Person(String role_name, double role_x, double role_y, double role_hight, double role_width, Image image, String person_name, String person_sex, int person_age, AudioClip person_sound, Map<String, Image> person_clouth) {
        super(role_name, role_x, role_y, role_hight, role_width, image);
        this.person_name = person_name;
        this.person_sex = person_sex;
        this.person_age = person_age;
        this.person_sound = person_sound;
        this.person_clouth = person_clouth;
    }


}
