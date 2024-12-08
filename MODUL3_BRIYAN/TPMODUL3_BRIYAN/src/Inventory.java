import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Inventory {

    @FXML
    private TableView<Album> tableView;

    @FXML
    private TableColumn<Album, String> colJudul;

    @FXML
    private TableColumn<Album, String> colArtis;

    @FXML
    private TableColumn<Album, Integer> colAvailable;

    @FXML
    private TableColumn<Album, Integer> colTotal;

    @FXML
    private TextField judulField;

    @FXML
    private TextField artisField;

    @FXML
    private TextField jumlahtField;

    private ObservableList<Album> albumList;

    @FXML
    public void initialize() {
        albumList = FXCollections.observableArrayList();
        colJudul.setCellValueFactory(new PropertyValueFactory<>("judul"));
        colArtis.setCellValueFactory(new PropertyValueFactory<>("artis"));
        colAvailable.setCellValueFactory(new PropertyValueFactory<>("available"));
        colTotal.setCellValueFactory(new PropertyValueFactory<>("total"));

        tableView.setItems(albumList);
    }

    @FXML
    void Tambah(ActionEvent event) {

        String judul = judulField.getText();
        String artis = artisField.getText();
        String jumlahTotalText = jumlahtField.getText();

        if (judul.isEmpty() || artis.isEmpty() || jumlahTotalText.isEmpty()) {
            showAlert(AlertType.ERROR, "Error", "Semua field harus diisi!");
            return;
        }

        try {
            int total = Integer.parseInt(jumlahTotalText);

            Album newAlbum = new Album(judul, artis, total, total);
            albumList.add(newAlbum);

            clearFields();
        } catch (NumberFormatException e) {
            showAlert(AlertType.ERROR, "Error", "Jumlah total harus berupa angka!");
        }
    }

    @FXML
    void Update(ActionEvent event) {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum == null) {
            showAlert(AlertType.ERROR, "Error", "Pilih album yang ingin diupdate!");
            return;
        }

        String judul = judulField.getText();
        String artis = artisField.getText();
        String jumlahTotalText = jumlahtField.getText();

        if (judul.isEmpty() || artis.isEmpty() || jumlahTotalText.isEmpty()) {
            showAlert(AlertType.ERROR, "Error", "Semua field harus diisi!");
            return;
        }

        try {
            int total = Integer.parseInt(jumlahTotalText);
            int rented = selectedAlbum.getTotal() - selectedAlbum.getAvailable();

            if (total < rented) {
                showAlert(AlertType.ERROR, "Error", "Total tidak bisa lebih kecil dari jumlah yang dirental!");
                return;
            }

            selectedAlbum.setJudul(judul);
            selectedAlbum.setArtis(artis);
            selectedAlbum.setTotal(total);
            selectedAlbum.setAvailable(total - rented);
            tableView.refresh();

            clearFields();
        } catch (NumberFormatException e) {
            showAlert(AlertType.ERROR, "Error", "Jumlah total harus berupa angka!");
        }
    }

    @FXML
    void Hapus(ActionEvent event) {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albumList.remove(selectedAlbum);
            clearFields();
        } else {
            showAlert(AlertType.ERROR, "Error", "Pilih data yang ingin dihapus!");
        }
    }

    @FXML
    void rentSelected(ActionEvent event) {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum == null) {
            showAlert(AlertType.ERROR, "Error", "Pilih album yang ingin dirental!");
            return;
        }

        if (selectedAlbum.getAvailable() > 0) {
            selectedAlbum.setAvailable(selectedAlbum.getAvailable() - 1);
            tableView.refresh();
        } else {
            showAlert(AlertType.ERROR, "Error", "Tidak ada album yang tersedia untuk dirental!");
        }
    }

    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void clearFields() {
        judulField.clear();
        artisField.clear();
        jumlahtField.clear();
    }
}
