package problem.dotorybook;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DotoryBookDAO {
	Connection conn;
	PreparedStatement pstmt;
	ArrayList<DotoryBookDTO> list = new ArrayList<>();

	public void insert(DotoryBookDTO bDto) {
		try {
			conn = DBManager.getConnection();
			String sql = "INSERT INTO tbl_book(bno,bname,price,company,writer) " + "VALUES (seq_book.NEXTVAL,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, bDto.getBname());
			pstmt.setInt(2, bDto.getPrice());
			pstmt.setString(3, bDto.getCompany());
			pstmt.setString(4, bDto.getWriter());
			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("도서정보등록 성공");
			} else {
				System.out.println("고장났어요.");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void update(DotoryBookDTO bDto) {
		try {
			conn = DBManager.getConnection();
			String sql = "UPDATE tbl_book "
					+ "SET bname = ?,"
					+ " price = ?,"
					+ "company = ?,"
					+ "writer = ? "
					+ "WHERE bno ="+bDto.getBno();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, bDto.getBname());
			pstmt.setInt(2, bDto.getPrice());
			pstmt.setString(3, bDto.getCompany());
			pstmt.setString(4, bDto.getWriter());
			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("도서정보수정 성공");
			} else {
				System.out.println("고장났어요.");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void delete(String bno) {
		try {
			conn =DBManager.getConnection();
			String sql = "DELETE FROM tbl_book WHERE bno = ?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, bno);
			int result=pstmt.executeUpdate();
			if(result>0) {
				System.out.println("삭제성공");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void select() {
		try {
			conn = DBManager.getConnection();
			String sql = "SELECT * FROM tbl_book";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String bno = rs.getString("bno");
				String bname = rs.getString("bname");
				int price = rs.getInt("price");
				String company = rs.getString("company");
				String writer = rs.getString("writer");
				Date regdate = rs.getDate("regdate");

				DotoryBookDTO dbDto = new DotoryBookDTO(bno, bname, price, company, writer, regdate);
				list.add(dbDto);
				
			}for (DotoryBookDTO line : list) {
				System.out.println(line.toString());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void search(String bname) {
		try {
			conn = DBManager.getConnection();
			String sql = "SELECT * FROM tbl_book WHERE bname LIKE ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+bname+"%");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String bno = rs.getString("bno");
				bname = rs.getString("bname");
				int price = rs.getInt("price");
				String company = rs.getString("company");
				String writer = rs.getString("writer");
				Date regdate = rs.getDate("regdate");

				DotoryBookDTO dbDto = new DotoryBookDTO(bno, bname, price, company, writer, regdate);
				list.add(dbDto);
				
			}for (DotoryBookDTO line : list) {
				System.out.println(line.toString());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void writer() {
		// TODO Auto-generated method stub
		System.out.println("dd");
	}

}
