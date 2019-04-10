package com.codeclan.example.filingsystem.components;

import com.codeclan.example.filingsystem.models.File;
import com.codeclan.example.filingsystem.models.Folder;
import com.codeclan.example.filingsystem.models.User;
import com.codeclan.example.filingsystem.repository.FileRepository;
import com.codeclan.example.filingsystem.repository.FolderRepository;
import com.codeclan.example.filingsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        User user1 = new User("John");
        userRepository.save(user1);

        User user2 = new User("Mella");
        userRepository.save(user1);

        Folder folder1= new Folder("Project1 Folder", user1);
        folderRepository.save(folder1);

        Folder folder2= new Folder("Project2 Folder", user2);
        folderRepository.save(folder1);

        File file1 = new File("Journal", "txt", 400, folder1);
        fileRepository.save(file1);

        File file2 = new File("One upon a time", "pdf", 200, folder2);
        fileRepository.save(file1);

        folder1.addFiles(file1);
        folder2.addFiles(file2);
        folderRepository.save(folder1);
        folderRepository.save(folder2);

        user1.addFolder(folder1);
        user2.addFolder(folder2);
        userRepository.save(user1);
        userRepository.save(user2);

    }

}
