package problem.DDEnter;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	Connection conn;
	PreparedStatement pstmt;
	ArrayList<MemberDTO> list = new ArrayList<>();

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
			String sql = "UPDATE tbl_enter " + "SET aname = ?, major=?, groupyn=?,groupnm=?,sal=? " + "WHERE ano = "
					+ mDto.getAno();
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
				pstmt.close();

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
		try {
			conn = DBManager.getConnection();
			String sql = "SELECT * FROM tbl_enter";
			pstmt = conn.prepareStatement(sql);
			// 셀렉문의 결과를 담음
			ResultSet rs = pstmt.executeQuery();
			// 리절트셋은 디비관련 객체
			// 자바전용 어레이 리스트에 리저트 셋에 데이터를 옮겨닮는 작업필요
			while (rs.next()) {
				String ano = rs.getString("ano");
				String aname = rs.getString("aname");
				String major = rs.getString("major");
				String groupyn = rs.getString("groupyn");
				String groupnm = rs.getString("groupnm");
				int sal = rs.getInt("sal");
				Date regdate = rs.getDate("regdate");
				MemberDTO mDto = new MemberDTO(ano, aname, major, groupyn, groupnm, sal, regdate);
				list.add(mDto);
			}
			for (MemberDTO line : list) {
				System.out.println(line.toString());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void memSearch(String aname) {
		try {
			conn = DBManager.getConnection();
			String sql = "SELECT * FROM tbl_enter WHERE aname LIKE ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, aname);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				aname = rs.getString("aname");
				String ano = rs.getString("ano");
				String major = rs.getString("major");
				String groupyn = rs.getString("groupyn");
				String groupnm = rs.getString("groupnm");
				int sal = rs.getInt("sal");
				Date regdate = rs.getDate("regdate");
				MemberDTO mDto = new MemberDTO(ano, aname, major, groupyn, groupnm, sal, regdate);
				list.add(mDto);
				
				
			}
			for (MemberDTO line : list) {
				System.out.println(line.toString());
			}

		} catch (

		Exception e) {
			// TODO: handle exception
		}
	}
}
