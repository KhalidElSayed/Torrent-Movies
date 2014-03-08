package com.tudelft.triblersvod.example;

public enum TorrentState {
	QEUED_FOR_CHECKING("Qeued for checking"), CHECKING_FILES("Checking files"), DOWNLOADING_METADATA(
			"Downloading metadata"), DOWNLOADING("Downloading"), FINISHED(
			"Finished"), SEEDING("Seeding"), ALLOCATING("Allocating"), CHECKING_RESUME_DATA(
			"Checking resume data"), PAUSED("Paused"), QEUED("Qeued");

	private String name;

	private TorrentState(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
