Torrent-Movies
==============

An Android application to watch torrent movies in your device.

#### Libraries
- [Libtorrent](https://github.com/rakshasa/libtorrent)
- [VideoLan](http://git.videolan.org/?p=vlc-ports/android.git;a=summary)
  _Information about VLC port_ https://wiki.videolan.org/AndroidCompile/ https://wiki.videolan.org/LibVLC/
- [AsyncHTTP](http://git.videolan.org/?p=vlc-ports/android.git;a=summary)
- [TMDB Wrapper for Android] (https://github.com/UweTrottmann/tmdb-java)


#### APIS
- [YIFI Torrents](https://yify-torrents.com/api/)
- [TMDB](https://www.themoviedb.org/documentation/api)


### Pending
- [] Integrate NDK with VLC and LibTorrent
- [] Connect torrent magnet URL with VLC and check if working
- [] Detail view
- [] Review grid view with images

## How to build Libtorrent
```
Build Instructions Libtorrent

BUILD BOOST
Tirst clone the boost for android project from github:
git clone https://github.com/MysticTreeGames/Boost-for-Android

Go to the directory in which the project resides, example:
cd git/Boost-for-Android

Then let boost-for-android, download and build boost by issuing the following command:
./build-android.sh

SETUP ENVIRONMENT
Add the following to environment (sudo gedit /etc/environment)
AndroidNDKRoot=path/to/android-ndk-r9_32
NDK_ROOT=path/to/android-ndk-r9_32
NDK_MODULE_PATH=path/to/Boost-for-Android
BOOST_ROOT=path/to/boost
BOOST_BUILD_PATH=path/to/boost/tools/build/v2

add the following to PATH:
path/to/Boost-for-Android

EXTRACT LIBTORRENT FROM RUTRACKER
Download the RuTracker source:
svn checkout http://softwarrior.googlecode.com/svn/tags/RutrackerDownloader/2.6.5.5/
extract all from the JNI folder.

MODIFY CONTENTS
In Libtorrent source, adapt file.cpp: 
Change ifdef __NR_fallocate to: ifndef __NR_fallocate

Add the previously build Boost libraries to libboost and make sure the filenames of these libraries in Android.mk are correct
In Application.mk, change or add APP_ABI to APP_ABI := armeabi armeabi-v7a

BUILD LIBTORRENT LIBS
In a terminal:
Go to the folder where RuTracker resides: cd path/to/RuTracker
Issue the following commands:
ndk-build clean
ndk-build

After a while it should have created the libraries libtorrent.so for both armeabi and armeabi-v7a in the libs folder.
```

## How to build VLC_lib
```
ENVIRONMENT
INSTALL:
- ORACLE JDK SE 6 64-BIT
- ANDROID SDK (including latest android version platforms)
- AND NDK R9

SETUP environment variables:

sudo gedit /etc/environment
add ANDROID_SDK=/home/user/android/android-sdk-linux
add ANDROID_NDK/home/user/android/android-ndk-r9
add ANDROID_ABI=armeabi-v7a

PATH add:
/home/user/android/android-sdk-linux/platform-tools:/home/user/android/android-
sdk-linux/tools
INSTALL THE FOLLOWING TOOLS: apache-ant (or ant), autoconf, automake, autopoint,
cmake, gawk (or nawk), gcc, g++, ia32-libs, build-essentials, libtool, m4, patch, pkg-config, ragel, subversion, and very up-to-date versions of those tools.

on the command line:
sudo apt-get install ant autoconf automake autopoint cmake gawk gcc g++ ia32-libs build-essentials libtool m4 patch pkg-config ragel subversion

GET THE SOURCE CODE:
git clone git://git.videolan.org/vlc-ports/android.git
COMPILING PROCESS
1.gedit /compile.sh
2.Edit the mcpu flags for the appropriate target CPU (cortex-a15 for Nexus 10)
3.gedit /vlc-android/jni/Application.mk
4.Modify content into NDK_TOOLCHAIN_VERSION=4.8
3.sh compile.sh
4.When the compiling stops, run the following command: find ~/vlcsourcefolder/ -name
“udiv.asm”
5.Edit each file from the search results, and remove the spaces between the [ ] brackets, if any.
AFFECTED FILES:
/home/user/git/android/vlc/contrib/android/gmp/mpn/udiv.asm
6.sh compile.sh (start the compilation again, it will now succesfully continue and finish)
COMPILING IS DONE!!
TARGET DEVICE INSTALLATION INSTRUCTIONS:
1.cd /vlc-android/bin/ folder
2.install the apk file with the 'adb install filename.apk' command
```
