package problem.DDEnter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {
	Connection conn;
	PreparedStatement pstmt;

	public void memInsert(MemberDTO mDto) {
		try {
			conn = DBManager.getConnection();
			String sql = "INSERT INTO tbl_enter(ano,aname,major,groupyn,groupnm,sal) "
					+ "VALUES(seq_enter.NEXTVAL,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mDto.getAname());
			pstmt.setString(2, mDto.getMajor());
			pstmt.setString(3, mDto.getGroupyn());
			pstmt.setString(4, mDto.getGroupnm());
			pstmt.setInt(5, mDto.getSal());
			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("▒▒" + mDto.getAname() + "아티스트와 계약");
			} else {
				System.out.println("실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void memUpdate(MemberDTO mDto) {
		try {
			conn = DBManager.getConnection();
			String sql = "UPDATE tbl_enter "
					+ "SET aname = ?, major=?, groupyn=?,groupnm=?,sal=? "
					+ "WHERE ano = "+mDto.getAno();
					;
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mDto.getAname());
			pstmt.setString(2, mDto.getMajor());
			pstmt.setString(3, mDto.getGroupyn());
			pstmt.setString(4, mDto.getGroupnm());
			pstmt.setInt(5, mDto.getSal());
			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("▒▒" + mDto.getAname() + "아티스트 수정");
			} else {
				System.out.println("실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void memDelete(String ano) {

		try {
			conn = DBManager.getConnection();
			String sql = "DELETE FROM tbl_enter " + "WHERE ano = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("▒▒" + ano + "아티스트와 계약해지");
			} else {
				System.out.println("▒▒ 해지 실패 관리자에게 문의바람.");
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
	}

	public void memSelect() {
		conn = DBManager.getConnection();
	}

	public void memSearch() {
		conn = DBManager.getConnection();
	}
}
