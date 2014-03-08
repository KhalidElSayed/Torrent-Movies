package com.tudelft.triblersvod.example;

public class TorrentContainer {

	public volatile String Status = "";
	public volatile String Name = "";
	public volatile String SavePath = "";
	public volatile String ContentName = "";
	public volatile int Progress = 0; // 0-100?
	public volatile long TotalSize = 0; // MB
	public volatile long ProgressSize = 0; // MB
	public volatile int StorageMode = 0;

	// 0-storage_mode_allocate,
	// 1-storage_mode_sparse,
	// 2-storage_mode_compact

	public TorrentContainer(String fileName, String contentName, int progress,
			long progressSize, long totalSize, int storageMode, String savePath) {
		Name = fileName;
		ContentName = contentName;
		Progress = progress;
		ProgressSize = progressSize;
		TotalSize = totalSize;
		StorageMode = storageMode;
		SavePath = savePath;
	}
}
