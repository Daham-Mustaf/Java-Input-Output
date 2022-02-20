package io.java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileFiltering {
	public static void main(String[] args) throws IOException {
		String dirPath = "/Users/m-store/eclipse-workspace/InputOutput";
		java.util.List<File> files = Files.list(Paths.get(dirPath))
				.map(Paths::toFile)
				.collect(Collectors.toList());

		files.forEach(System.out::println);
	}

}
