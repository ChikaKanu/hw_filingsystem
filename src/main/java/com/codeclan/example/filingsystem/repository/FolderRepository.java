package com.codeclan.example.filingsystem.repository;

import com.codeclan.example.filingsystem.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
