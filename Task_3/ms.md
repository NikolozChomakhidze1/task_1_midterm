# Photo Collection Management System

## Description

This system allows users to manage a collection of photos. It supports adding, removing, viewing, and searching for photos by tags.

---

## Class Structure

### 📸 Photo

Represents a photo with the following attributes:
- `title`: Title of the photo
- `author`: Person who took the photo
- `location`: Where the photo was taken
- `tags`: A list of tags that describe the photo

**Methods:**
- `getTitle()` / `setTitle(String title)`
- `getAuthor()` / `setAuthor(String author)`
- `getLocation()` / `setLocation(String location)`
- `getTags()` / `setTags(List<String> tags)`

---

### 📂 PhotoManager

Manages a list of photo objects. Allows adding, removing, viewing, and searching.

**Attributes:**
- `List<Photo> photos`

**Methods:**
- `addPhoto(Photo photo)`: Adds a photo to the collection.
- `removePhoto(Photo photo)`: Removes a photo from the collection.
- `viewPhotos()`: Displays all photos and their details.

---

## 🆕 New Feature

### 🔍 Search Photos by Tag

The system now supports searching for photos by a specific tag.

```java
// New Feature: Search Photos by Tag
public List<Photo> searchPhotosByTag(String tag) {
    List<Photo> result = new ArrayList<>();
    for (Photo photo : photos) {
        if (photo.getTags().contains(tag)) {
            result.add(photo);
        }
    }
    return result;
}
