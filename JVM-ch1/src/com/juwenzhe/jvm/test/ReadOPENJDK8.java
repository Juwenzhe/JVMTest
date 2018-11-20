package com.juwenzhe.jvm.test;

public class ReadOPENJDK8 {

	public static void main(String[] args) {
		/*File file = new File("F:\\编译openJDK1.8");
		
		InputStream is = null;
		try {
			is = new FileInputStream(file);
			byte [] b = new byte[1024];
			int s = 0;
			while((s = is.read(b))!=-1) {
				System.out.println(new String(b,""));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		for (int i=0; i<args.length; i++) {
			System.out.println("参数"+(i+1)+": "+args[i]);
		}
		//最大可用堆内存
		System.out.println("-Xmx="+Runtime.getRuntime().maxMemory()/1024/1024+"M");
		System.out.println("-Xmx="+Runtime.getRuntime().freeMemory()/1024/1024+"M");
		
	}
	
}