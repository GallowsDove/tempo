package com.cappielloantonio.play.util

import com.cappielloantonio.play.App
import com.cappielloantonio.play.helper.ThemeHelper

object Preferences {
    const val THEME = "theme"
    private const val SERVER = "server"
    private const val USER = "user"
    private const val PASSWORD = "password"
    private const val TOKEN = "token"
    private const val SALT = "salt"
    private const val LOW_SECURITY = "low_security"
    private const val SERVER_ID = "server_id"
    private const val PLAYBACK_SPEED = "playback_speed"
    private const val SKIP_SILENCE = "skip_silence"
    private const val IMAGE_CACHE_SIZE = "image_cache_size"
    private const val IMAGE_SIZE = "image_size"
    private const val MEDIA_CACHE_SIZE = "media_cache_size"
    private const val MAX_BITRATE_WIFI = "max_bitrate_wifi"
    private const val MAX_BITRATE_MOBILE = "max_bitrate_mobile"
    private const val AUDIO_TRANSCODE_FORMAT_WIFI = "audio_transcode_format_wifi"
    private const val AUDIO_TRANSCODE_FORMAT_MOBILE = "audio_transcode_format_mobile"
    private const val WIFI_ONLY = "wifi_only"
    private const val DATA_SAVING_MODE = "data_saving_mode"
    private const val SYNC_STARRED_TRACKS_FOR_OFFLINE_USE = "sync_starred_tracks_for_offline_use"

    @JvmStatic
    fun getTheme(): String? {
        return App.getInstance().preferences.getString(THEME, ThemeHelper.DEFAULT_MODE)
    }

    @JvmStatic
    fun getServer(): String? {
        return App.getInstance().preferences.getString(SERVER, null)
    }

    @JvmStatic
    fun setServer(server: String?) {
        App.getInstance().preferences.edit().putString(SERVER, server).apply()
    }

    @JvmStatic
    fun getUser(): String? {
        return App.getInstance().preferences.getString(USER, null)
    }

    @JvmStatic
    fun setUser(user: String?) {
        App.getInstance().preferences.edit().putString(USER, user).apply()
    }

    @JvmStatic
    fun getPassword(): String? {
        return App.getInstance().preferences.getString(PASSWORD, null)
    }

    @JvmStatic
    fun setPassword(password: String?) {
        App.getInstance().preferences.edit().putString(PASSWORD, password).apply()
    }

    @JvmStatic
    fun getToken(): String? {
        return App.getInstance().preferences.getString(TOKEN, null)
    }

    @JvmStatic
    fun setToken(token: String?) {
        App.getInstance().preferences.edit().putString(TOKEN, token).apply()
    }

    @JvmStatic
    fun getSalt(): String? {
        return App.getInstance().preferences.getString(SALT, null)
    }

    @JvmStatic
    fun setSalt(salt: String?) {
        App.getInstance().preferences.edit().putString(SALT, salt).apply()
    }

    @JvmStatic
    fun isLowScurity(): Boolean {
        return App.getInstance().preferences.getBoolean(LOW_SECURITY, false)
    }

    @JvmStatic
    fun setLowSecurity(isLowSecurity: Boolean) {
        App.getInstance().preferences.edit().putBoolean(LOW_SECURITY, isLowSecurity).apply()
    }

    @JvmStatic
    fun getServerId(): String? {
        return App.getInstance().preferences.getString(SERVER_ID, null)
    }

    @JvmStatic
    fun setServerId(serverId: String?) {
        App.getInstance().preferences.edit().putString(SERVER_ID, serverId).apply()
    }

    @JvmStatic
    fun getPlaybackSpeed(): Float {
        return App.getInstance().preferences.getFloat(PLAYBACK_SPEED, 1f)
    }

    @JvmStatic
    fun setPlaybackSpeed(playbackSpeed: Float) {
        App.getInstance().preferences.edit().putFloat(PLAYBACK_SPEED, playbackSpeed).apply()
    }

    @JvmStatic
    fun isSkipSilenceMode(): Boolean {
        return App.getInstance().preferences.getBoolean(SKIP_SILENCE, false)
    }

    @JvmStatic
    fun setSkipSilenceMode(isSkipSilenceMode: Boolean) {
        App.getInstance().preferences.edit().putBoolean(SKIP_SILENCE, isSkipSilenceMode)
            .apply()
    }

    @JvmStatic
    fun getImageCacheSize(): Int {
        return App.getInstance().preferences.getString(IMAGE_CACHE_SIZE, "400000000")!!
            .toInt()
    }

    @JvmStatic
    fun getMediaCacheSize(): Int {
        return App.getInstance().preferences.getString(MEDIA_CACHE_SIZE, "400000000")!!
            .toInt()
    }

    @JvmStatic
    fun getImageSize(): Int {
        return App.getInstance().preferences.getString(IMAGE_SIZE, "-1")!!.toInt()
    }

    @JvmStatic
    fun getMaxBitrateWifi(): String {
        return App.getInstance().preferences.getString(MAX_BITRATE_WIFI, "0")!!
    }

    @JvmStatic
    fun getMaxBitrateMobile(): String {
        return App.getInstance().preferences.getString(MAX_BITRATE_MOBILE, "0")!!
    }

    @JvmStatic
    fun getAudioTranscodeFormatWifi(): String {
        return App.getInstance().preferences.getString(AUDIO_TRANSCODE_FORMAT_WIFI, "raw")!!
    }

    @JvmStatic
    fun getAudioTranscodeFormatMobile(): String {
        return App.getInstance().preferences.getString(AUDIO_TRANSCODE_FORMAT_MOBILE, "raw")!!
    }

    @JvmStatic
    fun isWifiOnly(): Boolean {
        return App.getInstance().preferences.getBoolean(WIFI_ONLY, false)
    }

    @JvmStatic
    fun isDataSavingMode(): Boolean {
        return App.getInstance().preferences.getBoolean(DATA_SAVING_MODE, false)
    }

    @JvmStatic
    fun setDataSavingMode(isDataSavingModeEnabled: Boolean) {
        App.getInstance().preferences.edit()
            .putBoolean(DATA_SAVING_MODE, isDataSavingModeEnabled).apply()
    }

    @JvmStatic
    fun isStarredSyncEnabled(): Boolean {
        return App.getInstance().preferences
            .getBoolean(SYNC_STARRED_TRACKS_FOR_OFFLINE_USE, false)
    }

    @JvmStatic
    fun setStarredSyncEnabled(isStarredSyncEnabled: Boolean) {
        App.getInstance().preferences.edit().putBoolean(
            SYNC_STARRED_TRACKS_FOR_OFFLINE_USE, isStarredSyncEnabled
        ).apply()
    }
}