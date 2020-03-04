package hu.ben.photoalbumrenaming.model;

import java.io.File;
import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;

import hu.ben.photoalbumrenaming.comparator.ImageCreationTimeComparator;
import hu.ben.photoalbumrenaming.comparator.VideoCreationTimeComparator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FileWrapper {

    private Date fileCreationDate;

    private SortedSet<File> imageFiles = new TreeSet<>(new ImageCreationTimeComparator());

    private SortedSet<File> videoFiles = new TreeSet<>(new VideoCreationTimeComparator());

}
