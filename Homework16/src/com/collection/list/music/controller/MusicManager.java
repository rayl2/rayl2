package com.collection.list.music.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import com.collection.list.music.model.vo.Music;

public class MusicManager {
	
	 ArrayList<Music> mList = new ArrayList<Music>();
	
	{ 
		 mList.add(new Music("내사람","SG워너비"));
		 mList.add(new Music("소주한잔","임창정"));
		 mList.add(new Music("빙고","거북이"));
		 mList.add(new Music("천년의 사랑","박완규"));
		 mList.add(new Music("광화문에서","규현"));
			
		}
	
	public void selecList() {
		
		for(int i = 0; i < mList.size(); i++)
		System.out.println(mList.get(i).toString());
	}
	
	public void addList(Music m) {
		mList.add(m);
		System.out.println("음악이 추가됨");
	}
	
	public void addAtZero(Music m) {
		mList.add(0, m);
		System.out.println("음악이 추가됨");
	}
	
	public boolean removeMusic(String s) {
		boolean yn = false;
		for(int i = 0; i < mList.size(); i++) {
			String title = mList.get(i).getTitle();
			if (title.equals(s)) {
				mList.remove(i);
				yn = true;
				break;
			}
					
		}
		return yn;
	}
	
	public  boolean replace(Music oldMusic, Music newMusic) {
		boolean yn = false;
		
		for(int i = 0; i < mList.size(); i++) {
			String title = mList.get(i).getTitle();
			String singer = mList.get(i).getSinger();
			
			if (title.equals(oldMusic.getTitle()) && 
					singer.equals(oldMusic.getSinger())) {
				
				mList.set(i, newMusic);
				yn = true;
				break;
			}
					
		}
		return yn;
	}
	
	public void searchMusicByTitle(String searchTitle) {
		
		boolean yn = true;
		
		for(int i = 0; i < mList.size(); i++) {
			String title = mList.get(i).getTitle();
			if(title.contains(searchTitle)) {
				System.out.println(mList.get(i).toString());
				yn = false;
			}
		}
			if(yn)
				System.out.println("찾으시는 곡이없습니다.");
		
	}
	
     public void searchMusicBySinger(String singer) {
		
		boolean yn = true;
		
		for(int i = 0; i < mList.size(); i++) {
			String stitle = mList.get(i).getTitle();
			if(stitle.contains(singer)) {
				System.out.println(mList.get(i).toString());
				yn = false;
			}
			
		}if(yn)
		 System.out.println("찾으시는 곡이없습니다.");
		
	}
     
     public void orderBy(Comparator<Music> c) {
 		Collections.sort(mList, c);
 		System.out.println(mList);
 	}
    	
    

}
