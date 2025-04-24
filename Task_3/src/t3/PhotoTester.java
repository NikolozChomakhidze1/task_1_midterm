package t3;

import java.util.Arrays;
import java.util.List;

public class PhotoTester {
    public static void main(String[] args) {
        PhotoManager manager = new PhotoManager();

        // Create photo objects
        Photo photo1 = new Photo("Sunset at Beach", "John Doe", "Malibu", Arrays.asList("sunset", "beach", "vacation"));
        Photo photo2 = new Photo("Mountain Hike", "Jane Smith", "Alps", Arrays.asList("mountain", "hiking", "nature"));
        Photo photo3 = new Photo("City Lights", "Alex Green", "New York", Arrays.asList("city", "night", "lights"));

        // Add photos to manager
        manager.addPhoto(photo1);
        manager.addPhoto(photo2);
        manager.addPhoto(photo3);

        // View all photos
        System.out.println(" All Photos:");
        manager.viewPhotos();

        //  Use the new feature: Search by tag
        System.out.println("\n Photos with tag 'sunset':");
        List<Photo> sunsetPhotos = manager.searchPhotosByTag("sunset");
        for (Photo p : sunsetPhotos) {
            System.out.println(p.getTitle() + " by " + p.getAuthor());
        }
    }
}
