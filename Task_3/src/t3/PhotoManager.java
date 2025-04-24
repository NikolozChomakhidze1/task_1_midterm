package t3;

import java.util.ArrayList;
import java.util.List;

public class PhotoManager {
    private List<Photo> photos = new ArrayList<>();

    public void addPhoto(Photo photo) {
        photos.add(photo);
    }

    public boolean removePhoto(Photo photo) {
        return photos.remove(photo);
    }

    public void viewPhotos() {
        for (Photo photo : photos) {
            System.out.println(photo.getTitle() + " by " + photo.getAuthor() + " [" + photo.getLocation() + "]");
            System.out.println("Tags: " + photo.getTags());
            System.out.println("------------------------");
        }
    }

    // 🔥 New Feature: Search Photos by Tag
    public List<Photo> searchPhotosByTag(String tag) {
        List<Photo> result = new ArrayList<>();
        for (Photo photo : photos) {
            if (photo.getTags().contains(tag)) {
                result.add(photo);
            }
        }
        return result;
    }
}
