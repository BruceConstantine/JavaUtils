/**
 * ���ù��ܹ�����
 * @author honoka
 */
public class ToolUtil {
	/**
	 * �жϴ���Ķ����Ƿ�Ϊ��
	 * @author honoka
	 * @param obj
	 * @return
	 */
	public static boolean isNull(Object obj){
		return (obj==null);
	}
	
	/**
	 * �ж϶����Ƿ�ǿ�
	 * @author honoka
	 * @param obj
	 * @return
	 */
	public static boolean isNotNull(Object obj){
		return (null!=obj);
	}
	
	/**
	 * �ж϶����Ƿ�ǿգ����Ƿ�ǿ��ַ���
	 * @author honoka
	 * @param obj
	 * @return
	 */
	public static boolean isNotEmpty(Object obj){
		return (null!=obj)&&(!"".equals(obj.toString()));
	}
}