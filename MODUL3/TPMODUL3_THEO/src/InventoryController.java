import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryController {

    @FXML
    private TableView<Album> tableView;

    @FXML
    private TableColumn<Album, String> columnAlbumName;

    @FXML
    private TableColumn<Album, String> columnArtist;

    @FXML
    private TableColumn<Album, Integer> columnTotal;

    @FXML
    private TableColumn<Album, Integer> columnAvailable;

    @FXML
    private TableColumn<Album, Integer> columnRented;

    @FXML
    private TextField albumNameField;

    @FXML
    private TextField artistField;

    @FXML
    private TextField totalField;

    @FXML
    private TextField availableField;

    private final ObservableList<Album> albumList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Initialize columns with property names
        columnAlbumName.setCellValueFactory(new PropertyValueFactory<>("albumName"));
        columnArtist.setCellValueFactory(new PropertyValueFactory<>("artist"));
        columnTotal.setCellValueFactory(new PropertyValueFactory<>("total"));
        columnAvailable.setCellValueFactory(new PropertyValueFactory<>("available"));
        columnRented.setCellValueFactory(new PropertyValueFactory<>("rented"));

        // Set TableView items
        tableView.setItems(albumList);

        // Add listener for selecting an album from the table
        tableView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                albumNameField.setText(newSelection.getAlbumName());
                artistField.setText(newSelection.getArtist());
                totalField.setText(String.valueOf(newSelection.getTotal()));
                availableField.setText(String.valueOf(newSelection.getAvailable()));
            }
        });
    }

    @FXML
    private void addAlbum(ActionEvent event) {
        try {
            String albumName = albumNameField.getText();
            String artist = artistField.getText();
            int total = Integer.parseInt(totalField.getText());
            int available = Integer.parseInt(availableField.getText());

            if (available > total) {
                throw new IllegalArgumentException("Available cannot be greater than Total.");
            }

            albumList.add(new Album(albumName, artist, total, available, total - available));
            clearFields();
            showAlert("Success", "Album added successfully.", Alert.AlertType.INFORMATION);
        } catch (NumberFormatException e) {
            showAlert("Error", "Please enter valid numbers for Total and Available.", Alert.AlertType.ERROR);
        } catch (IllegalArgumentException e) {
            showAlert("Error", e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @FXML
    private void deleteAlbum(ActionEvent event) {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albumList.remove(selectedAlbum);
            clearFields();
            showAlert("Success", "Album deleted successfully.", Alert.AlertType.INFORMATION);
        } else {
            showAlert("Error", "No album selected to delete.", Alert.AlertType.ERROR);
        }
    }

    @FXML
    private void updateAlbum(ActionEvent event) {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            try {
                String albumName = albumNameField.getText();
                String artist = artistField.getText();
                int total = Integer.parseInt(totalField.getText());
                int available = Integer.parseInt(availableField.getText());

                if (available > total) {
                    throw new IllegalArgumentException("Available cannot be greater than Total.");
                }

                selectedAlbum.setAlbumName(albumName);
                selectedAlbum.setArtist(artist);
                selectedAlbum.setTotal(total);
                selectedAlbum.setAvailable(available);
                selectedAlbum.setRented(total - available);
                tableView.refresh();

                clearFields();
                showAlert("Success", "Album updated successfully.", Alert.AlertType.INFORMATION);
            } catch (NumberFormatException e) {
                showAlert("Error", "Please enter valid numbers for Total and Available.", Alert.AlertType.ERROR);
            } catch (IllegalArgumentException e) {
                showAlert("Error", e.getMessage(), Alert.AlertType.ERROR);
            }
        } else {
            showAlert("Error", "No album selected to update.", Alert.AlertType.ERROR);
        }
    }

    @FXML
    private void rentAlbum(ActionEvent event) {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            if (selectedAlbum.getAvailable() > 0) {
                selectedAlbum.setAvailable(selectedAlbum.getAvailable() - 1);
                selectedAlbum.setRented(selectedAlbum.getRented() + 1);
                tableView.refresh();
                showAlert("Success", "Album rented successfully.", Alert.AlertType.INFORMATION);
            } else {
                showAlert("Error", "No available albums to rent.", Alert.AlertType.ERROR);
            }
        } else {
            showAlert("Error", "No album selected to rent.", Alert.AlertType.ERROR);
        }
    }

    private void clearFields() {
        albumNameField.clear();
        artistField.clear();
        totalField.clear();
        availableField.clear();
    }

    private void showAlert(String title, String message, Alert.AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
