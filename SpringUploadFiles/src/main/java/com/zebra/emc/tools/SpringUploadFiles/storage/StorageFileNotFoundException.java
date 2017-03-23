package com.zebra.emc.tools.SpringUploadFiles.storage;

/**
 * Created by Tony Li Xu on 3/22/2017.
 */
public class StorageFileNotFoundException extends StorageException {

    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
