package cn.ekgc.addrbook.util;

import java.io.InputStream;
import java.util.Properties;

/**
 * <b>常量工具类</b>
 */
public class Constants {
	private static Properties props = new Properties();
	static {
		try {
			// 读取位于src下的addrbook.properties配置文件
			InputStream in = Constants.class.getClassLoader().getResourceAsStream("addrbook.properties");
			// 使用properties加载输入流
			props.load(in);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * <b>转发路径信息：转发前缀<b>
	 */
	public static final String FORWARD_PREFIX = props.getProperty("forward.prefix");
	/**
	 * <b>转发路径信息：转发后缀<b>
	 */
	public static final String FORWARD_SUFFIX = props.getProperty("forward.suffix");
}
