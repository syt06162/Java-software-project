
public class Test {

	public static void main(String[] args) {
		// 1. BookmarkList 객체 생성, 데이터 넣기
		BookmarkList bl = new BookmarkList("bookmark-input.txt");
		
		// 2. BookmarkList 안에 Bookmark들 출력
		for (int i = 0; i<bl.numBookmarks(); i++)
			bl.getBookmark(i).print();
		
		System.out.println("\n");
		
		// 3. BookmarkList merge by group, 잘 되었나 확인
		bl.mergeByGroup();
		for (int i = 0; i<bl.numBookmarks(); i++)
			bl.getBookmark(i).print();
		
		// 4. merge 결과를 파일로도 저장해봄.
		bl.saveBookmarks("bookmark-output.txt");
	}
}
