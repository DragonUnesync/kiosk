package H7;

import j$.nio.file.FileVisitResult;
import j$.nio.file.Path;
import j$.nio.file.PathMatcher;
import java.io.FileFilter;
import java.io.FilenameFilter;

public interface b extends FileFilter, FilenameFilter, PathMatcher {
    FileVisitResult a(Path path);
}
