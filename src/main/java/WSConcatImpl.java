package net.museum.proj;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "net.museum.proj.WSConcat", serviceName = "MyConcatAgent")
public class WSConcatImpl {
public String concat (String str1,String str2){
 return str1+str2;
}
}
