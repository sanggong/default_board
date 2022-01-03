package kr.co.songjava.framework.util;

import org.apache.commons.lang3.ObjectUtils;

import kr.co.songjava.mvc.domain.BaseCodeLabelEnum;

public class EnumUtils {

	public static boolean isSelected(BaseCodeLabelEnum[] values, BaseCodeLabelEnum codeEnum) {
		if (ObjectUtils.isEmpty(values)) {
			return false;
		}
		for (BaseCodeLabelEnum value : values) {
			if (value.code().equals(codeEnum.code())) {
				return true;
			}
		}
		return false;
	}
}
