package com.zebra.emc.tools.SpringUploadFiles.storage;

/**
 * Created by Tony Li Xu on 3/22/2017.
 */
public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }

}
