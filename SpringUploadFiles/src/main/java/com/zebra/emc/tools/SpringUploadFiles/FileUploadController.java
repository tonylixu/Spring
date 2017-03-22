package com.zebra.emc.tools.SpringUploadFiles;

import java.io.IOException;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

/**
 * Created by Tony Li Xu on 3/22/2017.
 */
@Controller
public class FileUploadController {

    private final StorageService storageService;

    @Autowired
    public FileUploadController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping("/")
    public String listUploadedFiles(Model model) throws IOException {

        model.addAttribute("files", storageService
            .loadAll()
            .map(path ->
                MvcUriComponentsBuilder
                    .fromMethodName(FileUploadController.class, "serveFile",
                        path.getFileName().toString())
                    .build().toString())
            .collect(Collectors.toList()));

        return "uploadForm";
    }
}
