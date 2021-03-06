package com.sossgrid.datastore;

import java.util.ArrayList;
import java.util.HashMap;

public interface IDataConnector {
	public void CreateConnection(HashMap<String,String> Configuration) throws Exception;
	public  StatusMessage Store(String Name,Object Obj,DataStoreCommandType comandtype);
	public StatusMessage[] Store(String Name,Object[] Objs);
	public StatusMessage Delete(String Name,Object Obj);
	public StatusMessage[] Delete(String Name,Object[] Objs);
	public <T> ArrayList<T> Retrive(String Name,HashMap<String,Object> QueryField,Class<T> c);
}
