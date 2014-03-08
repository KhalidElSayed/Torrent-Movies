package com.softwarrior.libtorrent;

/**
 * @author jaap Wrapper class for Libtorrent JNI
 */
public class LibTorrent {
	static {
		System.loadLibrary("torrent");
	}

	// public static final LibTorrent Instance = new LibTorrent();
	//
	// @Override
	// public Object clone() throws CloneNotSupportedException {
	// throw new CloneNotSupportedException();
	// }
	//
	// private LibTorrent(){};
	// -----------------------------------------------------------------------------
	/**
	 * 
	 * @param ListenPort
	 * @param UploadLimit
	 *            in kb/s
	 * @param DownloadLimit
	 *            in kb/s
	 * @param Encryption
	 *            on or off
	 * @return
	 */
	public native boolean SetSession(int ListenPort, int UploadLimit,
			int DownloadLimit, boolean Encryption);

	/**
	 * enum proxy_type { 0 - none, * a plain tcp socket is used, and the other
	 * settings are ignored. 1 - socks4, * socks4 server, requires username. 2 -
	 * socks5, * the hostname and port settings are used to connect to the
	 * proxy. No username or password is sent. 3 - socks5_pw, * the hostname and
	 * port are used to connect to the proxy. the username and password are used
	 * to authenticate with the proxy server. 4 - http, * the http proxy is only
	 * available for tracker and web seed traffic assumes anonymous access to
	 * proxy 5 - http_pw * http proxy with basic authentication uses username
	 * and password };
	 * 
	 * @param Type
	 * @param HostName
	 * @param Port
	 * @param UserName
	 * @param Password
	 * @return
	 */
	public native boolean SetProxy(int Type, String HostName, int Port,
			String UserName, String Password);

	// -----------------------------------------------------------------------------
	public native boolean SetSessionOptions(boolean LSD, boolean UPNP,
			boolean NATPMP);

	/**
	 * StorageMode: 0-storage_mode_allocate 1-storage_mode_sparse
	 * 2-storage_mode_compact
	 */
	public native boolean AddTorrent(String SavePath, String TorentFile,
			int StorageMode, boolean IsMagnet);

	// -----------------------------------------------------------------------------
	public native boolean PauseSession();

	// -----------------------------------------------------------------------------
	public native boolean ResumeSession();

	// -----------------------------------------------------------------------------
	public native boolean AbortSession();

	// -----------------------------------------------------------------------------
	public native boolean RemoveTorrent(String ContentFile);

	// -----------------------------------------------------------------------------
	public native boolean PauseTorrent(String ContentFile);

	// -----------------------------------------------------------------------------
	public native boolean ResumeTorrent(String ContentFile);

	// -----------------------------------------------------------------------------
	public native int GetTorrentProgress(String ContentFile);

	// -----------------------------------------------------------------------------
	/**
	 * result MB
	 */
	public native long GetTorrentProgressSize(String ContentFile);

	/**
	 * enum state_t { 0 queued_for_checking, 1 checking_files, 2
	 * downloading_metadata, 3 downloading, 4 finished, 5 seeding, 6 allocating,
	 * 7 checking_resume_data } + 8 paused + 9 queued
	 */
	public native int GetTorrentState(String ContentFile);

	/**
	 * static char const* state_str[] = {"checking (q)", "checking",
	 * "dl metadata", "downloading", "finished", "seeding", "allocating",
	 * "checking (r)"};
	 */
	public native String GetTorrentStatusText(String ContentFile);

	public native String GetSessionStatusText();

	/**
	 * separator between files '\n'
	 */
	public native String GetTorrentFiles(String ContentFile);

	/**
	 * 0 - piece is not downloaded at all 1 - normal priority. Download order is
	 * dependent on availability 2 - higher than normal priority. Pieces are
	 * preferred over pieces with the same availability, but not over pieces
	 * with lower availability 3 - pieces are as likely to be picked as partial
	 * pieces. 4 - pieces are preferred over partial pieces, but not over pieces
	 * with lower availability 5 - currently the same as 4 6 - piece is as
	 * likely to be picked as any piece with availability 1 7 - maximum
	 * priority, availability is disregarded, the piece is preferred over any
	 * other piece with lower priority
	 */
	public native boolean SetTorrentFilesPriority(byte[] FilesPriority,
			String ContentFile);

	public native byte[] GetTorrentFilesPriority(String ContentFile);

	public native String GetTorrentName(String TorrentFile);

	/**
	 * result MB
	 * 
	 * @param TorrentFile
	 * @return
	 */
	public native long GetTorrentSize(String TorrentFile);

	public native int[] GetPiecePriorities(String ContentFile);

	/**
	 * set the piece priorities
	 */
	public native boolean SetPiecePriorities(String ContentFile,
			int[] Priorities);

	public native boolean HavePiece(String ContentFile, int index);

	public native boolean[] GetBlocksForPiece(String ContentFile, int PieceIndex);

	/**
	 * piece size for the index piece in bytes (all the same except the last)
	 */
	public native long GetPieceSize(String ContentFile, int PieceIndex);

	/**
	 * Total progress size in bytes, stays 0 while in checking files state
	 */
	public native long GetProgressSize(String ContentFile);

	/**
	 * Makes torrent file from magnet link and saves it in savepath
	 * 
	 * @param SavePath
	 *            path to save torrent
	 * @param MagnetLink
	 *            the magnetlink to make the torrent from returns string of
	 *            filename
	 */
	public native boolean MakeTorrentFromMagnet(String SavePath,
			String MagnetLink);

	/**
	 * Add a magnet link
	 * 
	 * @param SavePath
	 *            path to save torrent
	 * @param StorageMode
	 *            see addTorrent
	 * @param MagnetLink
	 *            the magnetlink to make the torrent from returns string of
	 *            filename
	 * @return true if succesfull
	 */
	public native boolean AddMagnet(String SavePath, int StorageMode,
			String MagnetLink);

	/**
	 * returns true if the magnetlink has received the metadata
	 * 
	 * @param SavePath
	 * @param MagnetLink
	 * @return true if the magnetlink has received the metadata
	 */
	public native boolean HasMetaData(String SavePath, String MagnetLink);

	/**
	 * fix for magnets, should be called after getting data preq: metadata is
	 * available and savepath is set
	 * 
	 * @param MagnetLink
	 * @return true
	 */
	public native String GetMagnetContentFileName(String MagnetLink);

	/**
	 * @return the stored save path
	 */
	public native String GetSavePath();

	/**
	 * Set the save path for future use
	 * 
	 * @param SavePath
	 *            , the absolute save path
	 * @returns true
	 */
	public native boolean SetSavePath(String SavePath);

	/**
	 * Will return the number of torrents in the libtorrent queue
	 * 
	 * @return number of torrents in the libtorrent queue
	 */
	public native int GetNumberOfTorrents();

	/**
	 * @return true if the session is active or false if not(when it is paused,
	 *         aborted or otherwise)
	 */
	public native boolean GetSessionState();
}
