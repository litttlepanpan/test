package ks;

import java.util.Comparator;

public class school implements Comparable<Object>{
	private String name;
	private int scords;
	private int bh;
	private int manscords=0;
	private int womanscords=0;
	private project[] manproject;
    private project[] womanproject;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getScords() {
	return scords;
}
public int getBh() {
	return bh;
}
public void setBh(int bh) {
	this.bh = bh;
}
//�����ܵ÷�
public int getManscords() {
	return manscords;
}
//Ů���ܵ÷�
public int getWomanscords() {
return womanscords;
}
//�ӷַ���
public void addscord(int i,boolean f) {
	if(f) {
		this.womanscords=this.womanscords+manproject[i].getscord();
	}
	else
		this.manscords=this.manscords+manproject[i].getscord();
	
}

public project[] getManproject() {
	return manproject;
}
public void setManproject(project[] manproject) {
	for (int i=0;i<manproject.length;i++) {
		manproject[i].setBelong(this);
	}
	this.manproject = (project[])manproject.clone();
}
public project[] getWomanproject() {
	return womanproject;
}
public void setWomanproject(project[] womanproject) {
	for (int i=0;i<womanproject.length;i++) {
		womanproject[i].setBelong(this);
	}
	this.womanproject =  (project[])womanproject.clone();
}
public String toString() {
	
	return "��ţ�"+this.getBh()+" "+"ѧУ��"+this.getName()+" "+"������Ŀ�÷֣�"+this.getManscords()+" "+"Ů����Ŀ�÷֣�"+this.getWomanscords()+" �ܵ÷֣�"+this.getScords();
}
@Override
public int compareTo(Object o) {

school sc=(school)o;
int result=scords>sc.scords?1:(scords==sc.scords?0:-1);
	return result;
}
static class womanComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
	school  s1=(school)o1;
	school s2=(school)o2;
	int result=s2.getWomanscords()-s1.getWomanscords();
		return result;
	}
	
}
static class manComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
	school  s1=(school)o1;
	school s2=(school)o2;
	int result=s2.getManscords()-s1.getManscords();
		return result;
	}
	
}
static class bhComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		school  s1=(school)o1;
		school s2=(school)o2;
		int result=s2.getBh()-s1.getBh();
		return 0;
	}
	
}

}
