#!/bin/sh
# FourierTest/build.sh
# Compiles fftw3 for Android
# Make sure you have NDK_ROOT defined in .bashrc or .bash_profile

INSTALL_DIR="/Users/pepibumur/Desktop/Torrent-Movies/jni/libtorrent/"
SRC_DIR="/Users/pepibumur/Desktop/Torrent-Movies/libtorrent/"

cd $SRC_DIR

export PATH="$NDK_ROOT/toolchains/arm-linux-androideabi-4.6/prebuilt/darwin-x86/bin/:$PATH"
export SYS_ROOT="$NDK_ROOT/platforms/android-19/arch-arm/"
export CC="arm-linux-androideabi-gcc --sysroot=$SYS_ROOT"
export LD="arm-linux-androideabi-ld"
export AR="arm-linux-androideabi-ar"
export RANLIB="arm-linux-androideabi-ranlib"
export STRIP="arm-linux-androideabi-strip"

./configure --prefix=$INSTALL_DIR \
--enable-static \
--enable-pic \
--disable-asm \
--disable-cli \
--host=arm-eabi \
--build=i386-apple-darwin10.8.0

make
sudo make install

exit 0

# http://dl.dropboxusercontent.com/u/22605641/ffmpeg_android/main.html
# http://blog.jimjh.com/compiling-open-source-libraries-with-android-ndk-part-2.html
# http://www.rasterbar.com/products/libtorrent/examples.html