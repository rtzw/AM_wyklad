package com.example.am_wyklad.Database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J6\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000fJ\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001dJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u0006J\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0!2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060!2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020$0!2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0006J\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020$0!2\u0006\u0010\u0014\u001a\u00020\u0006J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060!2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001c\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00060!2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0006J\u001e\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u001a0)j\b\u0012\u0004\u0012\u00020\u001a`*2\u0006\u0010+\u001a\u00020\u0006J\u000e\u0010,\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u0006J\u0016\u0010,\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006J\u0010\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u000200H\u0016J \u00101\u001a\u00020\r2\u0006\u0010/\u001a\u0002002\u0006\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000fH\u0016J\u000e\u00104\u001a\u00020\r2\u0006\u00105\u001a\u00020$R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/example/am_wyklad/Database/UserDatabase;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "CREATE_CHALLENGE_TABLE", "", "CREATE_PROFILE_TABLE", "CREATE_USER_TABLE", "DROP_CHALLENGE_TABLE", "DROP_PROFILE_TABLE", "DROP_USER_TABLE", "addChallenge", "", "userId", "", "description", "addProfile", "adminId", "name", "code", "challenges", "players", "draw", "addUser", "user", "Lcom/example/am_wyklad/Database/User;", "deleteProfile", "getAllUser", "", "getBooleanProfileByCode", "", "getChallengeByDescription", "", "getChallenges", "getProfile", "Lcom/example/am_wyklad/Database/Profile;", "getProfileByCode", "getProfiles", "getProfilesByName", "getUserByLogin", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "login", "isRegistered", "password", "onCreate", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "old", "new", "updateProfile", "profile", "Companion", "app_debug"})
public final class UserDatabase extends android.database.sqlite.SQLiteOpenHelper {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.am_wyklad.Database.UserDatabase.Companion Companion = null;
    private static final java.lang.String DATABASE_NAME = "am.db";
    private static final int DATABASE_VERSION = 11;
    private static final java.lang.String TABLE_USER = "user";
    private static final java.lang.String COLUMN_ID = "id";
    private static final java.lang.String COLUMN_USER_LOGIN = "login";
    private static final java.lang.String COLUMN_USER_PASSWORD = "password";
    private static final java.lang.String COLUMN_USER_NAME = "name";
    private static final java.lang.String TABLE_CHALLENGE = "challenge";
    private static final java.lang.String COLUMN_CHALLENGE_USER_ID = "user_id";
    private static final java.lang.String COLUMN_CHALLENGE_DESCRIPTION = "description";
    private static final java.lang.String TABLE_PROFILE = "profile";
    private static final java.lang.String COLUMN_PROFILE_ADMIN_ID = "admin_id";
    private static final java.lang.String COLUMN_PROFILE_NAME = "name";
    private static final java.lang.String COLUMN_PROFILE_CODE = "code";
    private static final java.lang.String COLUMN_PROFILE_CHALLENGES = "challenges";
    private static final java.lang.String COLUMN_PROFILE_PLAYERS = "players";
    private static final java.lang.String COLUMN_PROFILE_DRAW = "draw";
    private final java.lang.String CREATE_USER_TABLE = "CREATE TABLE  user(id INTEGER PRIMARY KEY AUTOINCREMENT,login TEXT,password TEXT, name TEXT)";
    private final java.lang.String CREATE_PROFILE_TABLE = "CREATE TABLE  profile(id INTEGER PRIMARY KEY AUTOINCREMENT,admin_id INTEGER,name TEXT, code TEXT, challenges TEXT, players TEXT, draw TEXT )";
    private final java.lang.String CREATE_CHALLENGE_TABLE = "CREATE TABLE  challenge(id INTEGER PRIMARY KEY AUTOINCREMENT,user_id INTEGER,description TEXT)";
    private final java.lang.String DROP_USER_TABLE = "DROP TABLE IF EXISTS user";
    private final java.lang.String DROP_PROFILE_TABLE = "DROP TABLE IF EXISTS profile";
    private final java.lang.String DROP_CHALLENGE_TABLE = "DROP TABLE IF EXISTS challenge";
    
    public UserDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, null, 0);
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.NotNull()
    android.database.sqlite.SQLiteDatabase db) {
    }
    
    @java.lang.Override()
    public void onUpgrade(@org.jetbrains.annotations.NotNull()
    android.database.sqlite.SQLiteDatabase db, int old, int p2_54480) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.am_wyklad.Database.User> getAllUser() {
        return null;
    }
    
    public final void addUser(@org.jetbrains.annotations.NotNull()
    com.example.am_wyklad.Database.User user) {
    }
    
    public final void deleteProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String name, int adminId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.am_wyklad.Database.User> getUserByLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String login) {
        return null;
    }
    
    public final boolean isRegistered(@org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return false;
    }
    
    public final boolean isRegistered(@org.jetbrains.annotations.NotNull()
    java.lang.String login) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getChallenges(int userId) {
        return null;
    }
    
    public final void addChallenge(int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
    }
    
    public final void addProfile(int adminId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    java.lang.String challenges, @org.jetbrains.annotations.NotNull()
    java.lang.String players, @org.jetbrains.annotations.NotNull()
    java.lang.String draw) {
    }
    
    public final void updateProfile(@org.jetbrains.annotations.NotNull()
    com.example.am_wyklad.Database.Profile profile) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getChallengeByDescription(int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getProfiles(int userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getProfilesByName(int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.am_wyklad.Database.Profile> getProfile(int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.am_wyklad.Database.Profile> getProfileByCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        return null;
    }
    
    public final boolean getBooleanProfileByCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/am_wyklad/Database/UserDatabase$Companion;", "", "()V", "COLUMN_CHALLENGE_DESCRIPTION", "", "COLUMN_CHALLENGE_USER_ID", "COLUMN_ID", "COLUMN_PROFILE_ADMIN_ID", "COLUMN_PROFILE_CHALLENGES", "COLUMN_PROFILE_CODE", "COLUMN_PROFILE_DRAW", "COLUMN_PROFILE_NAME", "COLUMN_PROFILE_PLAYERS", "COLUMN_USER_LOGIN", "COLUMN_USER_NAME", "COLUMN_USER_PASSWORD", "DATABASE_NAME", "DATABASE_VERSION", "", "TABLE_CHALLENGE", "TABLE_PROFILE", "TABLE_USER", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}