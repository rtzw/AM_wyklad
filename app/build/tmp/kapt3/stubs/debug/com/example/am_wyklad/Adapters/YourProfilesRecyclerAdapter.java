package com.example.am_wyklad.Adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0016\u0017B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/am_wyklad/Adapters/YourProfilesRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/am_wyklad/Adapters/YourProfilesRecyclerAdapter$ViewHolder;", "dataSet", "", "", "clickListner", "Lcom/example/am_wyklad/Adapters/YourProfilesRecyclerAdapter$ClickListner;", "(Ljava/util/List;Lcom/example/am_wyklad/Adapters/YourProfilesRecyclerAdapter$ClickListner;)V", "getClickListner", "()Lcom/example/am_wyklad/Adapters/YourProfilesRecyclerAdapter$ClickListner;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItem", "ClickListner", "ViewHolder", "app_debug"})
public final class YourProfilesRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.am_wyklad.Adapters.YourProfilesRecyclerAdapter.ViewHolder> {
    private final java.util.List<java.lang.String> dataSet = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.am_wyklad.Adapters.YourProfilesRecyclerAdapter.ClickListner clickListner = null;
    
    public YourProfilesRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> dataSet, @org.jetbrains.annotations.NotNull()
    com.example.am_wyklad.Adapters.YourProfilesRecyclerAdapter.ClickListner clickListner) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.am_wyklad.Adapters.YourProfilesRecyclerAdapter.ClickListner getClickListner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.am_wyklad.Adapters.YourProfilesRecyclerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.am_wyklad.Adapters.YourProfilesRecyclerAdapter.ViewHolder holder, int position) {
    }
    
    public final void removeItem(int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/example/am_wyklad/Adapters/YourProfilesRecyclerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/am_wyklad/Adapters/YourProfilesRecyclerAdapter;Landroid/view/View;)V", "profile", "Landroid/widget/TextView;", "getProfile", "()Landroid/widget/TextView;", "setProfile", "(Landroid/widget/TextView;)V", "removeButton", "Landroid/widget/Button;", "getRemoveButton", "()Landroid/widget/Button;", "setRemoveButton", "(Landroid/widget/Button;)V", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView profile;
        @org.jetbrains.annotations.NotNull()
        private android.widget.Button removeButton;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getProfile() {
            return null;
        }
        
        public final void setProfile(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getRemoveButton() {
            return null;
        }
        
        public final void setRemoveButton(@org.jetbrains.annotations.NotNull()
        android.widget.Button p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/am_wyklad/Adapters/YourProfilesRecyclerAdapter$ClickListner;", "", "onItemClick", "", "string", "", "app_debug"})
    public static abstract interface ClickListner {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        java.lang.String string);
    }
}