package kr.co.songjava.configuration.mybatis.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class StringValueBooleanTypeHandler implements TypeHandler<Boolean>{

	@Override
	public void setParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType) throws SQLException {
		ps.setString(i, BooleanUtils.toString(parameter, "Y", "N"));
	}

	@Override
	public Boolean getResult(ResultSet rs, String columnName) throws SQLException {
		return BooleanUtils.toBoolean(rs.getString(columnName));
	}

	@Override
	public Boolean getResult(ResultSet rs, int columnIndex) throws SQLException {
		return BooleanUtils.toBoolean(rs.getString(columnIndex));
	}

	@Override
	public Boolean getResult(CallableStatement cs, int columnIndex) throws SQLException {
		return BooleanUtils.toBoolean(cs.getString(columnIndex));
	}

}
