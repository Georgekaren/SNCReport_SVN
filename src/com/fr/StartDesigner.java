package com.fr;


/**
 * @author shen.zhi 2016-5-6 右键运行打开设计器
 *
 */
public class StartDesigner {

	//右键 run 运行即可
	public static void main(String[] arg){
		Runtime rt = Runtime.getRuntime();
		StartDesigner start=new StartDesigner();
		try {
			String path=start.getClass().getResource("/").getPath();
			System.out.println("正在打开，需要一分钟加载时间，请稍后。。。。。。。。");
			path=path.substring(1,path.length()-16).replace("/", "\\");
		Process pc = rt.exec(" "+path+"designer\\jre\\bin\\java -Xms512m -Xmx1024m -cp "+path+"designer\\lib\\*;"+path+"designer\\lib\\jetty\\* com.fr.start.Designer"+" ");
		//pc.waitFor();
		}catch(Exception e){
		e.printStackTrace();
		}
	}   
	
	
}
