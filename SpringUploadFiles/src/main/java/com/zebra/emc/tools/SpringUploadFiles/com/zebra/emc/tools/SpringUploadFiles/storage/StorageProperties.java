package com.zebra.emc.tools.SpringUploadFiles.com.zebra.emc.tools.SpringUploadFiles.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Tony Li Xu on 3/22/2017.
 */
@ConfigurationProperties("storage")
public class StorageProperties {

    /**
     * Folder location for storing files
     */
    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
