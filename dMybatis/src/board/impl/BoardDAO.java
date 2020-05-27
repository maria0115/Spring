package board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import board.BoardVO;
import session.SqlSessionFactoryBean;

//JDBC : Connection - Mybatis : SqlSession
public class BoardDAO {
	private SqlSession mybatis; //연결객체

	public BoardDAO() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}

	public void insertBoard(BoardVO vo) {
		mybatis.insert("BoardDAO.insertBoard", vo);
		mybatis.commit();
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		return mybatis.selectList("BoardDAO.getBoardList", vo);
	}
}
