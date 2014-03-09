package com.PPinera.Torrent_Movies.Helpers;

public enum FilePriority {
	DONTDOWNLOAD, NORMAL, HIGHERTHANNORMAL, ASLIKELYASPARTIAL, PREFERREDOVERPARTIAL, SAMEASPREFERREDOVERPARTIAL, ASLIKELYASNORMAL, MAXPRIORITY;

	public byte getByte() {
		return (byte) ordinal();
	}
}
