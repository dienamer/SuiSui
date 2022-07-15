package SuiSui.zz.controller;


import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MusicPlayController {

    @FXML
    private TableColumn song_chois;

    @FXML
    private TableColumn song_long;

    @FXML
    private TableColumn song_name;

    @FXML
    private  TableView<Music> musicList = new TableView<>();

    private final ObservableList<Music> data =
            FXCollections.observableArrayList(
                    new Music("path", "Smith", "jacob.smith@example.com"),
                    new Music("path", "Smith", "jacob.smith@example.com"),
                    new Music("path", "Smith", "jacob.smith@example.com")

            );

    public MusicPlayController()
    {
            song_chois.setCellValueFactory(new PropertyValueFactory<Music,String>("choic"));
            song_name.setCellValueFactory(new PropertyValueFactory<Music,String>("name"));
            song_long.setCellValueFactory(new PropertyValueFactory<Music,String>("time"));
            musicList.setEditable(true);
            musicList.setItems(data);
    }

    public static class Music{

        private final SimpleStringProperty choic;
        private final SimpleStringProperty name;
        private final SimpleStringProperty time;

        public Music(String path,String name,String time) {
            
            this.choic = new SimpleStringProperty(path);
            this.name = new SimpleStringProperty(name);
            this.time = new SimpleStringProperty(time);


        }

        public String getChoic() {
            return choic.get();
        }

        public SimpleStringProperty choicProperty() {
            return choic;
        }

        public void setChoic(String choic) {
            this.choic.set(choic);
        }

        public String getName() {
            return name.get();
        }

        public SimpleStringProperty nameProperty() {
            return name;
        }

        public void setName(String name) {
            this.name.set(name);
        }

        public String getTime() {
            return time.get();
        }

        public SimpleStringProperty timeProperty() {
            return time;
        }

        public void setTime(String time) {
            this.time.set(time);
        }
    }
}
