package com.componente.factinven.fileupload;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {

	void init();

	void store(MultipartFile file, String pathName);

	Stream<Path> loadAll();

	Path load(String filename);

	Resource loadAsResource(String filename, String pathName);

	void deleteAll();

	void deleteAllbyName(String pathName, String filename);

}
