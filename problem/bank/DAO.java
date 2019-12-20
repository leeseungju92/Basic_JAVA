package problem.bank;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
	Connection conn;
	ResultSet rs;
	ArrayList<DTO> list = new ArrayList<DTO>();
	PreparedStatement pstmt;
	DTO dto;

	public void insert(DTO dto) {
		try {
			conn = DBManager.getConnection();
			String sql = "INSERT INTO tbl_bank(bno, bname, pw, money) " + "VALUES (seq_bank.NEXTVAL,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getBname());
			pstmt.setString(2, dto.getPw());
			pstmt.setInt(3, dto.getMoney());
			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println(dto.getBname() + "고객님 계좌생성 성공");
			} else {
				System.out.println("계좌생성 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public void updateI(DTO dto) {
		try {
			conn = DBManager.getConnection();
			String sql = "UPDATE tbl_bank " + "SET money = money + ? " + "WHERE bno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getMoney());
			pstmt.setInt(2, dto.getBno());
			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("입/출금성공");
			} else {
				System.out.println("입/출금실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public void select() {
		try {
			conn = DBManager.getConnection();
			String sql = "SELECT * " + "FROM tbl_bank ";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			list.clear();
			while (rs.next()) {
				int bno = rs.getInt("bno");
				int money = rs.getInt("money");
				String bname = rs.getString("bname");
				String pw = rs.getString("pw");
				Date regdate = rs.getDate("regdate");
				DTO dto = new DTO(bno, bname, pw, money, regdate);
				list.add(dto);
			}
			for (DTO line : list) {
				System.out.println(line.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void search(String bname) {
		try {
			conn = DBManager.getConnection();
			String sql = "SELECT * " + "FROM tbl_bank " + "WHERE bname LIKE ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + bname + "%");
			rs = pstmt.executeQuery();
			list.clear();
			while (rs.next()) {
				bname = rs.getString("bname");
				int bno = rs.getInt("bno");
				int money = rs.getInt("money");
				String pw = rs.getString("pw");
				Date regdate = rs.getDate("regdate");
				dto = new DTO(bno, bname, pw, money, regdate);
				list.add(dto);
			}
			for (DTO dto : list) {
				System.out.println(dto.toString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public int confirm(int bno, String pw) {
		int conf = 0;
		try {
			conn = DBManager.getConnection();
			String sql = "SELECT * " + "FROM tbl_bank " + "WHERE bno = ? and pw = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				conf = 1;
			} else {
				conf = 0;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conf;

	}

	public int confM(int bno) {
		int confmoney = 0;
		try {
			conn = DBManager.getConnection();
			String sql = "SELECT * " + "FROM tbl_bank " + "WHERE bno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
			confmoney = rs.getInt("money");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		} return confmoney;

	}

}
