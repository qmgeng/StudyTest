package ding.study.designpatterns.visitor2;
/**
 * �۲�������
 * @author daniel
 * @email 576699909@qq.com
 * @time 2016-5-11 ����2:28:58
 */
public class VisitorSaPo implements Visitor {

	@Override
	public void getVersion(Person person) {
		 if(person instanceof PersonNan){
				System.out.println( person.getMessage()+"����  -����");
			 }
			 if(person instanceof PersonNv){
					System.out.println( person.getMessage()+"����-��");
				 }

			}

}
