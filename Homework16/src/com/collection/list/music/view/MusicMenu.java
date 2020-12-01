package com.collection.list.music.view;

import java.util.Scanner;

import com.collection.list.music.controller.MusicManager;
import com.collection.list.music.controller.MusicSingerAscending;
import com.collection.list.music.controller.MusicSingerDescending;
import com.collection.list.music.controller.MusicTitleAscending;
import com.collection.list.music.controller.MusicTitleDescending;
import com.collection.list.music.model.vo.Music;

public class MusicMenu {
	
		private MusicManager mm = new MusicManager();
		private Scanner sc = new Scanner(System.in);
		
		private String title = null;
		private String title2 = null;
		private String singer = null;
		private String singer2 = null;
		 
	
	public void menu() {
		
		
		    boolean	yn2 = true;
		while (yn2) {
			boolean	yn = false;
		System.out.println(" ================ Music Playlist Menu ================\r\n" + 
				"    1.목록보기\r\n" + 
				"    2.마지막에 음악추가\r\n" + 
				"    3.맨처음에 음악추가\r\n" + 
				"    4.곡삭제\r\n" + 
				"    5.곡변경\r\n" + 
				"    6.곡명검색\r\n" + 
				"    7.가수검색\r\n" + 
				"    8.목록정렬(곡명오름차순)\r\n" + 
				"    0.종료\r\n" + 
				"   ================================================================\r\n" 
				);
		System.out.print("메뉴 선택 : ");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		sc.nextLine();
		switch(select) {
			case 0:
				System.out.println("프로그램 종료");
				yn2 =false;
			 return;
			 
			case 1:
				mm.selecList();
				break;
		
			case 2:
				System.out.print("찾으시는 제목을 입력하세요 : ");
				title = sc.nextLine();
				System.out.print("찾으시는 가수를 입력하세요 : ");
			    singer = sc.nextLine();
				mm.addList(new Music(title, singer));
				break;
		
			case 3:
				System.out.print("찾으시는 제목을 입력하세요 : ");
				title = sc.nextLine();
				System.out.print("찾으시는 가수를 입력하세요 : ");
			    singer = sc.nextLine();
				mm.addAtZero(new Music(title, singer));
				break;
			
			case 4:
				System.out.print("찾으시는 제목을 입력하세요 : ");
				title = sc.nextLine();
				yn = mm.removeMusic(title);
				if(yn)
					System.out.println("제거되었습니다.");
				else
					System.out.println("곡이 존재하지 않습니다.");
				
				break;
			
			case 5:
				System.out.print("찾으시는 제목을 입력하세요 : ");
				title = sc.nextLine();
				System.out.print("찾으시는 가수를 입력하세요 : ");
			    singer = sc.nextLine();
			    System.out.print("추가할 제목을 입력하세요 : ");
				title2 = sc.nextLine();
				System.out.print("추가할 가수를 입력하세요 : ");
			    singer2 = sc.nextLine();
				yn = mm.replace(new Music(title, singer), new Music(title2, singer2));
				if(yn)
					System.out.println("교체 되었습니다.");
				else
					System.out.println("곡이 존재하지 않습니다.");
				break;
				
			case 6:
				System.out.print("찾으시는 제목을 입력하세요 : ");
				title = sc.nextLine();
				mm.searchMusicByTitle(title);
				
				break;
				
			case 7:
				System.out.print("찾으시는 가수를 입력하세요 : ");
				singer = sc.nextLine();
				mm.searchMusicByTitle(singer);
				break;
			
			case 8:
				System.out.println("================== 정렬 메뉴 ===================\r\n" + 
						"    1. 가수명 오름차순\r\n" + 
						"    2. 가수명 내림차순\r\n" + 
						"    3. 곡명 오름차순\r\n" + 
						"    4. 곡명 내림차순\r\n" + 
						"    5. 메인메뉴 돌아가기\r\n" + 
						"    ================================================\r\n" + 
						"");
				System.out.print("메뉴선택 : ");
				int select2 = sc.nextInt();
				switch(select2) {
				
					case 1:
						System.out.println("가수명 오름차순 정렬");
						mm.orderBy(new MusicSingerAscending());
						break;
					case 2:
						System.out.println("가수명 내림차순 정렬");
						mm.orderBy(new MusicSingerDescending());
						break;
					case 3:
						System.out.println("곡명 오름차순 정렬");
						mm.orderBy(new MusicTitleAscending());
						break;
					case 4:
						System.out.println("곡명 내림차순 정렬");
						mm.orderBy(new MusicTitleDescending());
						break;
				}
			
				break;	
		}
	}
		
 }
	
}
