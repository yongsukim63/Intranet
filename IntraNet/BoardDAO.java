package intranet;

import jdbc.util.*;


import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

public class BoardDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	//글 등록하는 메소드
	public int writeBoard(BoardVO board) throws Exception
	{
		try {
			con=DBUtil.getCon();
			
			String sql="INSERT INTO BOARD VALUES(BOARD_SEQ.NEXTVAL,?,?,SYSDATE";
			
			ps=con.prepareStatement(sql);
			ps.setString(1, board.getName());
			ps.setString(2, board.getMsg());
			
			int n= ps.executeUpdate();
			
			return n;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;				//오류발생시 음수반환
		} finally {
			close();
		}
	}
	
	//검색 메소드
	public ArrayList<BoardVO> searchBoard(int type, String keyword)
	{
		try {
			con=DBUtil.getCon();
			
			String colName="";
			switch(type)
			{
			case 0:
				colName="name";
				break;
			case 1:
				colName="msg";
				break;
			case 2:
				colName="wdate";
				break;
			}
			
			String sql="SELECT * FROM BOARD WHERE "+colName+"LIKE ? ORDER BY IDX";
			
			ps= con.prepareStatement(sql);
			ps.setString(1, "%"+keyword+"%");
			
			rs=ps.executeQuery();
			
			ArrayList<BoardVO> al= makeList(rs);
			
			return al;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			close();
		}
	}
	public ArrayList<BoardVO> makeList(ResultSet rs) throws SQLException
	{
		ArrayList<BoardVO> al= new ArrayList<>();
		while(rs.next())
		{
			BoardVO bVO= new BoardVO();			//반복문 돌때마다 객체를 생성해야 각각 저장
			bVO.setIdx(rs.getInt(1));			//mVO set으로 객체에 값을 할당해야한다
			bVO.setName(rs.getString(2));		//값은 ResultSet에서 get으로 가져온다
			bVO.setMsg(rs.getString(3));
			bVO.setWdate(rs.getDate(4));
			
			al.add(bVO);
		}
		return al;
	}
	
	public int delete(Integer idx)
	{
		try {
			con=DBUtil.getCon();
			
			String sql= "DELETE FROM BOARD WHERE IDX=?";
			
			ps=con.prepareStatement(sql);
			int n= ps.executeUpdate();
			
			return n;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	
	
	
	
	
	//closing method
	private void close()
	{
		try {
			if(rs!=null)
				rs.close();
			if(ps!=null)
				ps.close();
			if(con!=null)
				con.close();
		} catch (Exception e) {
		}
	}
}
