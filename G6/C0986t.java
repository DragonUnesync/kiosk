package g6;

import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.attribute.PosixFilePermission;
import java.io.File;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: g6.t  reason: case insensitive filesystem */
public abstract class C0986t {
    /* access modifiers changed from: private */
    public static boolean canExecuteExecutable(File file) {
        if (Y.javaVersion() < 7 || file.canExecute()) {
            return true;
        }
        Set posixFilePermissions = Files.getPosixFilePermissions(FileRetargetClass.toPath(file), new LinkOption[0]);
        EnumSet of = EnumSet.of(PosixFilePermission.OWNER_EXECUTE, PosixFilePermission.GROUP_EXECUTE, PosixFilePermission.OTHERS_EXECUTE);
        if (posixFilePermissions.containsAll(of)) {
            return false;
        }
        EnumSet copyOf = EnumSet.copyOf(posixFilePermissions);
        copyOf.addAll(of);
        Files.setPosixFilePermissions(FileRetargetClass.toPath(file), copyOf);
        return file.canExecute();
    }
}
