package problem.board;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.DBManager;

public class BoardDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	ArrayList<BoardDTO> list = new ArrayList<>();
	BoardDTO dto;
	int result;
	public void select() {
		try {
			conn=DBManager.getConnection();
			String sql = "SELECT * FROM tbl_Board "
					   + "ORDER BY bno DESC";
			pstmt=conn.prepareStatement(sql);
			rs =pstmt.executeQuery();
			list.clear();
			while(rs.next()) {
				int bno = rs.getInt("bno");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				int viewcnt = rs.getInt("viewcnt");
				Date regdate = rs.getDate("regdate");
				BoardDTO dto = new BoardDTO(bno, title, content, writer,viewcnt, regdate);
				list.add(dto);
			}
			printQuery(list);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void insert(BoardDTO bDto) {
		try {
			conn=DBManager.getConnection();
			String sql = "INSERT INTO tbl_board (bno,title,content,writer) VALUES(seq_board.NEXTVAL,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, bDto.getTitle());
			pstmt.setString(2, bDto.getContent());
			pstmt.setString(3, bDto.getWriter());
			int result =pstmt.executeUpdate();
			if(result>0) {
				System.out.println("등록성공");
			} else {
				System.out.println("실패");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public void delete(int bno) {
		try {
			conn=DBManager.getConnection();
			String sql = "DELETE FROM tbl_board WHERE bno = ?";
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, bno);			
			int result =pstmt.executeUpdate();
			if(result>0) {
				System.out.println("삭제성공");
			} else {
				System.out.println("실패");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	public void update(BoardDTO bDto) {
		try {
			conn=DBManager.getConnection();
			String sql = "UPDATE tbl_board SET title = ?, content = ?, writer = ? WHERE bno = ?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, bDto.getTitle());
			pstmt.setString(2, bDto.getContent());
			pstmt.setString(3, bDto.getWriter());
			pstmt.setInt(4, bDto.getBno());
			
			int result =pstmt.executeUpdate();
			if(result>0) {
				System.out.println("등록성공");
			} else {
				System.out.println("실패");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void search(String title) {
		try {
			conn=DBManager.getConnection();
			String sql = "SELECT * FROM tbl_Board WHERE title LIKE ?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+title+"%");
			rs =pstmt.executeQuery();
			list.clear();
			while(rs.next()) {
				int bno = rs.getInt("bno");
				title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				Date regdate = rs.getDate("regdate");
				BoardDTO dto = new BoardDTO(bno, title, content, writer, regdate);
				list.add(dto);
			}
			for (BoardDTO line : list) {
				System.out.println(line.toString());
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void sort() {
		try {
			conn=DBManager.getConnection();
			String sql = "SELECT * "
					+ "FROM tbl_board "
					+ "ORDER BY viewcnt DESC";
					
					
			pstmt=conn.prepareStatement(sql);
			
			rs =pstmt.executeQuery();
			list.clear();
			while(rs.next()) {
				int bno = rs.getInt("bno");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				int viewcnt = rs.getInt("viewcnt");
				Date regdate = rs.getDate("regdate");
				BoardDTO dto = new BoardDTO(bno, title, content, writer,viewcnt, regdate);
				list.add(dto);
			}
			for (BoardDTO line : list) {
				System.out.println(line.toString());
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void view(int bno) {
		int result=viewCnt(bno);
		if(!(result>0)) {
			System.out.println("뷰카운트 안올라가따");
			return;
		}
		
		try {
			conn=DBManager.getConnection();
			String sql = "SELECT * "
					   + "FROM tbl_board "
					   + "WHERE bno = ?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				bno = rs.getInt("bno");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				Date regdate = rs.getDate("regdate");
				int viewcnt = rs.getInt("viewcnt");
				dto = new BoardDTO(bno, title, content, writer,viewcnt, regdate);
			}
			System.out.println("뚫쀍퀡쉙뚫쀍퀡쉙뚫쀍퀡쉙뚫쀍퀡쉙뚫쀍퀡쉙뚫쀍퀡쉙뚫쀍퀡쉙뚫쀍퀡쉙뚫쀍퀡쉙뚫쀍퀡쉙");
			System.out.println("뚫쀍퀡쉙|no|"+bno+"뚫쀍퀡쉙|제목|"+dto.getTitle()+"뚫쀍퀡쉙|쓴이|"+dto.getWriter()+"|조회수|"+dto.getViewcnt());
			System.out.println("뚫쀍퀡쉙뚫쀍퀡쉙뚫쀍퀡쉙뚫쀍퀡쉙|내용|퀡쉙뚫쀍퀡쉙뚫쀍퀡쉙뚫쀍퀡쉙뚫쀍퀡쉙뚫쀍퀡쉙");
			System.out.println(dto.getContent());
		} catch (Exception e) {
			// TODO: handle exception
		} 
	
		
	}
	public int viewCnt(int bno) {
		
		try {
			conn= DBManager.getConnection();
			String sql = "UPDATE tbl_board "
					+ "SET viewcnt = viewcnt +1 "
					+ "WHERE bno = ?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			result=pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}
	public void printQuery(ArrayList<BoardDTO> list) {
		
		System.out.println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
		System.out.println("번호\t제목\t\t내용\t\t작성자\t작성일자\t");
		System.out.println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
		for (BoardDTO line : list) {
			System.out.println(line.toString());
		}
		System.out.println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
	}
}
