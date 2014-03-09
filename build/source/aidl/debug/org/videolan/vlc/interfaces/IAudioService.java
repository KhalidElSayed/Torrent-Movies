/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/pepibumur/Desktop/Torrent-Movies/src/org/videolan/vlc/interfaces/IAudioService.aidl
 */
package org.videolan.vlc.interfaces;
public interface IAudioService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.videolan.vlc.interfaces.IAudioService
{
private static final java.lang.String DESCRIPTOR = "org.videolan.vlc.interfaces.IAudioService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.videolan.vlc.interfaces.IAudioService interface,
 * generating a proxy if needed.
 */
public static org.videolan.vlc.interfaces.IAudioService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.videolan.vlc.interfaces.IAudioService))) {
return ((org.videolan.vlc.interfaces.IAudioService)iin);
}
return new org.videolan.vlc.interfaces.IAudioService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_play:
{
data.enforceInterface(DESCRIPTOR);
this.play();
reply.writeNoException();
return true;
}
case TRANSACTION_pause:
{
data.enforceInterface(DESCRIPTOR);
this.pause();
reply.writeNoException();
return true;
}
case TRANSACTION_stop:
{
data.enforceInterface(DESCRIPTOR);
this.stop();
reply.writeNoException();
return true;
}
case TRANSACTION_next:
{
data.enforceInterface(DESCRIPTOR);
this.next();
reply.writeNoException();
return true;
}
case TRANSACTION_previous:
{
data.enforceInterface(DESCRIPTOR);
this.previous();
reply.writeNoException();
return true;
}
case TRANSACTION_shuffle:
{
data.enforceInterface(DESCRIPTOR);
this.shuffle();
reply.writeNoException();
return true;
}
case TRANSACTION_setTime:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.setTime(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_load:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<java.lang.String> _arg0;
_arg0 = data.createStringArrayList();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.load(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_append:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<java.lang.String> _arg0;
_arg0 = data.createStringArrayList();
this.append(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_moveItem:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.moveItem(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_remove:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.remove(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getMediaLocations:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<java.lang.String> _result = this.getMediaLocations();
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_getCurrentMediaLocation:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getCurrentMediaLocation();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_isPlaying:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isPlaying();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isShuffling:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isShuffling();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getRepeatType:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getRepeatType();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setRepeatType:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setRepeatType(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_hasMedia:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.hasMedia();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_hasNext:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.hasNext();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_hasPrevious:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.hasPrevious();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getTitle:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getTitle();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getTitlePrev:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getTitlePrev();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getTitleNext:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getTitleNext();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getArtist:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getArtist();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getArtistPrev:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getArtistPrev();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getArtistNext:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getArtistNext();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getAlbum:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getAlbum();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getTime:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getTime();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getLength:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getLength();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getCover:
{
data.enforceInterface(DESCRIPTOR);
android.graphics.Bitmap _result = this.getCover();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getCoverPrev:
{
data.enforceInterface(DESCRIPTOR);
android.graphics.Bitmap _result = this.getCoverPrev();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getCoverNext:
{
data.enforceInterface(DESCRIPTOR);
android.graphics.Bitmap _result = this.getCoverNext();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_addAudioCallback:
{
data.enforceInterface(DESCRIPTOR);
org.videolan.vlc.interfaces.IAudioServiceCallback _arg0;
_arg0 = org.videolan.vlc.interfaces.IAudioServiceCallback.Stub.asInterface(data.readStrongBinder());
this.addAudioCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_removeAudioCallback:
{
data.enforceInterface(DESCRIPTOR);
org.videolan.vlc.interfaces.IAudioServiceCallback _arg0;
_arg0 = org.videolan.vlc.interfaces.IAudioServiceCallback.Stub.asInterface(data.readStrongBinder());
this.removeAudioCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_detectHeadset:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.detectHeadset(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_showWithoutParse:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.showWithoutParse(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_playIndex:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.playIndex(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getRate:
{
data.enforceInterface(DESCRIPTOR);
float _result = this.getRate();
reply.writeNoException();
reply.writeFloat(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.videolan.vlc.interfaces.IAudioService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void play() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_play, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void pause() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_pause, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stop() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stop, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void next() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_next, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void previous() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_previous, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void shuffle() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_shuffle, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setTime(long time) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(time);
mRemote.transact(Stub.TRANSACTION_setTime, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void load(java.util.List<java.lang.String> mediaPathList, int position, boolean noVideo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStringList(mediaPathList);
_data.writeInt(position);
_data.writeInt(((noVideo)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_load, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void append(java.util.List<java.lang.String> mediaPathList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStringList(mediaPathList);
mRemote.transact(Stub.TRANSACTION_append, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void moveItem(int positionStart, int positionEnd) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(positionStart);
_data.writeInt(positionEnd);
mRemote.transact(Stub.TRANSACTION_moveItem, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void remove(int position) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(position);
mRemote.transact(Stub.TRANSACTION_remove, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.util.List<java.lang.String> getMediaLocations() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMediaLocations, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getCurrentMediaLocation() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentMediaLocation, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isPlaying() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isPlaying, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isShuffling() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isShuffling, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getRepeatType() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRepeatType, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setRepeatType(int t) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(t);
mRemote.transact(Stub.TRANSACTION_setRepeatType, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean hasMedia() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_hasMedia, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean hasNext() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_hasNext, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean hasPrevious() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_hasPrevious, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getTitle() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTitle, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getTitlePrev() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTitlePrev, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getTitleNext() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTitleNext, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getArtist() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getArtist, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getArtistPrev() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getArtistPrev, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getArtistNext() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getArtistNext, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getAlbum() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAlbum, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getTime() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTime, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getLength() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLength, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.graphics.Bitmap getCover() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.graphics.Bitmap _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCover, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.graphics.Bitmap.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.graphics.Bitmap getCoverPrev() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.graphics.Bitmap _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCoverPrev, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.graphics.Bitmap.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.graphics.Bitmap getCoverNext() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.graphics.Bitmap _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCoverNext, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.graphics.Bitmap.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void addAudioCallback(org.videolan.vlc.interfaces.IAudioServiceCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_addAudioCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeAudioCallback(org.videolan.vlc.interfaces.IAudioServiceCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_removeAudioCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void detectHeadset(boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_detectHeadset, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void showWithoutParse(int index) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
mRemote.transact(Stub.TRANSACTION_showWithoutParse, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void playIndex(int index) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
mRemote.transact(Stub.TRANSACTION_playIndex, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public float getRate() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
float _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRate, _data, _reply, 0);
_reply.readException();
_result = _reply.readFloat();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_play = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_pause = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_stop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_next = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_previous = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_shuffle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_load = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_append = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_moveItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_remove = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getMediaLocations = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getCurrentMediaLocation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_isPlaying = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_isShuffling = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getRepeatType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_setRepeatType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_hasMedia = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_hasNext = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_hasPrevious = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_getTitle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_getTitlePrev = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_getTitleNext = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_getArtist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_getArtistPrev = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_getArtistNext = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_getAlbum = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_getTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_getLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_getCover = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_getCoverPrev = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_getCoverNext = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_addAudioCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_removeAudioCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_detectHeadset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_showWithoutParse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_playIndex = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_getRate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
}
public void play() throws android.os.RemoteException;
public void pause() throws android.os.RemoteException;
public void stop() throws android.os.RemoteException;
public void next() throws android.os.RemoteException;
public void previous() throws android.os.RemoteException;
public void shuffle() throws android.os.RemoteException;
public void setTime(long time) throws android.os.RemoteException;
public void load(java.util.List<java.lang.String> mediaPathList, int position, boolean noVideo) throws android.os.RemoteException;
public void append(java.util.List<java.lang.String> mediaPathList) throws android.os.RemoteException;
public void moveItem(int positionStart, int positionEnd) throws android.os.RemoteException;
public void remove(int position) throws android.os.RemoteException;
public java.util.List<java.lang.String> getMediaLocations() throws android.os.RemoteException;
public java.lang.String getCurrentMediaLocation() throws android.os.RemoteException;
public boolean isPlaying() throws android.os.RemoteException;
public boolean isShuffling() throws android.os.RemoteException;
public int getRepeatType() throws android.os.RemoteException;
public void setRepeatType(int t) throws android.os.RemoteException;
public boolean hasMedia() throws android.os.RemoteException;
public boolean hasNext() throws android.os.RemoteException;
public boolean hasPrevious() throws android.os.RemoteException;
public java.lang.String getTitle() throws android.os.RemoteException;
public java.lang.String getTitlePrev() throws android.os.RemoteException;
public java.lang.String getTitleNext() throws android.os.RemoteException;
public java.lang.String getArtist() throws android.os.RemoteException;
public java.lang.String getArtistPrev() throws android.os.RemoteException;
public java.lang.String getArtistNext() throws android.os.RemoteException;
public java.lang.String getAlbum() throws android.os.RemoteException;
public int getTime() throws android.os.RemoteException;
public int getLength() throws android.os.RemoteException;
public android.graphics.Bitmap getCover() throws android.os.RemoteException;
public android.graphics.Bitmap getCoverPrev() throws android.os.RemoteException;
public android.graphics.Bitmap getCoverNext() throws android.os.RemoteException;
public void addAudioCallback(org.videolan.vlc.interfaces.IAudioServiceCallback cb) throws android.os.RemoteException;
public void removeAudioCallback(org.videolan.vlc.interfaces.IAudioServiceCallback cb) throws android.os.RemoteException;
public void detectHeadset(boolean enable) throws android.os.RemoteException;
public void showWithoutParse(int index) throws android.os.RemoteException;
public void playIndex(int index) throws android.os.RemoteException;
public float getRate() throws android.os.RemoteException;
}
