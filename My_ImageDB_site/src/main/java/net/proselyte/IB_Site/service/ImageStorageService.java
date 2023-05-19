package net.proselyte.IB_Site.service;
import java.nio.file.Path;
import java.util.stream.Stream;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;
public interface ImageStorageService    {
    public void init();
    public void save(MultipartFile file);
    public Resource load(String fileName);
    public void deleteAllFiles();
    public Stream<Path> loadAll();
}
