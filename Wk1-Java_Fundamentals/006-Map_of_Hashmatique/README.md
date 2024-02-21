# 006 Map of Hashmatique

## Overview
**Map of Hashmatique** is a Java project designed to organize a band's song list using a HashMap. The project enables the immediate retrieval of song lyrics based on the song name. It allows users to add songs to the list and pull out song lyrics by their titles. Additionally, users can view all tracks along with their lyrics.

## Functionality
The project achieves the following functionality:
- Stores songs and their lyrics using a HashMap with song titles as keys and lyrics as values.
- Enables immediate retrieval of lyrics based on song titles.
- Allows users to print out all tracks with their corresponding lyrics.

## Implementation
The `Hashmatique` class includes the following components:

### `main` Method
- Creates a HashMap `trackList` to store song titles and lyrics.
- Adds at least four songs to the `trackList`.
- Retrieves the lyrics of a specific song by its title.
- Calls the `printTrackList()` method to print all tracks with their lyrics.

### `printTrackList()` Method
- Takes a HashMap `trackList` as input.
- Iterates over the keys of the `trackList` HashMap.
- Prints each track title along with its lyrics in the format `Track: [Title] - Lyrics: [Lyrics]...`.
- The output of calling the `printTrackList()` method with the provided `trackList` is as follows:
    ```
    Track: 我不曾忘记 - Lyrics: 我的破木香...
    Track: 離れ離れの聞き君へ - Lyrics: あの空は戻らない...
    Track: 让风告诉你 - Lyrics: 当你的天空突然 下起了大雨 那时我在为你炸乌云...
    Track: Rubia - Lyrics: Life blooms like a flower...
    ```

---
<p align="right">Completed: ２０２４年０２月２１日（水）</p>
