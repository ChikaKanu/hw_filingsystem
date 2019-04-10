package com.codeclan.example.filingsystem;

import com.codeclan.example.filingsystem.models.File;
import com.codeclan.example.filingsystem.models.Folder;
import com.codeclan.example.filingsystem.models.User;
import com.codeclan.example.filingsystem.repository.FileRepository;
import com.codeclan.example.filingsystem.repository.FolderRepository;
import com.codeclan.example.filingsystem.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilingsystemApplicationTests {


	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFolderAndFileAndSave() {
		User user1 = new User("John");
		userRepository.save(user1);

		Folder folder1= new Folder("Project1 Folder", user1);
		folderRepository.save(folder1);

		File file1 = new File("Journal", "txt", 400, folder1);
		fileRepository.save(file1);

		folder1.addFiles(file1);
		folderRepository.save(folder1);

	}

	@Test
	public void createFolderAndUserAndSave() {
		User user1 = new User("John");
		userRepository.save(user1);

		Folder folder1= new Folder("Project1 Folder", user1);
		folderRepository.save(folder1);

		File file1 = new File("Journal", "txt", 400, folder1);
		fileRepository.save(file1);

		user1.addFolder(folder1);
		userRepository.save(user1);

	}

}
